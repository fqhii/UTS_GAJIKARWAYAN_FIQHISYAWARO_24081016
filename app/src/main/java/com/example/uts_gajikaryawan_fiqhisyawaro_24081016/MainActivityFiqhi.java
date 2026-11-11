package com.example.uts_gajikaryawan_fiqhisyawaro_24081016;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityFiqhi extends AppCompatActivity {

    Button btnGaji, btnPetunjuk, btnTentang, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fiqhi);

        btnGaji = findViewById(R.id.btnGajiPegawai);
        btnPetunjuk = findViewById(R.id.btnPetunjuk);
        btnTentang = findViewById(R.id.btnTentang);
        btnExit = findViewById(R.id.btnExit);

        btnGaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGaji = new Intent(MainActivityFiqhi.this, GajiActivityFiqhi.class);
                startActivity(intentGaji);
            }
        });

        btnPetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPetunjuk = new Intent(MainActivityFiqhi.this, PetunjukActivityFiqhi.class);
                startActivity(intentPetunjuk);
            }
        });

        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTentang = new Intent(MainActivityFiqhi.this, TentangActivityFiqhi.class);
                startActivity(intentTentang);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}