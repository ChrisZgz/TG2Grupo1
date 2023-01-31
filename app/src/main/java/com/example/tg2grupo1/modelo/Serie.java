package com.example.tg2grupo1.modelo;

public class Serie {

    private String nombre;
    private String resultado;

    public Serie() {
    }

    public Serie(String nombre, String puntuacion) {
        this.nombre = nombre;
        this.resultado = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return resultado + ';' + nombre;
    }
}
