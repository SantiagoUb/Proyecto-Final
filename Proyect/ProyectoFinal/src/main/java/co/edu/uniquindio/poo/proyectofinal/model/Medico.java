package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.LinkedList;

public class Medico extends Persona{

    private EspecialidadMedico especialidad;
    private LinkedList<HistorialMedico> listHistoriales;

    public Medico(EspecialidadMedico especialidad, String nombre, String id, String telefono, String email){
        super(nombre, id, telefono, email);
        this.especialidad = especialidad;
        LinkedList<HistorialMedico> listHistoriales = new LinkedList<>();
    }

    public EspecialidadMedico getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadMedico especialidad) {
        this.especialidad = especialidad;
    }

    public void registrarDiagnostico (){

    }

    public void administrarHorarios(){

    }

    public void consultarHistorialMedico () {

    }

    public void recetarMedicamento(){

    }

    public LinkedList<HistorialMedico> getListHistoriales() {
        return listHistoriales;
    }

    public void setListHistoriales(LinkedList<HistorialMedico> listHistoriales) {
        this.listHistoriales = listHistoriales;
    }
}
