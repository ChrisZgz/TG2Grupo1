package com.example.tg2grupo1.controlers;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class LecturaEscrituraDatos implements AutoCloseable{

    public void guardar(Context context, String contenido){
        File directorio = new File(String.valueOf(context), contenido);
        if (!directorio.exists())
            directorio.mkdir();

        try(FileOutputStream file = context.openFileOutput("Jugadores.txt", Context.MODE_APPEND);
            PrintWriter pw = new PrintWriter(file)){
            pw.println(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {

    }
}
