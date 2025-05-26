package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MenuAdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    private Label Text_BienvenidoAdministrador;

    @FXML
    void onClick_Cita(ActionEvent event) {

    }

    @FXML
    void onClick_CrearMedico(ActionEvent event) {

    }

    @FXML
    void onClick_CrearPaciente(ActionEvent event) {

    }

    @FXML
    void onClick_Monitoreo(ActionEvent event) {

    }

    @FXML
    void onClick_Notificacion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Button_Cita != null : "fx:id=\"Button_Cita\" was not injected: check your FXML file 'menuAdministrador.fxml'.";
        assert Button_CrearMedico != null : "fx:id=\"Button_CrearMedico\" was not injected: check your FXML file 'menuAdministrador.fxml'.";
        assert Button_CrearPaciente != null : "fx:id=\"Button_CrearPaciente\" was not injected: check your FXML file 'menuAdministrador.fxml'.";
        assert Button_Monitoreo != null : "fx:id=\"Button_Monitoreo\" was not injected: check your FXML file 'menuAdministrador.fxml'.";
        assert Button_Notificacion != null : "fx:id=\"Button_Notificacion\" was not injected: check your FXML file 'menuAdministrador.fxml'.";
        assert Text_BienvenidoAdministrador != null : "fx:id=\"Text_BienvenidoAdministrador\" was not injected: check your FXML file 'menuAdministrador.fxml'.";

    }

}

