package Controlador;

import Modelo.Beneficiario;
import Modelo.Cotizante;
import Modelo.Procedimiento;
import Modelo.ProcedimientoCirugia;
import Modelo.ProcedimientoConsultaMedica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;

public class ControladorReportesMedicos {

    //Este método traerá los datos de los beneficiarios como todos los datos de procedimientos médicos realizados a este
    public Beneficiario ConsultaProcedimientosMedicosPacienteBeneficiario(int identificadorU) {

        ResultSet datosPaciente = null;
        ResultSet datosProcedimientosC = null;
        ResultSet datosProcedimientosCM = null;
        ConexionBD objConex = new ConexionBD();

        String consultaPacienteB = "SELECT U.id_usuario, U.nombre, U.apellido, U.fechaNacimiento, U.genero, U.direccion, B.identificacion, B.tipoIdentificacion, B.relacion "
                + "FROM usuario as U "
                + "INNER JOIN beneficiario as B "
                + "ON U.id_usuario = B.id_usuario "
                + "WHERE B.identificacion = '" + identificadorU + "'";

        //Creando un objeto de la clase beneficiario y listas de sus procedimientos
        Beneficiario objB = null;
        LinkedList<ProcedimientoCirugia> ListaPC = new LinkedList<>();
        LinkedList<ProcedimientoConsultaMedica> ListaPCM = new LinkedList<>();

        //Guardando el atributo id_usuario que tiene la entidad usuario
        int atributo_id_usuario = 0;

        if (objConex.EstablecerConexion()) {

            try {

                datosPaciente = objConex.getEstadoConexion().executeQuery(consultaPacienteB);

                while (datosPaciente.next()) {

                    atributo_id_usuario = Integer.parseInt(datosPaciente.getString("id_usuario"));

                    String nombre = datosPaciente.getString("nombre");
                    String apellido = datosPaciente.getString("apellido");
                    LocalDate fechaNacimiento = LocalDate.parse(datosPaciente.getString("fechaNacimiento"));
                    String genero = datosPaciente.getString("genero");
                    int identificacion = Integer.parseInt(datosPaciente.getString("identificacion"));
                    String tipoIdentificacion = datosPaciente.getString("tipoIdentificacion");
                    String relacion = datosPaciente.getString("relacion");
                    String direccion = datosPaciente.getString("direccion");

                    objB = new Beneficiario(tipoIdentificacion, identificacion, relacion, nombre, apellido, fechaNacimiento, genero, direccion, ListaPC, ListaPCM);

                }//Fin while

                datosPaciente.close();

                //Realizando las consultas entre las entidades de procedimientos de cirugía
                String consultaProcedimientosCirugia = "SELECT P.fechaRegistro, P.duracion, P.costoPago, P.tarifaReal, P.tipoProcedimiento, R.nombre, R.apellido "
                        + "FROM usuario as U "
                        + "INNER JOIN usuarioprocedimiento as UP "
                        + "ON U.id_usuario = UP.id_usuario "
                        + "INNER JOIN procedimiento as P "
                        + "ON UP.id_procedimiento = P.id_procedimiento "
                        + "INNER JOIN procedimientocirugia as PC "
                        + "ON P.id_procedimiento = PC.id_procedimiento "
                        + "INNER JOIN responsable as R "
                        + "ON PC.id_profesional = R.id_profesional "
                        + "WHERE U.id_usuario = '" + atributo_id_usuario + "'";

                datosProcedimientosC = objConex.getEstadoConexion().executeQuery(consultaProcedimientosCirugia);

                while (datosProcedimientosC.next()) {

                    LocalDate fechaRegistro = LocalDate.parse(datosProcedimientosC.getString("fechaRegistro"));
                    int duracion = Integer.parseInt(datosProcedimientosC.getString("duracion"));
                    double costoPago = Double.parseDouble(datosProcedimientosC.getString("costoPago"));
                    double tarifaReal = Double.parseDouble(datosProcedimientosC.getString("tarifaReal"));
                    String tipoProcedimiento = datosProcedimientosC.getString("tipoProcedimiento");
                    String nombreR = datosProcedimientosC.getString("nombre");
                    String apellidoR = datosProcedimientosC.getString("apellido");
                    String nombreCompleto = nombreR + " " + apellidoR;

                    ProcedimientoCirugia objPC = new ProcedimientoCirugia(0, 0, 0, "", "", fechaRegistro, duracion, tarifaReal, costoPago, tipoProcedimiento, nombreCompleto);

                    objB.getObjPC().add(objPC);

                }//Fin while

                datosProcedimientosC.close();

                //Realizando las consultas entre las entidades de procedimientos de consulta médica
                String consultaProcedimientosConsulta = "SELECT P.fechaRegistro, P.duracion, P.costoPago, P.tarifaReal, P.tipoProcedimiento, R.nombre, R.apellido "
                        + "FROM usuario as U "
                        + "INNER JOIN usuarioprocedimiento as UP "
                        + "ON U.id_usuario = UP.id_usuario "
                        + "INNER JOIN procedimiento as P "
                        + "ON UP.id_procedimiento = P.id_procedimiento "
                        + "INNER JOIN procedimientoconsultamedica as PCM "
                        + "ON P.id_procedimiento = PCM.id_procedimiento "
                        + "INNER JOIN responsable as R "
                        + "ON PCM.id_profesional = R.id_profesional "
                        + "WHERE U.id_usuario = '" + atributo_id_usuario + "'";

                datosProcedimientosCM = objConex.getEstadoConexion().executeQuery(consultaProcedimientosConsulta);

                while (datosProcedimientosCM.next()) {

                    LocalDate fechaRegistro = LocalDate.parse(datosProcedimientosCM.getString("fechaRegistro"));
                    int duracion = Integer.parseInt(datosProcedimientosCM.getString("duracion"));
                    double costoPago = Double.parseDouble(datosProcedimientosCM.getString("costoPago"));
                    double tarifaReal = Double.parseDouble(datosProcedimientosCM.getString("tarifaReal"));
                    String tipoProcedimiento = datosProcedimientosCM.getString("tipoProcedimiento");
                    String nombreR = datosProcedimientosCM.getString("nombre");
                    String apellidoR = datosProcedimientosCM.getString("apellido");
                    String nombreCompleto = nombreR + " " + apellidoR;

                    ProcedimientoConsultaMedica objPCM = new ProcedimientoConsultaMedica("", "", 0, fechaRegistro, duracion, tarifaReal, costoPago, tipoProcedimiento, nombreCompleto);
                    objB.getObjPCM().add(objPCM);

                }//Fin while

                datosProcedimientosCM.close();

            } catch (SQLException e) {

                System.out.println("Error en la consulta: " + e);

            }//Fin catch

        }//Fin condición

        return objB;

    }//Fin método

    //Este método traerá los datos de los cotizantes como todos los datos de procedimientos médicos realizados a este
    public Cotizante ConsultaProcedimientosMedicosPacienteCotizante(int identificadorU) {

        ResultSet datosPaciente = null;
        ResultSet datosProcedimientosC = null;
        ResultSet datosProcedimientosCM = null;
        ConexionBD objConex = new ConexionBD();

        String consultaPacienteC = "SELECT U.id_usuario, U.nombre, U.apellido, U.fechaNacimiento, U.genero, U.direccion, C.cedula, C.telefono, C.correo "
                + "FROM usuario as U "
                + "INNER JOIN cotizante as C "
                + "ON U.id_usuario = C.id_usuario "
                + "WHERE C.cedula = '" + identificadorU + "'";

        //Creando un objeto de la clase beneficiario y listas de sus procedimientos
        Cotizante objC = null;
        LinkedList<ProcedimientoCirugia> ListaPC = new LinkedList<>();
        LinkedList<ProcedimientoConsultaMedica> ListaPCM = new LinkedList<>();

        //Guardando el atributo id_usuario que tiene la entidad usuario
        int atributo_id_usuario = 0;

        if (objConex.EstablecerConexion()) {

            try {

                datosPaciente = objConex.getEstadoConexion().executeQuery(consultaPacienteC);

                while (datosPaciente.next()) {

                    atributo_id_usuario = Integer.parseInt(datosPaciente.getString("id_usuario"));

                    String nombre = datosPaciente.getString("nombre");
                    String apellido = datosPaciente.getString("apellido");
                    LocalDate fechaNacimiento = LocalDate.parse(datosPaciente.getString("fechaNacimiento"));
                    String genero = datosPaciente.getString("genero");
                    int identificacion = Integer.parseInt(datosPaciente.getString("cedula"));
                    String telefono = datosPaciente.getString("telefono");
                    String correo = datosPaciente.getString("correo");
                    String direccion = datosPaciente.getString("direccion");

                    objC = new Cotizante(identificacion, telefono, correo, nombre, apellido, fechaNacimiento, genero, direccion, ListaPC, ListaPCM);

                }//Fin while

                datosPaciente.close();

                //Realizando las consultas entre las entidades de procedimientos de cirugía
                String consultaProcedimientosCirugia = "SELECT P.fechaRegistro, P.duracion, P.costoPago, P.tarifaReal, P.tipoProcedimiento, R.nombre, R.apellido "
                        + "FROM usuario as U "
                        + "INNER JOIN usuarioprocedimiento as UP "
                        + "ON U.id_usuario = UP.id_usuario "
                        + "INNER JOIN procedimiento as P "
                        + "ON UP.id_procedimiento = P.id_procedimiento "
                        + "INNER JOIN procedimientocirugia as PC "
                        + "ON P.id_procedimiento = PC.id_procedimiento "
                        + "INNER JOIN responsable as R "
                        + "ON PC.id_profesional = R.id_profesional "
                        + "WHERE U.id_usuario = '" + atributo_id_usuario + "'";

                datosProcedimientosC = objConex.getEstadoConexion().executeQuery(consultaProcedimientosCirugia);

                while (datosProcedimientosC.next()) {

                    LocalDate fechaRegistro = LocalDate.parse(datosProcedimientosC.getString("fechaRegistro"));
                    int duracion = Integer.parseInt(datosProcedimientosC.getString("duracion"));
                    double costoPago = Double.parseDouble(datosProcedimientosC.getString("costoPago"));
                    double tarifaReal = Double.parseDouble(datosProcedimientosC.getString("tarifaReal"));
                    String tipoProcedimiento = datosProcedimientosC.getString("tipoProcedimiento");
                    String nombreR = datosProcedimientosC.getString("nombre");
                    String apellidoR = datosProcedimientosC.getString("apellido");
                    String nombreCompleto = nombreR + " " + apellidoR;

                    ProcedimientoCirugia objPC = new ProcedimientoCirugia(0, 0, 0, "", "", fechaRegistro, duracion, tarifaReal, costoPago, tipoProcedimiento, nombreCompleto);

                    objC.getObjPC().add(objPC);

                }//Fin while

                datosProcedimientosC.close();

                //Realizando las consultas entre las entidades de procedimientos de consulta médica
                String consultaProcedimientosConsulta = "SELECT P.fechaRegistro, P.duracion, P.costoPago, P.tarifaReal, P.tipoProcedimiento, R.nombre, R.apellido "
                        + "FROM usuario as U "
                        + "INNER JOIN usuarioprocedimiento as UP "
                        + "ON U.id_usuario = UP.id_usuario "
                        + "INNER JOIN procedimiento as P "
                        + "ON UP.id_procedimiento = P.id_procedimiento "
                        + "INNER JOIN procedimientoconsultamedica as PCM "
                        + "ON P.id_procedimiento = PCM.id_procedimiento "
                        + "INNER JOIN responsable as R "
                        + "ON PCM.id_profesional = R.id_profesional "
                        + "WHERE U.id_usuario = '" + atributo_id_usuario + "'";

                datosProcedimientosCM = objConex.getEstadoConexion().executeQuery(consultaProcedimientosConsulta);

                while (datosProcedimientosCM.next()) {

                    LocalDate fechaRegistro = LocalDate.parse(datosProcedimientosCM.getString("fechaRegistro"));
                    int duracion = Integer.parseInt(datosProcedimientosCM.getString("duracion"));
                    double costoPago = Double.parseDouble(datosProcedimientosCM.getString("costoPago"));
                    double tarifaReal = Double.parseDouble(datosProcedimientosCM.getString("tarifaReal"));
                    String tipoProcedimiento = datosProcedimientosCM.getString("tipoProcedimiento");
                    String nombreR = datosProcedimientosCM.getString("nombre");
                    String apellidoR = datosProcedimientosCM.getString("apellido");
                    String nombreCompleto = nombreR + " " + apellidoR;

                    ProcedimientoConsultaMedica objPCM = new ProcedimientoConsultaMedica("", "", 0, fechaRegistro, duracion, tarifaReal, costoPago, tipoProcedimiento, nombreCompleto);
                    objC.getObjPCM().add(objPCM);

                }//Fin while

                datosProcedimientosCM.close();

            } catch (SQLException e) {

                System.out.println("Error en la consulta: " + e);

            }//Fin catch

        }//Fin condición

        return objC;

    }//Fin método

    //Este método traerá los datos de los beneficiarios relacionados a un cotizante
    public LinkedList ConsultaBeneficiariosCotizante(int cedula) {

        ResultSet datosBeneficiarios = null;
        ConexionBD objConex = new ConexionBD();
        String consultaSQL = "SELECT * "
                + "FROM usuario as U "
                + "INNER JOIN beneficiario as B "
                + "ON U.id_usuario = B.id_usuario "
                + "WHERE B.id_cedula = '" + cedula + "'";

        //Creando objeto beneficiario para guardar los datos de cada uno
        Beneficiario objB = null;
        LinkedList<Beneficiario> objBeneficiaro = objBeneficiaro = new LinkedList<>();;

        if (objConex.EstablecerConexion()) {

            try {

                datosBeneficiarios = objConex.getEstadoConexion().executeQuery(consultaSQL);

                while (datosBeneficiarios.next()) {

                    String nombre = datosBeneficiarios.getString("nombre");
                    String apellido = datosBeneficiarios.getString("apellido");
                    LocalDate fechaN = LocalDate.parse(datosBeneficiarios.getString("fechaNacimiento"));
                    String genero = datosBeneficiarios.getString("genero");
                    String direccion = datosBeneficiarios.getString("direccion");
                    int identificacion = Integer.parseInt(datosBeneficiarios.getString("identificacion"));
                    String tipoIdentificacion = datosBeneficiarios.getString("tipoIdentificacion");
                    String relacion = datosBeneficiarios.getString("relacion");

                    objB = new Beneficiario(tipoIdentificacion, identificacion, relacion, nombre, apellido, fechaN, genero, direccion);

                    objBeneficiaro.add(objB);

                }//Fin while

            } catch (SQLException e) {

                System.out.println("Error en la consulta: " + e);

            }//Fin catch

        }//Fin condición

        return objBeneficiaro;

    }//Fin método

    //Este método realiza una consulta para traer los datos de procedimientos de cirugía llevados a cabo en una IPS respectiva
    public LinkedList ConsultaProcedimientosIPS(int codigoIPS) {

        ResultSet resultadoDatos = null;
        ConexionBD objConex = new ConexionBD();
        String consultaSQL = "SELECT P.fechaRegistro, P.duracion, P.costoPago, P.tarifaReal, P.tipoProcedimiento, PC.diasHospitalizacion, PC.tipoCirugia, PC.descripcion, R.nombre, R.apellido, R.id_profesional "
                + "FROM procedimiento as P "
                + "INNER JOIN procedimientocirugia as PC "
                + "ON P.id_procedimiento = PC.id_procedimiento "
                + "INNER JOIN responsable as R "
                + "ON PC.id_profesional = R.id_profesional "
                + "WHERE PC.IPS = '" + codigoIPS + "'";
        
        //Creando un objeto de la clase procedimientoCirugia y una lista para guardar los datos
        ProcedimientoCirugia objPC = null;
        LinkedList<ProcedimientoCirugia> ListaPC = new LinkedList<>();

        if (objConex.EstablecerConexion()) {

            try {

                resultadoDatos = objConex.getEstadoConexion().executeQuery(consultaSQL);

                while (resultadoDatos.next()) {

                    String nombreR = resultadoDatos.getString("nombre");
                    String apellidoR = resultadoDatos.getString("apellido");
                    String nombreCompletoR = nombreR + " " + apellidoR;
                    
                    String tipoProcedimiento = resultadoDatos.getString("tipoProcedimiento");
                    String tipoCirugia = resultadoDatos.getString("tipoCirugia");
                    String descripcion = resultadoDatos.getString("descripcion");
                    LocalDate fechaRegistro = LocalDate.parse(resultadoDatos.getString("fechaRegistro"));
                    int duracion = Integer.parseInt(resultadoDatos.getString("duracion"));
                    double costoPago = Double.valueOf(resultadoDatos.getString("costoPago"));
                    double tarifaReal = Double.valueOf(resultadoDatos.getString("tarifaReal"));
                    int diasH = Integer.parseInt(resultadoDatos.getString("diasHospitalizacion"));
                    int idProfesional = Integer.parseInt(resultadoDatos.getString("id_profesional"));
                    
                    objPC = new ProcedimientoCirugia(idProfesional, codigoIPS, diasH, tipoCirugia, descripcion, fechaRegistro, duracion, tarifaReal, costoPago, tipoProcedimiento, nombreCompletoR);
                    
                    ListaPC.add(objPC);
                    
                }//Fin while
                
                resultadoDatos.close();

            } catch (SQLException e) {

                System.out.println("Error en la consulta: " + e);

            }//Fin catch

        }//Fin condición

        return ListaPC;
        
    }//Fin método

}//Fin clase
