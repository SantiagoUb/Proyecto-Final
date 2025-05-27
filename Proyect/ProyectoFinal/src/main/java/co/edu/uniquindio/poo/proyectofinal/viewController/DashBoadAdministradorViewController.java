package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.poo.proyectofinal.controller.AdministradorController;

import co.edu.uniquindio.poo.proyectofinal.model.Administrador;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DashBoadAdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button_CerrarSesion;

    @FXML
    private Button Button_Cita;

    @FXML
    private Button Button_CrearMedico;

    @FXML
    private Button Button_CrearPaciente;

    @FXML
    private Button Button_Monitoreo;

    @FXML
    private Button Button_Notificacion;

    @FXML
    private Pane Pane_Cita;

    @FXML
    private Pane Pane_CrearMedico;

    @FXML
    private Pane Pane_CrearPaciente;

    @FXML
    private Pane Pane_Monitoreo;

    @FXML
    private Pane Pane_Notificacion;

    @FXML
    private Label Text_BienvenidoAdministrador;

    @FXML
    void onClick_CerrarSecion(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/hello-view.fxml"));
        Scene scene = new Scene(loader.load(),1000,600);
        Stage stage = new Stage();
        LogginViewController logginViewController = loader.getController();
        logginViewController.setHospital(hospital);
        logginViewController.inicializar();
        Stage stageCerrar = (Stage) Button_CerrarSesion.getScene().getWindow();
        stageCerrar.close();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void onClick_Cita(ActionEvent event) {
        Pane_Cita.setVisible(true);
        Pane_CrearMedico.setVisible(false);
        Pane_CrearPaciente.setVisible(false);
        Pane_Monitoreo.setVisible(false);
        Pane_Notificacion.setVisible(false);


    }

    @FXML
    void onClick_CrearMedico(ActionEvent event) {
        Pane_Cita.setVisible(false);
        Pane_CrearMedico.setVisible(true);
        Pane_CrearPaciente.setVisible(false);
        Pane_Monitoreo.setVisible(false);
        Pane_Notificacion.setVisible(false);


    }

    @FXML
    void onClick_CrearPaciente(ActionEvent event) {
        Pane_Cita.setVisible(false);
        Pane_CrearMedico.setVisible(false);
        Pane_CrearPaciente.setVisible(true);
        Pane_Monitoreo.setVisible(false);
        Pane_Notificacion.setVisible(false);


    }

    @FXML
    void onClick_Monitoreo(ActionEvent event) {
        Pane_Cita.setVisible(false);
        Pane_CrearMedico.setVisible(false);
        Pane_CrearPaciente.setVisible(false);
        Pane_Monitoreo.setVisible(true);
        Pane_Notificacion.setVisible(false);


    }

    @FXML
    void onClick_Notificacion(ActionEvent event) {
        Pane_Cita.setVisible(false);
        Pane_CrearMedico.setVisible(false);
        Pane_CrearPaciente.setVisible(false);
        Pane_Monitoreo.setVisible(false);
        Pane_Notificacion.setVisible(true);


    }

    public void inicializarDashBoadAdministrador(Hospital hospital, Administrador administrador) {
        this.hospital = hospital;
        this.administrador = administrador;
    }

    AdministradorController administradorController;
    Hospital hospital;
    Administrador administrador;


    @FXML
    void initialize() {
        assert Button_CerrarSesion != null : "fx:id=\"Button_CerrarSesion\" was not injected: check your FXML file 'dashboardAdministrador.fxml'.";
        assert Button_Cita != null : "fx:id=\"Button_Cita\" was not injected: check your FXML file 'dashboardAdministrador.fxml'.";
        assert Button_CrearMedico != null : "fx:id=\"Button_CrearMedico\" was not injected: check your FXML file 'dashboardAdministrador.fxml'.";
        assert Button_CrearPaciente != null : "fx:id=\"Button_CrearPaciente\" was not injected: check your FXML file 'dashboardAdministrador.fxml'.";
        assert Button_Monitoreo != null : "fx:id=\"Button_Monitoreo\" was not injected: check your FXML file 'dashboardAdministrador.fxml'.";
        assert Button_Notificacion != null : "fx:id=\"Button_Notificacion\" was not injected: check your FXML file 'dashboardAdministrador.fxml'.";
        assert Text_BienvenidoAdministrador != null : "fx:id=\"Text_BienvenidoAdministrador\" was not injected: check your FXML file 'dashboardAdministrador.fxml'.";

    }

}

