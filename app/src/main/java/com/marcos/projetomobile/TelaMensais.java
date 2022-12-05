package com.marcos.projetomobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TelaMensais extends AppCompatActivity {
    private Button bt_moto_semanal;
    private Button bt_carro_semanal;
    private Button bt_van_semanal;
    private Button bt_moto_mensal;
    private Button bt_carro_mensal;
    private Button bt_van_mensal;

    public TelaMensais (){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_mensais);

        getSupportActionBar().hide();
        IniciarComponentes();

        bt_moto_semanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaMensais.this,MotoSemanal.class);
                startActivity(intent);
            }
        });

        bt_carro_semanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaMensais.this,CarroSemanal.class);
                startActivity(intent);
            }
        });

        bt_van_semanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaMensais.this,VanSemanal.class);
                startActivity(intent);
            }
        });

        bt_moto_mensal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaMensais.this,MotoMensal.class);
                startActivity(intent);
            }
        });

        bt_carro_mensal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaMensais.this,CarroMensal.class);
                startActivity(intent);
            }
        });

        bt_van_mensal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaMensais.this,VanMensal.class);
                startActivity(intent);
            }
        });

    }
    private void IniciarComponentes() {
        bt_moto_semanal = findViewById(R.id.bt_moto_semanal);
        bt_carro_semanal = findViewById(R.id.bt_carro_semanal);
        bt_van_semanal = findViewById(R.id.bt_van_semanal);
        bt_moto_mensal = findViewById(R.id.bt_moto_mensal);
        bt_carro_mensal = findViewById(R.id.bt_carro_mensal);
        bt_van_mensal = findViewById(R.id.bt_van_mensal);
    }
}
