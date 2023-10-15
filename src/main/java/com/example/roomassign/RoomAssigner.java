package com.example.roomassign;

public class RoomAssigner implements Display {
    private static ABB abb; // Declare abb as a static variable
    private String salon;
    private Boolean salonStatus = false;

    public RoomAssigner(){
         abb = new ABB();
    }

    public void assignRooms(String edificio, Boolean proyector, Integer capacidadRequerida, Boolean computadoras) {


        Aula aulaAsignada = abb.findClosestAula(capacidadRequerida, proyector, computadoras, edificio);

        if (aulaAsignada != null) {
            System.out.println("Aula asignada: " + aulaAsignada.getEdificio());
            salon = aulaAsignada.getEdificio();
            abb.removeAula(aulaAsignada);
            salonStatus = true;
            display();
        } else {
            System.out.println("No se encontró un aula adecuada.");
            salonStatus = false;
            display();
        }
        System.out.println("Árbol restante:");
        abb.printTree(abb.root);
    }

    //----------------------------------------------------------------






    //----------------------------------------------------------------

    public String display() {
        String text;
        if (salonStatus == true) {
            text = "Tu salón es: " + salon;
        } else {
            text = "No se encontró un aula adecuada.";
        }
        System.out.println(text);
        return text;
    }
}
