package co.edu.uniquindio.poo.proyectofinal.model;

import java.io.Serializable;

public class HorarioAtencion implements IArchivable {

    private String dia;
    private String horarioInicio;
    private String horarioFin;

    public HorarioAtencion(String dia, String horarioInicio, String horarioFin) {
        this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }

    public void estaDisponible() {

    }
}
