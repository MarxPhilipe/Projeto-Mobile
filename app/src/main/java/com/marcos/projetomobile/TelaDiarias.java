package com.marcos.projetomobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelaDiarias extends AppCompatActivity {

    private FloatingActionButton bt_planosmensais;
    private Button bt_diarias_moto;
    private Button bt_diarias_carro;
    private Button bt_diarias_van;


    public TelaDiarias() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_diarias);

        getSupportActionBar().hide();
        IniciarComponentes();

        bt_planosmensais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaDiarias.this,TelaMensais.class);
                startActivity(intent);
            }
        });

        bt_diarias_moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaDiarias.this,MotoDiaria.class);
                startActivity(intent);
            }
        });

        bt_diarias_carro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaDiarias.this,CarroDiaria.class);
                startActivity(intent);
            }
        });

        bt_diarias_van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaDiarias.this,VanDiaria.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){

        bt_planosmensais = findViewById(R.id.bt_planosmensais);
        bt_diarias_moto = findViewById(R.id.bt_diarias_moto);
        bt_diarias_carro = findViewById(R.id.bt_diarias_carro);
        bt_diarias_van = findViewById(R.id.bt_diarias_van);
    }
}