package com.example.tg2grupo1.controlers;

import android.content.Context;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;

public class Utilidades {

    public static Boolean comprobarVacioEditText(Context context, EditText editText) {
        if (editText.getText().toString().trim().isEmpty()) {
            alertaError(context, "ERROR",
                    "NO PUEDE DEJAR EL CAMPO " + editText.getHint());
            return true;
        }
        else return false;
    }

    public static void alertaError(Context context, String titulo, String contenido) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo);
        builder.setMessage(contenido);
        builder.setPositiveButton("Aceptar", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
