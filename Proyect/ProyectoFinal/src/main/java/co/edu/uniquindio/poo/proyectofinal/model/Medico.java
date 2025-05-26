package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Medico extends Persona{

    private EspecialidadMedico especialidad;
    public  DisponibilidadMedico disponiblidadMedico;
    private LinkedList<Paciente> listPacientes;
    public Administrador administrador;
    private Horario horario;


    public Medico(EspecialidadMedico especialidad, String nombre, String id, String telefono, String email,DisponibilidadMedico disponiblidadMedico, Horario horario) {
        super(nombre, id, telefono, email);
        this.especialidad = especialidad;
        this.disponiblidadMedico = disponiblidadMedico;
        this.horario = horario;
        LinkedList<Paciente> listPacientes = new LinkedList<>();
    }

    public Medico(EspecialidadMedico especialidad, String nombre, String id, String telefono, String email,DisponibilidadMedico disponiblidadMedico) {
        super(nombre, id, telefono, email);
        this.especialidad = especialidad;
        this.disponiblidadMedico = disponiblidadMedico;
        LinkedList<Paciente> listPacientes = new LinkedList<>();
    }

    public Medico(String nombre, String id, String telefono, String email, EspecialidadMedico especialidad, Administrador administrador, Horario horario) {
        super(nombre, id, telefono, email);
        this.especialidad = especialidad;
        this.administrador = administrador;
    }

    public EspecialidadMedico getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadMedico especialidad) {
        this.especialidad = especialidad;
    }

    public DisponibilidadMedico getDisponiblidadMedico() {
        return disponiblidadMedico;
    }

    public void setDisponiblidadMedico(DisponibilidadMedico disponiblidadMedico) {
        this.disponiblidadMedico = disponiblidadMedico;
    }

    public LinkedList<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(LinkedList<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    public void registrarDiagnostico (String idHistorial){
        for(HistorialMedico newHistorialMedico : administrador.listHistorialMedicos){
            if(newHistorialMedico.getIdHistorial().equals(idHistorial)){
                HistorialMedico historialTratamiento = new HistorialMedico(null, null);
            }
        }

    }

    public void administrarHorarios(){

    }

    public HistorialMedico ConsultahistorialMedico (String indexIdPaciente) {
        HistorialMedico historialBuscado = null;
        for(Paciente newPaciente : listPacientes){
            if(newPaciente.getId().equals(indexIdPaciente)){
                historialBuscado = newPaciente.getTheHistorialMedico();

            }
        }
        return historialBuscado;
    }


    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
