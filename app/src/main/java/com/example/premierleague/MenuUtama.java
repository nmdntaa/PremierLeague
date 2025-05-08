package com.example.premierleague;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuUtama extends AppCompatActivity {

    private Button btnschedule, btnengland, btnlaliga;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        btnengland = findViewById(R.id.btnengland);
        btnlaliga = findViewById(R.id.btnlaliga);

        btnengland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnlaliga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, laLiga.class);
                startActivity(intent);
            }
        });

        };
    }



