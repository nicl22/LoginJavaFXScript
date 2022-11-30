package com.example.loginjavafxscript;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

public class QuizController {
    @FXML
    Label answerText;
    @FXML
    private TextField answer;

    @FXML
    private Button answerBtn;

    private String answerInput;


    public void onAnswerBtnClick(ActionEvent actionEvent) {
        answerInput = answer.getText();

        if (answerInput.equals("2022")){

            answerText.setText("Incorrect username/password");
        }

    }
}
