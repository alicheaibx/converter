package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Tempreture extends AppCompatActivity {
    EditText value1;
    ImageButton bt1, bt2, bt3;
    RadioButton rb,rb1,rb2,rb3;
    String v;
    int v1;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        value1 = findViewById(R.id.v1);
        result = findViewById(R.id.v2);
        bt1 = findViewById(R.id.tempreture);
        bt2 = findViewById(R.id.weight);
        bt3= findViewById(R.id.convert);
        rb= findViewById(R.id.rb);
        rb1= findViewById(R.id.rb1);
        rb2= findViewById(R.id.rb2);
        rb3= findViewById(R.id.rb3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                distance();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });

    }

    private void convert() {
        v=value1.getText().toString();
        v1=Integer.parseInt(v);
        if(rb.isChecked()&&rb2.isChecked()){
            result.setText(String.valueOf(v1));
        }
        if(rb.isChecked()&&rb3.isChecked()){
            v1=v1*(9/5)+32;
            result.setText(String.valueOf(v1));
        }
        if(rb1.isChecked()&&rb2.isChecked()){
            result.setText(String.valueOf((v1-32)*5/9));
        }
        if(rb1.isChecked()&&rb3.isChecked()){
            result.setText(String.valueOf(v1));
        }



    }

    private void distance() {
        Intent intent1 = new Intent(Tempreture.this, Distance.class);
        startActivity(intent1);
        finish();
    }
    private void weight() {
        Intent intent1 = new Intent(Tempreture.this, Weight.class);
        startActivity(intent1);
        finish();
    }
}