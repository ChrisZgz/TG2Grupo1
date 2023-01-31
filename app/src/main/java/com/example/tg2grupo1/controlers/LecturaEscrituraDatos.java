package com.example.tg2grupo1.controlers;

import android.content.Context;

import com.example.tg2grupo1.modelo.Serie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LecturaEscrituraDatos {

    private static final String nombreArchivo = "registros.csv";

    public static void verificar(Context context) throws FileNotFoundException {
        File filesDir = context.getFilesDir();
        String ruta = filesDir.getAbsolutePath();
        String filePath = ruta + "/" + nombreArchivo;


        File file = new File(filePath);
        if (!file.exists()) {
            try (FileOutputStream fos = context.openFileOutput(nombreArchivo, context.MODE_PRIVATE);
                 PrintWriter pw = new PrintWriter(fos)) {
                pw.println("NOMBRE  RESULTADO");
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

    public static ArrayList<Serie> mostrar(Context context) {
        {
            ArrayList<Serie> informacion = new ArrayList<>();
            try (InputStreamReader isr = new InputStreamReader(context.openFileInput(nombreArchivo));
                 BufferedReader br = new BufferedReader(isr)) {
                br.readLine();
                String linea;
                while ((linea = br.readLine()) != null) {
                    Serie serie = new Serie();
                    String[] rec = linea.split(";");
                    serie.setResultado(rec[0]);
                    serie.setNombre(rec[1]);
                    informacion.add(serie);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return informacion;
        }
    }
}
