package co.edu.uniquindio.poo.proyectofinal.model;

public interface ICrudCita {
    boolean crearCita(Cita newCita);
    boolean eliminarCita(String id);
    boolean actualizarCita(String idActualizar, Cita citaActualizada);
    Cita buscarCita(String id);

}
