package com.example.roomassign;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class HelloController {

    @FXML
    private Label welcomeText;
    private Button SearchOn;
    @FXML
    private RadioButton CompTrueOn;
    @FXML
    protected void CompTrueOn() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public void CompTrueOn(ActionEvent actionEvent) {

    }

    public void SearchOn(ActionEvent actionEvent) {
    }

    public void ProyTrueOn(ActionEvent actionEvent) {
    }

    public void EstudiantesIn(ActionEvent actionEvent) {
    }
}