package com.marcos.projetomobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MotoSemanal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto_semanal);
        getSupportActionBar().hide();
    }
}