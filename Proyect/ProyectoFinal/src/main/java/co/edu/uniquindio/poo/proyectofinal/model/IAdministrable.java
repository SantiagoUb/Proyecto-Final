package co.edu.uniquindio.poo.proyectofinal.model;

public interface IAdministrable {
    boolean eliminarPaciente(String idPacienteEliminar);
    boolean modificarPaciente(String idPaciente,Paciente paciente);
    boolean eliminarMedico(String idEliminar);
    boolean modificarMedico(String idMedico, Medico medico);
}
