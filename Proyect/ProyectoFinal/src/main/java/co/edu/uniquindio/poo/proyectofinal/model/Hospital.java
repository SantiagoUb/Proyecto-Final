package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;
public class Hospital implements ICrudCita, IAdministrable {
    private LinkedList<Paciente> listPacientes;
    private LinkedList<Horario> listHorarios;
    private LinkedList<Medico> listMedicos;
    private LinkedList<Sala> listSalas;
    private LinkedList<Cita> listCitas;
    private LinkedList<HistorialMedico> listHistorialMedicos;
    private LinkedList<Administrador> listAdministradores;
    private String nombre;
    private Farmacia farmacia;

    public Hospital(String nombre){
        this.nombre = nombre;
        this.listPacientes = new LinkedList<>();
        this.listHorarios = new LinkedList<>();
        this.listMedicos = new LinkedList<>();
        this.listSalas = new LinkedList<>();
        this.listCitas = new LinkedList<>();
        this.listHistorialMedicos = new LinkedList<>();
        this.listAdministradores = new LinkedList<>();

    }

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
        for (Medico medico : listMedicos) {
            if(medico.getId().equals(idMedico)){
                medico.setNombre(medicoModificado.getNombre());
                medico.setId(medicoModificado.getId());
                medico.setEmail(medicoModificado.getEmail());
                medico.setTelefono(medicoModificado.getTelefono());
                medico.setEspecialidad(medicoModificado.getEspecialidad());
                medico.setAdministrador(medicoModificado.getAdministrador());
                return true;
            }
        }
        return false;
    }

    public Medico buscarMedico(String idBuscar) {
        for (Medico medico : listMedicos) {
            if(medico.getId().equals(idBuscar)){
                return medico;
            }
        }
        return null;
    }




    //CRUD HistorialMedico
    public boolean crearHistorialMedico(HistorialMedico newHistorialMedico) {
        for (HistorialMedico historialMedico : listHistorialMedicos) {
            if(verificarHistorial(newHistorialMedico.getIdHistorial())){
                listHistorialMedicos.add(historialMedico);
                return true;
            }
        }
        return false;
    }

    public boolean verificarHistorial(String idVerificar) {
        for (HistorialMedico historialMedico : listHistorialMedicos) {
            if(idVerificar.equals(historialMedico.getIdHistorial())){
                return false;
            }
        }
        return true;
    }


    public boolean eliminarHistorialMedico(String idEliminar) {
        for (HistorialMedico historialMedico : listHistorialMedicos) {
            if(idEliminar.equals(historialMedico.getIdHistorial())){
                listHistorialMedicos.remove(historialMedico);
                return true;
            }
        }
        return false;
    }

    public boolean actualizarHistorialMedico(String idActualizar, HistorialMedico historialMedicoActualizado) {
        for(HistorialMedico historialMedico : listHistorialMedicos){
            if(idActualizar.equals(historialMedico.getIdHistorial())){
                historialMedico.setIdHistorial(historialMedicoActualizado.getIdHistorial());
                historialMedico.setDescripcion(historialMedicoActualizado.getDescripcion());
                historialMedico.setTheMedico(historialMedicoActualizado.getTheMedico());
                historialMedico.setPaciente(historialMedicoActualizado.getPaciente());
                historialMedico.setTheCita(historialMedicoActualizado.getTheCita());
                historialMedico.setTheAdministrador(historialMedicoActualizado.getTheAdministrador());
                return true;
            }
        }
        return false;
    }

    public HistorialMedico buscarHistorialMedico(String idHistorial) {
        for (HistorialMedico historialMedico : listHistorialMedicos) {
            if(idHistorial.equals(historialMedico.getIdHistorial())){
                return historialMedico;
            }
        }
        return null;
    }

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

    public Paciente buscarPaciente(String idPaciente) {
        for (Paciente paciente : listPacientes) {
            if(paciente.getId().equals(idPaciente)){
                return paciente;
            }
        }
        return null;
    }
    @Override
    public boolean modificarPaciente(String idPaciente,Paciente pacienteModificado){
        boolean flag = false;

        for(Paciente paciente: listPacientes) {
            if(paciente.getId().equals(idPaciente)){
                paciente.setNombre(pacienteModificado.getNombre());
                paciente.setTelefono(pacienteModificado.getTelefono());
                paciente.setEmail(pacienteModificado.getEmail());
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean eliminarPaciente(String idPacienteEliminar) {
        boolean flag = false;
        for(Paciente paciente : listPacientes) {
            if(paciente.getId().equals(idPacienteEliminar)){
                listPacientes.remove(idPacienteEliminar);
                return true;
            }
        }
        return flag;
    }

    //CRUD Administrador
    public  boolean crearAdministrador (Administrador newAdministrador){
        for (Administrador administrador : listAdministradores) {
            if(verificarAdministrador(newAdministrador.getId())){
                listAdministradores.add(administrador);
                return true;
            }
        }
        return false;
    }

    public boolean verificarAdministrador(String idAdministrador){
        for (Administrador administrador : listAdministradores) {
            if(administrador.getId().equals(idAdministrador)){
                return false;
            }
        }
        return true;
    }

    public Administrador buscarAdministrador(String idAdministrador) {
        for (Administrador administrador : listAdministradores) {
            if(administrador.getId().equals(idAdministrador)){
                return administrador;
            }
        }
        return null;
    }

    public boolean actualizarAdministrador(String idAdministradorActualizar,String nombreActualizado, String telefonoActualizado, String emailActualizado){
        boolean flag = false;

        for(Administrador administrador: listAdministradores) {
            if(administrador.getId().equals(idAdministradorActualizar)){
                administrador.setNombre(nombreActualizado);
                administrador.setTelefono(telefonoActualizado);
                administrador.setEmail(emailActualizado);
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean eliminarAdministrador(String idAdministradorEliminar) {
        boolean flag = false;
        for(Administrador administrador : listAdministradores) {
            if(administrador.getId().equals(idAdministradorEliminar)){
                listAdministradores.remove(idAdministradorEliminar);
                return true;
            }
        }
        return flag;
    }

    //CRUD Administrador
    public  boolean crearSala (Sala newSala){
        for (Sala sala : listSalas) {
            if(verificarAdministrador(newSala.getNumero())){
                listSalas.add(sala);
                return true;
            }
        }
        return false;
    }

    public boolean verificarSala(String numero){
        for (Sala sala : listSalas) {
            if(sala.getNumero().equals(numero)){
                return false;
            }
        }
        return true;
    }

    public Sala buscarSala(String numero) {
        for (Sala sala : listSalas) {
            if(sala.getNumero().equals(numero)){
                return sala;
            }
        }
        return null;
    }

    public boolean actualizarSala(String numero){
        boolean flag = false;

        for(Sala sala: listSalas) {
            if(sala.getNumero().equals(numero)){
                sala.setNumero(numero);
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean eliminarSala(String numero) {
        boolean flag = false;
        for(Sala sala : listSalas) {
            if(sala.getNumero().equals(numero)){
                listSalas.remove(numero);
                return true;
            }
        }
        return flag;
    }


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
                listCitas.remove(id);
                return true;
            }
        }
        return flag;
    }

    @Override
    public boolean actualizarCita(String idActualizar, Cita citaActualizada) {
        for (Cita cita : listCitas) {
            if(cita.getId().equals(idActualizar)){
                cita.setId(citaActualizada.getId());
                cita.setFecha(citaActualizada.getFecha());
                cita.setEstadoCita(citaActualizada.getEstadoCita());
                cita.setHora(citaActualizada.getHora());
                cita.setAdministrador(citaActualizada.getAdministrador());
                cita.setTheHistorialMedico(citaActualizada.getTheHistorialMedico());
                return true;
            }
        }
        return false;
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