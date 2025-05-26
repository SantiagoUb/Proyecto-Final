package co.edu.uniquindio.poo.proyectofinal.model;

public class Sala {
    private String numero;
    public TipoSala tipoSala;
    public DisponiblidadSala disponibilidadSala;
    public Administrador administrador;

    public Sala(String numero, TipoSala tipoSala,DisponiblidadSala disponibilidadSala, Administrador administrador) {
        this.numero = numero;
        this.tipoSala = tipoSala;
        this.disponibilidadSala = disponibilidadSala;
        this.administrador = administrador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DisponiblidadSala getDisponibilidadSala() {
        return disponibilidadSala;
    }

    public void setDisponibilidadSala(DisponiblidadSala disponibilidadSala) {
        this.disponibilidadSala = disponibilidadSala;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
