package Modelo;

import java.time.LocalDate;

public class Procedimiento {

    //Atributos
    private LocalDate fechaRegistro;
    private int duracion;
    private double tarifaReal;
    private double costoPago;
    private String tipoProcedimiento;
    private String nombreCompletoResponsable;

    //Constructores
    public Procedimiento() {
    }//Fin constructor

    public Procedimiento(LocalDate fechaRegistro, int duracion, double tarifaReal) {
        this.fechaRegistro = fechaRegistro;
        this.duracion = duracion;
        this.tarifaReal = tarifaReal;
    }//Fin constructor

    public Procedimiento(LocalDate fechaRegistro, int duracion, double tarifaReal, double costoPago, String tipoProcedimiento, String nombreCompletoResponsable) {
        this.fechaRegistro = fechaRegistro;
        this.duracion = duracion;
        this.tarifaReal = tarifaReal;
        this.costoPago = costoPago;
        this.tipoProcedimiento = tipoProcedimiento;
        this.nombreCompletoResponsable = nombreCompletoResponsable;
    }//Fin constructor

    //Métodos set y get
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getTarifaReal() {
        return tarifaReal;
    }

    public void setTarifaReal(double tarifaReal) {
        this.tarifaReal = tarifaReal;
    }

    public double getCostoPago() {
        return costoPago;
    }

    public void setCostoPago(double costoPago) {
        this.costoPago = costoPago;
    }

    public String getTipoProcedimiento() {
        return tipoProcedimiento;
    }

    public void setTipoProcedimiento(String tipoProcedimiento) {
        this.tipoProcedimiento = tipoProcedimiento;
    }

    public String getNombreCompletoResponsable() {
        return nombreCompletoResponsable;
    }

    public void setNombreCompletoResponsable(String nombreCompletoResponsable) {
        this.nombreCompletoResponsable = nombreCompletoResponsable;
    }

    //Métodos de la clase
    public double CalcularCostoPago() {

        double costoReal = this.tarifaReal;

        return costoReal;

    }//Fin método

}//Fin clase
