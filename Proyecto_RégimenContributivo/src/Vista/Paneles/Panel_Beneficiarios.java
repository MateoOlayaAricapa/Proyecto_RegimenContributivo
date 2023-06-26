package Vista.Paneles;

import Controlador.ControladorUsuario;
import Modelo.Beneficiario;
import Vista.Ventanal_Ingreso_Datos;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Panel_Beneficiarios extends javax.swing.JPanel {

    // Establece el padding del JTextField
    int topPadding = 5; // Espaciado superior
    int leftPadding = 10; // Espaciado izquierdo
    int bottomPadding = 5; // Espaciado inferior
    int rightPadding = 10; // Espaciado derecho

    //Lista que guardará los datos de beneficiarios
    LinkedList<Beneficiario> datosBeneficiario;

    public Panel_Beneficiarios() {
        initComponents();
        PaddingTextField();
        PersonalizacionTabla();
        datosBeneficiario = new LinkedList<>();
    }//Fin constructor

    private void PersonalizacionTabla() {

        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) Tabla_Datos_Beneficiarios.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

    }//Fin método

    private void PaddingTextField() {

        Campo_cedula_cotizante.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

    }//Fin método

    private void agregarBeneficiario(Beneficiario objBeneficiario) {

        datosBeneficiario.add(objBeneficiario);

    }//Fin método

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Titulo_Cotizantes = new javax.swing.JLabel();
        Label_texto_cotizante = new javax.swing.JLabel();
        Label_texto_cotizante1 = new javax.swing.JLabel();
        Label_Texto_ingreso = new javax.swing.JLabel();
        Panel_datos_cotizante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_boton_agregar_beneficiario = new javax.swing.JPanel();
        label_agregar_beneficiario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Datos_Beneficiarios = new javax.swing.JTable();
        Label_texto_cotizante3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Campo_cedula_cotizante = new javax.swing.JTextField();
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
        label_Titulo_Cotizantes.setText("BENEFICIARIO");

        Label_texto_cotizante.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante.setText("En esta sección el encargado podrá ingresar todos los datos de los beneficiarios que tengan relación con un cotizante.");

        Label_texto_cotizante1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Label_texto_cotizante1.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante1.setText("Ciertamente puede agregar tantos beneficiarios como disponga el cotizante al sistema.");

        Label_Texto_ingreso.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_Texto_ingreso.setForeground(new java.awt.Color(154, 154, 155));
        Label_Texto_ingreso.setText("Ingreso de datos");

        Panel_datos_cotizante.setBackground(new java.awt.Color(247, 246, 249));
        Panel_datos_cotizante.setPreferredSize(new java.awt.Dimension(667, 302));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 14, 20));
        jLabel1.setText("Usuario(s)");

        jSeparator1.setPreferredSize(new java.awt.Dimension(628, 10));

        panel_boton_agregar_beneficiario.setBackground(new java.awt.Color(224, 169, 96));
        panel_boton_agregar_beneficiario.setPreferredSize(new java.awt.Dimension(121, 29));

        label_agregar_beneficiario.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        label_agregar_beneficiario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_agregar_beneficiario.setText("Agregar beneficiario");
        label_agregar_beneficiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_agregar_beneficiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_agregar_beneficiarioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_boton_agregar_beneficiarioLayout = new javax.swing.GroupLayout(panel_boton_agregar_beneficiario);
        panel_boton_agregar_beneficiario.setLayout(panel_boton_agregar_beneficiarioLayout);
        panel_boton_agregar_beneficiarioLayout.setHorizontalGroup(
            panel_boton_agregar_beneficiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_agregar_beneficiario, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        panel_boton_agregar_beneficiarioLayout.setVerticalGroup(
            panel_boton_agregar_beneficiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_agregar_beneficiario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        Tabla_Datos_Beneficiarios.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Tabla_Datos_Beneficiarios.setForeground(new java.awt.Color(0, 14, 20));
        Tabla_Datos_Beneficiarios.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Datos_Beneficiarios.setGridColor(new java.awt.Color(69, 186, 251));
        jScrollPane1.setViewportView(Tabla_Datos_Beneficiarios);

        javax.swing.GroupLayout Panel_datos_cotizanteLayout = new javax.swing.GroupLayout(Panel_datos_cotizante);
        Panel_datos_cotizante.setLayout(Panel_datos_cotizanteLayout);
        Panel_datos_cotizanteLayout.setHorizontalGroup(
            Panel_datos_cotizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_datos_cotizanteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel_datos_cotizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(Panel_datos_cotizanteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_boton_agregar_beneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_datos_cotizanteLayout.setVerticalGroup(
            Panel_datos_cotizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_datos_cotizanteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Panel_datos_cotizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(panel_boton_agregar_beneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        Label_texto_cotizante3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        Label_texto_cotizante3.setForeground(new java.awt.Color(154, 154, 155));
        Label_texto_cotizante3.setText("Ingresa los datos del cotizante");

        jPanel2.setBackground(new java.awt.Color(247, 246, 249));
        jPanel2.setPreferredSize(new java.awt.Dimension(667, 75));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 14, 20));
        jLabel11.setText("Cédula *");

        Campo_cedula_cotizante.setBackground(new java.awt.Color(217, 217, 217));
        Campo_cedula_cotizante.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Campo_cedula_cotizante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217)));
        Campo_cedula_cotizante.setPreferredSize(new java.awt.Dimension(151, 28));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(Campo_cedula_cotizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Campo_cedula_cotizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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
                        .addComponent(Panel_datos_cotizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(Panel_datos_cotizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void GuardarDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarDatosMousePressed

        int cedulaCotizante = Integer.parseInt(Campo_cedula_cotizante.getText());

        ControladorUsuario objCU = new ControladorUsuario();

        ResultSet datosConsulta = objCU.ConsultaCedulaCotizante(cedulaCotizante);

        try {

            if (datosConsulta.next()) {

                //Invocando método que guardará los datos de cada beneficiario de un cotizante
                boolean resultado = objCU.IngresarDatosBeneficiario(datosBeneficiario, cedulaCotizante);

                //Mostrando una mensaje al usuario para confirmar el guardado de los datos
                if (resultado) {

                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");

                } else {

                    JOptionPane.showMessageDialog(null, "Problemas al guardar los datos. Revisa de nuevo los campos ingresados.");

                }//Fin condición

            } else {

                JOptionPane.showMessageDialog(null, "Cédula no registrada en la base de datos. Verifica los valores ingresados.");
                
            }//Fin condición

        } catch (SQLException e) {

            System.out.println("Error consulta cédula: " + e);
            
        }//Fin catch

    }//GEN-LAST:event_GuardarDatosMousePressed

    private void Label_BorrarDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_BorrarDatosMousePressed


    }//GEN-LAST:event_Label_BorrarDatosMousePressed

    private void label_agregar_beneficiarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_agregar_beneficiarioMousePressed

        Ventanal_Ingreso_Datos PIDB = new Ventanal_Ingreso_Datos();
        PIDB.setVisible(true);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Relación");
        model.addColumn("Tipo de identificación");
        model.addColumn("Identificación");
        model.addColumn("Genero");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Dirección");

        //Este evento detecta cuando la ventana se cierra
        //Con este método se puede tomar objetos creados en otra interfaz gráfica
        //para ser utilizados en otra interfaz gráfica
        PIDB.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                agregarBeneficiario(PIDB.getObjBeneficiario());

                //Este for (ciclo) traerá todos los datos de cada beneficiario
                //y creará una fila en el table de la interfaz gráfica
                for (Beneficiario beneficiario : datosBeneficiario) {
                    model.addRow(new Object[]{beneficiario.getNombre(), beneficiario.getApellido(), beneficiario.getRelacion(), beneficiario.getTipoIdentificacion(),
                        beneficiario.getIdentificacion(), beneficiario.getGenero(), beneficiario.getFechaNacimiento(), beneficiario.getDireccion()});
                }//Fin ciclo for

                Tabla_Datos_Beneficiarios.setModel(model);
            }
        });

    }//GEN-LAST:event_label_agregar_beneficiarioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_cedula_cotizante;
    private javax.swing.JLabel GuardarDatos;
    private javax.swing.JLabel Label_BorrarDatos;
    private javax.swing.JLabel Label_Texto_ingreso;
    private javax.swing.JLabel Label_texto_cotizante;
    private javax.swing.JLabel Label_texto_cotizante1;
    private javax.swing.JLabel Label_texto_cotizante3;
    private javax.swing.JLabel Label_texto_cotizante4;
    private javax.swing.JPanel Panel_BotonGuardarDatos;
    private javax.swing.JPanel Panel_Boton_BorrarDatos;
    private javax.swing.JPanel Panel_datos_cotizante;
    private javax.swing.JTable Tabla_Datos_Beneficiarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_Titulo_Cotizantes;
    private javax.swing.JLabel label_agregar_beneficiario;
    private javax.swing.JPanel panel_boton_agregar_beneficiario;
    // End of variables declaration//GEN-END:variables
}
