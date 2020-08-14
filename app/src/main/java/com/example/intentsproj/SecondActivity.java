package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num3, num4;
    Button add, sub, mul, dev;
    String number1, number2;
    TextView txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num3 = findViewById(R.id.editTextNumber3);
        num4 = findViewById(R.id.editTextNumber4);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        dev = findViewById(R.id.dev);
        txtAnswer = findViewById(R.id.answer);

        Intent intent = getIntent();
        number1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        number2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);

        num3.setText(number1);
        num4.setText(number2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer;
                answer = Integer.parseInt(number1) + Integer.parseInt(number2);
                txtAnswer.setText(String.valueOf(answer));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer;
                answer = Integer.parseInt(number1) - Integer.parseInt(number2);
                txtAnswer.setText(String.valueOf(answer));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer;
                answer = Integer.parseInt(number1) * Integer.parseInt(number2);
                txtAnswer.setText(String.valueOf(answer));
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double answer;
                answer = Double.parseDouble(number1) / Double.parseDouble(number2);
                txtAnswer.setText(String.valueOf(answer));
            }
        });
    }

}