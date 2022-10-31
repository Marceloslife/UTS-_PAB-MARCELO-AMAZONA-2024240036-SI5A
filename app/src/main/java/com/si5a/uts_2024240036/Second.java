package com.si5a.uts_2024240036;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView tvNamaLengkap, tvNoPendaftaran, tvJalurp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        tvNamaLengkap = findViewById(R.id.tv_nama);
        tvNoPendaftaran = findViewById(R.id.tv_no_pend);
        tvJalurp = findViewById(R.id.tv_jalur);

        Intent ambil = getIntent();
        tvNamaLengkap.setText(ambil.getStringExtra("vrNama"));
        tvNoPendaftaran.setText(ambil.getStringExtra("vrNoPend"));
        tvJalurp.setText(ambil.getStringExtra("varSpinr"));

    }
}