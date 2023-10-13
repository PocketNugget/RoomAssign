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