package co.edu.uniquindio.poo.proyectofinal;

import co.edu.uniquindio.poo.proyectofinal.model.*;
import co.edu.uniquindio.poo.proyectofinal.viewController.LogginViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/poo/proyectofinal/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 338, 400);
        LogginViewController controller = fxmlLoader.getController();
        controller.setHospital(inicializarDatosQuemados());
        controller.inicializar();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public Hospital inicializarDatosQuemados(){

        Hospital hospital = new Hospital("Hospital UQ");
        Medico medico = new Medico("Jhanca", "1383315", "32168498", "juasn@jusam", DisponiblidadMedico.DISPONIBLE,EspecialidadMedico.GENERAL);
        Farmacia farmacia = new Farmacia("Farmacia UQ", "Cra 19 y ya ");
        Paciente paciente = new Paciente("Oscar","123","613153","jausna@loque");
        HistorialMedico historialMedico = new HistorialMedico("12256", "ninguna");
        historialMedico.setPaciente(paciente);
        paciente.setTheHistorialMedico(historialMedico);
        Cita cita = new Cita("01", LocalDate.now(), LocalTime.now(),historialMedico,EstadoCita.CONFIRMADO);
        Administrador administrador = new Administrador("Tomas","10718302", "3214684", "oscart.aristizabalv@loquesea",farmacia);
        farmacia.setAdministrador(administrador);
        paciente.setAdministrador(administrador);
        medico.setAdministrador(administrador);
        historialMedico.setTheCita(cita);
        historialMedico.setTheAdministrador(administrador);
        cita.setAdministrador(administrador);

        hospital.getListCitas().add(cita);
        hospital.getListAdministradores().add(administrador);
        hospital.getListMedicos().add(medico);
        hospital.getListHistorialMedicos().add(historialMedico);
        hospital.getListPacientes().add(paciente);

        return hospital;
    }
}