package com.example.parcial2_barria_martinez_vasquez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.parcial2_barria_martinez_vasquez.entidades.Historial;

import java.util.ArrayList;
import java.util.List;

public class EstudianteActivity extends AppCompatActivity {
 ListView lstHistorial;
 TextView Nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        this.InicializarControles();
    }
    private  void InicializarControles(){

        lstHistorial = (ListView)findViewById(R.id.lvEstudiante);
        Nombre = (TextView)findViewById(R.id.lblEstudiante);
    }

    private void LoadList(){
        List <Historial> notas = new ArrayList<Historial>();

    }
}
