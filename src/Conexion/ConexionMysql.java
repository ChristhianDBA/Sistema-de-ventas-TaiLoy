package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConexionMysql {

    Connection cn;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Referencia a Driver de conexion a bd
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_ventastailoy", "root", "");//establecer
            System.out.println("CONECTADO");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXIÓN DE BASE DE DATOS " + e);
        }
        return cn;
    }
    public Connection getConnection(){
        return cn;
    } 
}
