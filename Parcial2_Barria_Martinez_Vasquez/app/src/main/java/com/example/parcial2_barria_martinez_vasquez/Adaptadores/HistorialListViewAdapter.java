package com.example.parcial2_barria_martinez_vasquez.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.parcial2_barria_martinez_vasquez.R;
import com.example.parcial2_barria_martinez_vasquez.entidades.Historial;

import java.util.ArrayList;
import java.util.List;

public class HistorialListViewAdapter extends ArrayAdapter<Historial> {
    private List <Historial> notas = new ArrayList<>();
    public HistorialListViewAdapter (Context context, List<Historial> datos) {
        super(context, R.layout.lv_historial_layout, datos);
        notas = datos;
    }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.lv_historial_layout, null);

            ImageView imgPhoto = (ImageView) item.findViewById(R.id.imgvPhoto);
            imgPhoto.setImageResource(notas.get(position).getFoto());

            TextView materias = (TextView)item.findViewById(R.id.lblMateria);
            materias.setText(notas.get(position).getMateria());

            TextView semestra  = (TextView)item.findViewById(R.id.lblSemestre);
            semestra.setText(notas.get(position).getSemestre());

            TextView note = (TextView)item.findViewById(R.id.lblNota);
            note.setText(notas.get(position).getNota());

            ImageView imgNote = (ImageView)item.findViewById(R.id.imgvNota);
            imgNote.setImageResource(notas.get(position).getFotoN());

            return(item);
        }



}
