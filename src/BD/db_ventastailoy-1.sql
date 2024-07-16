-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-12-2023 a las 18:30:38
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_ventastailoy`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `precio_unitario` double NOT NULL,
  `tipo_de_producto` varchar(45) NOT NULL,
  `proveedor` varchar(45) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `precio_unitario`, `tipo_de_producto`, `proveedor`, `stock`) VALUES
(1, 'Lapiz', 2, 'Escritura', 'Artesco', 395),
(2, 'Borrador', 1.5, 'Papeleria', 'Faber Castell', 373),
(4, 'Hoja bond', 0.1, 'Papeleria', 'Artesco', 886),
(5, 'Regla', 1, 'Medicion', 'Faber Castell', 422),
(6, 'Lapicero', 3, 'Escritura', 'Panda', 470),
(7, 'Cuaderno cuadriculado', 8, 'Papeleria', 'Alpha', 641),
(8, 'Tijera', 2, 'Corte', 'Artesco', 326),
(9, 'Portaminas', 4.6, 'Escritura', 'Faber Castell', 149),
(10, 'Cuaderno rayado', 7.5, 'Papeleria', 'Justus', 489),
(11, 'Compas', 5.5, 'Dibujo', 'Artesco', 346),
(12, 'Plumon grueso', 2, 'Escritura', 'Faber Castell', 241),
(13, 'Plumon delgado', 1.5, 'Escritura', 'Artesco', 231),
(14, 'Plumon indeleble', 4, 'Escritura', 'Vinifan', 215),
(15, 'Liquid paper', 3.5, 'Papeleria', 'Artesco', 312),
(16, 'Forro plastico', 6, 'Papeleria', 'Vinifan', 248),
(17, 'Tempera en frasco', 6.7, 'Arte', 'Layconsa', 149),
(18, 'Pack de temperas', 10.6, 'Arte', 'Panda', 148),
(19, 'Cinta correctora', 7.5, 'Escritura', 'Faber Castell', 201),
(20, 'Tajador', 1.5, 'Escritura', 'Art', 216),
(21, 'Goma en barra', 2.5, 'Pegamento', 'Art', 245),
(22, 'Goma liquida personal', 1.5, 'Pegamento', 'Faber Castell', 150),
(23, 'Hoja de color', 0.5, 'Papeleria', 'Artesco', 547),
(24, 'Caja de colores', 8, 'Arte', 'Layconsa', 264),
(25, 'Pack de pinceles', 7.5, 'Arte', 'Panda', 121);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `correo` varchar(40) NOT NULL,
  `clave` varchar(50) NOT NULL,
  `tipo_nivel` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `apellido`, `correo`, `clave`, `tipo_nivel`) VALUES
(1, 'Roy', 'Meza Taipe', 'roymezataipe@gmail.com', '202cb962ac59075b964b07152d234b70', 'Administrador'),
(8, 'Christhian', 'Meza Taipe', 'alterno896@gmail.com', '202cb962ac59075b964b07152d234b70', 'Administrador'),
(15, 'Luz', 'Meza', 'luzmeza@hotmail.com', '58a9484f31f1fba80370617b48032ea1', 'Común'),
(16, 'Cristian', 'Ginez', 'lol@xd.com', '9cdfb439c7876e703e307864c9167a15', 'Común'),
(17, 'Juan Carlos', 'Sanchez Pajuelo', 'j.sanchez@gmail.com', '27236ed7e006e3b297a07be8220407a9', 'Administrador'),
(18, 'Carlos', 'Meza Huamani', 'c.meza@gmail.com', '202cb962ac59075b964b07152d234b70', 'Administrador'),
(19, 'Armando', 'Larumbe Castillo', 'a.larumbe@gmail.com', '5ae42c9053dfad0e4fdf45130ab46bd0', 'Común'),
(20, 'juan ', 'perez', 'juan@gmail.com', '202cb962ac59075b964b07152d234b70', 'Común'),
(21, 'juan', 'perez', 'pepe@gmail.com', '202cb962ac59075b964b07152d234b70', 'Común'),
(22, 'Renzo', 'Calle Islachin', 'r.calle@gmail.com', 'a3d0aa55faf4950fec99f8464daa9888', 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` int(11) NOT NULL,
  `op_gravada` double NOT NULL,
  `igv` double NOT NULL,
  `importe` double NOT NULL,
  `pago` double NOT NULL,
  `vuelto` double NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `hora` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `nombre`, `dni`, `op_gravada`, `igv`, `importe`, `pago`, `vuelto`, `fecha`, `hora`) VALUES
(43, 'Juan Perez Garcia', 48795148, 6, 1.08, 7.08, 10, 2.92, '2023-12-07', '18:49:32'),
(44, 'Fernando Salazar Vallejo', 48515718, 156.4, 28.15, 184.55, 200, 15.45, '2023-12-08', '11:21:36');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
