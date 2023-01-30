package com.example.tg2grupo1.controlers;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.tg2grupo1.R;

public class Sonidos {

    public static void sonidoFallo(Context contexto) {
        MediaPlayer fallo = MediaPlayer.create(contexto, R.raw.fallo);
        fallo.start();
    }

    public static void sonidoVictoria(Context contexto) {
        MediaPlayer victoria = MediaPlayer.create(contexto, R.raw.victoria);
        victoria.start();
    }

    public static void sonidoEmpate(Context contexto) {
        MediaPlayer empate = MediaPlayer.create(contexto, R.raw.empate);
        empate.start();
    }
    public static void sonidoFicha(Context contexto) {
        MediaPlayer ficha = MediaPlayer.create(contexto, R.raw.ficha);
        ficha.start();
    }

}
