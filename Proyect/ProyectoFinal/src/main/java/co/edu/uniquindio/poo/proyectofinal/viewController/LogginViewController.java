package co.edu.uniquindio.poo.proyectofinal.viewController;

import co.edu.uniquindio.poo.proyectofinal.controller.AdministradorController;
import co.edu.uniquindio.poo.proyectofinal.controller.PacienteController;
import co.edu.uniquindio.poo.proyectofinal.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LogginViewController{

    Hospital hospital;
    AdministradorController administradorController;
    PacienteController pacienteController;

    @FXML
    private Button btIngresar;

    @FXML
    private Button btRegistrar;

    @FXML
    private TextField txtContra;

    @FXML
    private TextField txtUsuario;
    Paciente paciente;

    @FXML
    void clickIngrear(ActionEvent event) throws IOException {
        if (!txtUsuario.getText().isEmpty() && !txtContra.getText().isEmpty()) {
            Persona pacienteEncontrado = pacienteController.buscarPaciente(txtUsuario.getText(), txtContra.getText());
            paciente = (Paciente) pacienteEncontrado;

           if (pacienteEncontrado != null) {
               if (pacienteEncontrado instanceof Paciente) {
                   abrirDashboardPaciente();
               }else if(pacienteEncontrado instanceof Medico) {
                   abrirDashBoardMedico();
               }else if (pacienteEncontrado instanceof Administrador) {
                   abrirDashBoardAdminstrador();
               }
           }
        }else {JOptionPane.showMessageDialog(null, "Podria usted señor ser tan poco retardado de llenar los espacios.");}


    }

    public void abrirDashboardPaciente() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/dashboardPaciente.fxml"));
        Scene scene = new Scene(loader.load(),1000,600);
        Stage stage = new Stage();
        DashBoadPacienteVIewController dashBoadPacienteVIewController = loader.getController();
        dashBoadPacienteVIewController.inicializarDashBoadPaciente(hospital,paciente);
        stage.setScene(scene);
        Stage stageCerrar = (Stage) btIngresar.getScene().getWindow();
        stageCerrar.close();
        stage.show();
    }

    public void abrirDashBoardMedico(){

    }
//        Scene scene = new Scene(loader.load(),1000,600);
    public void abrirDashBoardAdminstrador() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinal/dashboardAdministrador.fxml"));
        Scene scene = new Scene(loader.load(),1000,600);
        Stage stage = new Stage();
        DashBoadAdministradorViewController dashBoadAdministradorViewController = loader.getController();
        dashBoadAdministradorViewController.inicializarDashBoadAdministrador(hospital,administrador);
        stage.setScene(scene);
        Stage stageCerrar = (Stage) btIngresar.getScene().getWindow();
        stageCerrar.close();
        stage.show();

    }

    @FXML
    void clickRegistrar(ActionEvent event) {

    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void inicializar(){
        this.pacienteController = new PacienteController(this.hospital);
        this.administradorController = new AdministradorController(this.hospital);

    }

}
