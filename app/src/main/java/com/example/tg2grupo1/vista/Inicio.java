package com.example.tg2grupo1.vista;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.tg2grupo1.R;
import com.example.tg2grupo1.controlers.LecturaEscrituraDatos;

import java.io.FileNotFoundException;

public class Inicio extends AppCompatActivity {
    Button creditos;
    Button iniciar;
    Button estadisticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        try {
            LecturaEscrituraDatos.verificar(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        creditos = findViewById(R.id.btnCreditos);
        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarAlertDialog(creditos);
                cambiarColor(creditos);
            }

        });

        iniciar = (Button) findViewById(R.id.btnInicio);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this, Juego.class);
                startActivity(i);
                cambiarColor(iniciar);
            }
        });

        estadisticas = findViewById(R.id.btnEstadisticas);
        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarEstadisticas(estadisticas);
                cambiarColor(estadisticas);
            }

        });
    }


        public void mostrarAlertDialog(Button button){
            AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
            LayoutInflater inflater = this.getLayoutInflater();
            dialogo.setTitle("");
            dialogo.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {
                    cambiarColor2(button);
                }
            });

            View dialogoView = inflater.inflate(R.layout.dialogocreditos, null);
            dialogo.setView(dialogoView);


            dialogo.show();
    }

    public void mostrarEstadisticas(Button button){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        dialogo.setTitle("");
        dialogo.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
            cambiarColor2(button);
            }
        });

        View dialogoView = inflater.inflate(R.layout.recylcerviewalertdialog, null);
        dialogo.setView(dialogoView);


        dialogo.show();
    }

    public void cambiarColor(Button boton) {
        boton.setTextColor(Color.parseColor("#FFED00"));
    }

    public void cambiarColor2 (Button boton) {
        boton.setTextColor(Color.parseColor("#8A864D"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        cambiarColor2(iniciar);
    }
}