module co.edu.uniquindio.poo.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.poo.proyectofinal to javafx.fxml;
    opens co.edu.uniquindio.poo.proyectofinal.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.proyectofinal.controller to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinal;
}