package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Paciente extends Persona{

    private HistorialMedico theHistorialMedico;
    private LinkedList<Notificacion> listaNotificaciones;
    private Farmacia theFarmacia;
    private LinkedList<Cita> listaCitas;
    public Administrador administrador;

    public Paciente (String nombre, String id, String telefono, String email) {
        super(nombre, id, telefono, email);
        listaNotificaciones = new LinkedList<>();
        listaCitas = new LinkedList<>();
    }

    public Paciente(String nombre, String id, String telefono, String email, HistorialMedico theHistorialMedico, Farmacia theFarmacia, Administrador administrador) {
        super(nombre, id, telefono, email);
        this.theHistorialMedico = theHistorialMedico;
        this.theFarmacia = theFarmacia;
        this.administrador = administrador;
    }

    public boolean solicitarCita(String idCita){
        for(Cita cita : listaCitas){
            if (cita.getId().equals(idCita)){
                listaCitas.add( cita);
                return true;
            }
        }
        return false;
    }


    public boolean cancelarCita(String idCitaEliminar){
        listaCitas.removeIf(cita -> cita.getId().equals(idCitaEliminar));
        return true;
    }

    public String consultarHistorialPaciente(){
        return theHistorialMedico.toString();
    }

    public boolean solicitarMedicamento(String nombreMedicamento){
        for(Medicamento medicamento: theHistorialMedico.getListMedicamentos()){
            if(medicamento.getNombre().equals(nombreMedicamento)){
                return  true;
            }
        }
        return false;
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


    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public LinkedList<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(LinkedList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

}
