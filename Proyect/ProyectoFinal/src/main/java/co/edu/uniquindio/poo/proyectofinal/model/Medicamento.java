package co.edu.uniquindio.poo.proyectofinal.model;

public class Medicamento {
    private String nombre;
    private String codigo;
    private String descripcion;
    private int cantidadDisponible;

    public Medicamento(String nombre, String codigo, String descripcion, int cantidadDisponible) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void disminurCantidad (){

    }

    public void aumentarCantidad(){

    }
}
