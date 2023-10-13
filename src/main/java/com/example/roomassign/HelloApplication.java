package com.example.roomassign;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 430);
        stage.setResizable(false);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
//Holaaaaaa
    public static void main(String[] args) {

        System.out.println("holas 12345");
        System.out.println("Holaa gobe");




            ABB abb = new ABB();

            // Insertar algunas aulas con diferentes capacidades y detalles
            abb.insert(24, new Aula(24, "CN - 201", true, false));
            abb.insert(28, new Aula(28, "HU - 206", false, false));
            abb.insert(24, new Aula(24, "CN - 202", true, true));
            abb.insert(35, new Aula(35, "IA - 122", true, false));
            abb.insert(60, new Aula(60, "CS - 102", false, false));
            abb.insert(60, new Aula(60, "IA - 105", true, true));
            abb.insert(15, new Aula(15, "AG - 101", false, false));
            abb.insert(20, new Aula(20, "BI - 307", true, true));
            abb.insert(28, new Aula(28, "CE - 202", true, false));
            abb.insert(35, new Aula(35, "CI - 120", false, false));
            abb.insert(60, new Aula(60, "SL - 106", true, false));
            abb.insert(28, new Aula(28, "PU - 104", true, false));
            abb.insert(20, new Aula(20, "IOS - 101", false, false));
            abb.insert(35, new Aula(35, "LB - 106", true, false));
            abb.insert(30, new Aula(30, "LA - 120", true, false));
            abb.insert(24, new Aula(24, "NE - 103", false, false));

        //agregar logica para buscar salon con proyector y/o computadora







            // Buscar y asignar un aula para una clase con 25 estudiantes
            int capacidadRequerida=30;
        boolean proyector=true;
        String edificio ="HU";


            Aula aulaAsignada = abb.findClosestAula(capacidadRequerida, proyector, edificio);

        if (aulaAsignada != null) {
            System.out.println("Aula asignada: " + aulaAsignada.getEdificio());
            abb.removeAula(aulaAsignada);
        } else {
            System.out.println("No se encontró un aula adecuada.");
        }

        System.out.println("Árbol restante:");
        abb.printTree(abb.root);



        launch();
        }


}