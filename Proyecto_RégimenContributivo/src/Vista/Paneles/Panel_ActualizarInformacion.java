package Vista.Paneles;

import Controlador.ControladorActualizacionDatos;
import Controlador.ControladorProcedimientosMedicos;
import Modelo.Beneficiario;
import Modelo.Cotizante;
import Modelo.ProcedimientoCirugia;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;

public class Panel_ActualizarInformacion extends javax.swing.JPanel {

    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    //Map que guarda los datos de un cirujano
    HashMap<String, Integer> datosCirujanos;
    int id_usuario = 0;
    String tipoUsuario = "";
    int idusuario = 0;

    public Panel_ActualizarInformacion() {
        initComponents();
        PaddingTextField();
    }//Fin constructor

    private void PaddingTextField() {

        Campo_identificacionActualizar.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

    }//Fin método

    private void activarCamposCotizante() {

        Boton_EditarNombre.setEnabled(true);
        Boton_EditarApellido.setEnabled(true);
        Boton_EditarGenero.setEnabled(true);
        Boton_EditarFechaN.setEnabled(true);
        Boton_EditarDireccion.setEnabled(true);
        Boton_EditarTelefono.setEnabled(true);
        Boton_EditarCorreo.setEnabled(true);

        Boton_EditarRelacion.setEnabled(false);
        Boton_EditarTipoIdentificacion.setEnabled(false);

    }//Fin método

    private void activarCamposBeneficiario() {

        Boton_EditarNombre.setEnabled(true);
        Boton_EditarApellido.setEnabled(true);
        Boton_EditarGenero.setEnabled(true);
        Boton_EditarFechaN.setEnabled(true);
        Boton_EditarDireccion.setEnabled(true);
        Boton_EditarRelacion.setEnabled(true);
        Boton_EditarTipoIdentificacion.setEnabled(true);

        Boton_EditarTelefono.setEnabled(false);
        Boton_EditarCorreo.setEnabled(false);

    }//Fin método

    private void desactivarCamposBotones() {

        Boton_EditarNombre.setEnabled(false);
        Boton_EditarApellido.setEnabled(false);
        Boton_EditarGenero.setEnabled(false);
        Boton_EditarFechaN.setEnabled(false);
        Boton_EditarDireccion.setEnabled(false);
        Boton_EditarTelefono.setEnabled(false);
        Boton_EditarCorreo.setEnabled(false);
        Boton_EditarRelacion.setEnabled(false);
        Boton_EditarTipoIdentificacion.setEnabled(false);
        Boton_EditarTelefono.setEnabled(false);
        Boton_EditarCorreo.setEnabled(false);

        Campo_nombreU.setEnabled(false);
        Campo_telefonoU.setEnabled(false);
        Campo_apellidoU.setEnabled(false);
        Combo_generoU.setEnabled(false);
        Campo_direccionU.setEnabled(false);
        DateChooser_FechaNU.setEnabled(false);
        Combo_relacionU.setEnabled(false);
        Campo_correoU.setEnabled(false);
        Combo_tipoIdentificacionU.setEnabled(false);

    }

    private void RestablecerCampos() {

        Campo_nombreU.setText("");
        Campo_telefonoU.setText("");
        Campo_apellidoU.setText("");
        Combo_generoU.setSelectedItem("----------------");
        Campo_direccionU.setText("");
        DateChooser_FechaNU.setDate(null);
        Combo_relacionU.setSelectedItem("----------------");
        Campo_correoU.setText("");
        Combo_tipoIdentificacionU.setSelectedItem("----------------");

    }//Fin método

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Titulo_Cotizantes = new javax.swing.JLabel();
        Label_texto_cotizante = new javax.swing.JLabel();
        Label_texto_cotizante1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_DatosUsuario = new javax.swing.JPanel();
        Panel_IngresoUsuario = new javax.swing.JPanel();
        label_TipoUsuario = new javax.swing.JLabel();
        Combo_tipoUsuario = new javax.swing.JComboBox<>();
        label_TipoUsuario1 = new javax.swing.JLabel();
        Campo_identificacionActualizar = new javax.swing.JTextField();
        Label_Texto_ingreso = new javax.swing.JLabel();
        Panel_acciones = new javax.swing.JPanel();
        Panel_BotonBuscar = new javax.swing.JPanel();
        Label_BuscarUsuario = new javax.swing.JLabel();
        Panel_botonRestablecer = new javax.swing.JPanel();
        Label_ActualizarDatos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_TipoUsuario2 = new javax.swing.JLabel();
        label_TipoUsuario3 = new javax.swing.JLabel();
        label_TipoUsuario4 = new javax.swing.JLabel();
        label_TipoUsuario5 = new javax.swing.JLabel();
        label_TipoUsuario6 = new javax.swing.JLabel();
        Campo_nombreU = new javax.swing.JTextField();
        label_TipoUsuario14 = new javax.swing.JLabel();
        label_TipoUsuario15 = new javax.swing.JLabel();
        label_TipoUsuario16 = new javax.swing.JLabel();
        label_TipoUsuario17 = new javax.swing.JLabel();
        Boton_EditarNombre = new javax.swing.JButton();
        Campo_apellidoU = new javax.swing.JTextField();
        Boton_EditarApellido = new javax.swing.JButton();
        Combo_generoU = new javax.swing.JComboBox<>();
        Boton_EditarGenero = new javax.swing.JButton();
        Campo_telefonoU = new javax.swing.JTextField();
        Boton_EditarTelefono = new javax.swing.JButton();
        Campo_direccionU = new javax.swing.JTextField();
        Boton_EditarDireccion = new javax.swing.JButton();
        DateChooser_FechaNU = new com.toedter.calendar.JDateChooser();
        Boton_EditarFechaN = new javax.swing.JButton();
        Combo_relacionU = new javax.swing.JComboBox<>();
        Boton_EditarRelacion = new javax.swing.JButton();
        Campo_correoU = new javax.swing.JTextField();
        Boton_EditarCorreo = new javax.swing.JButton();
        Combo_tipoIdentificacionU = new javax.swing.JComboBox<>();
        Boton_EditarTipoIdentificacion = new javax.swing.JButton();
        Label_Texto_ingreso1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Label_Texto_ingreso2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(759, 679));

        label_Titulo_Cotizantes.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        label_Titulo_Cotizantes.setForeground(new java.awt.Color(0, 14, 20));
        label_Titulo_Cotizantes.setText("ACTUALIZACIÓN DATOS GENERALES");

        Label_texto_cotizante.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante.setText("En esta sección el encargado podrá actualizar o modificar datos relacionados a un cotizante o beneficiario registrado en el");

        Label_texto_cotizante1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante1.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante1.setText("la base de datos del sistema.");

        jTabbedPane1.setForeground(new java.awt.Color(0, 14, 20));
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N

        Panel_DatosUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Panel_DatosUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));

        Panel_IngresoUsuario.setBackground(new java.awt.Color(247, 246, 249));

        label_TipoUsuario.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        label_TipoUsuario.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario.setText("Tipo usuario *");

        Combo_tipoUsuario.setBackground(new java.awt.Color(217, 217, 217));
        Combo_tipoUsuario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cotizante", "Beneficiario" }));
        Combo_tipoUsuario.setPreferredSize(new java.awt.Dimension(134, 28));

        label_TipoUsuario1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        label_TipoUsuario1.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario1.setText("Identificación *");

        Campo_identificacionActualizar.setBackground(new java.awt.Color(217, 217, 217));
        Campo_identificacionActualizar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_identificacionActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_identificacionActualizar.setPreferredSize(new java.awt.Dimension(151, 28));

        javax.swing.GroupLayout Panel_IngresoUsuarioLayout = new javax.swing.GroupLayout(Panel_IngresoUsuario);
        Panel_IngresoUsuario.setLayout(Panel_IngresoUsuarioLayout);
        Panel_IngresoUsuarioLayout.setHorizontalGroup(
            Panel_IngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IngresoUsuarioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Panel_IngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_IngresoUsuarioLayout.createSequentialGroup()
                        .addComponent(label_TipoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Campo_identificacionActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_IngresoUsuarioLayout.createSequentialGroup()
                        .addComponent(label_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Combo_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        Panel_IngresoUsuarioLayout.setVerticalGroup(
            Panel_IngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IngresoUsuarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Panel_IngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_TipoUsuario)
                    .addComponent(Combo_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_IngresoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_TipoUsuario1)
                    .addComponent(Campo_identificacionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Label_Texto_ingreso.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso.setText("Ingreso de datos");

        Panel_acciones.setBackground(new java.awt.Color(247, 246, 249));

        Panel_BotonBuscar.setBackground(new java.awt.Color(224, 169, 96));

        Label_BuscarUsuario.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_BuscarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_BuscarUsuario.setText("Buscar usuario");
        Label_BuscarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_BuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_BuscarUsuarioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotonBuscarLayout = new javax.swing.GroupLayout(Panel_BotonBuscar);
        Panel_BotonBuscar.setLayout(Panel_BotonBuscarLayout);
        Panel_BotonBuscarLayout.setHorizontalGroup(
            Panel_BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_BotonBuscarLayout.setVerticalGroup(
            Panel_BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        Panel_botonRestablecer.setBackground(new java.awt.Color(224, 169, 96));

        Label_ActualizarDatos.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_ActualizarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_ActualizarDatos.setText("Actualizar datos");
        Label_ActualizarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_ActualizarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_ActualizarDatosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_botonRestablecerLayout = new javax.swing.GroupLayout(Panel_botonRestablecer);
        Panel_botonRestablecer.setLayout(Panel_botonRestablecerLayout);
        Panel_botonRestablecerLayout.setHorizontalGroup(
            Panel_botonRestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_ActualizarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_botonRestablecerLayout.setVerticalGroup(
            Panel_botonRestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_ActualizarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_accionesLayout = new javax.swing.GroupLayout(Panel_acciones);
        Panel_acciones.setLayout(Panel_accionesLayout);
        Panel_accionesLayout.setHorizontalGroup(
            Panel_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_accionesLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(Panel_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel_botonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_accionesLayout.setVerticalGroup(
            Panel_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_accionesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Panel_BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_botonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(247, 246, 249));

        label_TipoUsuario2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario2.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario2.setText("Nombre");

        label_TipoUsuario3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario3.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario3.setText("Apellido");

        label_TipoUsuario4.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario4.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario4.setText("Fecha nacimiento");

        label_TipoUsuario5.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario5.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario5.setText("Genero");

        label_TipoUsuario6.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario6.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario6.setText("Dirección");

        Campo_nombreU.setBackground(new java.awt.Color(217, 217, 217));
        Campo_nombreU.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_nombreU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_nombreU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_nombreU.setEnabled(false);
        Campo_nombreU.setPreferredSize(new java.awt.Dimension(151, 28));

        label_TipoUsuario14.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario14.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario14.setText("Teléfono");

        label_TipoUsuario15.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario15.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario15.setText("Correo");

        label_TipoUsuario16.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario16.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario16.setText("Tipo identificación");

        label_TipoUsuario17.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario17.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario17.setText("Relación");

        Boton_EditarNombre.setText("jButton1");
        Boton_EditarNombre.setEnabled(false);
        Boton_EditarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarNombreActionPerformed(evt);
            }
        });

        Campo_apellidoU.setBackground(new java.awt.Color(217, 217, 217));
        Campo_apellidoU.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_apellidoU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_apellidoU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_apellidoU.setEnabled(false);
        Campo_apellidoU.setPreferredSize(new java.awt.Dimension(151, 28));

        Boton_EditarApellido.setText("jButton1");
        Boton_EditarApellido.setEnabled(false);
        Boton_EditarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarApellidoActionPerformed(evt);
            }
        });

        Combo_generoU.setBackground(new java.awt.Color(217, 217, 217));
        Combo_generoU.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_generoU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "Masculino", "Femenino", "Ninguno" }));
        Combo_generoU.setEnabled(false);
        Combo_generoU.setPreferredSize(new java.awt.Dimension(134, 28));

        Boton_EditarGenero.setText("jButton1");
        Boton_EditarGenero.setEnabled(false);
        Boton_EditarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarGeneroActionPerformed(evt);
            }
        });

        Campo_telefonoU.setBackground(new java.awt.Color(217, 217, 217));
        Campo_telefonoU.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_telefonoU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_telefonoU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_telefonoU.setEnabled(false);
        Campo_telefonoU.setPreferredSize(new java.awt.Dimension(151, 28));

        Boton_EditarTelefono.setText("jButton1");
        Boton_EditarTelefono.setEnabled(false);
        Boton_EditarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarTelefonoActionPerformed(evt);
            }
        });

        Campo_direccionU.setBackground(new java.awt.Color(217, 217, 217));
        Campo_direccionU.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_direccionU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_direccionU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_direccionU.setEnabled(false);
        Campo_direccionU.setPreferredSize(new java.awt.Dimension(151, 28));

        Boton_EditarDireccion.setText("jButton1");
        Boton_EditarDireccion.setEnabled(false);
        Boton_EditarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarDireccionActionPerformed(evt);
            }
        });

        DateChooser_FechaNU.setEnabled(false);

        Boton_EditarFechaN.setText("jButton1");
        Boton_EditarFechaN.setEnabled(false);
        Boton_EditarFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarFechaNActionPerformed(evt);
            }
        });

        Combo_relacionU.setBackground(new java.awt.Color(217, 217, 217));
        Combo_relacionU.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_relacionU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "Mamá", "Papá", "Hijo", "Hija", "Hermano", "Hermana", "Esposa", "Esposo" }));
        Combo_relacionU.setEnabled(false);
        Combo_relacionU.setPreferredSize(new java.awt.Dimension(134, 28));

        Boton_EditarRelacion.setText("jButton1");
        Boton_EditarRelacion.setEnabled(false);
        Boton_EditarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarRelacionActionPerformed(evt);
            }
        });

        Campo_correoU.setBackground(new java.awt.Color(217, 217, 217));
        Campo_correoU.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_correoU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_correoU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_correoU.setEnabled(false);
        Campo_correoU.setPreferredSize(new java.awt.Dimension(151, 28));

        Boton_EditarCorreo.setText("jButton1");
        Boton_EditarCorreo.setEnabled(false);
        Boton_EditarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarCorreoActionPerformed(evt);
            }
        });

        Combo_tipoIdentificacionU.setBackground(new java.awt.Color(217, 217, 217));
        Combo_tipoIdentificacionU.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_tipoIdentificacionU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "Cédula", "Tarjeta de identidad", "Pasaporte" }));
        Combo_tipoIdentificacionU.setEnabled(false);
        Combo_tipoIdentificacionU.setPreferredSize(new java.awt.Dimension(134, 28));

        Boton_EditarTipoIdentificacion.setText("jButton1");
        Boton_EditarTipoIdentificacion.setEnabled(false);
        Boton_EditarTipoIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EditarTipoIdentificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(label_TipoUsuario14)
                .addGap(166, 166, 166)
                .addComponent(label_TipoUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_TipoUsuario4)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Campo_nombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton_EditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(label_TipoUsuario2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Campo_apellidoU, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton_EditarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(label_TipoUsuario3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Campo_telefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton_EditarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Combo_relacionU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton_EditarRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Campo_correoU, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton_EditarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Campo_direccionU, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton_EditarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Combo_tipoIdentificacionU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_EditarTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label_TipoUsuario5)
                                    .addGap(87, 87, 87))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(DateChooser_FechaNU, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Combo_generoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Boton_EditarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Boton_EditarFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_TipoUsuario17)
                        .addGap(180, 180, 180)
                        .addComponent(label_TipoUsuario15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_TipoUsuario16)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(label_TipoUsuario2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Campo_nombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Boton_EditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(label_TipoUsuario3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Campo_apellidoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Boton_EditarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_TipoUsuario5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_generoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_EditarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_TipoUsuario14)
                    .addComponent(label_TipoUsuario6)
                    .addComponent(label_TipoUsuario4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DateChooser_FechaNU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Campo_telefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_EditarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_direccionU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_EditarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Boton_EditarFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_TipoUsuario17)
                    .addComponent(label_TipoUsuario15)
                    .addComponent(label_TipoUsuario16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_relacionU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_EditarRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_correoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_EditarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_tipoIdentificacionU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_EditarTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        Label_Texto_ingreso1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso1.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso1.setText("Datos encontrados");

        javax.swing.GroupLayout Panel_DatosUsuarioLayout = new javax.swing.GroupLayout(Panel_DatosUsuario);
        Panel_DatosUsuario.setLayout(Panel_DatosUsuarioLayout);
        Panel_DatosUsuarioLayout.setHorizontalGroup(
            Panel_DatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_DatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_DatosUsuarioLayout.createSequentialGroup()
                        .addComponent(Panel_IngresoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel_acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_DatosUsuarioLayout.createSequentialGroup()
                        .addGroup(Panel_DatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Texto_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Texto_ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_DatosUsuarioLayout.setVerticalGroup(
            Panel_DatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosUsuarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Label_Texto_ingreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_DatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_IngresoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(Label_Texto_ingreso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Información usuario", Panel_DatosUsuario);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));

        Label_Texto_ingreso2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Label_Texto_ingreso2.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Texto_ingreso2.setText("EN PROCESO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(Label_Texto_ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(Label_Texto_ingreso2)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Información empleador", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(label_Titulo_Cotizantes)
                    .addComponent(Label_texto_cotizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_texto_cotizante1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
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
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Label_BuscarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_BuscarUsuarioMousePressed

        if (Campo_identificacionActualizar.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Se debe ingresar un dato en el campo de identificación.");

        } else {

            try {

                desactivarCamposBotones();
                tipoUsuario = Combo_tipoUsuario.getSelectedItem().toString();
                idusuario = Integer.parseInt(Campo_identificacionActualizar.getText());

                if (tipoUsuario.equals("Beneficiario")) {

                    ControladorActualizacionDatos objCAD = new ControladorActualizacionDatos();
                    Beneficiario objBene = (Beneficiario) objCAD.ConsultarDatosUsuario(idusuario, tipoUsuario);

                    Campo_nombreU.setText(objBene.getNombre());
                    Campo_apellidoU.setText(objBene.getApellido());
                    Campo_direccionU.setText(objBene.getDireccion());
                    DateChooser_FechaNU.setDate(Date.valueOf(objBene.getFechaNacimiento()));
                    Combo_generoU.setSelectedItem(objBene.getGenero());
                    Combo_relacionU.setSelectedItem(objBene.getRelacion());

                    Combo_tipoIdentificacionU.setSelectedItem(objBene.getTipoIdentificacion());

                    Campo_telefonoU.setText("");
                    Campo_correoU.setText("");

                    activarCamposBeneficiario();

                    //Contiene el id de la entidad usuario
                    id_usuario = objBene.getIdentificacion();

                } else if (tipoUsuario.equals("Cotizante")) {

                    ControladorActualizacionDatos objCAD = new ControladorActualizacionDatos();
                    Cotizante objCoti = (Cotizante) objCAD.ConsultarDatosUsuario(idusuario, tipoUsuario);

                    Campo_nombreU.setText(objCoti.getNombre());
                    Campo_apellidoU.setText(objCoti.getApellido());
                    Campo_direccionU.setText(objCoti.getDireccion());
                    Campo_telefonoU.setText(objCoti.getTelefono());
                    Campo_correoU.setText(objCoti.getCorreo());
                    DateChooser_FechaNU.setDate(Date.valueOf(objCoti.getFechaNacimiento()));
                    Combo_generoU.setSelectedItem(objCoti.getGenero());
                    Combo_relacionU.setSelectedItem("----------------");
                    Combo_tipoIdentificacionU.setSelectedItem("----------------");

                    activarCamposCotizante();

                    //Contiene el id de la entidad usuario
                    id_usuario = objCoti.getCedula();

                }//Fin condición

            } catch (Exception e) {

                System.out.println("Error: " + e);
                JOptionPane.showMessageDialog(null, "La identificación ingresada no se encuentra registrada en la base de datos.");

            }//Fin catch

        }//Fin condición principal

    }//GEN-LAST:event_Label_BuscarUsuarioMousePressed

    private void Label_ActualizarDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_ActualizarDatosMousePressed

        if (Campo_identificacionActualizar.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Ingresa el número de identificación del usuario en el campo (identificación *).");

        } else {

            if (tipoUsuario.equals("Beneficiario")) {

                //Datos generales
                String nombre = Campo_nombreU.getText();
                String apellido = Campo_apellidoU.getText();
                String genero = Combo_generoU.getSelectedItem().toString();
                String direccion = Campo_direccionU.getText();

                //Modificando la fecha obtenida del campo
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                String fechaFormato = formatoFecha.format(DateChooser_FechaNU.getDate());
                LocalDate fechaNacimiento = LocalDate.parse(fechaFormato);

                //Datos especificos
                String relacion = Combo_relacionU.getSelectedItem().toString();
                String tipoIdentificacion = Combo_tipoIdentificacionU.getSelectedItem().toString();

                Beneficiario nuevobeneficiario = new Beneficiario(tipoIdentificacion, idusuario, relacion, nombre, apellido, fechaNacimiento, genero, direccion);

                ControladorActualizacionDatos objCAD = new ControladorActualizacionDatos();

                boolean verificacion = objCAD.ActualizarDatosBeneficiario(nuevobeneficiario, id_usuario);

                if (verificacion) {

                    JOptionPane.showMessageDialog(null, "Datos actualizados del beneficiario correctamente.");
                    RestablecerCampos();

                } else {

                    JOptionPane.showMessageDialog(null, "Problemas al actualizar los datos ingresados del usuario.");

                }//Fin condición

            } else {

                //Datos generales
                String nombre = Campo_nombreU.getText();
                String apellido = Campo_apellidoU.getText();
                String genero = Combo_generoU.getSelectedItem().toString();
                String direccion = Campo_direccionU.getText();

                //Modificando la fecha obtenida del campo
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                String fechaFormato = formatoFecha.format(DateChooser_FechaNU.getDate());
                LocalDate fechaNacimiento = LocalDate.parse(fechaFormato);

                //Datos especificos
                String telefono = Campo_telefonoU.getText();
                String correo = Campo_correoU.getText();

                Cotizante nuevocotizante = new Cotizante(idusuario, telefono, correo, nombre, apellido, fechaNacimiento, genero, direccion);

                ControladorActualizacionDatos objCAD = new ControladorActualizacionDatos();

                boolean verificacion = objCAD.ActualizarDatosCotizante(nuevocotizante, id_usuario);

                if (verificacion) {

                    JOptionPane.showMessageDialog(null, "Datos actualizados del cotizante correctamente.");
                    RestablecerCampos();

                } else {

                    JOptionPane.showMessageDialog(null, "Problemas al actualizar los datos ingresados del usuario.");

                }//Fin condición

            }//Fin condición

        }//Fin condición

    }//GEN-LAST:event_Label_ActualizarDatosMousePressed

    private void Boton_EditarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarNombreActionPerformed

        Campo_nombreU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarNombreActionPerformed

    private void Boton_EditarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarTelefonoActionPerformed

        Campo_telefonoU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarTelefonoActionPerformed

    private void Boton_EditarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarApellidoActionPerformed

        Campo_apellidoU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarApellidoActionPerformed

    private void Boton_EditarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarGeneroActionPerformed

        Combo_generoU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarGeneroActionPerformed

    private void Boton_EditarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarDireccionActionPerformed

        Campo_direccionU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarDireccionActionPerformed

    private void Boton_EditarFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarFechaNActionPerformed

        DateChooser_FechaNU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarFechaNActionPerformed

    private void Boton_EditarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarRelacionActionPerformed

        Combo_relacionU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarRelacionActionPerformed

    private void Boton_EditarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarCorreoActionPerformed

        Campo_correoU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarCorreoActionPerformed

    private void Boton_EditarTipoIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EditarTipoIdentificacionActionPerformed

        Combo_tipoIdentificacionU.setEnabled(true);

    }//GEN-LAST:event_Boton_EditarTipoIdentificacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_EditarApellido;
    private javax.swing.JButton Boton_EditarCorreo;
    private javax.swing.JButton Boton_EditarDireccion;
    private javax.swing.JButton Boton_EditarFechaN;
    private javax.swing.JButton Boton_EditarGenero;
    private javax.swing.JButton Boton_EditarNombre;
    private javax.swing.JButton Boton_EditarRelacion;
    private javax.swing.JButton Boton_EditarTelefono;
    private javax.swing.JButton Boton_EditarTipoIdentificacion;
    private javax.swing.JTextField Campo_apellidoU;
    private javax.swing.JTextField Campo_correoU;
    private javax.swing.JTextField Campo_direccionU;
    private javax.swing.JTextField Campo_identificacionActualizar;
    private javax.swing.JTextField Campo_nombreU;
    private javax.swing.JTextField Campo_telefonoU;
    private javax.swing.JComboBox<String> Combo_generoU;
    private javax.swing.JComboBox<String> Combo_relacionU;
    private javax.swing.JComboBox<String> Combo_tipoIdentificacionU;
    private javax.swing.JComboBox<String> Combo_tipoUsuario;
    private com.toedter.calendar.JDateChooser DateChooser_FechaNU;
    private javax.swing.JLabel Label_ActualizarDatos;
    private javax.swing.JLabel Label_BuscarUsuario;
    private javax.swing.JLabel Label_Texto_ingreso;
    private javax.swing.JLabel Label_Texto_ingreso1;
    private javax.swing.JLabel Label_Texto_ingreso2;
    private javax.swing.JLabel Label_texto_cotizante;
    private javax.swing.JLabel Label_texto_cotizante1;
    private javax.swing.JPanel Panel_BotonBuscar;
    private javax.swing.JPanel Panel_DatosUsuario;
    private javax.swing.JPanel Panel_IngresoUsuario;
    private javax.swing.JPanel Panel_acciones;
    private javax.swing.JPanel Panel_botonRestablecer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_TipoUsuario;
    private javax.swing.JLabel label_TipoUsuario1;
    private javax.swing.JLabel label_TipoUsuario14;
    private javax.swing.JLabel label_TipoUsuario15;
    private javax.swing.JLabel label_TipoUsuario16;
    private javax.swing.JLabel label_TipoUsuario17;
    private javax.swing.JLabel label_TipoUsuario2;
    private javax.swing.JLabel label_TipoUsuario3;
    private javax.swing.JLabel label_TipoUsuario4;
    private javax.swing.JLabel label_TipoUsuario5;
    private javax.swing.JLabel label_TipoUsuario6;
    private javax.swing.JLabel label_Titulo_Cotizantes;
    // End of variables declaration//GEN-END:variables
}
