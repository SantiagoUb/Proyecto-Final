package co.edu.uniquindio.poo.proyectofinal.viewController;

import co.edu.uniquindio.poo.proyectofinal.controller.PacienteController;
import co.edu.uniquindio.poo.proyectofinal.model.Administrador;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import co.edu.uniquindio.poo.proyectofinal.model.Notificacion;
import co.edu.uniquindio.poo.proyectofinal.model.Paciente;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

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
        private Button btnSolicitar;

        @FXML
        private Button btnCerrar;



    @FXML
    void clickCItas(ActionEvent event) {
        paneCita.setVisible(true);
        paneHistorial.setVisible(false);
        panePerfil.setVisible(false);


    }

    @FXML
    void clickSolicitar(ActionEvent event) {
        solicitarCita();
    }

    @FXML
    void clickGuardar(ActionEvent event) {
        paciente.setNombre(txtNombreUsuario.getText());
        paciente.setTelefono(txtTelefono.getText());
        paciente.setEmail(txtEmail.getText());
        paciente.setId(txtId.getText());

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

    @FXML
    void clickCerrar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/hello-view.fxml"));
        Scene scene = new Scene(loader.load(),338,400);
        Stage stage = new Stage();
        LogginViewController controller = loader.getController();
        controller.setHospital(hospital);
        controller.inicializar();
        stage.setScene(scene);
        Stage stageCerrar = (Stage) btnCitas.getScene().getWindow();
        stageCerrar.close();
        stage.show();
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

    public void solicitarCita(){
        Notificacion notify = new Notificacion("solicitar_cita", paciente);
        hospital.getListAdministradores().getFirst().crearNotificacion(notify);
    }


    PacienteController pacienteController;
    Hospital hospital;
    Paciente paciente;

}