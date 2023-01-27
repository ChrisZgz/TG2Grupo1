package com.example.tg2grupo1.controlers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.example.tg2grupo1.R;
import com.example.tg2grupo1.modelo.Fichas;

import java.util.List;

public class Logica {
    private static Context context;
    private static Logica logica;
    private static List<Button> botones;
    private static Fichas fichas;

    public static Logica getInstance(List<Button> but, Context conte) {
        if (logica == null) {
            context = conte;
            logica = new Logica();
            botones = but;
        }
        return logica;
    }

    public Boolean startComprobations(Button btn, Fichas fich) {
        fichas = fich;
        if (comprobarBTN(btn)) {
            if (comprobar3EnRaya()) {

            }
        }
    }

    public Boolean comprobarBTN(Button btn) {
        if (botonVacio(btn)) {
            return true;
        } else {
            alertaError("ERROR", "LA CASILLA YA ESTÁ OCUPADA");
            return false;
        }

    }

    private Boolean botonVacio(Button btn) {
        return btn.getBackground() == null;
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
        } else if (comprobanteDeBloques(2, 4, 6)) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean comprobanteDeBloques(int nu1, int nu2, int nu3) {
        return tipoDeFicha(botones.get(nu1))
                && tipoDeFicha(botones.get(nu2))
                && tipoDeFicha(botones.get(nu3));
    }

    private Boolean tipoDeFicha(Button btn) {
        Drawable background = btn.getBackground();
        return background != null && background.equals(fichas.getTipo());
    }

    private void alertaError(String titulo, String contenido) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo);
        builder.setMessage(contenido);
        builder.setPositiveButton("Aceptar", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
