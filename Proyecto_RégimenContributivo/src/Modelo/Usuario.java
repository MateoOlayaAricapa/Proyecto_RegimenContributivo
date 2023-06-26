package Modelo;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.LinkedList;

public class Usuario {

    //Atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String genero;
    private String direccion;
    private BufferedImage foto;

    //Estos atributos son tipo listas, ya que un usuario puede tener varios
    //procedimientos de cirugía como de consulta médica. 
    private LinkedList<ProcedimientoCirugia> objPC;
    private LinkedList<ProcedimientoConsultaMedica> objPCM;

    //Constructores
    public Usuario() {
    }//Fin Constructor

    //Este constructor es para generar un cotizante con sus datos personales
    public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
    }//Fin constructor

    public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, LinkedList<ProcedimientoCirugia> objPC, LinkedList<ProcedimientoConsultaMedica> objPCM) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.objPC = objPC;
        this.objPCM = objPCM;
    }//Fin constructor

    public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, BufferedImage foto, LinkedList<ProcedimientoCirugia> objPC, LinkedList<ProcedimientoConsultaMedica> objPCM) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.foto = foto;
        this.objPC = objPC;
        this.objPCM = objPCM;
    }//Fin constructor

    //Método set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    public LinkedList<ProcedimientoCirugia> getObjPC() {
        return objPC;
    }

    public void setObjPC(LinkedList<ProcedimientoCirugia> objPC) {
        this.objPC = objPC;
    }

    public LinkedList<ProcedimientoConsultaMedica> getObjPCM() {
        return objPCM;
    }

    public void setObjPCM(LinkedList<ProcedimientoConsultaMedica> objPCM) {
        this.objPCM = objPCM;
    }

}//Fin clase
