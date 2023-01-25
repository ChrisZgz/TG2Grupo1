package com.example.tg2grupo1.vista;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
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
            }
        });

        Button Iniciar = (Button) findViewById(R.id.btnInicio);
        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this, Juego.class);
                startActivity(i);
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
}