package com.example.evaluacionsumativa1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToSecond = findViewById(R.id.btnIngresa);

        buttonToSecond.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
            Intent intent = new Intent(MainActivity.this, Pantalla_Registrar.class);
            startActivity(intent);
            }
        });


    }
}