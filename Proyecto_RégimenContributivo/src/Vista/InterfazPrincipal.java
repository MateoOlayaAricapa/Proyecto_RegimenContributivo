package Vista;

import Vista.Paneles.Panel_ActualizarInformacion;
import Vista.Paneles.Panel_Beneficiarios;
import Vista.Paneles.Panel_Cotizantes;
import Vista.Paneles.Panel_ProcedimientoCirugia;
import Vista.Paneles.Panel_ProcedimientoConsultaMedica;
import Vista.Paneles.Panel_ReportesGenerales;
import Vista.Paneles.Panel_ReportesIPS;
import java.awt.Color;

public class InterfazPrincipal extends javax.swing.JFrame {

    //Invocando un objeto del panel cotizantes y demás
    Panel_Cotizantes PC;
    Panel_Beneficiarios PB;
    Panel_ProcedimientoCirugia PPC;
    Panel_ProcedimientoConsultaMedica PPCM;
    Panel_ReportesGenerales PRG;
    Panel_ReportesIPS PRI;
    Panel_ActualizarInformacion PAI;

    public InterfazPrincipal() {

        initComponents();
        setLocationRelativeTo(null);

        Boton_cotizantes.setBackground(Color.decode("#45BAFB"));
        Boton_beneficiario.setBackground(Color.decode("#45BAFB"));
        Boton_ConsultaMedica.setBackground(Color.decode("#45BAFB"));
        Boton_PCirugia.setBackground(Color.decode("#45BAFB"));
        Boton_IPS.setBackground(Color.decode("#45BAFB"));
        Boton_Pacientes.setBackground(Color.decode("#45BAFB"));
        Boton_desconectarse.setBackground(Color.decode("#45BAFB"));
        Boton_ActualizarDatos.setBackground(Color.decode("#45BAFB"));

        Boton_cotizantes.setBorderPainted(false);
        Boton_cotizantes.setFocusPainted(false);

        IniciandoPanelPrincipal();

    }//Fin constructor

    //Creando método que inicia al principio el panel de cotizantes
    private void IniciandoPanelPrincipal() {

        PC = new Panel_Cotizantes();
        PC.setSize(759, 679);

        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PC);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//Fin método

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo_principal = new javax.swing.JPanel();
        ContenidoPaneles = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Panel_Menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Boton_cotizantes = new javax.swing.JButton();
        Boton_beneficiario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Boton_PCirugia = new javax.swing.JButton();
        Boton_ConsultaMedica = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Boton_IPS = new javax.swing.JButton();
        Boton_Pacientes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Boton_desconectarse = new javax.swing.JButton();
        Boton_ActualizarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        Fondo_principal.setBackground(new java.awt.Color(69, 186, 251));

        ContenidoPaneles.setBackground(new java.awt.Color(255, 255, 255));
        ContenidoPaneles.setPreferredSize(new java.awt.Dimension(759, 679));

        javax.swing.GroupLayout ContenidoPanelesLayout = new javax.swing.GroupLayout(ContenidoPaneles);
        ContenidoPaneles.setLayout(ContenidoPanelesLayout);
        ContenidoPanelesLayout.setHorizontalGroup(
            ContenidoPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        ContenidoPanelesLayout.setVerticalGroup(
            ContenidoPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo2.png"))); // NOI18N

        Panel_Menu.setBackground(new java.awt.Color(69, 186, 251));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 14, 20));
        jLabel2.setText("USUARIOS");

        Boton_cotizantes.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_cotizantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenCotizante.png"))); // NOI18N
        Boton_cotizantes.setText("Cotizante");
        Boton_cotizantes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_cotizantes.setBorderPainted(false);
        Boton_cotizantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_cotizantes.setFocusPainted(false);
        Boton_cotizantes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_cotizantes.setIconTextGap(8);
        Boton_cotizantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cotizantesActionPerformed(evt);
            }
        });

        Boton_beneficiario.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_beneficiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenBeneficiarios.png"))); // NOI18N
        Boton_beneficiario.setText("Beneficiario");
        Boton_beneficiario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_beneficiario.setBorderPainted(false);
        Boton_beneficiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_beneficiario.setFocusPainted(false);
        Boton_beneficiario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_beneficiario.setIconTextGap(8);
        Boton_beneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_beneficiarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 14, 20));
        jLabel3.setText("PROCEDIMIENTOS");

        Boton_PCirugia.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_PCirugia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenCirugia.png"))); // NOI18N
        Boton_PCirugia.setText("P. Cirugía");
        Boton_PCirugia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_PCirugia.setBorderPainted(false);
        Boton_PCirugia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_PCirugia.setFocusPainted(false);
        Boton_PCirugia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_PCirugia.setIconTextGap(8);
        Boton_PCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PCirugiaActionPerformed(evt);
            }
        });

        Boton_ConsultaMedica.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_ConsultaMedica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenConsulta.png"))); // NOI18N
        Boton_ConsultaMedica.setText("P. Consulta Médica");
        Boton_ConsultaMedica.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_ConsultaMedica.setBorderPainted(false);
        Boton_ConsultaMedica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_ConsultaMedica.setFocusPainted(false);
        Boton_ConsultaMedica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_ConsultaMedica.setIconTextGap(8);
        Boton_ConsultaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ConsultaMedicaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 14, 20));
        jLabel4.setText("REPORTES");

        Boton_IPS.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_IPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIPS.png"))); // NOI18N
        Boton_IPS.setText("IPS");
        Boton_IPS.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_IPS.setBorderPainted(false);
        Boton_IPS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_IPS.setFocusPainted(false);
        Boton_IPS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_IPS.setIconTextGap(8);
        Boton_IPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_IPSActionPerformed(evt);
            }
        });

        Boton_Pacientes.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_Pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenPacientes.png"))); // NOI18N
        Boton_Pacientes.setText("Pacientes");
        Boton_Pacientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_Pacientes.setBorderPainted(false);
        Boton_Pacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Pacientes.setFocusPainted(false);
        Boton_Pacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_Pacientes.setIconTextGap(8);
        Boton_Pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PacientesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 14, 20));
        jLabel5.setText("ACTUALIZAR");

        Boton_desconectarse.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_desconectarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenDesconectarse.png"))); // NOI18N
        Boton_desconectarse.setText("Desconectarse");
        Boton_desconectarse.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_desconectarse.setBorderPainted(false);
        Boton_desconectarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_desconectarse.setFocusPainted(false);
        Boton_desconectarse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_desconectarse.setIconTextGap(8);
        Boton_desconectarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_desconectarseActionPerformed(evt);
            }
        });

        Boton_ActualizarDatos.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Boton_ActualizarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenActualizar.png"))); // NOI18N
        Boton_ActualizarDatos.setText("Información");
        Boton_ActualizarDatos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Boton_ActualizarDatos.setBorderPainted(false);
        Boton_ActualizarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_ActualizarDatos.setFocusPainted(false);
        Boton_ActualizarDatos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_ActualizarDatos.setIconTextGap(8);
        Boton_ActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualizarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_MenuLayout = new javax.swing.GroupLayout(Panel_Menu);
        Panel_Menu.setLayout(Panel_MenuLayout);
        Panel_MenuLayout.setHorizontalGroup(
            Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_cotizantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_beneficiario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(Boton_PCirugia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_ConsultaMedica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(Boton_Pacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_IPS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Boton_desconectarse, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(Boton_ActualizarDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel_MenuLayout.setVerticalGroup(
            Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MenuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_cotizantes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_beneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_PCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_ConsultaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_IPS, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_ActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(Boton_desconectarse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Fondo_principalLayout = new javax.swing.GroupLayout(Fondo_principal);
        Fondo_principal.setLayout(Fondo_principalLayout);
        Fondo_principalLayout.setHorizontalGroup(
            Fondo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo_principalLayout.createSequentialGroup()
                .addGroup(Fondo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(Fondo_principalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ContenidoPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Fondo_principalLayout.setVerticalGroup(
            Fondo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo_principalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Fondo_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContenidoPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_desconectarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_desconectarseActionPerformed

        App_Inicio objAPI = new App_Inicio();
        objAPI.setVisible(true);
        dispose();

    }//GEN-LAST:event_Boton_desconectarseActionPerformed

    private void Boton_beneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_beneficiarioActionPerformed

        PB = new Panel_Beneficiarios();
        PB.setSize(759, 679);
        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PB);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//GEN-LAST:event_Boton_beneficiarioActionPerformed

    private void Boton_cotizantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cotizantesActionPerformed

        PC = new Panel_Cotizantes();
        PC.setSize(759, 679);

        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PC);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//GEN-LAST:event_Boton_cotizantesActionPerformed

    private void Boton_PCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PCirugiaActionPerformed

        PPC = new Panel_ProcedimientoCirugia();
        PPC.setSize(759, 679);
        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PPC);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//GEN-LAST:event_Boton_PCirugiaActionPerformed

    private void Boton_ConsultaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ConsultaMedicaActionPerformed

        PPCM = new Panel_ProcedimientoConsultaMedica();
        PPCM.setSize(759, 679);
        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PPCM);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//GEN-LAST:event_Boton_ConsultaMedicaActionPerformed

    private void Boton_PacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PacientesActionPerformed

        PRG = new Panel_ReportesGenerales();
        PRG.setSize(759, 679);
        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PRG);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//GEN-LAST:event_Boton_PacientesActionPerformed

    private void Boton_IPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_IPSActionPerformed

        PRI = new Panel_ReportesIPS();
        PRI.setSize(759, 679);
        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PRI);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//GEN-LAST:event_Boton_IPSActionPerformed

    private void Boton_ActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualizarDatosActionPerformed

        PAI = new Panel_ActualizarInformacion();
        PAI.setSize(759, 679);
        ContenidoPaneles.removeAll();
        ContenidoPaneles.add(PAI);
        ContenidoPaneles.revalidate();
        ContenidoPaneles.repaint();

    }//GEN-LAST:event_Boton_ActualizarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_ActualizarDatos;
    private javax.swing.JButton Boton_ConsultaMedica;
    private javax.swing.JButton Boton_IPS;
    private javax.swing.JButton Boton_PCirugia;
    private javax.swing.JButton Boton_Pacientes;
    private javax.swing.JButton Boton_beneficiario;
    private javax.swing.JButton Boton_cotizantes;
    private javax.swing.JButton Boton_desconectarse;
    private javax.swing.JPanel ContenidoPaneles;
    private javax.swing.JPanel Fondo_principal;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Panel_Menu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
