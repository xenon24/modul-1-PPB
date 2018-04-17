package com.appjombang.praktikumpbbmusya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsatu = (Button) findViewById(R.id.btnmodulsatu);
        btnsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent btgree = new Intent(getApplicationContext(),ShowGreeting.class);
                startActivity(btgree);
            }
        });

        Button btndua = (Button) findViewById (R.id.btnmoduldua);
        btndua.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mdldua = new Intent (getApplicationContext(),ModulDua.class );
                startActivity(mdldua);
            }
        } );

        Button btntiga = (Button) findViewById (R.id.btnmodultiga);
        btntiga.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mdltiga = new Intent (getApplicationContext(),ModulTiga.class );
                startActivity(mdltiga);
            }
        } );

        Button btnempat = (Button) findViewById (R.id.btnmodulempat);
        btnempat.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mdlempat = new Intent (getApplicationContext(),ModulEmpat.class);
                startActivity(mdlempat);
            }
        } );

    }
}
