package co.edu.uniquindio.poo.proyectofinal.model;

public class Horario {

    private String dia;
    private String horarioEntrada;
    private String horarioSalida;
    private TipoHorario tipoHorario;
    public Administrador administrador;

    public Horario(String dia, String horarioInicio, String horarioFin,TipoHorario tipoHorario, Administrador administrador) {
        this.dia = dia;
        this.horarioEntrada = horarioInicio;
        this.horarioSalida = horarioFin;
        this.tipoHorario = tipoHorario;
        this.administrador = administrador;
    }

    public Horario() {

    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public TipoHorario getTipoHorario() {
        return tipoHorario;
    }

    public void setTipoHorario(TipoHorario tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
