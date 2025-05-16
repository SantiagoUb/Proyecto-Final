package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Administrador extends Persona{
    private LinkedList<Medico> listMedicos;
    private LinkedList<Paciente>listPacientes;
    private LinkedList<Sala>listSalas;
    private LinkedList<Cita>listCitas;
    private LinkedList<Horario>listHorarios;
    private LinkedList<Notificacion> listNotificaciones;
    private LinkedList<HistorialMedico> listHistorialMedicos;
    private Farmacia farmacia;

    public Administrador(String nombre, String id, String telefono, String email, Farmacia farmacia) {
        super(nombre, id, telefono, email);
        this.listMedicos = new LinkedList<>();
        this.listPacientes = new LinkedList<>();
        this.listSalas = new LinkedList<>();
        this.listCitas = new LinkedList<>();
        this.listHorarios = new LinkedList<>();
        this.listNotificaciones = new LinkedList<>();
        this.listHistorialMedicos = new LinkedList<>();
        this.farmacia = farmacia;
    }


    public LinkedList<Medico> getListMedicos() {
        return listMedicos;
    }

    public void setListMedicos(LinkedList<Medico> listMedicos) {
        this.listMedicos = listMedicos;
    }

    public LinkedList<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(LinkedList<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
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

    public LinkedList<Horario> getListHorarios() {
        return listHorarios;
    }

    public void setListHorarios(LinkedList<Horario> listHorarios) {
        this.listHorarios = listHorarios;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public LinkedList<Notificacion> getListNotificaciones() {
        return listNotificaciones;
    }

    public void setListNotificaciones(LinkedList<Notificacion> listNotificaciones) {
        this.listNotificaciones = listNotificaciones;
    }

    public LinkedList<HistorialMedico> getListHistorialMedicos() {
        return listHistorialMedicos;
    }

    public void setListHistorialMedicos(LinkedList<HistorialMedico> listHistorialMedicos) {
        this.listHistorialMedicos = listHistorialMedicos;
    }

    public void gestionarUsuarios(){

    }

    public void asignarMedico(){

    }

    public void gestionarSala(){

    }

    public void generarInforme(){

    }
}
