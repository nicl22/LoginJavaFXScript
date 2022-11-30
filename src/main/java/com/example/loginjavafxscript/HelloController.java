package com.example.loginjavafxscript;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button loginButton;

    private Stage stage;

    String usernameText, passwordText;

    public void onHelloButtonClick(ActionEvent event) throws IOException {
        User user = new User();
        usernameText =username.getText();
        passwordText = password.getText();

        //create a boolean operator and counter for number of inputs allowed
        Boolean loggedIn = false;

        if (usernameText.equals(user.getUsername())) {
                if (passwordText.equals(user.getPassword())) {
                    welcomeText.setText("Logged in");
                    FXMLLoader fxmlLoader2 = new FXMLLoader(HelloController.class.getResource("quiz.fxml"));
                    Scene scene = new Scene(fxmlLoader2.load(), 620, 240);
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    stage.setScene(scene);


                } else {
                    welcomeText.setText("Incorrect username/password");


                }
            } else {
                welcomeText.setText("Incorrect username/password");
                usernameText ="";
                passwordText = "";
            }



    }


    public void newScene() throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloController.class.getResource("quiz.fxml"));
        Scene scene = new Scene(fxmlLoader2.load(), 320, 240);
        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();
    }

}