package com.example.roomassign;


class NodoABB {
    int key;
    Aula value;
    NodoABB left;
    NodoABB right;

    public NodoABB(int key, Aula value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
