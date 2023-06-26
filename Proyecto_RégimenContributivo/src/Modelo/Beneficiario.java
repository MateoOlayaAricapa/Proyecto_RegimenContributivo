package Modelo;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.LinkedList;

public class Beneficiario extends Usuario {

    //Atributos
    private String tipoIdentificacion;
    private int identificacion;
    private String relacion;

    //Constructores
    public Beneficiario() {
    }//Fin constructor

    public Beneficiario(String tipoIdentificacion, int identificacion, String relacion, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion) {
        super(nombre, apellido, fechaNacimiento, genero, direccion);
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.relacion = relacion;
    }//Fin constructor

    public Beneficiario(String tipoIdentificacion, int identificacion, String relacion, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, BufferedImage foto, LinkedList<ProcedimientoCirugia> objPC, LinkedList<ProcedimientoConsultaMedica> objPCM) {
        super(nombre, apellido, fechaNacimiento, genero, direccion, foto, objPC, objPCM);
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.relacion = relacion;
    }//Fin constructor

    public Beneficiario(String tipoIdentificacion, int identificacion, String relacion, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, LinkedList<ProcedimientoCirugia> objPC, LinkedList<ProcedimientoConsultaMedica> objPCM) {
        super(nombre, apellido, fechaNacimiento, genero, direccion, objPC, objPCM);
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.relacion = relacion;
    }//Fin constructor

    //Métodos set y get
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

}//Fin clase
