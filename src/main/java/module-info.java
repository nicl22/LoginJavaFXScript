module com.example.loginjavafxscript {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.loginjavafxscript to javafx.fxml;
    exports com.example.loginjavafxscript;
}