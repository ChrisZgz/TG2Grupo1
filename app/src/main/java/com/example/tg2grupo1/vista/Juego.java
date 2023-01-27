package com.example.tg2grupo1.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.tg2grupo1.R;
import com.example.tg2grupo1.controlers.Logica;
import com.example.tg2grupo1.modelo.Fichas;

import java.util.ArrayList;
import java.util.List;

public class Juego extends AppCompatActivity {
    EditText txtJugadorUno;
    EditText txtJugadorDos;
    Button btnIniciar;
    ImageButton bt1;
    ImageButton bt2;
    ImageButton bt3;
    ImageButton bt4;
    ImageButton bt5;
    ImageButton bt6;
    ImageButton bt7;
    ImageButton bt8;
    ImageButton bt9;
    Logica logica = new Logica();
    Fichas ficha1 = new Fichas(1, R.drawable.fichao);
    Fichas ficha2 = new Fichas(2, R.drawable.fichax);
    Fichas fichaEnUso = ficha1;
    int contadorDeFichas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        contadorDeFichas = 0;
        txtJugadorUno = findViewById(R.id.txtJugadorUno);
        txtJugadorDos = findViewById(R.id.txtJugadorDos);
        btnIniciar = findViewById(R.id.btnIniciar);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        List<ImageButton> botones = meterBotones();
        Logica.getInstance(botones, this);

        btnIniciar.setOnClickListener(v -> {
            txtJugadorUno.setEnabled(false);
            txtJugadorDos.setEnabled(false);
            for (int i = 0; i < 9; i++) {
                botones.get(i).setClickable(true);
            }
            btnIniciar.setClickable(false);
        });

        bt1.setOnClickListener(v -> {
            logica.comprobarVacio(bt1, fichaEnUso);
            if (contadorDeFichas > 4) {
                logica.tresEnRaya(fichaEnUso);
            }
            contadorDeFichas++;
        });
    }

    public ArrayList<ImageButton> meterBotones() {
        ArrayList<ImageButton> botones = new ArrayList<>();
        botones.add(bt1);
        botones.add(bt2);
        botones.add(bt3);
        botones.add(bt4);
        botones.add(bt5);
        botones.add(bt6);
        botones.add(bt7);
        botones.add(bt8);
        botones.add(bt9);
        return botones;
    }
}