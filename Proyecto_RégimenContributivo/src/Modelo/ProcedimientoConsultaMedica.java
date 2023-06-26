package Modelo;

import java.time.LocalDate;

public class ProcedimientoConsultaMedica extends Procedimiento {

    //Atributos
    private String observacion;
    private String motivo;
    private int codigoMedico;

    //Constructores
    public ProcedimientoConsultaMedica() {
    }//Fin constructor

    public ProcedimientoConsultaMedica(String observacion, String motivo, int codigoMedico, LocalDate fechaRegistro, int duracion, double tarifaReal) {
        super(fechaRegistro, duracion, tarifaReal);
        this.observacion = observacion;
        this.motivo = motivo;
        this.codigoMedico = codigoMedico;
    }//Fin constructor

    public ProcedimientoConsultaMedica(String observacion, String motivo, int codigoMedico, LocalDate fechaRegistro, int duracion, double tarifaReal, double costoPago, String tipoProcedimiento, String nombreCompletoResponsable) {
        super(fechaRegistro, duracion, tarifaReal, costoPago, tipoProcedimiento, nombreCompletoResponsable);
        this.observacion = observacion;
        this.motivo = motivo;
        this.codigoMedico = codigoMedico;
    }//Fin contructor

    //Métodos set y get
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getcodigoMedico() {
        return codigoMedico;
    }

    public void setNombreMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    //Métodos de la clase
    @Override
    public double CalcularCostoPago() {

        double cuotaModerada = 0.05;
        double costo = super.CalcularCostoPago() * cuotaModerada;

        return costo;

    }//Fin método

}//Fin clase
