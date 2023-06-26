package Vista.Paneles;

import Controlador.ControladorUsuario;
import Modelo.Cotizante;
import Modelo.Empleador;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class Panel_Cotizantes extends javax.swing.JPanel {

    //Iniciando atributos de la clase GUI
    private Cotizante datosCotizante;
    private Empleador datosEmpleador;
    
    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    public Panel_Cotizantes() {
        initComponents();
        PaddingTextField();
    }//Fin constructor
    
    private void PaddingTextField(){
        Campo_apellidoC.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_cedulaC.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_correoC.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_nombreC.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_direccionC.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_nombreEmpleador.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_salario.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_telefonoC.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
    }//Fin método

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Titulo_Cotizantes = new javax.swing.JLabel();
        Label_texto_cotizante = new javax.swing.JLabel();
        Label_texto_cotizante1 = new javax.swing.JLabel();
        Label_Texto_ingreso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Campo_nombreC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Campo_apellidoC = new javax.swing.JTextField();
        Campo_cedulaC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Campo_telefonoC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Campo_correoC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Campo_direccionC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Combo_genero = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Label_FotoPerfil = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Label_Boton_SubirFoto = new javax.swing.JLabel();
        DateChooser_FechaNacimiento = new com.toedter.calendar.JDateChooser();
        Label_texto_cotizante3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Campo_nombreEmpleador = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Combo_tipoContrato = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Campo_salario = new javax.swing.JTextField();
        Label_texto_cotizante4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Panel_BotonGuardarDatos = new javax.swing.JPanel();
        GuardarDatos = new javax.swing.JLabel();
        Panel_Boton_BorrarDatos = new javax.swing.JPanel();
        Label_BorrarDatos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(759, 679));

        label_Titulo_Cotizantes.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        label_Titulo_Cotizantes.setForeground(new java.awt.Color(0, 14, 20));
        label_Titulo_Cotizantes.setText("COTIZANTE");

        Label_texto_cotizante.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante.setText("En esta sección el encargado podrá ingresar todos los datos correspondientes del cotizante. También de incluir");

        Label_texto_cotizante1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante1.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante1.setText("información del empleador del cotizante.");

        Label_Texto_ingreso.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso.setText("Ingreso de datos");

        jPanel1.setBackground(new java.awt.Color(247, 246, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(667, 302));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 14, 20));
        jLabel2.setText("Nombre *");

        Campo_nombreC.setBackground(new java.awt.Color(217, 217, 217));
        Campo_nombreC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_nombreC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Campo_nombreC.setPreferredSize(new java.awt.Dimension(151, 28));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 14, 20));
        jLabel3.setText("Apellido *");

        Campo_apellidoC.setBackground(new java.awt.Color(217, 217, 217));
        Campo_apellidoC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_apellidoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_apellidoC.setPreferredSize(new java.awt.Dimension(132, 28));

        Campo_cedulaC.setBackground(new java.awt.Color(217, 217, 217));
        Campo_cedulaC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_cedulaC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_cedulaC.setPreferredSize(new java.awt.Dimension(111, 28));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 14, 20));
        jLabel4.setText("Cédula *");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 14, 20));
        jLabel5.setText("Teléfono *");

        Campo_telefonoC.setBackground(new java.awt.Color(217, 217, 217));
        Campo_telefonoC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_telefonoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_telefonoC.setPreferredSize(new java.awt.Dimension(151, 28));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 14, 20));
        jLabel6.setText("Correo *");

        Campo_correoC.setBackground(new java.awt.Color(217, 217, 217));
        Campo_correoC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_correoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_correoC.setPreferredSize(new java.awt.Dimension(151, 28));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 14, 20));
        jLabel7.setText("Dirección *");

        Campo_direccionC.setBackground(new java.awt.Color(217, 217, 217));
        Campo_direccionC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_direccionC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_direccionC.setPreferredSize(new java.awt.Dimension(151, 28));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 14, 20));
        jLabel8.setText("Genero *");

        Combo_genero.setBackground(new java.awt.Color(217, 217, 217));
        Combo_genero.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No definido" }));
        Combo_genero.setPreferredSize(new java.awt.Dimension(134, 28));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 14, 20));
        jLabel9.setText("Fecha *");

        jPanel4.setBackground(new java.awt.Color(247, 246, 249));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));

        Label_FotoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_FotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenPerfil.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(154, 154, 155));
        jLabel10.setText("Subir una imagen o foto que represente al cotizante.");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(154, 154, 155));
        jLabel12.setText("Además, se recomienda un tamaño máximo de 5 MB.");

        jPanel5.setBackground(new java.awt.Color(224, 169, 96));
        jPanel5.setPreferredSize(new java.awt.Dimension(112, 35));

        Label_Boton_SubirFoto.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Label_Boton_SubirFoto.setForeground(new java.awt.Color(0, 14, 20));
        Label_Boton_SubirFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Boton_SubirFoto.setText("Subir foto");
        Label_Boton_SubirFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Boton_SubirFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_Boton_SubirFotoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Boton_SubirFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Boton_SubirFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Label_FotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_FotoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Campo_direccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Campo_telefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Combo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DateChooser_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Campo_apellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_cedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Campo_correoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Campo_nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Campo_apellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Campo_cedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Campo_telefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Campo_correoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Campo_direccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Combo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(DateChooser_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Label_texto_cotizante3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_texto_cotizante3.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante3.setText("Ingreso de datos empleador");

        jPanel2.setBackground(new java.awt.Color(247, 246, 249));
        jPanel2.setPreferredSize(new java.awt.Dimension(667, 75));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 14, 20));
        jLabel11.setText("Nombre *");

        Campo_nombreEmpleador.setBackground(new java.awt.Color(217, 217, 217));
        Campo_nombreEmpleador.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_nombreEmpleador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_nombreEmpleador.setPreferredSize(new java.awt.Dimension(151, 28));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 14, 20));
        jLabel13.setText("Contrato *");

        Combo_tipoContrato.setBackground(new java.awt.Color(217, 217, 217));
        Combo_tipoContrato.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_tipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indefinido", "Largo plazo", "Fijo", "Temporal", "Tiempo parcial" }));
        Combo_tipoContrato.setPreferredSize(new java.awt.Dimension(134, 28));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 14, 20));
        jLabel14.setText("Salario *");

        Campo_salario.setBackground(new java.awt.Color(217, 217, 217));
        Campo_salario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_salario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_salario.setPreferredSize(new java.awt.Dimension(111, 28));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_nombreEmpleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Combo_tipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Campo_nombreEmpleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Combo_tipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Campo_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Label_texto_cotizante4.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_texto_cotizante4.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante4.setText("Acciones");

        jPanel3.setBackground(new java.awt.Color(247, 246, 249));
        jPanel3.setPreferredSize(new java.awt.Dimension(667, 53));

        Panel_BotonGuardarDatos.setBackground(new java.awt.Color(224, 169, 96));
        Panel_BotonGuardarDatos.setPreferredSize(new java.awt.Dimension(163, 29));

        GuardarDatos.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        GuardarDatos.setForeground(new java.awt.Color(0, 14, 20));
        GuardarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuardarDatos.setText("Guardar datos");
        GuardarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GuardarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GuardarDatosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotonGuardarDatosLayout = new javax.swing.GroupLayout(Panel_BotonGuardarDatos);
        Panel_BotonGuardarDatos.setLayout(Panel_BotonGuardarDatosLayout);
        Panel_BotonGuardarDatosLayout.setHorizontalGroup(
            Panel_BotonGuardarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GuardarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Panel_BotonGuardarDatosLayout.setVerticalGroup(
            Panel_BotonGuardarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GuardarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        Panel_Boton_BorrarDatos.setBackground(new java.awt.Color(224, 169, 96));
        Panel_Boton_BorrarDatos.setPreferredSize(new java.awt.Dimension(163, 29));

        Label_BorrarDatos.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Label_BorrarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_BorrarDatos.setText("Borrar datos");
        Label_BorrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_BorrarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_BorrarDatosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Boton_BorrarDatosLayout = new javax.swing.GroupLayout(Panel_Boton_BorrarDatos);
        Panel_Boton_BorrarDatos.setLayout(Panel_Boton_BorrarDatosLayout);
        Panel_Boton_BorrarDatosLayout.setHorizontalGroup(
            Panel_Boton_BorrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BorrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Panel_Boton_BorrarDatosLayout.setVerticalGroup(
            Panel_Boton_BorrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BorrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(Panel_BotonGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Panel_Boton_BorrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_BotonGuardarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Panel_Boton_BorrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_Titulo_Cotizantes)
                        .addComponent(Label_texto_cotizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_texto_cotizante1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_Texto_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_texto_cotizante3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_texto_cotizante4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo_Cotizantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_texto_cotizante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_texto_cotizante1)
                .addGap(18, 18, 18)
                .addComponent(Label_Texto_ingreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_texto_cotizante3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_texto_cotizante4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Label_Boton_SubirFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Boton_SubirFotoMousePressed


    }//GEN-LAST:event_Label_Boton_SubirFotoMousePressed

    private void GuardarDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarDatosMousePressed

        //Obteniendo los datos del cotizante ingresados en la aplicación
        String nombre = Campo_nombreC.getText();
        String apellido = Campo_apellidoC.getText();
        int cedula = Integer.parseInt(Campo_cedulaC.getText());
        String telefono = Campo_telefonoC.getText();
        String correo = Campo_correoC.getText();
        String direccion = Campo_direccionC.getText();
        String genero = Combo_genero.getSelectedItem().toString();

        //Modificando la fecha obtenida del campo
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormato = formatoFecha.format(DateChooser_FechaNacimiento.getDate());
        LocalDate fechaNacimiento = LocalDate.parse(fechaFormato);

        //Obteniedo los datos de un empleador 
        String nombreE = Campo_nombreEmpleador.getText();
        String TipoContrato = Combo_tipoContrato.getSelectedItem().toString();
        double Salario = Double.parseDouble(Campo_salario.getText());
        
        //Generando objetos con los datos ingresados
        datosEmpleador = new Empleador(Salario, TipoContrato, nombreE);
        
        datosCotizante = new Cotizante(cedula, telefono, correo, datosEmpleador, nombre, apellido, fechaNacimiento, genero, direccion);
        
        //Objeto para establecer la conexión con BD y guardar los datos
        ControladorUsuario objCU = new ControladorUsuario();
        
        Boolean verificacion = objCU.IngresarDatosCotizante(datosCotizante);
        
        //Condición para mostrar una ventana emergente indicando que se guard correctamente los datos
        if(verificacion){
            
            JOptionPane.showMessageDialog(null, "Datos guardado correctamente.");
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Problemas al guardar los datos. Verifica los datos que estás ingresando.");
            
        }//Fin condición

    }//GEN-LAST:event_GuardarDatosMousePressed

    private void Label_BorrarDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_BorrarDatosMousePressed


    }//GEN-LAST:event_Label_BorrarDatosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_apellidoC;
    private javax.swing.JTextField Campo_cedulaC;
    private javax.swing.JTextField Campo_correoC;
    private javax.swing.JTextField Campo_direccionC;
    private javax.swing.JTextField Campo_nombreC;
    private javax.swing.JTextField Campo_nombreEmpleador;
    private javax.swing.JTextField Campo_salario;
    private javax.swing.JTextField Campo_telefonoC;
    private javax.swing.JComboBox<String> Combo_genero;
    private javax.swing.JComboBox<String> Combo_tipoContrato;
    private com.toedter.calendar.JDateChooser DateChooser_FechaNacimiento;
    private javax.swing.JLabel GuardarDatos;
    private javax.swing.JLabel Label_BorrarDatos;
    private javax.swing.JLabel Label_Boton_SubirFoto;
    private javax.swing.JLabel Label_FotoPerfil;
    private javax.swing.JLabel Label_Texto_ingreso;
    private javax.swing.JLabel Label_texto_cotizante;
    private javax.swing.JLabel Label_texto_cotizante1;
    private javax.swing.JLabel Label_texto_cotizante3;
    private javax.swing.JLabel Label_texto_cotizante4;
    private javax.swing.JPanel Panel_BotonGuardarDatos;
    private javax.swing.JPanel Panel_Boton_BorrarDatos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel label_Titulo_Cotizantes;
    // End of variables declaration//GEN-END:variables
}
