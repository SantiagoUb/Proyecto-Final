package co.edu.uniquindio.poo.proyectofinal.model;

public class Notificacion {

    public String asunto;
    private Paciente paciente;

    

    public Notificacion(String asunto, Paciente paciente) {
        this.asunto = asunto;
        this.paciente = paciente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
