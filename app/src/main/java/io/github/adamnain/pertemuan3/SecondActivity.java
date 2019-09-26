package io.github.adamnain.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvHasil, tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvHasil = findViewById(R.id.tv_hasil);
        tvNama = findViewById(R.id.tv_nama);

        Intent i = getIntent();
        String jumlah = i.getStringExtra("jumlah");
        String nama = i.getStringExtra("nama");

        tvHasil.setText(jumlah);
        tvNama.setText(nama);
    }
}
