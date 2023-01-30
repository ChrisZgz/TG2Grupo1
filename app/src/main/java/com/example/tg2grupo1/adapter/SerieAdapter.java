package com.example.tg2grupo1.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tg2grupo1.R;
import com.example.tg2grupo1.controlers.Serie;

import java.util.ArrayList;

public class SerieAdapter extends RecyclerView.Adapter<SerieAdapter.ViewHolder> {

    private ArrayList<Serie> series;
    public SerieAdapter(ArrayList<Serie> series){
        this.series = series;

    }

    @NonNull
    @Override
    public SerieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_serie_adapter, parent, false);

        return new SerieAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SerieAdapter.ViewHolder holder, int position) {
        holder.nombre.setText(series.get(position).getNombre());
        holder.resultado.setText(series.get(position).getResultado());

    }

    @Override
    public int getItemCount() {
        return series.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nombre;
        public TextView resultado;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.nombre);
            resultado = itemView.findViewById(R.id.resultado);

        }
    }
}