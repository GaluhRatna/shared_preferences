package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Mainactivity extends AppCompatActivity {

    private Button hitung, nest, fargment;
    private Edittest panjang, lebar, tinggi;
    private TextView hasil;

protected void onCreate(Bundle saveInstanceState) {
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);

    fragment = (Button) findViewById(R.id.btnFragment);
    hitung = (Button findViewById(R.id.btnHitung);
    next = (Button) findViewById(R.id.btnNext);


fragment.setOnClickListener(newView.OnClickListener() {
    @Override
    publik void onClick(View v) {
        intent sample = new Intent (packageContext MainActivity.this, Fragmentactivity.class);
        startActivity(sample);
        }
    }
});