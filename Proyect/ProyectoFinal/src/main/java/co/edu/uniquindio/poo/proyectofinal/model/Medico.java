package co.edu.uniquindio.poo.proyectofinal.model;

public class Medico extends Persona{

    private EspecialidadMedico especialidad;

    public Medico(EspecialidadMedico especialidad, String nombre, String id, String telefono, String email){
        super(nombre, id, telefono, email);
        this.especialidad = especialidad;
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

}
