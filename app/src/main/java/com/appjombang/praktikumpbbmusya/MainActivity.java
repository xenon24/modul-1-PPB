package com.appjombang.praktikumpbbmusya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    }
}