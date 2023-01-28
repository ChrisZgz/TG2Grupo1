package com.example.tg2grupo1.modelo;

public class Fichas {
    private String nombre;
    private int tipo;

    public Fichas(String nombre, int tipo) {
        this.nombre = nombre.toUpperCase();
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
