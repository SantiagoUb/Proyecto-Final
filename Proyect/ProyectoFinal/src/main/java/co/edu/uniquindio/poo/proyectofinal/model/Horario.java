package co.edu.uniquindio.poo.proyectofinal.model;

public class Horario {

    private String dia;
    private String horarioEntrada;
    private String horarioSalida;
    private TipoHorario tipoHorario;

    public Horario(String dia, String horarioInicio, String horarioFin,TipoHorario tipoHorario) {
        this.dia = dia;
        this.horarioEntrada = horarioInicio;
        this.horarioSalida = horarioFin;
        this.tipoHorario = tipoHorario;
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

}
