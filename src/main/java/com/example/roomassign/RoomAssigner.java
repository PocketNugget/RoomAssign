package com.example.roomassign;

public class RoomAssigner {
    private static ABB abb; // Declare abb as a static variable
    private String salon;
    private Boolean salonStatus= false;
    public static void createRooms() {
        abb = new ABB();

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

    }

    public void assignRooms(String edificio,Boolean proyector, Integer capacidadRequerida,Boolean computadoras,String salon){

        Aula aulaAsignada = abb.findClosestAula(capacidadRequerida, proyector, edificio);

        if (aulaAsignada != null) {
            System.out.println("Aula asignada: " + aulaAsignada.getEdificio());
            this.salon = aulaAsignada.getEdificio();
            abb.removeAula(aulaAsignada, capacidadRequerida);
            display();
        } else {
            System.out.println("No se encontró un aula adecuada.");
            this.salonStatus= false;
        }
    }
    public String display() {
        String text;
        if (salonStatus == true) {
            text = "Tu salón es: " + salon;
        } else {
            text = "No se encontró un aula adecuada.";
        }
        return text;
    }

}
