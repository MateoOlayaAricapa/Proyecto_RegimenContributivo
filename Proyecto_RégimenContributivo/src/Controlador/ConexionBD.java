package Controlador;

import java.sql.*;

public class ConexionBD {

    //Atributos
    Connection conexion;
    Statement estadoConexion;

    public ConexionBD() {
    }//Fin contructor

    public Connection getConexion() {
        return conexion;
    }

    public Statement getEstadoConexion() {
        return estadoConexion;
    }

    //Regresa un booleano indicando si la conexión fue éxitosa o no
    public boolean EstablecerConexion() {

        //En caso de que dectecte un catch, retornará un false indicando un fallo en la conexión
        try {

            //Importando el drive respectivo de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            //En esta conexión se debe indicar la dirección o ruta, el número de puerto, nombre BD, usuario y contraseña
            String ParametrosRuta = "jdbc:mysql://localhost:3306/regimencontributivo";
            String UsuarioBD = "root";
            String ContrasenaBD = "1234";

            conexion = DriverManager.getConnection(ParametrosRuta, UsuarioBD, ContrasenaBD);
            estadoConexion = conexion.createStatement();

        } catch (SQLException ex) {

            System.out.println(ex);
            return false;

        } catch (ClassNotFoundException ex) {

            System.out.println(ex);
            return false;

        } //Fin catch

        return true;

    }//Fin método

}//Fin clase
