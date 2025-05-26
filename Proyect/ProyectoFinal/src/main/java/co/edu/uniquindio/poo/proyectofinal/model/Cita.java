package co.edu.uniquindio.poo.proyectofinal.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    private String id;
    private LocalDate fecha;
    private LocalTime hora;
    public EstadoCita estadoCita;
    private HistorialMedico theHistorialMedico;
    public Administrador administrador;

    public Cita(String id, LocalDate fecha, LocalTime hora, HistorialMedico theHistorialMedico, EstadoCita estadoCita) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoCita = estadoCita;
        this.theHistorialMedico = theHistorialMedico;
    }

    public Cita(String id, LocalDate fecha, LocalTime hora, EstadoCita estadoCita, HistorialMedico theHistorialMedico, Administrador administrador) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoCita = estadoCita;
        this.theHistorialMedico = theHistorialMedico;
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id='" + id + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", estadoCita=" + estadoCita +
                ", theHistorialMedico=" + theHistorialMedico +
                ", administrador=" + administrador +
                '}';
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
