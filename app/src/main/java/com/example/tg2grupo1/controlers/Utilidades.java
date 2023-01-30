package com.example.tg2grupo1.controlers;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.example.tg2grupo1.R;
import com.example.tg2grupo1.vista.Juego;

public class Utilidades {
    private static Context cont;

    public static Boolean comprobarVacioEditText(Context context, EditText editText) {
        if (editText.getText().toString().trim().isEmpty()) {
            Sonidos.sonidoFallo(context);
            alerta(context, "NO PUEDE DEJAR EL CAMPO " + editText.getHint() + " VACIO", false);
            return true;
        } else return false;
    }

    public static Boolean comprobarIgualesEditText(Context context, EditText editText1, EditText editText2) {
        if (editText1.getText().toString().equals(editText2.getText().toString())) {
            alerta(context, "LOS NOMBRES DE LOS JUGADORES NO PUEDEN SER IGUALES", false);
            return true;
        } else return false;
    }

    public static void alerta(Context context, String contenido, Boolean aBoolean) {
        cont = context;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.card_layout_alerta, null);
        TextView textView = view.findViewById(R.id.campoAlertas);
        textView.setText(contenido);
        builder.setView(view);
        if (aBoolean) {
            builder.setOnDismissListener(dialog -> {
                alertaFinDeJuego(cont);
            });
        }
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public static void alertaFinDeJuego(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View alertLayout = inflater.inflate(R.layout.card_layout_final, null);
        Button btnOtraVez = (Button) alertLayout.findViewById(R.id.btnOtraVez);
        Button btnJugadores = (Button) alertLayout.findViewById(R.id.btnJugadores);
        Button btnPantInicio = (Button) alertLayout.findViewById(R.id.btnPantInicio);
        AlertDialog.Builder alert = new AlertDialog.Builder(context);
        alert.setView(alertLayout);
        final AlertDialog dialog = alert.create();
        btnOtraVez.setOnClickListener(v -> {
            Juego.reiniciarJuego();
            dialog.dismiss();
        });
        btnJugadores.setOnClickListener(v -> {
            Juego.reiniciarJuegoOtrosJugadores();
            dialog.dismiss();
        });
        btnPantInicio.setOnClickListener(v -> {
            dialog.dismiss();
            Juego.cerrarActividad((Activity) context);
        });
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();

    }

}
