package Vista.Paneles;

import Controlador.ControladorReportesMedicos;
import Modelo.ProcedimientoCirugia;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Panel_ReportesIPS extends javax.swing.JPanel {

    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    LinkedList<ProcedimientoCirugia> datosIPS;

    public Panel_ReportesIPS() {
        initComponents();
        datosIPS = new LinkedList<>();
    }//Fin constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Titulo_Cotizantes = new javax.swing.JLabel();
        Label_texto_cotizante = new javax.swing.JLabel();
        Label_texto_cotizante1 = new javax.swing.JLabel();
        Panel_IngresoUsuario2 = new javax.swing.JPanel();
        label_TipoUsuario7 = new javax.swing.JLabel();
        Campo_identificacionIPS = new javax.swing.JTextField();
        Label_Texto_ingreso = new javax.swing.JLabel();
        Panel_acciones = new javax.swing.JPanel();
        Panel_BotonBuscar = new javax.swing.JPanel();
        Label_BuscarIPS = new javax.swing.JLabel();
        Panel_botonRestablecer = new javax.swing.JPanel();
        Label_Restablecer = new javax.swing.JLabel();
        Label_Texto_ingreso1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_DatosIPS = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(759, 679));

        label_Titulo_Cotizantes.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        label_Titulo_Cotizantes.setForeground(new java.awt.Color(0, 14, 20));
        label_Titulo_Cotizantes.setText("REPORTES GENERALES DE PACIENTES");

        Label_texto_cotizante.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante.setText("En esta sección el encargado podrá buscar todos los datos relacionados a los procedimientos de cirugía realizados en una IPS");

        Label_texto_cotizante1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante1.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante1.setText("o centro médico especializado en cirugías.");

        Panel_IngresoUsuario2.setBackground(new java.awt.Color(247, 246, 249));

        label_TipoUsuario7.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        label_TipoUsuario7.setForeground(new java.awt.Color(0, 14, 20));
        label_TipoUsuario7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_TipoUsuario7.setText("Identificación *");

        Campo_identificacionIPS.setBackground(new java.awt.Color(217, 217, 217));
        Campo_identificacionIPS.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Campo_identificacionIPS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Campo_identificacionIPS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_identificacionIPS.setPreferredSize(new java.awt.Dimension(151, 28));

        javax.swing.GroupLayout Panel_IngresoUsuario2Layout = new javax.swing.GroupLayout(Panel_IngresoUsuario2);
        Panel_IngresoUsuario2.setLayout(Panel_IngresoUsuario2Layout);
        Panel_IngresoUsuario2Layout.setHorizontalGroup(
            Panel_IngresoUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IngresoUsuario2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(label_TipoUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_IngresoUsuario2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Campo_identificacionIPS, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        Panel_IngresoUsuario2Layout.setVerticalGroup(
            Panel_IngresoUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IngresoUsuario2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_TipoUsuario7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_identificacionIPS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label_Texto_ingreso.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso.setText("Ingreso de datos");

        Panel_acciones.setBackground(new java.awt.Color(247, 246, 249));

        Panel_BotonBuscar.setBackground(new java.awt.Color(224, 169, 96));

        Label_BuscarIPS.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        Label_BuscarIPS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_BuscarIPS.setText("Buscar IPS");
        Label_BuscarIPS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_BuscarIPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Label_BuscarIPSMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BotonBuscarLayout = new javax.swing.GroupLayout(Panel_BotonBuscar);
        Panel_BotonBuscar.setLayout(Panel_BotonBuscarLayout);
        Panel_BotonBuscarLayout.setHorizontalGroup(
            Panel_BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BuscarIPS, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        Panel_BotonBuscarLayout.setVerticalGroup(
            Panel_BotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_BuscarIPS, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_accionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel_botonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        Panel_accionesLayout.setVerticalGroup(
            Panel_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_accionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_botonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Label_Texto_ingreso1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso1.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso1.setText("Listado de procedimientos realizados en la IPS solicitada");

        jPanel1.setBackground(new java.awt.Color(247, 246, 249));

        Tabla_DatosIPS.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Tabla_DatosIPS.setForeground(new java.awt.Color(0, 14, 20));
        Tabla_DatosIPS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha registro", "Duración (min)", "Valor cancelar", "Tarifa real", "Tipo Proce.", "Responsable", "Tipo cirugía", "Días Hospita."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_DatosIPS.setGridColor(new java.awt.Color(69, 186, 251));
        jScrollPane2.setViewportView(Tabla_DatosIPS);
        if (Tabla_DatosIPS.getColumnModel().getColumnCount() > 0) {
            Tabla_DatosIPS.getColumnModel().getColumn(3).setResizable(false);
            Tabla_DatosIPS.getColumnModel().getColumn(5).setResizable(false);
        }

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Texto_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Label_texto_cotizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Label_texto_cotizante1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_Titulo_Cotizantes)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Label_Texto_ingreso1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(Panel_IngresoUsuario2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Panel_acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_Titulo_Cotizantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_texto_cotizante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_texto_cotizante1)
                .addGap(27, 27, 27)
                .addComponent(Label_Texto_ingreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_IngresoUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(Label_Texto_ingreso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Label_BuscarIPSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_BuscarIPSMousePressed

        if (Campo_identificacionIPS.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Se debe ingresar la identificación de la IPS.");

        } else {

            try {

                int codigoIPS = Integer.parseInt(Campo_identificacionIPS.getText());
                ControladorReportesMedicos objCRM = new ControladorReportesMedicos();
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Fecha Registro");
                model.addColumn("Duración (min)");
                model.addColumn("Valor cancelar");
                model.addColumn("Tarifa real");
                model.addColumn("Tipo procedimiento");
                model.addColumn("Responsable");
                model.addColumn("Tipo cirugía");
                model.addColumn("Días Hospita.");

                datosIPS = objCRM.ConsultaProcedimientosIPS(codigoIPS);

                for (ProcedimientoCirugia PC : datosIPS) {

                    model.addRow(new Object[]{PC.getFechaRegistro(), PC.getDuracion(), PC.getCostoPago(), PC.getTarifaReal(), PC.getTipoProcedimiento(),
                        PC.getNombreCompletoResponsable(), PC.getTipo(), PC.getDiasHospitalizacion()});

                }//Fin ciclo for

                Tabla_DatosIPS.setModel(model);

            } catch (Exception e) {

                System.out.println("Error consulta: " + e);

            }//Fin catch

        }//Fin condición

    }//GEN-LAST:event_Label_BuscarIPSMousePressed

    private void Label_RestablecerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_RestablecerMousePressed


    }//GEN-LAST:event_Label_RestablecerMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_identificacionIPS;
    private javax.swing.JTextField Campo_identificacionPC;
    private javax.swing.JTextField Campo_identificacionPC1;
    private javax.swing.JTextField Campo_identificacionPC2;
    private javax.swing.JComboBox<String> Combo_tipoUsuario;
    private javax.swing.JComboBox<String> Combo_tipoUsuario1;
    private javax.swing.JComboBox<String> Combo_tipoUsuario2;
    private javax.swing.JLabel Label_BuscarIPS;
    private javax.swing.JLabel Label_Restablecer;
    private javax.swing.JLabel Label_Texto_ingreso;
    private javax.swing.JLabel Label_Texto_ingreso1;
    private javax.swing.JLabel Label_texto_cotizante;
    private javax.swing.JLabel Label_texto_cotizante1;
    private javax.swing.JPanel Panel_BotonBuscar;
    private javax.swing.JPanel Panel_DatosUsuario;
    private javax.swing.JPanel Panel_DatosUsuario1;
    private javax.swing.JPanel Panel_DatosUsuario2;
    private javax.swing.JPanel Panel_IngresoUsuario;
    private javax.swing.JPanel Panel_IngresoUsuario1;
    private javax.swing.JPanel Panel_IngresoUsuario2;
    private javax.swing.JPanel Panel_IngresoUsuario3;
    private javax.swing.JPanel Panel_acciones;
    private javax.swing.JPanel Panel_botonRestablecer;
    private javax.swing.JTable Tabla_DatosIPS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_TipoUsuario;
    private javax.swing.JLabel label_TipoUsuario1;
    private javax.swing.JLabel label_TipoUsuario2;
    private javax.swing.JLabel label_TipoUsuario4;
    private javax.swing.JLabel label_TipoUsuario5;
    private javax.swing.JLabel label_TipoUsuario6;
    private javax.swing.JLabel label_TipoUsuario7;
    private javax.swing.JLabel label_Titulo_Cotizantes;
    // End of variables declaration//GEN-END:variables
}
