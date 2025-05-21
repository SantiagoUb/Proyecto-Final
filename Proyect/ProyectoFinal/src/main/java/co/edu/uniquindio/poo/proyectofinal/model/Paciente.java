package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Paciente extends Persona{

    private HistorialMedico theHistorialMedico;
    private LinkedList<Notificacion> listaNotificaciones;
    private Farmacia theFarmacia;
    private Cita theCita;
    public Administrador administrador;

    public Paciente (String nombre, String id, String telefono, String email) {
        super(nombre, id, telefono, email);
        this.listaNotificaciones = new LinkedList<>();
    }

    public void solicitarCita(){

    }

    public void cancelarCita(){

    }

    public void consultarHistorialPaciente(){

    }

    public void solicitarMedicamento(){

    }

    public HistorialMedico getTheHistorialMedico() {
        return theHistorialMedico;
    }

    public void setTheHistorialMedico(HistorialMedico theHistorialMedico) {
        this.theHistorialMedico = theHistorialMedico;
    }

    public LinkedList<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(LinkedList<Notificacion> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    public Farmacia getTheFarmacia() {
        return theFarmacia;
    }

    public void setTheFarmacia(Farmacia theFarmacia) {
        this.theFarmacia = theFarmacia;
    }

    public Cita getTheCita() {
        return theCita;
    }

    public void setTheCita(Cita theCita) {
        this.theCita = theCita;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
