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
        this.proyector = false;
        this.computadoras = false;
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
}
