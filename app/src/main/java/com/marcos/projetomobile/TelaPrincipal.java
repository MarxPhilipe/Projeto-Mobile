package com.marcos.projetomobile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class TelaPrincipal extends AppCompatActivity {
    ViewPager viewPager;
    private TextView text_tpprecos;
    private ImageView bt_perfilusuario;
    private TextView text_tpsaibamais;
    private TextView text_tpmapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        getSupportActionBar().hide();
        Iniciarcomponentes();

        text_tpmapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse
                        ("https://www.google.com.br/maps/place/Park+Facil+Estacionamento+e+Lava+Rapido+Ltda/@-23.5236798,-46.7827629,12z/data=!4m10!1m2!2m1!1sfacil+park!3m6!1s0x94ce57f79e0799e1:0x38e5d333d78420ae!8m2!3d-23.53384!4d-46.6728664!15sCgpmYWNpbCBwYXJrkgEOcGFya2luZ19nYXJhZ2XgAQA!16s%2Fg%2F11b7y71455"));
                startActivity(intent);
            }
        });

        text_tpsaibamais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaPrincipal.this, com.marcos.projetomobile.SaibaMais.class);
                startActivity(intent);
            }
        });

        text_tpprecos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(TelaPrincipal.this, com.marcos.projetomobile.TelaDiarias.class);
                startActivity(intent);
            }
        });
        bt_perfilusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, com.marcos.projetomobile.TelaUsuario.class);
                startActivity(intent);
            }
        });
    }

    private void Iniciarcomponentes(){
        text_tpprecos = findViewById(R.id.text_tpprecos);
        bt_perfilusuario = findViewById(R.id.bt_perfilusuario);
        text_tpsaibamais = findViewById(R.id.text_tpsaibamais);
        text_tpmapa = findViewById(R.id.text_tpmapa);
    }
}