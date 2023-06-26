package Vista;

import Controlador.ControladorEncargado;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.border.EmptyBorder;

public class App_Inicio extends javax.swing.JFrame {

    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    public App_Inicio() {
        initComponents();
        setLocationRelativeTo(null);

        //Código para colocarle un padding a los JtextField
        Campo_correoSesion.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_contrasenaSesion.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

    }//Constructor interfaz gráfica

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        Panel_Fondo_Azul = new javax.swing.JPanel();
        Panel_InicioSesion = new javax.swing.JPanel();
        Label_TituloInicioSesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Label_texto_correo = new javax.swing.JLabel();
        Campo_correoSesion = new javax.swing.JTextField();
        Campo_contrasenaSesion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Panel_Boton_Conectarse = new javax.swing.JPanel();
        Label_Texto_Conectarse = new javax.swing.JLabel();
        Fondo_Logo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel_Fondo_Azul.setBackground(new java.awt.Color(69, 186, 251));

        Panel_InicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        Panel_InicioSesion.setPreferredSize(new java.awt.Dimension(366, 306));

        Label_TituloInicioSesion.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Label_TituloInicioSesion.setForeground(new java.awt.Color(0, 14, 20));
        Label_TituloInicioSesion.setText("Inicio sesión encargado");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Label_texto_correo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Label_texto_correo.setText("Correo asignado *");

        Campo_correoSesion.setBackground(new java.awt.Color(234, 233, 240));
        Campo_correoSesion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_correoSesion.setBorder(null);
        Campo_correoSesion.setPreferredSize(new java.awt.Dimension(286, 33));

        Campo_contrasenaSesion.setBackground(new java.awt.Color(234, 233, 240));
        Campo_contrasenaSesion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_contrasenaSesion.setBorder(null);
        Campo_contrasenaSesion.setPreferredSize(new java.awt.Dimension(286, 33));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel5.setText("Contraseña *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_texto_correo)
                    .addComponent(Campo_correoSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Campo_contrasenaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_texto_correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_correoSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_contrasenaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Panel_Boton_Conectarse.setBackground(new java.awt.Color(224, 169, 96));
        Panel_Boton_Conectarse.setPreferredSize(new java.awt.Dimension(169, 42));

        Label_Texto_Conectarse.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_Texto_Conectarse.setForeground(new java.awt.Color(0, 14, 20));
        Label_Texto_Conectarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Texto_Conectarse.setText("CONECTARSE");
        Label_Texto_Conectarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Texto_Conectarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label_Texto_ConectarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_Texto_ConectarseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_Texto_ConectarseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Boton_ConectarseLayout = new javax.swing.GroupLayout(Panel_Boton_Conectarse);
        Panel_Boton_Conectarse.setLayout(Panel_Boton_ConectarseLayout);
        Panel_Boton_ConectarseLayout.setHorizontalGroup(
            Panel_Boton_ConectarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Texto_Conectarse, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        Panel_Boton_ConectarseLayout.setVerticalGroup(
            Panel_Boton_ConectarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Texto_Conectarse, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Panel_Boton_Conectarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(Panel_Boton_Conectarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Panel_InicioSesionLayout = new javax.swing.GroupLayout(Panel_InicioSesion);
        Panel_InicioSesion.setLayout(Panel_InicioSesionLayout);
        Panel_InicioSesionLayout.setHorizontalGroup(
            Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                .addGroup(Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Label_TituloInicioSesion))
                    .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Panel_InicioSesionLayout.setVerticalGroup(
            Panel_InicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InicioSesionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Label_TituloInicioSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Fondo_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        Fondo_Logo.setPreferredSize(new java.awt.Dimension(169, 57));

        javax.swing.GroupLayout Panel_Fondo_AzulLayout = new javax.swing.GroupLayout(Panel_Fondo_Azul);
        Panel_Fondo_Azul.setLayout(Panel_Fondo_AzulLayout);
        Panel_Fondo_AzulLayout.setHorizontalGroup(
            Panel_Fondo_AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Fondo_AzulLayout.createSequentialGroup()
                .addGroup(Panel_Fondo_AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Fondo_AzulLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(Fondo_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_Fondo_AzulLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(Panel_InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        Panel_Fondo_AzulLayout.setVerticalGroup(
            Panel_Fondo_AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Fondo_AzulLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(Fondo_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Panel_InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Fondo_Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Fondo_Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label_Texto_ConectarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Texto_ConectarseMousePressed

        ControladorEncargado consultaEncargado = new ControladorEncargado();

        //Realizando una consulta a la base de datos para verificar datos ingresados a la aplicación
        String correoE = Campo_correoSesion.getText();
        String contraseñaE = Campo_contrasenaSesion.getText();

        ResultSet resultadoConsulta = consultaEncargado.ConsultaBaseDeDatosEncargados(correoE, contraseñaE);

        //Generando datos de fechas y horas
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaIngreso = LocalTime.now();

        //Verificamos que la consulta traiga datos indicando que si encontró la coincidencia de valores en la base de datos
        try {

            if (resultadoConsulta.next()) {

                InterfazPrincipal objIP = new InterfazPrincipal();
                objIP.setVisible(true);
                dispose();

                int cedula = Integer.parseInt(resultadoConsulta.getString("cedula"));

                consultaEncargado.GuardarRegistroSesion(fechaActual, horaIngreso, cedula);

            } else {

                //En esta parte, si el resultado no trae datos indica que las credenciales ingresadas no son las correctas.
                //Por lo tanto, despliega un mensaje de advertencia
                Error_InicioSesion objEI = new Error_InicioSesion();
                objEI.setVisible(true);

            }//Fin condición

        } catch (SQLException e) {
            System.out.println(e);
        }//Fin catch


    }//GEN-LAST:event_Label_Texto_ConectarseMousePressed

    private void Label_Texto_ConectarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Texto_ConectarseMouseEntered

        Panel_Boton_Conectarse.setBackground(Color.decode("#C39456"));

    }//GEN-LAST:event_Label_Texto_ConectarseMouseEntered

    private void Label_Texto_ConectarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Texto_ConectarseMouseExited

        Panel_Boton_Conectarse.setBackground(Color.decode("#E0A960"));

    }//GEN-LAST:event_Label_Texto_ConectarseMouseExited

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
            java.util.logging.Logger.getLogger(App_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_contrasenaSesion;
    private javax.swing.JTextField Campo_correoSesion;
    private javax.swing.JLabel Fondo_Logo;
    private javax.swing.JLabel Label_Texto_Conectarse;
    private javax.swing.JLabel Label_TituloInicioSesion;
    private javax.swing.JLabel Label_texto_correo;
    private javax.swing.JPanel Panel_Boton_Conectarse;
    private javax.swing.JPanel Panel_Fondo_Azul;
    private javax.swing.JPanel Panel_InicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
