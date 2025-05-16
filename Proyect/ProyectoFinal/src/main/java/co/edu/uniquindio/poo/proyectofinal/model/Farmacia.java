package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Farmacia {

    private String nombre;
    private String direccion;
    private LinkedList<Paciente> listPacientes;
    private LinkedList<Medicamento> listMedicamentos;

    public Farmacia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        LinkedList<Medicamento> listMedicamentos = new LinkedList<>();
        LinkedList<Paciente> listPacientes = new LinkedList<>();
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

    public LinkedList<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(LinkedList<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    public LinkedList<Medicamento> getListMedicamentos() {
        return listMedicamentos;
    }

    public void setListMedicamentos(LinkedList<Medicamento> listMedicamentos) {
        this.listMedicamentos = listMedicamentos;
    }
}
