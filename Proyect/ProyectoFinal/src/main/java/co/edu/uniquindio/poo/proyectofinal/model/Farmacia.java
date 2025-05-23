package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Farmacia {

    private String nombre;
    private String direccion;
    private LinkedList<Paciente> listPacientes;
    private LinkedList<Medicamento> listMedicamentos;
    private Administrador administrador;

    public Farmacia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        LinkedList<Medicamento> listMedicamentos = new LinkedList<>();
        LinkedList<Paciente> listPacientes = new LinkedList<>();
    }

    public Farmacia(String nombre, String direccion, Administrador administrador) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listPacientes = listPacientes;
        this.listMedicamentos = listMedicamentos;
        this.administrador = administrador;
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

    //CRUD Medicamento
    public  boolean crearMedicamento (Medicamento newMedicamento){
        for (Medicamento medicamento : listMedicamentos) {
            if(verificarMedicamento(newMedicamento.getCodigo())){
                listMedicamentos.add(medicamento);
                return true;
            }
        }
        return false;
    }

    public boolean verificarMedicamento(String codigo){
        for (Medicamento medicamento : listMedicamentos) {
            if(medicamento.getCodigo().equals(codigo)){
                return false;
            }
        }
        return true;
    }

    public Medicamento buscarMedicamento(String codigo) {
        for (Medicamento medicamento : listMedicamentos) {
            if(medicamento.getCodigo().equals(codigo)){
                return medicamento;
            }
        }
        return null;
    }

    public boolean actualizarMedicamento(String nombre, String codigo, String descripcion, int cantidadDisponible){
        boolean flag = false;

        for(Medicamento medicamento: listMedicamentos) {
            if(medicamento.getCodigo().equals(codigo)){
                medicamento.setNombre(nombre);
                medicamento.setDescripcion(descripcion);
                medicamento.setCantidadDisponible(cantidadDisponible);
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean eliminarMedicamento(String codigo) {
        boolean flag = false;
        for(Medicamento medicamento : listMedicamentos) {
            if(medicamento.getCodigo().equals(codigo)){
                listMedicamentos.remove(codigo);
                return true;
            }
        }
        return flag;
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

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
