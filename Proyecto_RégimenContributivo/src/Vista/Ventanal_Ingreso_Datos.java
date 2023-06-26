package Vista;

import Modelo.Beneficiario;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.border.EmptyBorder;

public class Ventanal_Ingreso_Datos extends javax.swing.JFrame {

    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    //Creando un objeto de la clase Beneficiario
    Beneficiario objBeneficiario;

    public Ventanal_Ingreso_Datos() {
        initComponents();
        PaddingTextField();
        setLocationRelativeTo(null);
    }//Fin constructor

    private void PaddingTextField() {

        Campo_apellidoB.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_nombreB.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_direccionB.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_identificacionB.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

    }//Fin método

    //Métodos set y get
    public Beneficiario getObjBeneficiario() {
        return objBeneficiario;
    }

    public void setObjBeneficiario(Beneficiario objBeneficiario) {
        this.objBeneficiario = objBeneficiario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Campo_nombreB = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Campo_apellidoB = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Campo_direccionB = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Combo_generoB = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Label_FotoPerfil1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Label_Boton_SubirFotoB = new javax.swing.JLabel();
        DateChooser_FechaNacimientoB = new com.toedter.calendar.JDateChooser();
        Combo_relacionB = new javax.swing.JComboBox<>();
        Combo_TipoIdentificacion = new javax.swing.JComboBox<>();
        Campo_identificacionB = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        Panel_BotonGuardarDatos1 = new javax.swing.JPanel();
        AgregarDatosBeneficiarios = new javax.swing.JLabel();
        Panel_Boton_BorrarDatos = new javax.swing.JPanel();
        Cerrar_ventanaB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setPreferredSize(new java.awt.Dimension(667, 302));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 14, 20));
        jLabel11.setText("Nombre *");

        Campo_nombreB.setBackground(new java.awt.Color(247, 246, 249));
        Campo_nombreB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_nombreB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_nombreB.setPreferredSize(new java.awt.Dimension(151, 28));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 14, 20));
        jLabel13.setText("Apellido *");

        Campo_apellidoB.setBackground(new java.awt.Color(247, 246, 249));
        Campo_apellidoB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_apellidoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_apellidoB.setPreferredSize(new java.awt.Dimension(132, 28));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 14, 20));
        jLabel14.setText("Relación *");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 14, 20));
        jLabel15.setText("Tipo de identificación *");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 14, 20));
        jLabel16.setText("Identificación *");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 14, 20));
        jLabel17.setText("Dirección *");

        Campo_direccionB.setBackground(new java.awt.Color(247, 246, 249));
        Campo_direccionB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_direccionB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_direccionB.setPreferredSize(new java.awt.Dimension(151, 28));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 14, 20));
        jLabel18.setText("Genero *");

        Combo_generoB.setBackground(new java.awt.Color(217, 217, 217));
        Combo_generoB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_generoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No definido" }));
        Combo_generoB.setPreferredSize(new java.awt.Dimension(134, 28));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 14, 20));
        jLabel19.setText("Fecha *");

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 14, 20)));

        Label_FotoPerfil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_FotoPerfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenPerfil.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(154, 154, 155));
        jLabel20.setText("Subir una imagen o foto que represente al beneficiario.");

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(154, 154, 155));
        jLabel21.setText("Además, se recomienda un tamaño máximo de 5 MB.");

        jPanel8.setBackground(new java.awt.Color(224, 169, 96));
        jPanel8.setPreferredSize(new java.awt.Dimension(112, 35));

        Label_Boton_SubirFotoB.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Label_Boton_SubirFotoB.setForeground(new java.awt.Color(0, 14, 20));
        Label_Boton_SubirFotoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Boton_SubirFotoB.setText("Subir foto");
        Label_Boton_SubirFotoB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Boton_SubirFotoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_Boton_SubirFotoBMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Boton_SubirFotoB, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Boton_SubirFotoB, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Label_FotoPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_FotoPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Combo_relacionB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_relacionB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papá", "Mamá", "Esposa", "Esposo", "Hijo", "Hija" }));
        Combo_relacionB.setPreferredSize(new java.awt.Dimension(103, 28));

        Combo_TipoIdentificacion.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_TipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Tarjeta de identidad" }));

        Campo_identificacionB.setBackground(new java.awt.Color(247, 246, 249));
        Campo_identificacionB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_identificacionB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_identificacionB.setPreferredSize(new java.awt.Dimension(132, 28));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Campo_direccionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Campo_apellidoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Combo_relacionB, 0, 111, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Combo_generoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DateChooser_FechaNacimientoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Combo_TipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Campo_identificacionB, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Campo_nombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Campo_apellidoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Combo_relacionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(Campo_identificacionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_TipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Campo_direccionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(Combo_generoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(DateChooser_FechaNacimientoB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setPreferredSize(new java.awt.Dimension(667, 53));

        Panel_BotonGuardarDatos1.setBackground(new java.awt.Color(224, 169, 96));
        Panel_BotonGuardarDatos1.setPreferredSize(new java.awt.Dimension(163, 29));

        AgregarDatosBeneficiarios.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        AgregarDatosBeneficiarios.setForeground(new java.awt.Color(0, 14, 20));
        AgregarDatosBeneficiarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarDatosBeneficiarios.setText("Agregar datos");
        AgregarDatosBeneficiarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarDatosBeneficiarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgregarDatosBeneficiariosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotonGuardarDatos1Layout = new javax.swing.GroupLayout(Panel_BotonGuardarDatos1);
        Panel_BotonGuardarDatos1.setLayout(Panel_BotonGuardarDatos1Layout);
        Panel_BotonGuardarDatos1Layout.setHorizontalGroup(
            Panel_BotonGuardarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgregarDatosBeneficiarios, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Panel_BotonGuardarDatos1Layout.setVerticalGroup(
            Panel_BotonGuardarDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgregarDatosBeneficiarios, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        Panel_Boton_BorrarDatos.setBackground(new java.awt.Color(224, 169, 96));
        Panel_Boton_BorrarDatos.setPreferredSize(new java.awt.Dimension(163, 29));

        Cerrar_ventanaB.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Cerrar_ventanaB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar_ventanaB.setText("Cancelar");
        Cerrar_ventanaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar_ventanaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Cerrar_ventanaBMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Boton_BorrarDatosLayout = new javax.swing.GroupLayout(Panel_Boton_BorrarDatos);
        Panel_Boton_BorrarDatos.setLayout(Panel_Boton_BorrarDatosLayout);
        Panel_Boton_BorrarDatosLayout.setHorizontalGroup(
            Panel_Boton_BorrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cerrar_ventanaB, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Panel_Boton_BorrarDatosLayout.setVerticalGroup(
            Panel_Boton_BorrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cerrar_ventanaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(Panel_BotonGuardarDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Panel_Boton_BorrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_BotonGuardarDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Panel_Boton_BorrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label_Boton_SubirFotoBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Boton_SubirFotoBMousePressed

    }//GEN-LAST:event_Label_Boton_SubirFotoBMousePressed

    private void AgregarDatosBeneficiariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarDatosBeneficiariosMousePressed

        String tipoIdentificacion = Combo_TipoIdentificacion.getSelectedItem().toString();
        String nombre = Campo_nombreB.getText();
        String apellido = Campo_apellidoB.getText();
        String relacion = Combo_relacionB.getSelectedItem().toString();
        int identificacion = Integer.parseInt(Campo_identificacionB.getText());
        String direccion = Campo_direccionB.getText();
        String genero = Combo_generoB.getSelectedItem().toString();

        //Modificando la fecha obtenida del campo
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormato = formatoFecha.format(DateChooser_FechaNacimientoB.getDate());
        LocalDate fechaNacimientoB = LocalDate.parse(fechaFormato);

        //Creando un objeto de la clase beneficiario
        objBeneficiario = new Beneficiario(tipoIdentificacion, identificacion, relacion, nombre, apellido, fechaNacimientoB, genero, direccion);
        
        dispose();

    }//GEN-LAST:event_AgregarDatosBeneficiariosMousePressed

    private void Cerrar_ventanaBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar_ventanaBMousePressed

        dispose();

    }//GEN-LAST:event_Cerrar_ventanaBMousePressed

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
            java.util.logging.Logger.getLogger(Ventanal_Ingreso_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanal_Ingreso_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanal_Ingreso_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanal_Ingreso_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanal_Ingreso_Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgregarDatosBeneficiario;
    private javax.swing.JLabel AgregarDatosBeneficiarios;
    private javax.swing.JTextField Campo_apellidoB;
    private javax.swing.JTextField Campo_apellidoC;
    private javax.swing.JTextField Campo_cedulaC;
    private javax.swing.JTextField Campo_correoC;
    private javax.swing.JTextField Campo_direccionB;
    private javax.swing.JTextField Campo_direccionC;
    private javax.swing.JTextField Campo_identificacionB;
    private javax.swing.JTextField Campo_nombreB;
    private javax.swing.JTextField Campo_nombreC;
    private javax.swing.JTextField Campo_telefonoC;
    private javax.swing.JLabel Cerrar_ventanaB;
    private javax.swing.JComboBox<String> Combo_TipoIdentificacion;
    private javax.swing.JComboBox<String> Combo_genero;
    private javax.swing.JComboBox<String> Combo_generoB;
    private javax.swing.JComboBox<String> Combo_relacionB;
    private com.toedter.calendar.JDateChooser DateChooser_FechaNacimientoB;
    private javax.swing.JLabel Label_Boton_SubirFoto;
    private javax.swing.JLabel Label_Boton_SubirFotoB;
    private javax.swing.JLabel Label_FotoPerfil;
    private javax.swing.JLabel Label_FotoPerfil1;
    private javax.swing.JPanel Panel_BotonGuardarDatos;
    private javax.swing.JPanel Panel_BotonGuardarDatos1;
    private javax.swing.JPanel Panel_Boton_BorrarDatos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
