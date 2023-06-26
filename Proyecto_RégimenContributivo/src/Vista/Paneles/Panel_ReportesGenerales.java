package Vista.Paneles;

import Controlador.ControladorReportesMedicos;
import Modelo.Beneficiario;
import Modelo.Cotizante;
import Modelo.ProcedimientoCirugia;
import Modelo.ProcedimientoConsultaMedica;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Panel_ReportesGenerales extends javax.swing.JPanel {

    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    LinkedList<Beneficiario> listaBeneficiario;

    public Panel_ReportesGenerales() {
        initComponents();
        PaddingTextField();
        listaBeneficiario = new LinkedList<>();
    }//Fin constructor

    private void PaddingTextField() {

        Campo_identificacionPC.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

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
        Campo_identificacionPC = new javax.swing.JTextField();
        Label_Texto_ingreso = new javax.swing.JLabel();
        Panel_acciones = new javax.swing.JPanel();
        Panel_BotonBuscar = new javax.swing.JPanel();
        Label_BuscarUsuario = new javax.swing.JLabel();
        Panel_botonRestablecer = new javax.swing.JPanel();
        Label_Restablecer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_DatosProcedimientos = new javax.swing.JTable();
        Label_Texto_ingreso1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Label_Texto_ingreso2 = new javax.swing.JLabel();
        Panel_acciones1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_BeneficiariosCotizante = new javax.swing.JTable();
        Panel_IngresoUsuario2 = new javax.swing.JPanel();
        label_TipoUsuario3 = new javax.swing.JLabel();
        Campo_cedulaCotizante = new javax.swing.JTextField();
        Panel_acciones2 = new javax.swing.JPanel();
        Panel_BotonBuscar2 = new javax.swing.JPanel();
        Label_BuscarCotizante = new javax.swing.JLabel();
        Panel_botonRestablecer2 = new javax.swing.JPanel();
        Label_RestablecerDatosCotizante = new javax.swing.JLabel();
        Label_Texto_ingreso3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(759, 679));

        label_Titulo_Cotizantes.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        label_Titulo_Cotizantes.setForeground(new java.awt.Color(0, 14, 20));
        label_Titulo_Cotizantes.setText("REPORTES GENERALES DE PACIENTES");

        Label_texto_cotizante.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante.setText("En esta sección el encargado podrá buscar todos los datos relacionados a los procedimientos médicos realizados a un usuario ");

        Label_texto_cotizante1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante1.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante1.setText("del régimen contributivo. Además de encontrar todos los beneficiarios que tiene un cotizante.");

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

        Campo_identificacionPC.setBackground(new java.awt.Color(217, 217, 217));
        Campo_identificacionPC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_identificacionPC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_identificacionPC.setPreferredSize(new java.awt.Dimension(151, 28));

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
                        .addComponent(Campo_identificacionPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(Campo_identificacionPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        Label_Restablecer.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_Restablecer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Restablecer.setText("Restablecer");
        Label_Restablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Restablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_RestablecerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_botonRestablecerLayout = new javax.swing.GroupLayout(Panel_botonRestablecer);
        Panel_botonRestablecer.setLayout(Panel_botonRestablecerLayout);
        Panel_botonRestablecerLayout.setHorizontalGroup(
            Panel_botonRestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Restablecer, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_botonRestablecerLayout.setVerticalGroup(
            Panel_botonRestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Restablecer, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
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
                .addContainerGap(109, Short.MAX_VALUE))
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

        Tabla_DatosProcedimientos.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Tabla_DatosProcedimientos.setForeground(new java.awt.Color(0, 14, 20));
        Tabla_DatosProcedimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha registro", "Duración (min)", "Valor cancelar", "Tarifa real", "Tipo procedimiento", "Responsable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_DatosProcedimientos.setGridColor(new java.awt.Color(69, 186, 251));
        jScrollPane2.setViewportView(Tabla_DatosProcedimientos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        Label_Texto_ingreso1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso1.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso1.setText("Listado de procedimientos recibidos");

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
                            .addComponent(Label_Texto_ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTabbedPane1.addTab("Procedimientos recibidos", Panel_DatosUsuario);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));

        Label_Texto_ingreso2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso2.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso2.setText("Ingreso de datos");

        Panel_acciones1.setBackground(new java.awt.Color(247, 246, 249));

        Tabla_BeneficiariosCotizante.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Tabla_BeneficiariosCotizante.setForeground(new java.awt.Color(0, 14, 20));
        Tabla_BeneficiariosCotizante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Relación", "Tipo identificación", "Identificación", "Genero", "Fecha Nacimiento", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_BeneficiariosCotizante.setGridColor(new java.awt.Color(69, 186, 251));
        jScrollPane1.setViewportView(Tabla_BeneficiariosCotizante);

        javax.swing.GroupLayout Panel_acciones1Layout = new javax.swing.GroupLayout(Panel_acciones1);
        Panel_acciones1.setLayout(Panel_acciones1Layout);
        Panel_acciones1Layout.setHorizontalGroup(
            Panel_acciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_acciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        Panel_acciones1Layout.setVerticalGroup(
            Panel_acciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_acciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_IngresoUsuario2.setBackground(new java.awt.Color(247, 246, 249));

        label_TipoUsuario3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        label_TipoUsuario3.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario3.setText("Cédula *");

        Campo_cedulaCotizante.setBackground(new java.awt.Color(217, 217, 217));
        Campo_cedulaCotizante.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Campo_cedulaCotizante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_cedulaCotizante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_cedulaCotizante.setPreferredSize(new java.awt.Dimension(151, 28));

        javax.swing.GroupLayout Panel_IngresoUsuario2Layout = new javax.swing.GroupLayout(Panel_IngresoUsuario2);
        Panel_IngresoUsuario2.setLayout(Panel_IngresoUsuario2Layout);
        Panel_IngresoUsuario2Layout.setHorizontalGroup(
            Panel_IngresoUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IngresoUsuario2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(Panel_IngresoUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Campo_cedulaCotizante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_IngresoUsuario2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(label_TipoUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        Panel_IngresoUsuario2Layout.setVerticalGroup(
            Panel_IngresoUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IngresoUsuario2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_TipoUsuario3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_cedulaCotizante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_acciones2.setBackground(new java.awt.Color(247, 246, 249));

        Panel_BotonBuscar2.setBackground(new java.awt.Color(224, 169, 96));

        Label_BuscarCotizante.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_BuscarCotizante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_BuscarCotizante.setText("Buscar cotizante");
        Label_BuscarCotizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_BuscarCotizante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_BuscarCotizanteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotonBuscar2Layout = new javax.swing.GroupLayout(Panel_BotonBuscar2);
        Panel_BotonBuscar2.setLayout(Panel_BotonBuscar2Layout);
        Panel_BotonBuscar2Layout.setHorizontalGroup(
            Panel_BotonBuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BuscarCotizante, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_BotonBuscar2Layout.setVerticalGroup(
            Panel_BotonBuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BuscarCotizante, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        Panel_botonRestablecer2.setBackground(new java.awt.Color(224, 169, 96));

        Label_RestablecerDatosCotizante.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_RestablecerDatosCotizante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_RestablecerDatosCotizante.setText("Restablecer");
        Label_RestablecerDatosCotizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_RestablecerDatosCotizante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_RestablecerDatosCotizanteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_botonRestablecer2Layout = new javax.swing.GroupLayout(Panel_botonRestablecer2);
        Panel_botonRestablecer2.setLayout(Panel_botonRestablecer2Layout);
        Panel_botonRestablecer2Layout.setHorizontalGroup(
            Panel_botonRestablecer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_RestablecerDatosCotizante, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_botonRestablecer2Layout.setVerticalGroup(
            Panel_botonRestablecer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_RestablecerDatosCotizante, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_acciones2Layout = new javax.swing.GroupLayout(Panel_acciones2);
        Panel_acciones2.setLayout(Panel_acciones2Layout);
        Panel_acciones2Layout.setHorizontalGroup(
            Panel_acciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_acciones2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(Panel_acciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel_botonRestablecer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_BotonBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        Panel_acciones2Layout.setVerticalGroup(
            Panel_acciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_acciones2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Panel_BotonBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_botonRestablecer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Label_Texto_ingreso3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso3.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso3.setText("Listado de beneficarios asociados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_acciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Panel_IngresoUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel_acciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Texto_ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Texto_ingreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Label_Texto_ingreso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_acciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_IngresoUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Label_Texto_ingreso3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_acciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos cotizante", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(label_Titulo_Cotizantes)
                    .addComponent(Label_texto_cotizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_texto_cotizante1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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

        if (Campo_identificacionPC.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Se debe ingresar un dato en el campo de identificación.");

        } else {

            try {

                String tipoUsuario = Combo_tipoUsuario.getSelectedItem().toString();
                int idusuario = Integer.parseInt(Campo_identificacionPC.getText());
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Fecha Registro");
                model.addColumn("Duración (min)");
                model.addColumn("Valor cancelar");
                model.addColumn("Tarifa real");
                model.addColumn("Tipo procedimiento");
                model.addColumn("Responsable");

                ControladorReportesMedicos objCRP = new ControladorReportesMedicos();

                if (tipoUsuario.equals("Beneficiario")) {

                    Beneficiario datosB = objCRP.ConsultaProcedimientosMedicosPacienteBeneficiario(idusuario);

                    for (ProcedimientoConsultaMedica PCM : datosB.getObjPCM()) {

                        model.addRow(new Object[]{PCM.getFechaRegistro(), PCM.getDuracion(), PCM.getCostoPago(), PCM.getTarifaReal(), PCM.getTipoProcedimiento(), PCM.getNombreCompletoResponsable()});

                    }//Fin ciclo for

                    for (ProcedimientoCirugia PC : datosB.getObjPC()) {

                        model.addRow(new Object[]{PC.getFechaRegistro(), PC.getDuracion(), PC.getCostoPago(), PC.getTarifaReal(), PC.getTipoProcedimiento(), PC.getNombreCompletoResponsable()});

                    }//Fin ciclo

                    Tabla_DatosProcedimientos.setModel(model);

                } else {

                    Cotizante datosC = objCRP.ConsultaProcedimientosMedicosPacienteCotizante(idusuario);

                    for (ProcedimientoConsultaMedica PCM : datosC.getObjPCM()) {

                        model.addRow(new Object[]{PCM.getFechaRegistro(), PCM.getDuracion(), PCM.getCostoPago(), PCM.getTarifaReal(), PCM.getTipoProcedimiento(), PCM.getNombreCompletoResponsable()});

                    }//Fin ciclo for

                    for (ProcedimientoCirugia PC : datosC.getObjPC()) {

                        model.addRow(new Object[]{PC.getFechaRegistro(), PC.getDuracion(), PC.getCostoPago(), PC.getTarifaReal(), PC.getTipoProcedimiento(), PC.getNombreCompletoResponsable()});

                    }//Fin ciclo

                    Tabla_DatosProcedimientos.setModel(model);

                }//Fin condición

            } catch (Exception e) {

                System.out.println("error: " + e);

                JOptionPane.showMessageDialog(null, "La identificación ingresa no corresponde con ninguna registrada.");

            }//Fin cathc

        }//Fin condición principal

    }//GEN-LAST:event_Label_BuscarUsuarioMousePressed

    private void Label_RestablecerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RestablecerMousePressed

        Campo_identificacionPC.setText("");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Fecha Registro");
        model.addColumn("Duración (min)");
        model.addColumn("Valor cancelar");
        model.addColumn("Tarifa real");
        model.addColumn("Tipo procedimiento");
        model.addColumn("Responsable");
        model.addRow(new Object[]{});
        Tabla_DatosProcedimientos.setModel(model);

    }//GEN-LAST:event_Label_RestablecerMousePressed

    private void Label_BuscarCotizanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_BuscarCotizanteMousePressed

        if (Campo_cedulaCotizante.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Se debe ingresar un dato en el campo de cédula.");

        } else {

            int cedulaC = Integer.parseInt(Campo_cedulaCotizante.getText());
            ControladorReportesMedicos objCRP = new ControladorReportesMedicos();

            listaBeneficiario = objCRP.ConsultaBeneficiariosCotizante(cedulaC);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Relación");
            model.addColumn("Tipo de identificación");
            model.addColumn("Identificación");
            model.addColumn("Genero");
            model.addColumn("Fecha Nacimiento");
            model.addColumn("Dirección");

            for (Beneficiario bf : listaBeneficiario) {

                model.addRow(new Object[]{bf.getNombre(), bf.getApellido(), bf.getRelacion(), bf.getTipoIdentificacion(), bf.getIdentificacion(), bf.getGenero(), bf.getFechaNacimiento(), bf.getDireccion()});

            }//Fin ciclo for

            Tabla_BeneficiariosCotizante.setModel(model);

        }//Fin condición

    }//GEN-LAST:event_Label_BuscarCotizanteMousePressed

    private void Label_RestablecerDatosCotizanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RestablecerDatosCotizanteMousePressed

        Campo_cedulaCotizante.setText("");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Relación");
        model.addColumn("Tipo de identificación");
        model.addColumn("Identificación");
        model.addColumn("Genero");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Dirección");
        model.addRow(new Object[]{});
        Tabla_BeneficiariosCotizante.setModel(model);

    }//GEN-LAST:event_Label_RestablecerDatosCotizanteMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_cedulaCotizante;
    private javax.swing.JTextField Campo_identificacionPC;
    private javax.swing.JComboBox<String> Combo_tipoUsuario;
    private javax.swing.JLabel Label_BuscarCotizante;
    private javax.swing.JLabel Label_BuscarUsuario;
    private javax.swing.JLabel Label_Restablecer;
    private javax.swing.JLabel Label_RestablecerDatosCotizante;
    private javax.swing.JLabel Label_Texto_ingreso;
    private javax.swing.JLabel Label_Texto_ingreso1;
    private javax.swing.JLabel Label_Texto_ingreso2;
    private javax.swing.JLabel Label_Texto_ingreso3;
    private javax.swing.JLabel Label_texto_cotizante;
    private javax.swing.JLabel Label_texto_cotizante1;
    private javax.swing.JPanel Panel_BotonBuscar;
    private javax.swing.JPanel Panel_BotonBuscar2;
    private javax.swing.JPanel Panel_DatosUsuario;
    private javax.swing.JPanel Panel_IngresoUsuario;
    private javax.swing.JPanel Panel_IngresoUsuario2;
    private javax.swing.JPanel Panel_acciones;
    private javax.swing.JPanel Panel_acciones1;
    private javax.swing.JPanel Panel_acciones2;
    private javax.swing.JPanel Panel_botonRestablecer;
    private javax.swing.JPanel Panel_botonRestablecer2;
    private javax.swing.JTable Tabla_BeneficiariosCotizante;
    private javax.swing.JTable Tabla_DatosProcedimientos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_TipoUsuario;
    private javax.swing.JLabel label_TipoUsuario1;
    private javax.swing.JLabel label_TipoUsuario3;
    private javax.swing.JLabel label_Titulo_Cotizantes;
    // End of variables declaration//GEN-END:variables
}
