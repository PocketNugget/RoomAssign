package com.example.roomassign;


class Aula {
    int capacidad;
    String edificio;
    String numero;
    boolean proyector;
    boolean computadoras;

    public Aula(int capacidad, String edificio, boolean proyector, boolean computadoras) {
        this.capacidad = capacidad;
        this.edificio = edificio;
        this.proyector = proyector;
        this.computadoras = computadoras;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEdificio() {
        return edificio;
    }

    public String getNumero() {
        return numero;
    }

    public boolean getProyector() {
        return proyector;
    }

    public boolean getComputadoras() {
        return computadoras;
    }

    public boolean tieneProyector() {
        return proyector;
    }

    public boolean tieneComputadoras() {
        return computadoras;
    }
}
