package co.edu.uniquindio.poo.proyectofinal.viewController;

import co.edu.uniquindio.poo.proyectofinal.controller.PacienteController;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import co.edu.uniquindio.poo.proyectofinal.model.Paciente;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class DashBoadPacienteVIewController {




        @FXML
        private Button btnCitas;

        @FXML
        private Button btnGuardar;

        @FXML
        private Button btnHistorial;

        @FXML
        private Button btnPerfil;

        @FXML
        private Pane paneCita;

        @FXML
        private Pane paneHistorial;

        @FXML
        private Pane panePerfil;

        @FXML
        private TextField txtEmail;

        @FXML
        private TextField txtId;

        @FXML
        private TextField txtNombreUsuario;

        @FXML
        private TextField txtTelefono;

    @FXML
    void clickCItas(ActionEvent event) {
        paneCita.setVisible(true);
        paneHistorial.setVisible(false);
        panePerfil.setVisible(false);
    }

    @FXML
    void clickGuardar(ActionEvent event) {

    }

    @FXML
    void clickHistorial(ActionEvent event) {
        paneHistorial.setVisible(true);
        paneCita.setVisible(false);
        panePerfil.setVisible(false);
    }

    @FXML
    void clickPerfil(ActionEvent event) {
        panePerfil.setVisible(true);
        paneCita.setVisible(false);
        paneHistorial.setVisible(false);

        inicializarPerfil ();

    }

    public void inicializarPerfil() {
        txtNombreUsuario.setText(paciente.getNombre());
        txtTelefono.setText(paciente.getTelefono());
        txtEmail.setText(paciente.getEmail());
        txtId.setText(paciente.getId());
    }

    public void inicializarDashBoadPaciente(Hospital hospital, Paciente paciente) {
        this.hospital = hospital;
        this.paciente = paciente;
    }

    PacienteController pacienteController;
    Hospital hospital;
    Paciente paciente;

}