package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class HistorialMedico {
    private String idHistorial;
    private String diagnostico;
    private String tratamiento;
    private LinkedList<Medicamento> listMedicamentos;
    private Paciente paciente;
    private Medico theMedico;
    private Cita theCita;
    private Administrador theAdministrador;


    public HistorialMedico(String idHistorial,String diagnostico, String tratamiento, Medico theMedico) {
        this.idHistorial = idHistorial;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        listMedicamentos = new LinkedList<>();
        this.theMedico = theMedico;
    }

    public HistorialMedico(String diagnostico, String tratamiento){
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }



    public String getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(String idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getDescripcion() {
        return diagnostico;
    }

    public void setDescripcion(String descripcion) {
        this.diagnostico = descripcion;
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

    public String getDiagnostico(){
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento(){
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
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

    @Override
    public String toString() {
        return "Historial Medico{" +
                "idHistorial='" + idHistorial + '\'' +
                ", descripcion='" + diagnostico + '\'' +
                ", listMedicamentos=" + listMedicamentos +
                ", paciente=" + paciente +
                ", theMedico=" + theMedico +
                ", theCita=" + theCita +
                ", theAdministrador=" + theAdministrador +
                '}';
    }
}
