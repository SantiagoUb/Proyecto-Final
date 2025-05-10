package co.edu.uniquindio.poo.proyectofinal.model;

public class Farmacia {

    private String nombre;
    private String direccion;

    public Farmacia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void entregarMedicamento(){

    }

    public void reporteDisponibleMedicamento(){

    }

    public void reabastecerMedicamento(){

    }
}
