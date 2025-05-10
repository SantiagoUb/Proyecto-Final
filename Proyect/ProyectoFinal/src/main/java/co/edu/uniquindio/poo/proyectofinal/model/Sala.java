package co.edu.uniquindio.poo.proyectofinal.model;

public class Sala {
    private String numero;
    private boolean disponible;

    public Sala(String numero, boolean disponible) {
        this.numero = numero;
        this.disponible = disponible;
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

    public void liberarSala (){

    }
}
