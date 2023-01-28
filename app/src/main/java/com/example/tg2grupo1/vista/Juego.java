package com.example.tg2grupo1.vista;

import static com.example.tg2grupo1.controlers.Utilidades.comprobarIgualesEditText;
import static com.example.tg2grupo1.controlers.Utilidades.comprobarVacioEditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.tg2grupo1.R;
import com.example.tg2grupo1.controlers.Logica;
import com.example.tg2grupo1.controlers.Utilidades;
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
    Fichas ficha1;
    Fichas ficha2;
    Fichas fichaEnUso;
    int contadorDeFichas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_juego);

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

        contadorDeFichas = 0;
        List<ImageButton> botones = meterBotones();
        Logica.getInstance(this);

        for (int i = 0; i < 9; i++) {
            botones.get(i).setEnabled(false);
        }

        btnIniciar.setOnClickListener(v -> {
            if (comprobarVacioEditText(this, txtJugadorUno)) {
            } else if (comprobarVacioEditText(this, txtJugadorDos)) {
            } else if (comprobarIgualesEditText(this, txtJugadorUno, txtJugadorDos)){
            }
            else {
                ficha1 = new Fichas(txtJugadorUno.getText().toString(), R.drawable.fichao);
                ficha2 = new Fichas(txtJugadorDos.getText().toString(), R.drawable.fichax);
                fichaEnUso = ficha1;
                txtJugadorUno.setEnabled(false);
                txtJugadorDos.setEnabled(false);
                for (int i = 0; i < 9; i++) {
                    botones.get(i).setEnabled(true);
                }
                btnIniciar.setClickable(false);
            }
        });

        bt1.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt1, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt1.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
            if (bt1.getForeground().getConstantState().equals(getResources().getDrawable(fichaEnUso.getTipo()).getConstantState())) {
                System.out.println("");
            } else {
                // El contenido del foreground es diferente a la imagen esperada
            }
        });
        bt2.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt2, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt2.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
        bt3.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt3, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt3.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
        bt4.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt4, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt4.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
        bt5.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt5, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt5.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
        bt6.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt6, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt6.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
        bt7.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt7, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt7.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
        bt8.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt8, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt8.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
        bt9.setOnClickListener(v -> {
            if (logica.comprobarVacio(bt9, fichaEnUso)){
                contadorDeFichas++;
                Drawable myDrawable = ContextCompat.getDrawable(getApplicationContext(),
                        fichaEnUso.getTipo());
                bt9.setForeground(myDrawable);
                if (contadorDeFichas > 4) {
                    logica.tresEnRaya(fichaEnUso, meterBotones());
                }
                cambioDeFicha();
            }
        });
    }

    private void cambioDeFicha(){
        if (fichaEnUso == ficha1){
            fichaEnUso = ficha2;
        }else fichaEnUso = ficha1;
    }

    private ArrayList<ImageButton> meterBotones() {
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

    @Override
    protected void onStop() {
        super.onStop();
            Logica.unset();
    }
}