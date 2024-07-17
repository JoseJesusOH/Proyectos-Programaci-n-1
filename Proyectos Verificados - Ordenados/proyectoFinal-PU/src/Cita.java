/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josej
 */
public class Cita {
    private String nombreEstudiante, maestro, tipoClase, tipoPago;

    public Cita() {
    }

    public Cita(String nombreEstudiante, String maestro, String tipoClase, String tipoPago) {
        this.nombreEstudiante = nombreEstudiante;
        this.maestro = maestro;
        this.tipoClase = tipoClase;
        this.tipoPago = tipoPago;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    
}
