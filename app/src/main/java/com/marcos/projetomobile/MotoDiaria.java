package com.marcos.projetomobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MotoDiaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto_diaria);

        getSupportActionBar().hide();
    }
}