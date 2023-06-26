package Modelo;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.LinkedList;

public class Cotizante extends Usuario {

    //Atributos
    private int cedula;
    private String telefono;
    private String correo;

    //El cotizante puede tener entre 1 a muchos beneficiarios
    private LinkedList<Beneficiario> objBeneficiarios;
    private Empleador trabajo;

    //Constructores
    public Cotizante() {
    }//Fin constructor

    public Cotizante(int cedula, String telefono, String correo, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, LinkedList<ProcedimientoCirugia> objPC, LinkedList<ProcedimientoConsultaMedica> objPCM) {
        super(nombre, apellido, fechaNacimiento, genero, direccion, objPC, objPCM);
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }//Fin 

    public Cotizante(int cedula, String telefono, String correo, Empleador trabajo, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion) {
        super(nombre, apellido, fechaNacimiento, genero, direccion);
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.trabajo = trabajo;
    }//Fin constructor

    public Cotizante(int cedula, String telefono, String correo, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion) {
        super(nombre, apellido, fechaNacimiento, genero, direccion);
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }//Fin constructor

    public Cotizante(int cedula, String telefono, String correo, LinkedList<Beneficiario> objBeneficiarios, Empleador trabajo, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, BufferedImage foto, LinkedList<ProcedimientoCirugia> objPC, LinkedList<ProcedimientoConsultaMedica> objPCM) {
        super(nombre, apellido, fechaNacimiento, genero, direccion, foto, objPC, objPCM);
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.objBeneficiarios = objBeneficiarios;
        this.trabajo = trabajo;
    }//Fin constructor

    //Método set y get
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LinkedList<Beneficiario> getObjBeneficiarios() {
        return objBeneficiarios;
    }

    public void setObjBeneficiarios(LinkedList<Beneficiario> objBeneficiarios) {
        this.objBeneficiarios = objBeneficiarios;
    }

    public Empleador getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Empleador trabajo) {
        this.trabajo = trabajo;
    }

}//Fin clase
