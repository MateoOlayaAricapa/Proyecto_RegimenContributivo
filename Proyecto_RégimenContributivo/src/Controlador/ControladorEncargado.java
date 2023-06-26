package Controlador;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class ControladorEncargado {

    //Este método realizará una consulta a la base de datos para verificar los datos del encargado
    public ResultSet ConsultaBaseDeDatosEncargados(String correo, String contrasena) {

        //Creando objeto para crear conexión con la base de datos
        ConexionBD objConexion = new ConexionBD();

        //Creando un objeto que permita manejar los resultados obtenidos de la consulta o conexión
        ResultSet resultados = null;

        //Si la conexión fue positiva, entrará en la condición
        if (objConexion.EstablecerConexion()) {

            try {

                //Guardará los resultados encontrados en la consulta
                String consultaSQL = "SELECT * FROM encargado WHERE correo = '" + correo + "' AND contraseña = '" + contrasena + "'";
                resultados = objConexion.getEstadoConexion().executeQuery(consultaSQL);

            } catch (SQLException e) {

                System.out.println(e);

            }//Fin catch

        }//Fin condición if

        return resultados;

    }//Fin método

    //Este método permitirá guardar un registro de fecha y hora que el encargado ingresó a utilizar la aplicación
    public void GuardarRegistroSesion(LocalDate fechaRegistro, LocalTime horaRegistro, int cedulaEncargado) {

        String sentenciaSQL = "INSERT INTO registroingreso (fechaRegistro, hora, cedula) "
                + "VALUES(?,?,?)";

        //Creando objeto para crear conexión con la base de datos
        ConexionBD objConexion = new ConexionBD();
        PreparedStatement ps = null;

        if (objConexion.EstablecerConexion()) {

            try {

                objConexion.getConexion().setAutoCommit(false);

                ps = objConexion.getConexion().prepareStatement(sentenciaSQL);

                ps.setDate(1, Date.valueOf(fechaRegistro));
                ps.setTime(2, Time.valueOf(horaRegistro));
                ps.setInt(3, cedulaEncargado);

                ps.executeUpdate();

                objConexion.getConexion().commit();

            } catch (SQLException e) {

            } finally {

                try {

                    //Se cierran el proceso de transacción realizada a la base de datos para evitar consumo de recursos innecesarios
                    ps.close();

                } catch (SQLException e) {
                }//Fin catch

            }//Fin finally

        }//Fin condición

    }//Fin método

}//Fin clase
