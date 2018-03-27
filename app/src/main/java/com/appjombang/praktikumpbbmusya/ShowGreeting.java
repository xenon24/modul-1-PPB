package com.appjombang.praktikumpbbmusya;

/**
 * Created by Musya Rizal on 3/27/2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ShowGreeting extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_greetingshow);

        Button btshow = (Button) findViewById(R.id.showmodulsatu);
        btshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent modulsatu = new Intent(getApplicationContext(),ModulSatu.class);
                Toast.makeText(ShowGreeting.this, "Hallo Muhammad Syaiful Rizal Nim Kamu 140411100054 Selamat Berbahagia Hari ini", Toast.LENGTH_SHORT).show();
                startActivity(modulsatu);

            }
        });

    }
}
