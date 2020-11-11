package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton b1;
ImageButton b2;
ImageButton b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.tempreture);
        b2=findViewById(R.id.distance);
        b3=findViewById(R.id.weight);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temperature();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                distance();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight();
            }
        });
    }

    private void weight() {
        Intent intent1 = new Intent(MainActivity.this, Weight.class);
        startActivity(intent1);

    }

    private void distance() {
        Intent intent1 = new Intent(MainActivity.this, Distance.class);
        startActivity(intent1);

    }

    private void temperature() {
        Intent intent1 = new Intent(MainActivity.this, Tempreture.class);
        startActivity(intent1);
    }

}
