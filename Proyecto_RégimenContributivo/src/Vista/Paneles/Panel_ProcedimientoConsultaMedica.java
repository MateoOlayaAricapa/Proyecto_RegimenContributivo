package Vista.Paneles;

import Controlador.ControladorProcedimientosMedicos;
import Modelo.ProcedimientoCirugia;
import Modelo.ProcedimientoConsultaMedica;
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

public class Panel_ProcedimientoConsultaMedica extends javax.swing.JPanel {

    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    //Map que guarda los datos de un cirujano
    HashMap<String, Integer> datosCirujanos;
    int id_usuario = 0;

    public Panel_ProcedimientoConsultaMedica() {
        initComponents();
        PaddingTextField();
        ConsultaDatosResponsablesAsync();
    }//Fin constructor

    private void PaddingTextField() {

        Campo_identificacionPCM.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        Campo_duracionConsulta.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

    }//Fin método

    //Este método se ejecutará en segundo plano mientras se renderiza la aplicación
    private void ConsultaDatosResponsablesAsync() {

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {

                ControladorProcedimientosMedicos objCPM = new ControladorProcedimientosMedicos();
                datosCirujanos = new HashMap();

                ResultSet datos = objCPM.DatosResponsables("Médico general");

                while (datos.next()) {

                    String nombre = datos.getString("nombre");
                    String apellido = datos.getString("apellido");
                    String nombreCompleto = nombre + " " + apellido;
                    String rol = datos.getString("rol");
                    int id = Integer.parseInt(datos.getString("id_profesional"));

                    Combo_responsableMedico.addItem(nombreCompleto);
                    datosCirujanos.put(nombreCompleto, id);

                }//Fin while

                return null;

            }//Fin doInBackground

            @Override
            protected void done() {

                //Cuando termine de hacer la tarea en segundo plano, imprime los resultados obtenidos
                System.out.println(datosCirujanos);

            }//Fin método done

        };//Fin SwingWorker

        worker.execute();

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
        Campo_identificacionPCM = new javax.swing.JTextField();
        Label_Texto_ingreso = new javax.swing.JLabel();
        Panel_acciones = new javax.swing.JPanel();
        Panel_BotonBuscar = new javax.swing.JPanel();
        Label_BuscarUsuario = new javax.swing.JLabel();
        Panel_botonRestablecer = new javax.swing.JPanel();
        Label_Restablecer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_TipoUsuario2 = new javax.swing.JLabel();
        label_TipoUsuario3 = new javax.swing.JLabel();
        label_TipoUsuario4 = new javax.swing.JLabel();
        label_TipoUsuario5 = new javax.swing.JLabel();
        label_TipoUsuario6 = new javax.swing.JLabel();
        Campo_fechaN = new javax.swing.JTextField();
        Campo_Direccion = new javax.swing.JTextField();
        Campo_genero = new javax.swing.JTextField();
        Campo_telefono = new javax.swing.JTextField();
        Campo_relacion = new javax.swing.JTextField();
        Label_NombreCompleto = new javax.swing.JLabel();
        Label_FotoUsuario = new javax.swing.JLabel();
        Label_Texto_ingreso1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Panel_IngresoUsuario1 = new javax.swing.JPanel();
        label_TipoUsuario7 = new javax.swing.JLabel();
        label_TipoUsuario8 = new javax.swing.JLabel();
        Campo_duracionConsulta = new javax.swing.JTextField();
        DataChoose_FechaRegistroConsulta = new com.toedter.calendar.JDateChooser();
        label_TipoUsuario9 = new javax.swing.JLabel();
        Combo_MotivoConsulta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_observaciones = new javax.swing.JTextArea();
        label_TipoUsuario13 = new javax.swing.JLabel();
        Combo_responsableMedico = new javax.swing.JComboBox<>();
        Label_Texto_ingreso2 = new javax.swing.JLabel();
        Panel_acciones1 = new javax.swing.JPanel();
        Panel_BotonBuscar1 = new javax.swing.JPanel();
        Label_GuardarDatosPC = new javax.swing.JLabel();
        Panel_botonRestablecer1 = new javax.swing.JPanel();
        Label_RestablecerPCM = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_valorCancelar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(759, 679));

        label_Titulo_Cotizantes.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        label_Titulo_Cotizantes.setForeground(new java.awt.Color(0, 14, 20));
        label_Titulo_Cotizantes.setText("PROCEDIMIENTO DE CONSULTA MÉDICA");

        Label_texto_cotizante.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante.setText("En esta sección el encargado podrá ingresar los datos del procedimiento de consulta que se le realizará a un cotizante o ");

        Label_texto_cotizante1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante1.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante1.setText("beneficiario. Adicionalmente, será necesario solicitar datos del usuario como identificación y tipo de usuario.");

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

        Campo_identificacionPCM.setBackground(new java.awt.Color(217, 217, 217));
        Campo_identificacionPCM.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_identificacionPCM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_identificacionPCM.setPreferredSize(new java.awt.Dimension(151, 28));

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
                        .addComponent(Campo_identificacionPCM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(Campo_identificacionPCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(100, Short.MAX_VALUE))
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
        label_TipoUsuario2.setText("Fecha nacimiento");

        label_TipoUsuario3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario3.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario3.setText("Dirección");

        label_TipoUsuario4.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario4.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario4.setText("Genero");

        label_TipoUsuario5.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario5.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario5.setText("Teléfono");

        label_TipoUsuario6.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario6.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario6.setText("Relación");

        Campo_fechaN.setBackground(new java.awt.Color(217, 217, 217));
        Campo_fechaN.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_fechaN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_fechaN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_fechaN.setEnabled(false);
        Campo_fechaN.setPreferredSize(new java.awt.Dimension(151, 28));

        Campo_Direccion.setBackground(new java.awt.Color(217, 217, 217));
        Campo_Direccion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_Direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_Direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_Direccion.setEnabled(false);
        Campo_Direccion.setPreferredSize(new java.awt.Dimension(151, 28));

        Campo_genero.setBackground(new java.awt.Color(217, 217, 217));
        Campo_genero.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_genero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_genero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_genero.setEnabled(false);
        Campo_genero.setPreferredSize(new java.awt.Dimension(151, 28));

        Campo_telefono.setBackground(new java.awt.Color(217, 217, 217));
        Campo_telefono.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_telefono.setEnabled(false);
        Campo_telefono.setPreferredSize(new java.awt.Dimension(151, 28));

        Campo_relacion.setBackground(new java.awt.Color(217, 217, 217));
        Campo_relacion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Campo_relacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_relacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_relacion.setEnabled(false);
        Campo_relacion.setPreferredSize(new java.awt.Dimension(151, 28));

        Label_NombreCompleto.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        Label_NombreCompleto.setForeground(new java.awt.Color(0, 14, 20));
        Label_NombreCompleto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_NombreCompleto.setText("Nombre Completo");

        Label_FotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_FotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FotoUsuario_PC.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_TipoUsuario6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Campo_relacion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_TipoUsuario5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_TipoUsuario4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Campo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_TipoUsuario3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Campo_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_TipoUsuario2)
                        .addGap(18, 18, 18)
                        .addComponent(Campo_fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_NombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_FotoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_TipoUsuario2)
                            .addComponent(Campo_fechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_TipoUsuario3)
                            .addComponent(Campo_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Campo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_TipoUsuario4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_TipoUsuario5)
                            .addComponent(Campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_TipoUsuario6)
                            .addComponent(Campo_relacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Label_FotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Label_NombreCompleto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Label_Texto_ingreso1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso1.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso1.setText("Resultados");

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

        jTabbedPane1.addTab("Datos usuario", Panel_DatosUsuario);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));

        Panel_IngresoUsuario1.setBackground(new java.awt.Color(247, 246, 249));

        label_TipoUsuario7.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario7.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario7.setText("Fecha Registro *");

        label_TipoUsuario8.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario8.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario8.setText("Duración (min) *");

        Campo_duracionConsulta.setBackground(new java.awt.Color(217, 217, 217));
        Campo_duracionConsulta.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_duracionConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_duracionConsulta.setPreferredSize(new java.awt.Dimension(151, 28));

        label_TipoUsuario9.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label_TipoUsuario9.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario9.setText("Motivo *");

        Combo_MotivoConsulta.setBackground(new java.awt.Color(217, 217, 217));
        Combo_MotivoConsulta.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Combo_MotivoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolor cabeza", "Dolor pecho", "Gripa", "Dolor estómago", "Fiebre" }));

        TextArea_observaciones.setBackground(new java.awt.Color(217, 217, 217));
        TextArea_observaciones.setColumns(20);
        TextArea_observaciones.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TextArea_observaciones.setLineWrap(true);
        TextArea_observaciones.setRows(5);
        TextArea_observaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones generales del procedimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 11))); // NOI18N
        jScrollPane1.setViewportView(TextArea_observaciones);

        label_TipoUsuario13.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        label_TipoUsuario13.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario13.setText("Medico/a *");

        Combo_responsableMedico.setBackground(new java.awt.Color(217, 217, 217));
        Combo_responsableMedico.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        javax.swing.GroupLayout Panel_IngresoUsuario1Layout = new javax.swing.GroupLayout(Panel_IngresoUsuario1);
        Panel_IngresoUsuario1.setLayout(Panel_IngresoUsuario1Layout);
        Panel_IngresoUsuario1Layout.setHorizontalGroup(
            Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_IngresoUsuario1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(Panel_IngresoUsuario1Layout.createSequentialGroup()
                        .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_IngresoUsuario1Layout.createSequentialGroup()
                                .addComponent(label_TipoUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(DataChoose_FechaRegistroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_IngresoUsuario1Layout.createSequentialGroup()
                                .addComponent(label_TipoUsuario8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_duracionConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel_IngresoUsuario1Layout.createSequentialGroup()
                                .addComponent(label_TipoUsuario13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Combo_responsableMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_IngresoUsuario1Layout.createSequentialGroup()
                                .addComponent(label_TipoUsuario9)
                                .addGap(36, 36, 36)
                                .addComponent(Combo_MotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48))
        );
        Panel_IngresoUsuario1Layout.setVerticalGroup(
            Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IngresoUsuario1Layout.createSequentialGroup()
                .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_IngresoUsuario1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_MotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_TipoUsuario9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_TipoUsuario13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Combo_responsableMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_IngresoUsuario1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DataChoose_FechaRegistroConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_TipoUsuario7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_IngresoUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_TipoUsuario8)
                            .addComponent(Campo_duracionConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        Label_Texto_ingreso2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso2.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso2.setText("Ingreso de datos");

        Panel_acciones1.setBackground(new java.awt.Color(247, 246, 249));

        Panel_BotonBuscar1.setBackground(new java.awt.Color(224, 169, 96));

        Label_GuardarDatosPC.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_GuardarDatosPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_GuardarDatosPC.setText("Guardar datos");
        Label_GuardarDatosPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_GuardarDatosPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_GuardarDatosPCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotonBuscar1Layout = new javax.swing.GroupLayout(Panel_BotonBuscar1);
        Panel_BotonBuscar1.setLayout(Panel_BotonBuscar1Layout);
        Panel_BotonBuscar1Layout.setHorizontalGroup(
            Panel_BotonBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_GuardarDatosPC, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_BotonBuscar1Layout.setVerticalGroup(
            Panel_BotonBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_GuardarDatosPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_botonRestablecer1.setBackground(new java.awt.Color(224, 169, 96));

        Label_RestablecerPCM.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_RestablecerPCM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_RestablecerPCM.setText("Restablecer");
        Label_RestablecerPCM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_RestablecerPCM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_RestablecerPCMMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_botonRestablecer1Layout = new javax.swing.GroupLayout(Panel_botonRestablecer1);
        Panel_botonRestablecer1.setLayout(Panel_botonRestablecer1Layout);
        Panel_botonRestablecer1Layout.setHorizontalGroup(
            Panel_botonRestablecer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_RestablecerPCM, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_botonRestablecer1Layout.setVerticalGroup(
            Panel_botonRestablecer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_RestablecerPCM, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_acciones1Layout = new javax.swing.GroupLayout(Panel_acciones1);
        Panel_acciones1.setLayout(Panel_acciones1Layout);
        Panel_acciones1Layout.setHorizontalGroup(
            Panel_acciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_acciones1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(Panel_BotonBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_botonRestablecer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_acciones1Layout.setVerticalGroup(
            Panel_acciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_acciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_acciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_BotonBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_botonRestablecer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(247, 246, 249));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setText("VALOR A CANCELAR");

        label_valorCancelar.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        label_valorCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_valorCancelar.setText("$ 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(label_valorCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_valorCancelar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_IngresoUsuario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_acciones1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_Texto_ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Label_Texto_ingreso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_IngresoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_acciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos procedimiento", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(label_Titulo_Cotizantes)
                    .addComponent(Label_texto_cotizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_texto_cotizante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
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

        if (Campo_identificacionPCM.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Se debe ingresar un dato en el campo de identificación.");

        } else {

            String tipoUsuario = Combo_tipoUsuario.getSelectedItem().toString();
            int idusuario = Integer.parseInt(Campo_identificacionPCM.getText());

            ControladorProcedimientosMedicos objCPM = new ControladorProcedimientosMedicos();

            //Obteniendo los resultados de la consulta
            ResultSet datosResultados = objCPM.ConsultarDatosUsuarioProcedimiento(tipoUsuario, idusuario);

            if (tipoUsuario.equals("Beneficiario")) {

                try {

                    while (datosResultados.next()) {

                        String nombre = datosResultados.getString("nombre");
                        String apellido = datosResultados.getString("apellido");

                        String identificacion = datosResultados.getString("identificacion");
                        String telefono = "N/A";
                        String fechaNacimiento = datosResultados.getString("fechaNacimiento");
                        String genero = datosResultados.getString("genero");
                        String direccion = datosResultados.getString("direccion");
                        String relacion = datosResultados.getString("relacion");

                        String nombreCompleto = nombre + " " + apellido;
                        Label_NombreCompleto.setText(nombreCompleto);

                        Campo_fechaN.setText(fechaNacimiento);
                        Campo_Direccion.setText(direccion);
                        Campo_genero.setText(genero);
                        Campo_telefono.setText(telefono);
                        Campo_relacion.setText(relacion);

                        id_usuario = Integer.parseInt(datosResultados.getString("id_usuario"));

                    }//Fin while

                } catch (SQLException e) {

                    System.out.println("Error extrayendo datos: " + e);

                }//Fin catch

            } else if (tipoUsuario.equals("Cotizante")) {

                try {

                    while (datosResultados.next()) {

                        String cedula = datosResultados.getString("cedula");
                        String telefono = datosResultados.getString("telefono");
                        String fechaNacimiento = datosResultados.getString("fechaNacimiento");
                        String genero = datosResultados.getString("genero");
                        String direccion = datosResultados.getString("direccion");
                        String relacion = "N/A";

                        String nombre = datosResultados.getString("nombre");
                        String apellido = datosResultados.getString("apellido");

                        String nombreCompleto = nombre + " " + apellido;
                        Label_NombreCompleto.setText(nombreCompleto);

                        Campo_fechaN.setText(fechaNacimiento);
                        Campo_Direccion.setText(direccion);
                        Campo_genero.setText(genero);
                        Campo_telefono.setText(telefono);
                        Campo_relacion.setText(relacion);

                        id_usuario = Integer.parseInt(datosResultados.getString("id_usuario"));

                    }//Fin while

                } catch (SQLException e) {

                    System.out.println("Error extrayendo datos: " + e);

                }//Fin catch

            }//Fin condición

        }//Fin condición principal

    }//GEN-LAST:event_Label_BuscarUsuarioMousePressed

    private void Label_GuardarDatosPCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_GuardarDatosPCMousePressed

        if (id_usuario == 0) {

            JOptionPane.showMessageDialog(null, "Busca la información del usuario en la pestaña (Datos usuario).");

        } else if (id_usuario != 0) {

            //Modificando la fecha obtenida del campo
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormato = formatoFecha.format(DataChoose_FechaRegistroConsulta.getDate());
            LocalDate fechaRegistroProcedimiento = LocalDate.parse(fechaFormato);

            String motivoConsulta = Combo_MotivoConsulta.getSelectedItem().toString();
            int duracionProcedimiento = Integer.parseInt(Campo_duracionConsulta.getText());
            double tarifaReal = 50000.0;
            String tipoProcedimiento = "P. consulta médica";

            String observaciones = TextArea_observaciones.getText();
            String responsable = Combo_responsableMedico.getSelectedItem().toString();

            //En esta parte se está guardando el valor (id) al encontrar el nombre del responsable en el hashmap
            int codigoCirujano = datosCirujanos.get(responsable);

            //Creando un objeto de la clase procedimiento cirugia
            ProcedimientoConsultaMedica objPCM = new ProcedimientoConsultaMedica(observaciones, motivoConsulta, codigoCirujano, fechaRegistroProcedimiento, duracionProcedimiento, tarifaReal);

            Double costoPago = objPCM.CalcularCostoPago();

            DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
            label_valorCancelar.setText("$ " + decimalFormat.format(costoPago));

            //Invocando método para enviar los datos a la base de datos
            ControladorProcedimientosMedicos objCPM = new ControladorProcedimientosMedicos();

            boolean resultadosGuardado = objCPM.InsertarDatosProcedimientoConsultaMedica(objPCM, tipoProcedimiento, costoPago, id_usuario);

            if (resultadosGuardado) {

                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");

            } else {

                JOptionPane.showMessageDialog(null, "Problemas al guardar los datos.");

            }//Fin condición

        }//Fin condición 

    }//GEN-LAST:event_Label_GuardarDatosPCMousePressed

    private void Label_RestablecerPCMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RestablecerPCMMousePressed

        Campo_duracionConsulta.setText("");
        TextArea_observaciones.setText("");
        label_valorCancelar.setText("$ 0");

    }//GEN-LAST:event_Label_RestablecerPCMMousePressed

    private void Label_RestablecerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RestablecerMousePressed

        Campo_identificacionPCM.setText("");
        Campo_fechaN.setText("");
        Campo_Direccion.setText("");
        Campo_genero.setText("");
        Campo_telefono.setText("");
        Campo_relacion.setText("");
        Label_NombreCompleto.setText("Nombre Completo");
        id_usuario = 0;

    }//GEN-LAST:event_Label_RestablecerMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_Direccion;
    private javax.swing.JTextField Campo_duracionConsulta;
    private javax.swing.JTextField Campo_fechaN;
    private javax.swing.JTextField Campo_genero;
    private javax.swing.JTextField Campo_identificacionPCM;
    private javax.swing.JTextField Campo_relacion;
    private javax.swing.JTextField Campo_telefono;
    private javax.swing.JComboBox<String> Combo_MotivoConsulta;
    private javax.swing.JComboBox<String> Combo_responsableMedico;
    private javax.swing.JComboBox<String> Combo_tipoUsuario;
    private com.toedter.calendar.JDateChooser DataChoose_FechaRegistroConsulta;
    private javax.swing.JLabel Label_BuscarUsuario;
    private javax.swing.JLabel Label_FotoUsuario;
    private javax.swing.JLabel Label_GuardarDatosPC;
    private javax.swing.JLabel Label_NombreCompleto;
    private javax.swing.JLabel Label_Restablecer;
    private javax.swing.JLabel Label_RestablecerPCM;
    private javax.swing.JLabel Label_Texto_ingreso;
    private javax.swing.JLabel Label_Texto_ingreso1;
    private javax.swing.JLabel Label_Texto_ingreso2;
    private javax.swing.JLabel Label_texto_cotizante;
    private javax.swing.JLabel Label_texto_cotizante1;
    private javax.swing.JPanel Panel_BotonBuscar;
    private javax.swing.JPanel Panel_BotonBuscar1;
    private javax.swing.JPanel Panel_DatosUsuario;
    private javax.swing.JPanel Panel_IngresoUsuario;
    private javax.swing.JPanel Panel_IngresoUsuario1;
    private javax.swing.JPanel Panel_acciones;
    private javax.swing.JPanel Panel_acciones1;
    private javax.swing.JPanel Panel_botonRestablecer;
    private javax.swing.JPanel Panel_botonRestablecer1;
    private javax.swing.JTextArea TextArea_observaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_TipoUsuario;
    private javax.swing.JLabel label_TipoUsuario1;
    private javax.swing.JLabel label_TipoUsuario13;
    private javax.swing.JLabel label_TipoUsuario2;
    private javax.swing.JLabel label_TipoUsuario3;
    private javax.swing.JLabel label_TipoUsuario4;
    private javax.swing.JLabel label_TipoUsuario5;
    private javax.swing.JLabel label_TipoUsuario6;
    private javax.swing.JLabel label_TipoUsuario7;
    private javax.swing.JLabel label_TipoUsuario8;
    private javax.swing.JLabel label_TipoUsuario9;
    private javax.swing.JLabel label_Titulo_Cotizantes;
    private javax.swing.JLabel label_valorCancelar;
    // End of variables declaration//GEN-END:variables
}
