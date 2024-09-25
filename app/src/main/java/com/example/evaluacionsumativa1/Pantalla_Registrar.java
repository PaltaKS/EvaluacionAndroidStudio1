package com.example.evaluacionsumativa1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla_Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar);


        Button buttonToSecond = findViewById(R.id.btnCancelar);

        buttonToSecond.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Pantalla_Registrar.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}