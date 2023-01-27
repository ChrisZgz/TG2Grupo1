package com.example.tg2grupo1.modelo;

public class Fichas {
    private int id;
    private int tipo;

    public Fichas(int id, int tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
