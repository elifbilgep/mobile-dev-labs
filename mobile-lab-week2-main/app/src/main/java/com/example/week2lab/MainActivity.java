package com.example.week2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArrayAdapter;
    Button btnCustomArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArrayAdapter = findViewById(R.id.btnArrayAdapter);
        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this ,ArrayAdapterActivity.class );
                startActivity(intent);
            }
        });

        btnCustomArrayAdapter = findViewById(R.id.btnCustomAdapter);
        btnCustomArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this ,CustomAdapterActivity.class );
                startActivity(intent);
            }
        });

    }
}