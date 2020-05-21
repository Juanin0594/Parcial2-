package com.example.parcial2_barria_martinez_vasquez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText Ced,Pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.InicializaUsuario();
        this.InicializarControles();


    }
    private void InicializarControles(){
        Ced = (EditText)findViewById(R.id.CedId);
        Pass = (EditText)findViewById(R.id.PassId);


    }

    public void InicializaUsuario(){

        String[] roles = {"Estudiante", "Profesor"};


        SharedPreferences pref = null;
                pref = getSharedPreferences("Profesor", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("nombre","Denzel Crocker");
        editor.putString("cedula","4-986-654");
        editor.putString("passw","whatever");
        editor.putString("rol","Profesor");
        editor.commit();

        pref = getSharedPreferences("Estudiante", MODE_PRIVATE);
        SharedPreferences.Editor editor2 = pref.edit();
        editor2.putString("nombre","Timmy Tunner");
        editor2.putString("cedula","2-986-654");
        editor2.putString("passw","fairy");
        editor2.putString("rol","Estudiante");
        editor2.commit();

    }

    private void Ingresar(View view){

        try{
            String CedulaEscrita = Ced.getText().toString();
            String PassEscrita = Ced.getText().toString();
            SharedPreferences pref = null;
            pref = getSharedPreferences("Profesor", MODE_PRIVATE);
            if(CedulaEscrita.equals(pref.getString("cedula",""))&&PassEscrita.equals(pref.getString("passw",""))){
                Intent i = new Intent(this,MainActivity.class);
                i.putExtra("rolereg",pref.getString("rol","N/M"));
                startActivity(i);

            } else {
                pref = getSharedPreferences("Estudiante", MODE_PRIVATE);
                if(CedulaEscrita.equals(pref.getString("cedula",""))&&PassEscrita.equals(pref.getString("passw",""))){
                    Intent i = new Intent(this,MainActivity.class);
                    i.putExtra("rolereg",pref.getString("rol","N/M"));
                    startActivity(i);
                }else {
                    Toast.makeText(this, "Cedula o Contraseña incorrecta ", Toast.LENGTH_SHORT).show();
                }

            }



        }
        catch (Exception e){
            Toast.makeText(this, "Error: "+e.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }

    }
}
