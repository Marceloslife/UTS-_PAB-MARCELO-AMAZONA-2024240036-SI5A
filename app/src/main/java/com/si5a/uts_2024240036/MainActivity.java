package com.si5a.uts_2024240036;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText etNamaLengkap,etNp;
private CheckBox checkBoxmeat;
private Spinner sp1;
private Button btn;
private String nama,nomorpendaftaran,spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etNp          = findViewById(R.id.et_np);
        checkBoxmeat  = findViewById(R.id.checkbox_meat);
        sp1       = findViewById(R.id.spinner1);
        btn      = findViewById(R.id.btn_daftar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            nama = etNamaLengkap.getText().toString();
            nomorpendaftaran = etNp.getText().toString();
            spinner          =  sp1.getSelectedItem().toString();
            if(nomorpendaftaran.trim().equals("")){
                etNp. setError("Set error!");
            }
            else if (nama.trim().equals("")){
                etNamaLengkap. setError("Set error!");
            }
            else if (spinner.trim().equals("jalur Pendaftaran")){
                Toast.makeText(MainActivity.this, "pilih jalur pendaftaran!", Toast.LENGTH_SHORT).show();
            }
            else if (!(checkBoxmeat.isChecked())){
                    Toast.makeText(MainActivity.this, "check box belum dicentang", Toast.LENGTH_SHORT).show();
                }
            else {
                Intent intent = new
                        Intent(MainActivity.this, Second.class);
                startActivity(intent);
                }
            }
        });




    }
}