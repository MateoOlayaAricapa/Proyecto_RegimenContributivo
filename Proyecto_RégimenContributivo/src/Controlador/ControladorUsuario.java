package Controlador;

import Modelo.Beneficiario;
import Modelo.Cotizante;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class ControladorUsuario {

    //Este método permitirá guardar los datos de un cotizante en la base de datos
    public boolean IngresarDatosCotizante(Cotizante objCotizante) {

        boolean GuardadoCorrecto = true;

        ResultSet idUsuario = null;
        ResultSet idEmpleador = null;
        PreparedStatement Ps = null;
        PreparedStatement Ps2 = null;
        PreparedStatement Ps3 = null;

        //Conjunto de sentencias
        String sentenciaSQL = "INSERT INTO usuario (nombre, apellido, fechaNacimiento, genero, direccion) VALUES (?, ?, ?, ?, ?)";

        String sentenciaSQL2 = "INSERT INTO empleador (salariopago, contratoLaboral, nombre) VALUES (?, ?, ?)";

        String sentenciaSQL3 = "INSERT INTO cotizante (cedula, telefono, correo, id_usuario, id_empleador) VALUES (?, ?, ?, ?, ?)";

        ConexionBD conexion = new ConexionBD();

        if (conexion.EstablecerConexion()) {

            try {

                conexion.getConexion().setAutoCommit(false);

                Ps = conexion.getConexion().prepareStatement(sentenciaSQL, conexion.getEstadoConexion().RETURN_GENERATED_KEYS);
                Ps2 = conexion.getConexion().prepareStatement(sentenciaSQL2, conexion.getEstadoConexion().RETURN_GENERATED_KEYS);
                Ps3 = conexion.getConexion().prepareStatement(sentenciaSQL3, conexion.getEstadoConexion().RETURN_GENERATED_KEYS);

                //Guardando datos en la entidad usuario
                Ps.setString(1, objCotizante.getNombre());
                Ps.setString(2, objCotizante.getApellido());
                Ps.setDate(3, Date.valueOf(objCotizante.getFechaNacimiento()));
                Ps.setString(4, objCotizante.getGenero());
                Ps.setString(5, objCotizante.getDireccion());

                Ps.executeUpdate();

                idUsuario = Ps.getGeneratedKeys();
                int idU = 0;

                while (idUsuario.next()) {

                    idU = idUsuario.getInt(1);

                }//Fin while

                //Guardando datos en la entidad empleador
                Ps2.setDouble(1, objCotizante.getTrabajo().getSalario());
                Ps2.setString(2, objCotizante.getTrabajo().getContratoLaboral());
                Ps2.setString(3, objCotizante.getTrabajo().getNombre());

                Ps2.executeUpdate();

                idEmpleador = Ps2.getGeneratedKeys();

                //Guardando los datos en la entidad cotizante
                int idE = 0;

                while (idEmpleador.next()) {

                    idE = idEmpleador.getInt(1);

                }//Fin while

                Ps3.setInt(1, objCotizante.getCedula());
                Ps3.setString(2, objCotizante.getTelefono());
                Ps3.setString(3, objCotizante.getCorreo());
                Ps3.setInt(4, idU);
                Ps3.setInt(5, idE);

                Ps3.executeUpdate();

                conexion.getConexion().commit();

            } catch (SQLException e) {

                System.out.println("Error: " + e);
                GuardadoCorrecto = false;

            } finally {

                try {

                    Ps.close();
                    Ps2.close();
                    Ps3.close();

                } catch (SQLException e) {

                    System.out.println("Error finally: " + e);
                    GuardadoCorrecto = false;

                }//Fin catch

            }//Fin finally

        }//Fin condición

        return GuardadoCorrecto;

    }//Fin método

    //Este método guardará todos los datos de beneficiarios asociados a un cotizante
    public boolean IngresarDatosBeneficiario(LinkedList<Beneficiario> listaBeneficiarios, int id_cedula) {

        boolean Verificacion = true;

        ResultSet idusuarioBeneficiario;
        PreparedStatement Ps = null;
        PreparedStatement Ps2 = null;

        String sentenciaSQL1 = "INSERT INTO usuario (nombre, apellido, fechaNacimiento, genero, direccion) VALUES (?, ?, ?, ?, ?)";
        String sentenciaSQL2 = "INSERT INTO beneficiario (identificacion, tipoIdentificacion, relacion, id_usuario, id_cedula) VALUES (?, ?, ?, ?, ?)";

        ConexionBD objConexion = new ConexionBD();

        if (objConexion.EstablecerConexion()) {

            try {

                for (Beneficiario objBene : listaBeneficiarios) {

                    objConexion.getConexion().setAutoCommit(false);

                    Ps = objConexion.getConexion().prepareStatement(sentenciaSQL1, objConexion.getEstadoConexion().RETURN_GENERATED_KEYS);
                    Ps2 = objConexion.getConexion().prepareStatement(sentenciaSQL2);

                    //Insertando datos en la sentenciaSQL # 1 para la entidad usuario
                    Ps.setString(1, objBene.getNombre());
                    Ps.setString(2, objBene.getApellido());
                    Ps.setDate(3, Date.valueOf(objBene.getFechaNacimiento()));
                    Ps.setString(4, objBene.getGenero());
                    Ps.setString(5, objBene.getDireccion());

                    //Método para que ejecute la sentencia
                    Ps.executeUpdate();

                    //Obteniendo la primary key que se generó para ese dato en la entidad usuario
                    idusuarioBeneficiario = Ps.getGeneratedKeys();

                    int IdUsuarioBene = 0;

                    while (idusuarioBeneficiario.next()) {

                        IdUsuarioBene = idusuarioBeneficiario.getInt(1);

                    }//Fin while

                    //Insertando los demás datos del beneficario en la entidad beneficiario
                    Ps2.setInt(1, objBene.getIdentificacion());
                    Ps2.setString(2, objBene.getTipoIdentificacion());
                    Ps2.setString(3, objBene.getRelacion());
                    Ps2.setInt(4, IdUsuarioBene);
                    Ps2.setInt(5, id_cedula);

                    Ps2.executeUpdate();

                    objConexion.getConexion().commit();

                }//Fin ciclo for

            } catch (SQLException e) {

                System.out.println("Error en el guardado: " + e);
                Verificacion = false;

            } finally {

                try {

                    Ps.close();
                    Ps2.close();

                } catch (SQLException e) {

                    System.out.println("Error catch close: " + e);
                    Verificacion = false;

                }//Fin catch

            }//Fin catch

        }//Fin condición

        return Verificacion;

    }//Fin método

    //Este método realizará una consulta a la BD para verificar si existe registrado la cédula del cotizante ingresado
    public ResultSet ConsultaCedulaCotizante(int cedulaVerificacion) {

        ResultSet resultadoBusqueda = null;
        ConexionBD objConex = new ConexionBD();

        String SentenciaSQL = "SELECT * FROM cotizante WHERE cedula = '" + cedulaVerificacion + "'";

        try {

            if (objConex.EstablecerConexion()) {

              resultadoBusqueda = objConex.getEstadoConexion().executeQuery(SentenciaSQL);

            }//Fin condición

        } catch (SQLException e) {

            System.out.println("Problemas: " + e);
            
        }//Fin catch

        return resultadoBusqueda;
        
    }//Fin método

}//Fin clase
