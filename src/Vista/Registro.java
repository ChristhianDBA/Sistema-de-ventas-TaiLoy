package Vista;

import javax.swing.JOptionPane;
import Conexion.ConexionMysql;
import java.awt.Color;
import java.sql.Connection;
import java.sql.*;

public class Registro extends javax.swing.JFrame {

    int xMouse, yMouse;
    Conexion.ConexionMysql con = new ConexionMysql();
    Connection cn = con.conectar();

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        tfApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tfCorreoElectronico = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tfContraseña = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        comboTipo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JPanel();
        txtGuardar = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JPanel();
        txtNuevo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tayloy Logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 95, 76));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registrarse");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 133, 37));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondologo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 233, -1));

        tfNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tfNombre.setText("Nombre");
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 154, -1, 29));

        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese su Nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 189, 258, 25));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 220, 258, -1));

        tfApellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tfApellido.setText("Apellido");
        jPanel1.add(tfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 241, -1, 24));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("Ingrese su Apellido");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 271, 258, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 297, 258, -1));

        tfCorreoElectronico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tfCorreoElectronico.setText("Correo Electronico");
        jPanel1.add(tfCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 318, -1, 24));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese su Correo");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 348, 258, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 374, 258, -1));

        tfContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tfContraseña.setText("Contraseña");
        jPanel1.add(tfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 395, -1, 24));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 448, 258, -1));

        txtContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("**********");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 425, 258, -1));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Común", "Administrador" }));
        comboTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 323, 158, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 102));
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtGuardar.setForeground(new java.awt.Color(0, 204, 0));
        txtGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGuardar.setText("Guardar");
        txtGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(0, 162, 92));
        btnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtNuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNuevo.setForeground(new java.awt.Color(255, 255, 102));
        txtNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNuevo.setText("Nuevo");
        txtNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNuevoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNuevoLayout = new javax.swing.GroupLayout(btnNuevo);
        btnNuevo.setLayout(btnNuevoLayout);
        btnNuevoLayout.setHorizontalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnNuevoLayout.setVerticalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));

        txtSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalir.setText("X");
        txtSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 481, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("Ingrese su Nombre")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }

        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Ingrese su Apellido");
            txtApellido.setForeground(new Color(204, 204, 204));
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su Correo");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }

        if (String.valueOf(txtContraseña.getPassword()).isEmpty()) {
            txtContraseña.setText("**********");
            txtContraseña.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed

    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed

        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese su Nombre");
            txtNombre.setForeground(new Color(204, 204, 204));
        }

        if (txtApellido.getText().equals("Ingrese su Apellido")) {
            txtApellido.setText("");
            txtApellido.setForeground(Color.black);
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su Correo");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }

        if (String.valueOf(txtContraseña.getPassword()).isEmpty()) {
            txtContraseña.setText("**********");
            txtContraseña.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed

        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese su Nombre");
            txtNombre.setForeground(new Color(204, 204, 204));
        }

        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Ingrese su Apellido");
            txtApellido.setForeground(new Color(204, 204, 204));
        }

        if (txtCorreo.getText().equals("Ingrese su Correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }

        if (String.valueOf(txtContraseña.getPassword()).isEmpty()) {
            txtContraseña.setText("**********");
            txtContraseña.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed

        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese su Nombre");
            txtNombre.setForeground(new Color(204, 204, 204));
        }

        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Ingrese su Apellido");
            txtApellido.setForeground(new Color(204, 204, 204));
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su Correo");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }

        if (String.valueOf(txtContraseña.getPassword()).equals("**********")) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }


    }//GEN-LAST:event_txtContraseñaMousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void txtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseClicked
        int rpta;
        rpta = JOptionPane.showConfirmDialog(this, "¿Estas seguro?", "Salir", 0);
        if (rpta == 0) {
            Login a = new Login();
            a.show();
            this.setVisible(false);
            //dispose();
        }
    }//GEN-LAST:event_txtSalirMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    private void txtGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseClicked
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String contraseña = txtContraseña.getText();
        String tipousuario = comboTipo.getSelectedItem().toString();

        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR TODOS LOS DATOS");
        } else {
            if (tipousuario.equalsIgnoreCase("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "DEBE DE SELECCIONAR UN TIPO DE USUARIO");
            } else {
                try {
                    String consulta = "INSERT INTO usuarios (nombre,apellido,correo,clave,tipo_nivel) VALUES ('" + nombre + "','" + apellido + "','" + correo + "','" + contraseña + "','" + tipousuario + "')";
                    PreparedStatement ps = cn.prepareStatement(consulta);
                    ps.executeUpdate();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR USUARIO" + e);
                }

            }

        }

    }//GEN-LAST:event_txtGuardarMouseClicked

    private void txtNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoMouseClicked
        txtNombre.setText("");
        txtApellido.setText("");
        txtContraseña.setText("");
        txtCorreo.setText("");
        txtNombre.requestFocus();
    }//GEN-LAST:event_txtNuevoMouseClicked

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseEntered
        btnGuardar.setBackground(new Color(196, 196, 79));
        txtGuardar.setForeground(Color.white);
    }//GEN-LAST:event_txtGuardarMouseEntered

    private void txtGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseExited
        btnGuardar.setBackground(new Color(255, 255, 102));
        txtGuardar.setForeground(new Color(0, 204, 0));
    }//GEN-LAST:event_txtGuardarMouseExited

    private void txtNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoMouseEntered
        btnNuevo.setBackground(new Color(0, 125, 71));
        txtNuevo.setForeground(Color.white);

    }//GEN-LAST:event_txtNuevoMouseEntered

    private void txtNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoMouseExited
        btnNuevo.setBackground(new Color(0, 162, 92));
        txtNuevo.setForeground(new Color(255, 255, 102));

    }//GEN-LAST:event_txtNuevoMouseExited

    private void txtSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseEntered
        btnSalir.setBackground(Color.red);
        txtSalir.setForeground(Color.white);

    }//GEN-LAST:event_txtSalirMouseEntered

    private void txtSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseExited
        btnSalir.setBackground(new Color(255, 255, 255));
        txtSalir.setForeground(Color.black);
    }//GEN-LAST:event_txtSalirMouseExited

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != '@' && c != '.' && !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtContraseña.setText("");
        txtCorreo.setText("");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel tfApellido;
    private javax.swing.JLabel tfContraseña;
    private javax.swing.JLabel tfCorreoElectronico;
    private javax.swing.JLabel tfNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNuevo;
    private javax.swing.JLabel txtSalir;
    // End of variables declaration//GEN-END:variables
}
