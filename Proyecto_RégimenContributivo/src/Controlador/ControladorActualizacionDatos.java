package Controlador;

import Modelo.Beneficiario;
import Modelo.Cotizante;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ControladorActualizacionDatos {

    //Método que trae los datos de un cotizante o un beneficiario
    public Object ConsultarDatosUsuario(int codigoID, String TipoUsuario) {

        ResultSet resultados = null;
        ConexionBD objConex = new ConexionBD();
        String consultaSQLC = "SELECT U.id_usuario, U.nombre, U.apellido, U.fechaNacimiento, U.genero, U.direccion, C.cedula, C.telefono, C.correo "
                + "FROM usuario as U "
                + "INNER JOIN cotizante as C "
                + "ON U.id_usuario = C.id_usuario "
                + "WHERE C.cedula = '" + codigoID + "'";

        String consultaSQLB = "SELECT U.id_usuario, U.nombre, U.apellido, U.fechaNacimiento, U.genero, U.direccion, B.identificacion, B.tipoIdentificacion, B.relacion "
                + "FROM usuario as U "
                + "INNER JOIN beneficiario as B "
                + "ON U.id_usuario = B.id_usuario "
                + "WHERE B.identificacion = '" + codigoID + "'";

        //Creando un objet de la clase cotizante o beneficiario
        Beneficiario objB = null;
        Cotizante objC = null;

        if (objConex.EstablecerConexion()) {

            try {

                if (TipoUsuario.equals("Beneficiario")) {

                    resultados = objConex.getEstadoConexion().executeQuery(consultaSQLB);

                    while (resultados.next()) {

                        String nombre = resultados.getString("nombre");
                        String apellido = resultados.getString("apellido");

                        int id_usuario = Integer.parseInt(resultados.getString("id_usuario"));
                        LocalDate fechaNacimiento = LocalDate.parse(resultados.getString("fechaNacimiento"));
                        String genero = resultados.getString("genero");
                        String direccion = resultados.getString("direccion");
                        String relacion = resultados.getString("relacion");
                        String tipoIdentificacion = resultados.getString("tipoIdentificacion");

                        objB = new Beneficiario(tipoIdentificacion, id_usuario, relacion, nombre, apellido, fechaNacimiento, genero, direccion);

                    }//Fin while

                    return objB;

                } else {

                    resultados = objConex.getEstadoConexion().executeQuery(consultaSQLC);

                    while (resultados.next()) {

                        int id_usuario = Integer.parseInt(resultados.getString("id_usuario"));
                        String telefono = resultados.getString("telefono");
                        LocalDate fechaNacimiento = LocalDate.parse(resultados.getString("fechaNacimiento"));
                        String genero = resultados.getString("genero");
                        String direccion = resultados.getString("direccion");
                        String nombre = resultados.getString("nombre");
                        String apellido = resultados.getString("apellido");
                        String correo = resultados.getString("correo");

                        objC = new Cotizante(id_usuario, telefono, correo, nombre, apellido, fechaNacimiento, genero, direccion);

                    }//Fin while

                    return objC;

                }//Fin condición

            } catch (SQLException e) {

                System.out.println("Error: " + e);

            }//Fin catch

        }//Fin condición

        return null;

    }//Fin método

    //Método para actualizar los datos de un beneficiario
    public boolean ActualizarDatosBeneficiario(Beneficiario Bf, int id_usuarioB) {

        boolean validacionGuardado = true;
        ConexionBD objConex = new ConexionBD();

        PreparedStatement ps = null;
        PreparedStatement ps2 = null;

        String ActualizarSQLUsuario = "UPDATE usuario "
                + "SET nombre = ?, apellido = ?, fechaNacimiento = ?, genero = ?, direccion = ? "
                + "WHERE id_usuario = '" + id_usuarioB + "'";

        String ActualizarSQLBeneficiario = "UPDATE beneficiario "
                + "SET tipoIdentificacion = ?, relacion = ? "
                + "WHERE identificacion = '" + Bf.getIdentificacion() + "'";

        if (objConex.EstablecerConexion()) {

            try {

                objConex.getConexion().setAutoCommit(false);
                ps = objConex.getConexion().prepareStatement(ActualizarSQLUsuario);
                ps2 = objConex.getConexion().prepareStatement(ActualizarSQLBeneficiario);

                //Actualizando datos en la entidad usuario
                ps.setString(1, Bf.getNombre());
                ps.setString(2, Bf.getApellido());
                ps.setDate(3, Date.valueOf(Bf.getFechaNacimiento()));
                ps.setString(4, Bf.getGenero());
                ps.setString(5, Bf.getDireccion());

                ps.executeUpdate();

                //Actualizando datos en la entidad beneficiario
                ps2.setString(1, Bf.getTipoIdentificacion());
                ps2.setString(2, Bf.getRelacion());
                
                ps2.executeUpdate();
                
                objConex.getConexion().commit();
                
            } catch (SQLException e) {

                System.out.println("Problemas al actualizar los datos: " + e);
                validacionGuardado = false;

            }finally{
                
                try {
                    
                    ps.close();
                    ps2.close();
                    
                } catch (SQLException e) {
                
                    System.out.println("Problemas al cerrar: " + e);
                    validacionGuardado = false;
                    
                }//Fin catch
                
            }//Fin catch

        }//Fin condición

        return validacionGuardado;

    }//Fin método

    //Método para actualizar los datos de un cotizante
    public boolean ActualizarDatosCotizante(Cotizante Co, int id_usuarioC) {

        boolean validacionGuardado = true;
        ConexionBD objConex = new ConexionBD();

        PreparedStatement ps = null;
        PreparedStatement ps2 = null;

        String ActualizarSQLUsuario = "UPDATE usuario "
                + "SET nombre = ?, apellido = ?, fechaNacimiento = ?, genero = ?, direccion = ? "
                + "WHERE id_usuario = '" + id_usuarioC + "'";

        String ActualizarSQLCotizante = "UPDATE cotizante "
                + "SET telefono = ?, correo = ? "
                + "WHERE cedula = '" + Co.getCedula() + "'";

        if (objConex.EstablecerConexion()) {

            try {

                objConex.getConexion().setAutoCommit(false);
                ps = objConex.getConexion().prepareStatement(ActualizarSQLUsuario);
                ps2 = objConex.getConexion().prepareStatement(ActualizarSQLCotizante);

                //Actualizando datos en la entidad usuario
                ps.setString(1, Co.getNombre());
                ps.setString(2, Co.getApellido());
                ps.setDate(3, Date.valueOf(Co.getFechaNacimiento()));
                ps.setString(4, Co.getGenero());
                ps.setString(5, Co.getDireccion());

                ps.executeUpdate();

                //Actualizando datos en la entidad beneficiario
                ps2.setString(1, Co.getTelefono());
                ps2.setString(2, Co.getCorreo());
                
                ps2.executeUpdate();
                
                objConex.getConexion().commit();
                
            } catch (SQLException e) {

                System.out.println("Problemas al actualizar los datos: " + e);
                validacionGuardado = false;

            }finally{
                
                try {
                    
                    ps.close();
                    ps2.close();
                    
                } catch (SQLException e) {
                
                    System.out.println("Problemas al cerrar: " + e);
                    validacionGuardado = false;
                    
                }//Fin catch
                
            }//Fin catch

        }//Fin condición

        return validacionGuardado;

    }//Fin método

}//Fin clase
