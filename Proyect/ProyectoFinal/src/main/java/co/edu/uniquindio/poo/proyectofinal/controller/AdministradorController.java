package co.edu.uniquindio.poo.proyectofinal.controller;
import co.edu.uniquindio.poo.proyectofinal.model.Administrador;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;

public class AdministradorController {

    Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Administrador buscarAdministrador(String nombre, String id) {
        for(Administrador newAdministrador: hospital.getListAdministradores()) {
            if(newAdministrador.getNombre().equals(nombre) && newAdministrador.getId().equals(id)){
                return newAdministrador;
            }
        }
        return null;
    }

    public AdministradorController(Hospital hospital) {
        this.hospital = hospital;
    }
}
