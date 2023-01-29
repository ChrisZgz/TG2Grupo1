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
import android.widget.Toast;

import com.example.tg2grupo1.R;

public class Inicio extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button Creditos = findViewById(R.id.btnCreditos);
        Creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarAlertDialog();
                cambiarColor(Creditos);
                cambiarColor2(Creditos);
            }

        });

        Button Iniciar = (Button) findViewById(R.id.btnInicio);
        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this, Juego.class);
                startActivity(i);
                cambiarColor(Iniciar);
                cambiarColor2(Iniciar);
            }
        });

        Button Estadisticas = findViewById(R.id.btnEstadisticas);
        Estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarEstadisticas();
                cambiarColor(Estadisticas);
            }

        });
    }


        public void mostrarAlertDialog(){
            AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
            LayoutInflater inflater = this.getLayoutInflater();
            dialogo.setTitle("");

            View dialogoView = inflater.inflate(R.layout.dialogocreditos, null);
            dialogo.setView(dialogoView);


            dialogo.show();
    }

    public void mostrarEstadisticas(){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        dialogo.setTitle("");

        View dialogoView = inflater.inflate(R.layout.card_layout, null);
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
    }
}