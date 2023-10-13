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
        System.out.println("Holaa gobe");




            ABB abb = new ABB();

            // Insertar algunas aulas con diferentes capacidades y detalles
            abb.insert(24, new Aula(29, "CN - 201", true, true));
            abb.insert(28, new Aula(28, "HU - 206", true, true));
            abb.insert(24, new Aula(24, "CN - 202", false, true));
            abb.insert(35, new Aula(35, "IA - 122", true, true));
            abb.insert(60, new Aula(60, "CS - 102", false, true));



        //agregar logica para buscar salon con proyector y/o computadora







            // Buscar y asignar un aula para una clase con 25 estudiantes
            int capacidadRequerida=30;
        boolean proyector=true;
        String edificio ="HU";
            Aula aulaAsignada = abb.findClosestAula(capacidadRequerida, proyector, edificio);

            if (aulaAsignada != null) {
                System.out.println("Aula asignada: " + aulaAsignada.getEdificio());
                abb.removeAula(aulaAsignada, capacidadRequerida);
            } else {
                System.out.println("No se encontró un aula adecuada.");
            }


        launch();
        }


}