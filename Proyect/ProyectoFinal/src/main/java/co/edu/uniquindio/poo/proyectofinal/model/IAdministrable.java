package co.edu.uniquindio.poo.proyectofinal.model;

public interface IAdministrable {
    boolean crearPaciente(Paciente newPaciente);
    boolean eliminarPaciente(String idPacienteEliminar);
    boolean modificarPaciente(String idPaciente,Paciente paciente);
    boolean crearMedico(Medico newMedico);
    boolean eliminarMedico(String idEliminar);
    boolean modificarMedico(String idMedico, Medico medico);
}
