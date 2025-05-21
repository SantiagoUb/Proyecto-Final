package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class HistorialMedico {
    private String idHistorial;
    private String descripcion;
    private LinkedList<Medicamento> listMedicamentos;
    private Paciente paciente;
    private Medico theMedico;
    private Cita theCita;
    private Administrador theAdministrador;


    public HistorialMedico(String idHistorial, String notasAdicionales, Medico theMedico) {
        this.idHistorial = idHistorial;
        this.descripcion = notasAdicionales;
        listMedicamentos = new LinkedList<>();
        this.theMedico = theMedico;
    }

    public String getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarDiagnostico (){

    }

    public void agregarEnfermedad(){

    }

    public void agregarAlergia(){

    }

    public void recetarMedicamento(){

    }

    public void registro(){

    }

    public LinkedList<Medicamento> getListMedicamentos() {
        return listMedicamentos;
    }

    public void setListMedicamentos(LinkedList<Medicamento> listMedicamentos) {
        this.listMedicamentos = listMedicamentos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getTheMedico() {
        return theMedico;
    }

    public void setTheMedico(Medico theMedico) {
        this.theMedico = theMedico;
    }

    public Cita getTheCita() {
        return theCita;
    }

    public void setTheCita(Cita theCita) {
        this.theCita = theCita;
    }

    public Administrador getTheAdministrador() {
        return theAdministrador;
    }

    public void setTheAdministrador(Administrador theAdministrador) {
        this.theAdministrador = theAdministrador;
    }
}
