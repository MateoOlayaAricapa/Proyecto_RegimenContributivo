package Modelo;

import java.time.LocalDate;

public class ProcedimientoCirugia extends Procedimiento {

    //Atributos
    private int codigoCirujano;
    private int IPS;
    private int diasHospitalizacion;
    private String tipo;
    private String descripcion;

    //Constructores
    public ProcedimientoCirugia() {
    }//Fin constructor

    public ProcedimientoCirugia(int codigoCirujano, int IPS, int diasHospitalizacion, String tipo, String descripcion, LocalDate fechaRegistro, int duracion, double tarifaReal) {
        super(fechaRegistro, duracion, tarifaReal);
        this.codigoCirujano = codigoCirujano;
        this.IPS = IPS;
        this.diasHospitalizacion = diasHospitalizacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }//Fin constructor

    public ProcedimientoCirugia(int codigoCirujano, int IPS, int diasHospitalizacion, String tipo, String descripcion, LocalDate fechaRegistro, int duracion, double tarifaReal, double costoPago, String tipoProcedimiento, String nombreCompletoResponsable) {
        super(fechaRegistro, duracion, tarifaReal, costoPago, tipoProcedimiento, nombreCompletoResponsable);
        this.codigoCirujano = codigoCirujano;
        this.IPS = IPS;
        this.diasHospitalizacion = diasHospitalizacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }//Fin constructor

    //Métodos set y get
    public int getcodigoCirujano() {
        return codigoCirujano;
    }

    public void setcodigoCirujano(int codigoCirujano) {
        this.codigoCirujano = codigoCirujano;
    }

    public int getIPS() {
        return IPS;
    }

    public void setIPS(int IPS) {
        this.IPS = IPS;
    }

    public int getDiasHospitalizacion() {
        return diasHospitalizacion;
    }

    public void setDiasHospitalizacion(int diasHospitalizacion) {
        this.diasHospitalizacion = diasHospitalizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Métodos de la clase
    @Override
    public double CalcularCostoPago() {

        double copago = 0.1;
        double costoCirugia = super.CalcularCostoPago() * copago;

        return costoCirugia;

    }//Fin método

}//Fin clase
