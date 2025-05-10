package co.edu.uniquindio.poo.proyectofinal.model;

import java.time.LocalDate;

public class Cita {
    private String id;
    private LocalDate fecha;
    private LocalDate hora;

    public Cita(String id, LocalDate fecha, LocalDate hora) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
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
}
