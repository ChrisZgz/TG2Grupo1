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

public class LecturaEscrituraDatos implements AutoCloseable {

    private static final String nombreArchivo = "registros.csv";

    public static void verificar(Context context) throws FileNotFoundException {
        File filesDir = context.getFilesDir();
        String ruta = filesDir.getAbsolutePath();
        String filePath = ruta + "/"+ nombreArchivo +".csv";


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

    public static ArrayList<Serie> mostrar(Context context){

        try(InputStreamReader fis = new InputStreamReader(context.openFileInput(nombreArchivo));
            BufferedReader br = new BufferedReader(fis))
        {
            ArrayList<Serie> lista = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null){
                String[] dato = line.split(":");
                lista.add(new Serie(dato[0],dato[1]));
            }

        }catch (Exception e){

        }
        return lista;
    }

    @Override
    public void close() throws Exception {

    }

    public static ArrayList<Serie> lista = new ArrayList<>();

}
