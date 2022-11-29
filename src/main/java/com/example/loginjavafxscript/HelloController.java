package com.example.loginjavafxscript;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        int i=1;
        String usernameInput;
        //do while loop that will ke
        do{

            if (usernameText.equals(user.getUsername())) {
                if (passwordText.equals(user.getPassword())) {
                    welcomeText.setText("Logged in");
                    loggedIn=true;
                } else {
                    welcomeText.setText("Incorrect username/password");
                }
            } else {
                welcomeText.setText("Incorrect username/password");
            }
        }
        while(loggedIn == false);

    }

}