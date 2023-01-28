package com.example.tg2grupo1.controlers;

import static com.example.tg2grupo1.controlers.Utilidades.alerta;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

import androidx.core.content.ContextCompat;

import com.example.tg2grupo1.modelo.Fichas;

import java.util.List;

public class Logica {
    private static Context context;
    private static Logica logica;
    private static List<ImageButton> botones;
    private static Fichas fichas;

    public static Logica getInstance(Context conte) {
        if (logica == null) {
            context = conte;
            logica = new Logica();
        }
        return logica;
    }
    public static void unset(){
        logica = null;
    }

    public Boolean tresEnRaya(Fichas fich, List<ImageButton> buttons) {
        botones = buttons;
        fichas = fich;
        if (comprobar3EnRaya()){
            alerta(context, "FELICIDADES", "EL JUGADOR: "+ fich.getNombre()+ " ES EL GANADOR");
            return true;
        }
        else return false;
    }

    public Boolean comprobarVacio(ImageButton btn, Fichas fich) {
        fichas = fich;
        if (botonVacio(btn)) {
            return true;
        } else {
            alerta(context, "ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            return false;
        }

    }

    private Boolean botonVacio(ImageButton btn) {
        return btn.getForeground() == null;
    }

    private Boolean comprobar3EnRaya() {
        if (comprobanteDeBloques(0, 1, 2)) {
            return true;
        } else if (comprobanteDeBloques(3, 4, 5)) {
            return true;
        } else if (comprobanteDeBloques(6, 7, 8)) {
            return true;
        } else if (comprobanteDeBloques(0, 3, 6)) {
            return true;
        } else if (comprobanteDeBloques(1, 4, 7)) {
            return true;
        } else if (comprobanteDeBloques(2, 5, 8)) {
            return true;
        } else if (comprobanteDeBloques(0, 4, 8)) {
            return true;
        } else return comprobanteDeBloques(2, 4, 6);
    }

    private Boolean comprobanteDeBloques(int nu1, int nu2, int nu3) {
        return tipoDeFicha(botones.get(nu1))
                && tipoDeFicha(botones.get(nu2))
                && tipoDeFicha(botones.get(nu3));
    }

    private Boolean tipoDeFicha(ImageButton btn) {
        Drawable drawable1 = btn.getDrawable();
        Drawable drawable2 = ContextCompat.getDrawable(context, fichas.getTipo());
        if (drawable1.equals(drawable2)){
            System.out.println("");
        }
        return btn.getForeground() != null && drawable1.equals(drawable2);
    }
}
