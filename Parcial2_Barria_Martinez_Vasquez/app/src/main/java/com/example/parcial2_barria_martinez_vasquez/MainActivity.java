package com.example.parcial2_barria_martinez_vasquez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup Op;
    TextView Rol;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InicializarControles();
        Intent i = getIntent();
        Rol.setText(i.getStringExtra("rolereg"));
    }

    private void InicializarControles(){
        Op = (RadioGroup) findViewById(R.id.rgOpciones);
        Rol = (TextView) findViewById(R.id.txtRol);

    }

    public void Entrar (View view){

        try {
            switch (Op.getCheckedRadioButtonId()) {
                case R.id.rbtRol:
                    Intent m ;
                    //if() // FALTA ESTO
                    break;
                case R.id.rbtUtp:
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.utp.ac.pa/"));
                    startActivity(i);
                    break;
                case R.id.rbtEcampus:
                    Intent x = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ecampus.utp.ac.pa/moodle/")); // El intent esta raro
                    startActivity(x);
                    break;

            }

        }  catch (Exception e) {
            Toast.makeText(this, "Error: " + e.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }



    }
}
