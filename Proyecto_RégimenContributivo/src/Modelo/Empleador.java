package Modelo;

public class Empleador {

    //Atributos
    private double salario;
    private String ContratoLaboral;
    private String nombre;

    //Constructores
    public Empleador() {
    }//Fin constructor

    public Empleador(double salario, String ContratoLaboral, String nombre) {
        this.salario = salario;
        this.ContratoLaboral = ContratoLaboral;
        this.nombre = nombre;
    }//Fin contructor

    //Métodos set y get
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getContratoLaboral() {
        return ContratoLaboral;
    }

    public void setContratoLaboral(String ContratoLaboral) {
        this.ContratoLaboral = ContratoLaboral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}//Fin clase
