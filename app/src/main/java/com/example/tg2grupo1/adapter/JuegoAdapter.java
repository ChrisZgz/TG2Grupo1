package com.example.tg2grupo1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tg2grupo1.modelo.Fichas;

import java.util.List;

public class JuegoAdapter extends RecyclerView.Adapter<JuegoAdapter.ViewHolder> {
    private List<Fichas> fichas:
    private ViewHolder.OnNoteListener mOnNoteListener;

    public JuegoAdapter(List<Fichas> fichas, ViewHolder.OnNoteListener onNoteListener) {
        this.fichas = fichas;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //FALTA CREAR EL CARD O LAYOUT que cargue el recycler view cada vez que
        //meta un dato
        View view = inflater.inflate(R.layout, parent, false);
        return new ViewHolder(view, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //aqui hay que poner el image view desde el modelo
        //holder.titulo.setText(series.get(position).getTitulo());     EJEMPLO
        holder.
    }

    @Override
    public int getItemCount() {
        return fichas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        OnNoteListener onNoteListener;

        public ViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            this.onNoteListener = onNoteListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onNoteListener.onNoteClic(getAdapterPosition());
        }

        public interface OnNoteListener {
            void onNoteClic(int posicion);
        }
    }
}
