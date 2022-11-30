package com.example.loginjavafxscript;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class QuizController {

    @FXML
    private TextField answer;

    @FXML
    private Button answerBtn;

    @FXML
    private Label answerVerification;

    private String answerInput;


    public void onAnswerBtnClick(ActionEvent actionEvent) {
        answerInput = answer.getText();

        if (answerInput.equals("2022")){

            answerVerification.setText("correct answer!");
        }else {
            answerVerification.setText("Incorrect answer!");
        }

    }
}
