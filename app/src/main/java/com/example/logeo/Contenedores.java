package com.example.logeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class Contenedores extends AppCompatActivity {

    private Button plasticos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedores);

        plasticos = (Button)findViewById(R.id.Plasticos);

        plasticos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contenedores.this,MapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
