package co.edu.uniquindio.poo.proyectofinal.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.proyectofinal.controller.MedicoController;
import co.edu.uniquindio.poo.proyectofinal.model.Hospital;
import co.edu.uniquindio.poo.proyectofinal.model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class DashBoadMedicoViewController {


        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button Button_CerrarSesion;

        @FXML
        private Button Button_CrearHistorial;

        @FXML
        private Button Button_HorariosConsulta;

        @FXML
        private Button Button_Notificacion;

        @FXML
        private Button Button_VerHistorialMedico;

        @FXML
        private Pane Pane_CrearHistorial;

        @FXML
        private Pane Pane_HorariosConsulta;

        @FXML
        private Pane Pane_Notificacion;

        @FXML
        private Pane Pane_VerHistorialMedico;

        @FXML
        private Label Text_BienvenidoMedico;

        @FXML
        void onClick_CrearHistorial(ActionEvent event) {
            Pane_CrearHistorial.setVisible(true);
            Pane_HorariosConsulta.setVisible(false);
            Pane_Notificacion.setVisible(false);
            Pane_VerHistorialMedico.setVisible(false);

        }

        @FXML
        void onClick_HorariosConsulta(ActionEvent event) {
            Pane_CrearHistorial.setVisible(false);
            Pane_HorariosConsulta.setVisible(true);
            Pane_Notificacion.setVisible(false);
            Pane_VerHistorialMedico.setVisible(false);


        }

        @FXML
        void onClick_Notificacion(ActionEvent event) {
            Pane_CrearHistorial.setVisible(false);
            Pane_HorariosConsulta.setVisible(false);
            Pane_Notificacion.setVisible(true);
            Pane_VerHistorialMedico.setVisible(false);


        }

        @FXML
        void onClick_VerHistorialMedico(ActionEvent event) {
            Pane_CrearHistorial.setVisible(false);
            Pane_HorariosConsulta.setVisible(false);
            Pane_Notificacion.setVisible(false);
            Pane_VerHistorialMedico.setVisible(true);


        }

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


    public void inicializarDashBoadMedico(Hospital hospital, Medico medico) {
        this.hospital = hospital;
        this.medico = medico;
    }

    MedicoController medicoController;
    Hospital hospital;
    Medico medico;


    @FXML
        void initialize() {
            assert Button_CerrarSesion != null : "fx:id=\"Button_CerrarSesion\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Button_CrearHistorial != null : "fx:id=\"Button_CrearHistorial\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Button_HorariosConsulta != null : "fx:id=\"Button_HorariosConsulta\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Button_Notificacion != null : "fx:id=\"Button_Notificacion\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Button_VerHistorialMedico != null : "fx:id=\"Button_VerHistorialMedico\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Pane_CrearHistorial != null : "fx:id=\"Pane_CrearHistorial\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Pane_HorariosConsulta != null : "fx:id=\"Pane_HorariosConsulta\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Pane_Notificacion != null : "fx:id=\"Pane_Notificacion\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Pane_VerHistorialMedico != null : "fx:id=\"Pane_VerHistorialMedico\" was not injected: check your FXML file 'dashboardMedico.fxml'.";
            assert Text_BienvenidoMedico != null : "fx:id=\"Text_BienvenidoMedico\" was not injected: check your FXML file 'dashboardMedico.fxml'.";

        }



}
