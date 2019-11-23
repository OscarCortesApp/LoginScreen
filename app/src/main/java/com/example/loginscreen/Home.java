package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        configureNextButton();
    }

    private void configureNextButton() {
        Button btnNotas = (Button) findViewById(R.id.NotasButton); //crear pantalla
        btnNotas.setOnClickListener(new View.OnClickListener(){ //Evento escuchador en click
            @Override
            public void onClick(View view){ //
                startActivity(new Intent(Home.this,NotasScreen.class)); //cambiar de pantalla, queda en pantalla la anterior (una sobre otra)
            }
        });

        Button btnHorario = (Button) findViewById(R.id.horarioButton); //crear pantalla
        btnHorario.setOnClickListener(new View.OnClickListener(){ //Evento escuchador en click
            @Override
            public void onClick(View view){ //
                startActivity(new Intent(Home.this,HorarioActivity.class)); //cambiar de pantalla, queda en pantalla la anterior (una sobre otra)
            }
        });

        Button btnCalendario = (Button) findViewById(R.id.CalendarioButton); //crear pantalla
        btnCalendario.setOnClickListener(new View.OnClickListener(){ //Evento escuchador en click
            @Override
            public void onClick(View view){ //
                //startActivity(new Intent(Home.this,NotasScreen.class)); //cambiar de pantalla, queda en pantalla la anterior (una sobre otra)
            }
        });
    }

}
