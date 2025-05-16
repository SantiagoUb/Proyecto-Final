package co.edu.uniquindio.poo.proyectofinal.model;

import java.time.LocalDate;

public class Cita {

    private String id;
    private LocalDate fecha;
    private LocalDate hora;
    public EstadoCita estadoCita;
    private HistorialMedico theHistorialMedico;

    public Cita(String id, LocalDate fecha, LocalDate hora, HistorialMedico theHistorialMedico, EstadoCita estadoCita) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoCita = estadoCita;
        this.theHistorialMedico = theHistorialMedico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    public HistorialMedico getTheHistorialMedico() {
        return theHistorialMedico;
    }

    public void setTheHistorialMedico(HistorialMedico theHistorialMedico) {
        this.theHistorialMedico = theHistorialMedico;
    }
}
