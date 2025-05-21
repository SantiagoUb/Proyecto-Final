package co.edu.uniquindio.poo.proyectofinal.controller;

import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import co.edu.uniquindio.poo.proyectofinal.model.Paciente;

public class PacienteController {

    Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Paciente buscarPaciente(String nombre, String id) {
        for(Paciente newPaciente: hospital.getListPacientes()){
            if(newPaciente.getNombre().equals(nombre) && newPaciente.getId().equals(id)){
                return newPaciente;
            }
        }
        return null;
    }

    public PacienteController(Hospital hospital) {
        this.hospital = hospital;
    }

}
