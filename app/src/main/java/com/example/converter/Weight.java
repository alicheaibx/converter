package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Weight extends AppCompatActivity {
    EditText value1;
    ImageButton bbt1, bbt2, bbt3;
    RadioButton rb,rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13;
    String v;
    float v1;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whight);
        value1 = findViewById(R.id.v1);
        result = findViewById(R.id.v2);
        bbt1 = findViewById(R.id.tp);
        bbt2 = findViewById(R.id.distance);
        bbt3= findViewById(R.id.convert);
        rb= findViewById(R.id.rb);
        rb1= findViewById(R.id.rb1);
        rb2= findViewById(R.id.rb2);
        rb3= findViewById(R.id.rb3);
        rb4= findViewById(R.id.rb4);
        rb5= findViewById(R.id.rb5);
        rb6= findViewById(R.id.rb6);
        rb7= findViewById(R.id.rb7);
        rb8= findViewById(R.id.rb8);
        rb9= findViewById(R.id.rb9);
        rb10= findViewById(R.id.rb10);
        rb11= findViewById(R.id.rb11);
        rb12= findViewById(R.id.rb12);
        rb13= findViewById(R.id.rb13);
        bbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temperature();
            }
        });
        bbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                distance();
            }
        });
        bbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });

    }

    private void convert() {
        v=value1.getText().toString();
        v1=Float.parseFloat(v);

        if(rb.isChecked()&&rb7.isChecked()){
            result.setText(String.valueOf(v1));

        }
        if(rb.isChecked()&&rb8.isChecked()){
            result.setText(String.valueOf(v1*10));
        }
        if(rb.isChecked()&&rb9.isChecked()){
            result.setText(String.valueOf(v1*100));
        }
        if(rb.isChecked()&&rb10.isChecked()){
            result.setText(String.valueOf(v1*1000));
        }
        if(rb.isChecked()&&rb11.isChecked()){
            result.setText(String.valueOf(v1*10000));
        }
        if(rb.isChecked()&&rb12.isChecked()){
            result.setText(String.valueOf(v1*100000));
        }
        if(rb.isChecked()&&rb13.isChecked()){
            result.setText(String.valueOf(v1*1000000));
        }
        if(rb1.isChecked()&&rb7.isChecked()){
            result.setText(String.valueOf(v1/10));
        }
        if(rb1.isChecked()&&rb8.isChecked()){
            result.setText(String.valueOf(v1));
        }
        if(rb1.isChecked()&&rb9.isChecked()){
            result.setText(String.valueOf(v1*10));
        }
        if(rb1.isChecked()&&rb10.isChecked()){
            result.setText(String.valueOf(v1*100));
        }
        if(rb1.isChecked()&&rb11.isChecked()){
            result.setText(String.valueOf(v1*1000));
        }
        if(rb1.isChecked()&&rb12.isChecked()){
            result.setText(String.valueOf(v1*10000));
        }
        if(rb1.isChecked()&&rb13.isChecked()){
            result.setText(String.valueOf(v1*100000));
        }
        if(rb2.isChecked()&&rb7.isChecked()){
            result.setText(String.valueOf(v1/100));
        }
        if(rb2.isChecked()&&rb8.isChecked()){
            result.setText(String.valueOf(v1/10));
        }
        if(rb2.isChecked()&&rb9.isChecked()){
            result.setText(String.valueOf(v1));
        }
        if(rb2.isChecked()&&rb10.isChecked()){
            result.setText(String.valueOf(v1*10));
        }
        if(rb2.isChecked()&&rb11.isChecked()){
            result.setText(String.valueOf(v1*100));
        }
        if(rb2.isChecked()&&rb12.isChecked()){
            result.setText(String.valueOf(v1*1000));
        }
        if(rb2.isChecked()&&rb13.isChecked()){
            result.setText(String.valueOf(v1*10000));
        }
        if(rb2.isChecked()&&rb7.isChecked()){
            result.setText(String.valueOf(v1/1000));
        }
        if(rb3.isChecked()&&rb8.isChecked()){
            result.setText(String.valueOf(v1/100));
        }
        if(rb3.isChecked()&&rb9.isChecked()){
            result.setText(String.valueOf(v1/10));
        }
        if(rb3.isChecked()&&rb10.isChecked()){
            result.setText(String.valueOf(v1));
        }
        if(rb3.isChecked()&&rb11.isChecked()){
            result.setText(String.valueOf(v1*10));
        }
        if(rb3.isChecked()&&rb12.isChecked()){
            result.setText(String.valueOf(v1*100));
        }
        if(rb3.isChecked()&&rb13.isChecked()){
            result.setText(String.valueOf(v1*1000));
        }
        if(rb4.isChecked()&&rb7.isChecked()){
            result.setText(String.valueOf(v1/10000));
        }
        if(rb4.isChecked()&&rb8.isChecked()){
            result.setText(String.valueOf(v1/1000));
        }
        if(rb4.isChecked()&&rb9.isChecked()){
            result.setText(String.valueOf(v1/100));
        }
        if(rb4.isChecked()&&rb10.isChecked()){
            result.setText(String.valueOf(v1/10));
        }
        if(rb4.isChecked()&&rb11.isChecked()){
            result.setText(String.valueOf(v1));
        }
        if(rb4.isChecked()&&rb12.isChecked()){
            result.setText(String.valueOf(v1*10));
        }
        if(rb4.isChecked()&&rb13.isChecked()){
            result.setText(String.valueOf(v1*100));
        }
        if(rb5.isChecked()&&rb7.isChecked()){
            result.setText(String.valueOf(v1/100000));
        }
        if(rb5.isChecked()&&rb8.isChecked()){
            result.setText(String.valueOf(v1/10000));
        }
        if(rb5.isChecked()&&rb9.isChecked()){
            result.setText(String.valueOf(v1/1000));
        }
        if(rb5.isChecked()&&rb10.isChecked()){
            result.setText(String.valueOf(v1/100));
        }
        if(rb5.isChecked()&&rb11.isChecked()){
            result.setText(String.valueOf(v1/10));
        }
        if(rb5.isChecked()&&rb12.isChecked()){
            result.setText(String.valueOf(v1));
        }
        if(rb5.isChecked()&&rb13.isChecked()){
            result.setText(String.valueOf(v1*10));
        }
        if(rb6.isChecked()&&rb7.isChecked()){
            result.setText(String.valueOf(v1/1000000));
        }
        if(rb6.isChecked()&&rb8.isChecked()){
            result.setText(String.valueOf(v1/100000));
        }
        if(rb6.isChecked()&&rb9.isChecked()){
            result.setText(String.valueOf(v1/10000));
        }
        if(rb6.isChecked()&&rb10.isChecked()){
            result.setText(String.valueOf(v1/1000));
        }
        if(rb6.isChecked()&&rb11.isChecked()){
            result.setText(String.valueOf(v1/100));
        }
        if(rb6.isChecked()&&rb12.isChecked()){
            result.setText(String.valueOf(v1/10));
        }
        if(rb6.isChecked()&&rb13.isChecked()){
            result.setText(String.valueOf(v1));
        }


    }

    private void temperature() {
        Intent intent1 = new Intent(Weight.this, Temperature.class);
        startActivity(intent1);
        finish();
    }
    private void distance() {
        Intent intent1 = new Intent(Weight.this, Distance.class);
        startActivity(intent1);
        finish();
    }
}