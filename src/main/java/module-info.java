module com.example.loginjavafxscript {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginjavafxscript to javafx.fxml;
    exports com.example.loginjavafxscript;
}