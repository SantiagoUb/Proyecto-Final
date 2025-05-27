package co.edu.uniquindio.poo.proyectofinal.controller;
import co.edu.uniquindio.poo.proyectofinal.model.Medico;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;

public class MedicoController {

    Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Medico buscarMedico(String nombre, String id) {
        for(Medico newMedico: hospital.getListMedicos()) {
            if(newMedico.getNombre().equals(nombre) && newMedico.getId().equals(id)){
                return newMedico;
            }
        }
        return null;
    }

    public MedicoController(Hospital hospital) {
        this.hospital = hospital;
    }
}
