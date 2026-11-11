package com.example.uts_gajikaryawan_fiqhisyawaro_24081016;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TentangActivityFiqhi extends AppCompatActivity {

    Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_fiqhi);

        btnKembali = findViewById(R.id.btnKembaliTentang);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}