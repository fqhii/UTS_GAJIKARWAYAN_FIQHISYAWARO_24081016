// Nama : Fiqhi Syawaro
// NIM  : 24081016

package com.example.uts_gajikaryawan_fiqhisyawaro_24081016;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class GajiActivityFiqhi extends AppCompatActivity {

    EditText etNik, etNama, etGajiPokok, etTunjJabatan, etHariKerja;
    TextView tvMakan, tvTransport, tvGajiKotor, tvGajiBersih;
    Button btnHitung, btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_fiqhi);

        etNik = findViewById(R.id.etNik);
        etNama = findViewById(R.id.etNama);
        etGajiPokok = findViewById(R.id.etGajiPokok);
        etTunjJabatan = findViewById(R.id.etTunjanganJabatan);
        etHariKerja = findViewById(R.id.etHariKerja);

        tvMakan = findViewById(R.id.tvTunjanganMakan);
        tvTransport = findViewById(R.id.tvTunjanganTransport);
        tvGajiKotor = findViewById(R.id.tvGajiKotor);
        tvGajiBersih = findViewById(R.id.tvGajiBersih);

        btnHitung = findViewById(R.id.btnHitung);
        btnKembali = findViewById(R.id.btnKembaliGaji);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etGajiPokok.getText().toString().isEmpty() || etHariKerja.getText().toString().isEmpty() || etTunjJabatan.getText().toString().isEmpty()) {
                    Toast.makeText(GajiActivityFiqhi.this, "Lengkapi nominal Gaji, Tunjangan Jabatan, dan Hari Kerja", Toast.LENGTH_SHORT).show();
                    return;
                }

                double gajiPokok = Double.parseDouble(etGajiPokok.getText().toString());
                double tunjJabatan = Double.parseDouble(etTunjJabatan.getText().toString());
                int hariKerja = Integer.parseInt(etHariKerja.getText().toString());


                double makan = hariKerja * 10000;

                double transport = hariKerja * 5000;

                double gajiKotor = gajiPokok + tunjJabatan + makan + transport;

                double pajak = gajiKotor * 0.10;
                double gajiBersih = gajiKotor - pajak;

                tvMakan.setText("Tunjangan Makan: Rp. " + makan);
                tvTransport.setText("Tunjangan Transportasi: Rp. " + transport);
                tvGajiKotor.setText("Gaji Kotor: Rp. " + gajiKotor);
                tvGajiBersih.setText("Gaji Bersih: Rp. " + gajiBersih);
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}