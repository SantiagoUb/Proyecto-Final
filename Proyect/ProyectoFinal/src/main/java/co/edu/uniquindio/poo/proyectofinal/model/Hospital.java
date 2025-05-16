package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;
public class Hospital {
    private LinkedList<Paciente> listPacientes;
    private LinkedList<Horario> listHorarios;
    private LinkedList<Medico> listMedicos;
    private LinkedList<Sala> listSalas;
    private LinkedList<Cita> listCitas;
    private LinkedList<HistorialMedico> listHistorialMedicos;
    private LinkedList<Administrador> listAdministradores;
    private String nombre;
    private Farmacia farmacia;

    public Hospital(String nombre, Farmacia farmacia) {
        this.listPacientes = new LinkedList<>();
        this.listHorarios = new LinkedList<>();
        this.listMedicos = new LinkedList<>();
        this.listSalas = new LinkedList<>();
        this.listCitas = new LinkedList<>();
        this.listHistorialMedicos = new LinkedList<>();
        this.listAdministradores = new LinkedList<>();
        this.nombre = nombre;
        this.farmacia = farmacia;
    }

    public LinkedList<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(LinkedList<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    public LinkedList<Horario> getListHorarios() {
        return listHorarios;
    }

    public void setListHorarios(LinkedList<Horario> listHorarios) {
        this.listHorarios = listHorarios;
    }

    public LinkedList<Medico> getListMedicos() {
        return listMedicos;
    }

    public void setListMedicos(LinkedList<Medico> listMedicos) {
        this.listMedicos = listMedicos;
    }

    public LinkedList<Sala> getListSalas() {
        return listSalas;
    }

    public void setListSalas(LinkedList<Sala> listSalas) {
        this.listSalas = listSalas;
    }

    public LinkedList<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(LinkedList<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    public LinkedList<HistorialMedico> getListHistorialMedicos() {
        return listHistorialMedicos;
    }

    public void setListHistorialMedicos(LinkedList<HistorialMedico> listHistorialMedicos) {
        this.listHistorialMedicos = listHistorialMedicos;
    }

    public LinkedList<Administrador> getListAdministradores() {
        return listAdministradores;
    }

    public void setListAdministradores(LinkedList<Administrador> listAdministradores) {
        this.listAdministradores = listAdministradores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
}