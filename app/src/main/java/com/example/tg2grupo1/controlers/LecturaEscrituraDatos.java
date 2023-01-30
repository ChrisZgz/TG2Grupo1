package com.example.tg2grupo1.controlers;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class LecturaEscrituraDatos implements AutoCloseable {

    private static final String nombreArchivo = "registros.csv";

    public static void verificar(Context context) throws FileNotFoundException {
        File file = new File(context.getExternalFilesDir(null), nombreArchivo);
        if (!file.exists()) {
            try (FileOutputStream fos = context.openFileOutput(nombreArchivo, context.MODE_PRIVATE);
                 PrintWriter pw = new PrintWriter(fos)) {
                pw.println("RESULTADO    NOMBRE");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void guardar(Context context, String contenido) {
        try (FileOutputStream file = context.openFileOutput(nombreArchivo, Context.MODE_APPEND);
             PrintWriter pw = new PrintWriter(file)) {
            pw.println(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {

    }
}
