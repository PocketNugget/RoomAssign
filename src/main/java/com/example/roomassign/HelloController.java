package com.example.roomassign;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    private final RoomAssigner roomAssigner;
    ObservableList<String> aulas = FXCollections.observableArrayList("AG", "HU", "BI", "CE", "CN", "CI", "SL", "CS", "PU", "IA", "IOS", "LB", "LA", "NE");

    @FXML
    private Label Output;
    @FXML
    private Button SearchOn;
    @FXML
    private RadioButton CompTrueOn;
    @FXML
    private ChoiceBox<String> EdificiosL; // Añade el tipo de datos (String) entre los <>.
    @FXML
    private TextField Estudiantes;

    public boolean proyector = false, computadora = false, proyvalue = true, compvalue = true;

    private final ABB abb; // Declare abb as a static variable

    public HelloController(){
        roomAssigner = new RoomAssigner();
        abb = new ABB();

    }
    @FXML
    public void initialize() {
        EdificiosL.setItems(aulas);
    }
    public void EstudiantesIn(ActionEvent actionEvent) {
    }


    @FXML
    public void CompTrueOn(ActionEvent actionEvent) {
        if(compvalue){
            computadora = true;
            compvalue = false;
        }else {
            computadora = false;
            compvalue = true;
        }

    }
    public void ProyTrueOn(ActionEvent actionEvent) {
        if(proyvalue){
            proyector = true;
            proyvalue = false;
        }else {
            proyector = false;
            proyvalue = true;
        }
    }
    @FXML
    public void SearchOn(ActionEvent actionEvent) {
        int estudiantes = 20;
        String seleccion = (EdificiosL.getValue());
        roomAssigner.assignRooms(seleccion, proyector, estudiantes, computadora);
        System.out.println(roomAssigner.display());
        Output.setText(roomAssigner.display());
    }



}
