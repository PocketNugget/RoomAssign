package com.example.roomassign;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import com.example.roomassign.RoomAssigner;

public class HelloController {
    ObservableList<String> aulas = FXCollections.observableArrayList("AG", "HU", "BI", "CE", "CN", "CI", "SL", "CS", "PU", "IA", "IOS", "LB", "LA", "NE");

    @FXML
    private Label Output;
    @FXML
    private Button SearchOn;
    @FXML
    private RadioButton CompTrueOn;
    @FXML
    private ChoiceBox<String> EdificiosL; // Añade el tipo de datos (String) entre los <>.

    private boolean proyector = false, computadora = false;

    @FXML
    public void initialize() {
        EdificiosL.setItems(aulas);
    }

    @FXML
    public void CompTrueOn(ActionEvent actionEvent) {
     computadora= true;
    }

    @FXML
    public void SearchOn(ActionEvent actionEvent) {
        // Aquí puedes obtener la selección del usuario
        String seleccion = EdificiosL.getValue();
        if (seleccion != null) {
            System.out.println("Seleccionaste: " + seleccion);
        }

    }

    @FXML
    public void ProyTrueOn(ActionEvent actionEvent) {
        proyector = true;
    }

    @FXML
    public void EstudiantesIn(ActionEvent actionEvent) {
        String estudiantes = ((TextField) actionEvent.getSource()).getText();
    }

    @FXML
    public void EdificiosLON(MouseEvent mouseEvent) {
    }
}
