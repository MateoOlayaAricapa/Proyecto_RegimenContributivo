package Controlador;

import Modelo.ProcedimientoCirugia;
import Modelo.ProcedimientoConsultaMedica;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorProcedimientosMedicos {

    //Este método traera todos los datos de un usuario consultado
    public ResultSet ConsultarDatosUsuarioProcedimiento(String tipoUsuario, int id) {

        ResultSet resultados = null;
        ConexionBD objConx = new ConexionBD();

        String consultaSQLC = "SELECT * FROM usuario as U INNER JOIN cotizante as C ON U.id_usuario = C.id_usuario WHERE C.cedula = '" + id + "'";
        String consultaSQLB = "SELECT * FROM usuario as U INNER JOIN beneficiario as B ON U.id_usuario = B.id_usuario WHERE B.identificacion = '" + id + "'";

        if (objConx.EstablecerConexion()) {

            //Esta condición permite ejecutar sentencias SQL diferentes
            if (tipoUsuario.equals("Beneficiario")) {

                try {

                    resultados = objConx.getEstadoConexion().executeQuery(consultaSQLB);

                } catch (SQLException e) {

                    System.out.println("Error en la consulta: " + e);

                }//Fin catch

            } else if (tipoUsuario.equals("Cotizante")) {

                try {

                    resultados = objConx.getEstadoConexion().executeQuery(consultaSQLC);
                    System.out.println(resultados);

                } catch (SQLException e) {

                    System.out.println("Error en la consulta: " + e);

                }//Fin catch

            }//Fin condición

        }//Fin condición

        return resultados;

    }//Fin método

    //Este método traerá todos los datos de los responsables encontrados en la base de datos
    public ResultSet DatosResponsables(String tipoResponsable) {

        ResultSet datosResultados = null;
        ConexionBD objconex = new ConexionBD();
        String consultaSQL = "SELECT * FROM responsable WHERE rol = '" + tipoResponsable + "'";

        if (objconex.EstablecerConexion()) {

            try {

                datosResultados = objconex.getEstadoConexion().executeQuery(consultaSQL);

            } catch (SQLException e) {

                System.out.println("Error en la consulta: " + e);

            }//Fin catch

        }//Fin condición

        return datosResultados;

    }//Fin método

    //Este método insertará los datos del procedimiento de cirugía
    public boolean InsertarDatosProcedimientoCirugia(ProcedimientoCirugia PC, String tipoProcedimiento, Double CostoPago, int id_usuario) {

        boolean verificacionguardado = true;

        ConexionBD objConex = new ConexionBD();
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;

        ResultSet idProcedimiento;

        //Sentencias SQL
        String consultaSQL1 = "INSERT INTO procedimiento (fechaRegistro, duracion, costoPago, tarifaReal, tipoProcedimiento) VALUES(?,?,?,?,?)";
        String consultaSQL2 = "INSERT INTO procedimientocirugia (IPS, diasHospitalizacion, tipoCirugia, descripcion, id_procedimiento, id_profesional) VALUES(?,?,?,?,?,?)";
        String consultaSQL3 = "INSERT INTO usuarioprocedimiento (id_procedimiento, id_usuario) VALUES(?,?)";

        if (objConex.EstablecerConexion()) {

            try {

                objConex.getConexion().setAutoCommit(false);
                ps = objConex.getConexion().prepareStatement(consultaSQL1, objConex.getEstadoConexion().RETURN_GENERATED_KEYS);
                ps2 = objConex.getConexion().prepareStatement(consultaSQL2);
                ps3 = objConex.getConexion().prepareStatement(consultaSQL3);

                //Insertando datos en la entidad procedimiento
                ps.setDate(1, Date.valueOf(PC.getFechaRegistro()));
                ps.setInt(2, PC.getDuracion());
                ps.setDouble(3, CostoPago);
                ps.setDouble(4, PC.getTarifaReal());
                ps.setString(5, tipoProcedimiento);

                ps.executeUpdate();

                idProcedimiento = ps.getGeneratedKeys();

                int idP = 0;

                while (idProcedimiento.next()) {

                    idP = idProcedimiento.getInt(1);

                }//Fin while

                //Insertando datos en la entidad procedimiento cirugía
                ps2.setInt(1, PC.getIPS());
                ps2.setInt(2, PC.getDiasHospitalizacion());
                ps2.setString(3, PC.getTipo());
                ps2.setString(4, PC.getDescripcion());
                ps2.setInt(5, idP);
                ps2.setInt(6, PC.getcodigoCirujano());

                ps2.executeUpdate();

                //Insertando datos en la entidad asociativa usuarioprocedimiento
                ps3.setInt(1, idP);
                ps3.setInt(2, id_usuario);

                ps3.executeUpdate();

                objConex.getConexion().commit();

            } catch (SQLException e) {

                System.out.println("Error en la inserción de datos: " + e);
                verificacionguardado = false;

            } finally {

                try {

                    ps.close();
                    ps2.close();
                    ps3.close();

                } catch (SQLException e) {

                    System.out.println("Error al cerrar transacción: " + e);
                    verificacionguardado = false;

                }//Fin catch

            }//Fin catch

        }//Fin condición

        return verificacionguardado;

    }//Fin método

    //Este método guardará datos relacionados a la consulta médica
    public boolean InsertarDatosProcedimientoConsultaMedica(ProcedimientoConsultaMedica PCM, String tipoProcedimiento, Double CostoPago, int id_usuario) {

        boolean verificacionguardado = true;

        ConexionBD objConex = new ConexionBD();
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;

        ResultSet idProcedimiento;

        //Sentencias SQL
        String consultaSQL1 = "INSERT INTO procedimiento (fechaRegistro, duracion, costoPago, tarifaReal, tipoProcedimiento) VALUES(?,?,?,?,?)";
        String consultaSQL2 = "INSERT INTO procedimientoconsultamedica (motivo, observacion, id_procedimiento, id_profesional) VALUES(?,?,?,?)";
        String consultaSQL3 = "INSERT INTO usuarioprocedimiento (id_procedimiento, id_usuario) VALUES(?,?)";

        if (objConex.EstablecerConexion()) {

            try {

                objConex.getConexion().setAutoCommit(false);
                ps = objConex.getConexion().prepareStatement(consultaSQL1, objConex.getEstadoConexion().RETURN_GENERATED_KEYS);
                ps2 = objConex.getConexion().prepareStatement(consultaSQL2);
                ps3 = objConex.getConexion().prepareStatement(consultaSQL3);

                //Insertando datos en la entidad procedimiento
                ps.setDate(1, Date.valueOf(PCM.getFechaRegistro()));
                ps.setInt(2, PCM.getDuracion());
                ps.setDouble(3, CostoPago);
                ps.setDouble(4, PCM.getTarifaReal());
                ps.setString(5, tipoProcedimiento);

                ps.executeUpdate();

                idProcedimiento = ps.getGeneratedKeys();

                int idP = 0;

                while (idProcedimiento.next()) {

                    idP = idProcedimiento.getInt(1);

                }//Fin while

                //Insertando datos en la entidad procedimiento consulta médica
                ps2.setString(1, PCM.getMotivo());
                ps2.setString(2, PCM.getObservacion());
                ps2.setInt(3, idP);
                ps2.setInt(4, PCM.getcodigoMedico());

                ps2.executeUpdate();

                //Insertando datos en la entidad asociativa usuarioprocedimiento
                ps3.setInt(1, idP);
                ps3.setInt(2, id_usuario);

                ps3.executeUpdate();

                objConex.getConexion().commit();

            } catch (SQLException e) {

                System.out.println("Error en la inserción de datos: " + e);
                verificacionguardado = false;

            } finally {

                try {

                    ps.close();
                    ps2.close();
                    ps3.close();

                } catch (SQLException e) {

                    System.out.println("Error al cerrar transacción: " + e);
                    verificacionguardado = false;

                }//Fin catch

            }//Fin catch

        }//Fin condición

        return verificacionguardado;
        
    }//Fin método

}//Fin método
