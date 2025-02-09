package com.example.kuiskecilform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Spinner prodiSpinner = findViewById(R.id.prodi);
        String[] prodiOptions = new String[]{"Sistem Informasi", "Dkv", "Teknik Industri", "Teknik Informatika"};
        ArrayAdapter<String> prodiAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, prodiOptions);
        prodiSpinner.setAdapter(prodiAdapter);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}
