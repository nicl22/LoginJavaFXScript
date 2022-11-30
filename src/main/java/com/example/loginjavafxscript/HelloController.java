package com.example.loginjavafxscript;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

    String usernameText, passwordText;

    public void onHelloButtonClick(ActionEvent event) {
        User user = new User();
        usernameText =username.getText();
        passwordText = password.getText();

        //create a boolean operator and counter for number of inputs allowed
        Boolean loggedIn = false;

        if (usernameText.equals(user.getUsername())) {
                if (passwordText.equals(user.getPassword())) {
                    welcomeText.setText("Logged in");
                    loggedIn=true;
                    newScene(Stage stage);

                } else {
                    welcomeText.setText("Incorrect username/password");


                }
            } else {
                welcomeText.setText("Incorrect username/password");
                usernameText ="";
                passwordText = "";
            }



    }


    public void newScene(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("quiz.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();
    }

}