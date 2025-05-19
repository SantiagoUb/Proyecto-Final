package co.edu.uniquindio.poo.proyectofinal.model;

public class Sala {
    private String numero;
    private boolean disponible;
    public TIpoSala tipoSala;
    public Administrador administrador;

    public Sala(String numero, boolean disponible, TIpoSala tIpoSala, Administrador administrador) {
        this.numero = numero;
        this.disponible = disponible;
        this.tipoSala = tipoSala;
        this.administrador = administrador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public void liberarSala (){

    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
