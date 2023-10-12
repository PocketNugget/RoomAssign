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
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
//Holaaaaaa
    public static void main(String[] args) {

        System.out.println("holas 12345");
        System.out.println("Holaa");




            ABB abb = new ABB();

            // Insertar algunas aulas con diferentes capacidades y detalles
            abb.insert(24, new Aula(24, "CN - 201", true, false));
            abb.insert(28, new Aula(28, "HU - 206", true, false));
            abb.insert(24, new Aula(24, "CN - 202", true, true));
            abb.insert(35, new Aula(35, "IA - 122", true, false));
            abb.insert(60, new Aula(60, "CS - 102", true, false));

            // Buscar y asignar un aula para una clase con 25 estudiantes
            int capacidadRequerida=25;
            Aula aulaAsignada = abb.findClosestAula(capacidadRequerida);

            if (aulaAsignada != null) {
                System.out.println("Aula asignada: " + aulaAsignada.getEdificio());
                abb.removeAula(aulaAsignada, capacidadRequerida);
            } else {
                System.out.println("No se encontró un aula adecuada.");
            }


        launch();
        }


}