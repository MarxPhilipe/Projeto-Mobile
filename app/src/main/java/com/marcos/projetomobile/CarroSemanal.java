package com.marcos.projetomobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CarroSemanal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_semanal);
        getSupportActionBar().hide();
    }
}