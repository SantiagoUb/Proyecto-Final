package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Administrador extends Persona implements ICrudCita, IAdministrable{
    public LinkedList<Medico> listMedicos;
    public LinkedList<Paciente>listPacientes;
    public LinkedList<Sala>listSalas;
    public LinkedList<Cita>listCitas;
    public LinkedList<Horario>listHorarios;
    private LinkedList<Notificacion> listNotificaciones;
    public LinkedList<HistorialMedico> listHistorialMedicos;
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


    //CRUD Notificacion
    public void crearNotificacion(Notificacion newNotificacion){
        listNotificaciones.add(newNotificacion);
    }

    public boolean eliminarNotificacion(Notificacion notificacionEliminar){
        listNotificaciones.remove(notificacionEliminar);
        return true;
    }


    // monitoreo de disponibilidad de medicos y asignacion de pacientes
    public boolean monitoreoYAsignacionMedico(String idMedico, String idPaciente){

        boolean asignar = false;
        Medico medicoAsociado = null;
        Paciente pacienteAsociado = null;

        for(Medico medico:listMedicos){
            if(medico.getId().equals(idMedico) && medico.getDisponiblidadMedico() == DisponibilidadMedico.DISPONIBLE){
                medicoAsociado = medico;
            }
        }
        for (Paciente paciente:listPacientes){
            if (paciente.getId().equals(idPaciente)){
                pacienteAsociado = paciente;
            }
        }
        if(medicoAsociado != null && pacienteAsociado != null){
            medicoAsociado.getListPacientes().add(pacienteAsociado);
            medicoAsociado.setDisponiblidadMedico(DisponibilidadMedico.NO_DISPONIBLE);
            asignar = true;
        }
        return asignar;

    }

    // Reporte de citas y ocupacion del hospital
    public String generacionReporte() {
        LinkedList<Sala> salasDisponibles = new LinkedList<>();
        for(Sala sala:listSalas){
            if(sala.getDisponibilidadSala() == DisponiblidadSala.DISPONIBLE){
                salasDisponibles.add(sala);
            }
        }

        LinkedList<Cita> citasConfirmadas = new LinkedList<>();
        for (Cita cita:listCitas){
            if(cita.getEstadoCita().equals(EstadoCita.CONFIRMADO)){
                citasConfirmadas.add(cita);
            }
        }
        return "Administrador " + nombre +
                "lista de salas disponibles =" + salasDisponibles + "citas confirmadas " + citasConfirmadas;
    }

    // Gestion de salas y horarios de atencion
    public boolean ocuparSala(String numero){
        for (Sala sala:listSalas){
            if(sala.getNumero().equals(numero) && sala.getDisponibilidadSala() == DisponiblidadSala.DISPONIBLE){
                sala.setDisponibilidadSala(DisponiblidadSala.NO_DISPONIBLE);
                return true;
            }
        }
        return false;
    }

    public boolean liberarSala (String numeroSala) {
        for(Sala sala: listSalas){
            if(sala.getNumero().equals(numeroSala) && sala.getDisponibilidadSala() == DisponiblidadSala.NO_DISPONIBLE){
                sala.setDisponibilidadSala(DisponiblidadSala.DISPONIBLE);
                return true;
            }
        }
        return false;
    }

    public String verHorariosAtencion(){
        LinkedList<Horario> horariosConsulta = new LinkedList<>();
        for(Horario horario:listHorarios){
            if(horario.getTipoHorario() == TipoHorario.CONSULTA){
                horariosConsulta.add(horario);
            }
        }

        LinkedList<Horario> horariosAtencion = new LinkedList<>();
        for(Horario horario: listHorarios){
            if(horario.getTipoHorario() == TipoHorario.ATENCION){
                horariosAtencion.add(horario);
            }
        }
        return  "los horarios de consulta son " + horariosConsulta + " los horarios de atencion son " + horariosAtencion;
    }

    // CRUD para cita
    @Override
    public boolean crearCita(Cita newCita) {
        for(Cita cita : listCitas){
            if(verificarCita(newCita.getId())){
                listCitas.add(cita);
                return true;
            }
        }
        return false;
    }

    public boolean verificarCita(String id){
        for (Cita cita : listCitas) {
            if(cita.getId().equals(id)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean eliminarCita(String id) {
        boolean flag = false;

        for(Cita cita : listCitas) {
            if(cita.getId().equals(id)){
                listCitas.remove(cita);
                return true;
            }
        }
        return flag;
    }

    @Override
    public boolean actualizarCita(String idActualizar, Cita citaActualizada) {
        boolean actualizar = false;
        for (Cita cita : listCitas) {
            if(cita.getId().equals(idActualizar)){
                cita.setId(citaActualizada.getId());
                cita.setFecha(citaActualizada.getFecha());
                cita.setEstadoCita(citaActualizada.getEstadoCita());
                cita.setHora(citaActualizada.getHora());
                cita.setAdministrador(citaActualizada.getAdministrador());
                cita.setTheHistorialMedico(citaActualizada.getTheHistorialMedico());
                actualizar = true;
                break;
            }
        }
        return actualizar;
    }

    @Override
    public Cita buscarCita(String id) {
        for (Cita cita : listCitas) {
            if (cita.getId().equals(id)) {
                return cita;
            }
        }
        return null;
    }


    // CRUD para medico
    @Override
    public boolean crearMedico(Medico newMedico) {
        for (Medico medico : listMedicos) {
            if(verificarMedico(newMedico.getId())){
                listMedicos.add(medico);
                return true;
            }
        }
        return false;
    }

    public boolean verificarMedico(String idVerificar) {
        for (Medico medico : listMedicos) {
            if(medico.getId().equals(idVerificar)){
                return  false;
            }
        }
        return true;
    }

    @Override
    public boolean eliminarMedico(String idEliminar) {
        for (Medico medico : listMedicos) {
            if(medico.getId().equals(idEliminar)){
                listMedicos.remove(medico);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean modificarMedico(String idMedico, Medico medicoModificado) {
        boolean modificar = false;
        for (Medico medico : listMedicos) {
            if(medico.getId().equals(idMedico)){
                medico.setNombre(medicoModificado.getNombre());
                medico.setId(medicoModificado.getId());
                medico.setEmail(medicoModificado.getEmail());
                medico.setTelefono(medicoModificado.getTelefono());
                medico.setEspecialidad(medicoModificado.getEspecialidad());
                medico.setAdministrador(medicoModificado.getAdministrador());
                modificar = true;
                break;
            }
        }
        return modificar;
    }

    // CRUD para paciente
    @Override
    public  boolean crearPaciente (Paciente newpaciente){
        for (Paciente paciente : listPacientes) {
            if(verificarPaciente(newpaciente.getId())){
                listPacientes.add(paciente);
                return true;
            }
        }
        return false;
    }

    public boolean verificarPaciente(String idPaciente){
        for (Paciente paciente : listPacientes) {
            if(paciente.getId().equals(idPaciente)){
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean modificarPaciente(String idPaciente,Paciente pacienteModificado){

        for(Paciente paciente: listPacientes) {
            if(paciente.getId().equals(idPaciente)){
                paciente.setNombre(pacienteModificado.getNombre());
                paciente.setTelefono(pacienteModificado.getTelefono());
                paciente.setEmail(pacienteModificado.getEmail());
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean eliminarPaciente(String idPacienteEliminar) {
        boolean flag = false;
        for(Paciente paciente : listPacientes) {
            if(paciente.getId().equals(idPacienteEliminar)){
                listPacientes.remove(paciente);
                return true;
            }
        }
        return flag;
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


}
