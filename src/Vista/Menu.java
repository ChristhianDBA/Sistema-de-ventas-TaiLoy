/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/menu image.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JPanel();
        txtHistorial = new javax.swing.JLabel();
        btnSalirSesion = new javax.swing.JPanel();
        txtSalirSesion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCuentas = new javax.swing.JPanel();
        txtCuentas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Login = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JfVentas = new javax.swing.JMenuItem();
        JfNuevoProducto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 162, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 51));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, 30));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 840, 750));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu image.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 320, 390));

        btnHistorial.setBackground(new java.awt.Color(255, 255, 102));
        btnHistorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtHistorial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtHistorial.setForeground(new java.awt.Color(0, 204, 0));
        txtHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHistorial.setText("Historial");
        txtHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtHistorialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnHistorialLayout = new javax.swing.GroupLayout(btnHistorial);
        btnHistorial.setLayout(btnHistorialLayout);
        btnHistorialLayout.setHorizontalGroup(
            btnHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        btnHistorialLayout.setVerticalGroup(
            btnHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 200, 40));

        btnSalirSesion.setBackground(new java.awt.Color(255, 51, 0));
        btnSalirSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSalirSesion.setBackground(new java.awt.Color(255, 102, 102));
        txtSalirSesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtSalirSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalirSesion.setText("Cerrar sesión");
        txtSalirSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSalirSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalirSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSalirSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSalirSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalirSesionLayout = new javax.swing.GroupLayout(btnSalirSesion);
        btnSalirSesion.setLayout(btnSalirSesionLayout);
        btnSalirSesionLayout.setHorizontalGroup(
            btnSalirSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtSalirSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnSalirSesionLayout.setVerticalGroup(
            btnSalirSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtSalirSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnSalirSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 120, 30));

        jPanel2.setBackground(new java.awt.Color(0, 162, 92));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 130));

        btnCuentas.setBackground(new java.awt.Color(255, 255, 102));
        btnCuentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCuentas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCuentas.setForeground(new java.awt.Color(0, 204, 0));
        txtCuentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCuentas.setText("Registro");
        txtCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCuentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCuentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCuentasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCuentasLayout = new javax.swing.GroupLayout(btnCuentas);
        btnCuentas.setLayout(btnCuentasLayout);
        btnCuentasLayout.setHorizontalGroup(
            btnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        btnCuentasLayout.setVerticalGroup(
            btnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(btnCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu image - copia.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 220, 650));

        jMenu1.setText("File");

        Login.setText("Salir");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jMenu1.add(Login);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Operaciones");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        JfVentas.setText("Menu ventas");
        JfVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfVentasActionPerformed(evt);
            }
        });
        jMenu3.add(JfVentas);

        JfNuevoProducto.setText("Nuevo producto");
        JfNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfNuevoProductoActionPerformed(evt);
            }
        });
        jMenu3.add(JfNuevoProducto);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalirSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirSesionMouseClicked
        int rpta;
        rpta = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar sesión?", "Salir", 0);
        if (rpta == 0) {
            Login a = new Login();
            a.show();
            this.setVisible(false);
            //dispose();
        }
    }//GEN-LAST:event_txtSalirSesionMouseClicked

    private void txtHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHistorialMouseClicked
        Historial x = new Historial ();
        x.show();
        this.setVisible(false);
    }//GEN-LAST:event_txtHistorialMouseClicked

    private void txtHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHistorialMouseEntered
        btnHistorial.setBackground(new Color(204,204,82));
        txtHistorial.setForeground(Color.white);
    }//GEN-LAST:event_txtHistorialMouseEntered

    private void txtHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHistorialMouseExited
        btnHistorial.setBackground(new Color(255,255,102));
        txtHistorial.setForeground(new Color(0,204,51));
    }//GEN-LAST:event_txtHistorialMouseExited

    private void txtSalirSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirSesionMouseEntered
        btnSalirSesion.setBackground(new Color(196,39,0));
        txtSalirSesion.setForeground(Color.white);
    }//GEN-LAST:event_txtSalirSesionMouseEntered

    private void txtSalirSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirSesionMouseExited
        btnSalirSesion.setBackground(new Color(255,51,0));
        txtSalirSesion.setForeground(Color.black);
    }//GEN-LAST:event_txtSalirSesionMouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x= evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void JfNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfNuevoProductoActionPerformed
        JIJfNuevoProducto a = new JIJfNuevoProducto();
        jDesktopPane1.add(a);
        a.show();
        
    }//GEN-LAST:event_JfNuevoProductoActionPerformed

    private void JfVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfVentasActionPerformed
        JIJfVentas a = new JIJfVentas();
        jDesktopPane1.add(a);
        a.show();
        
    }//GEN-LAST:event_JfVentasActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Login a = new Login ();
        a.show();
        this.setVisible(false);
    }//GEN-LAST:event_LoginActionPerformed

    private void txtCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCuentasMouseClicked
        Cuentas a =  new Cuentas ();
        a.show();
        this.setVisible(false);
    }//GEN-LAST:event_txtCuentasMouseClicked

    private void txtCuentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCuentasMouseEntered
        btnCuentas.setBackground(new Color(204,204,82));
        txtCuentas.setForeground(Color.white);
    }//GEN-LAST:event_txtCuentasMouseEntered

    private void txtCuentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCuentasMouseExited
        btnCuentas.setBackground(new Color(255,255,102));
        txtCuentas.setForeground(new Color(0,204,51));
    }//GEN-LAST:event_txtCuentasMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JfNuevoProducto;
    private javax.swing.JMenuItem JfVentas;
    private javax.swing.JMenuItem Login;
    private javax.swing.JPanel btnCuentas;
    private javax.swing.JPanel btnHistorial;
    private javax.swing.JPanel btnSalirSesion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtCuentas;
    private javax.swing.JLabel txtHistorial;
    private javax.swing.JLabel txtSalirSesion;
    // End of variables declaration//GEN-END:variables
}
