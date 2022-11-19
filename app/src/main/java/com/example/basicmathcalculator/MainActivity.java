package com.example.basicmathcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView addition = findViewById(R.id.textViewHeader2);
        TextView subtraction = findViewById(R.id.textViewHeader3);
        TextView multiply = findViewById(R.id.textViewHeader4);
        TextView divide = findViewById(R.id.textViewHeader5);
        TextView percentage = findViewById(R.id.textViewHeader6);
        TextView celsius = findViewById(R.id.textViewHeader7);
        TextView fahrenheit = findViewById(R.id.textViewHeader8);


        addition.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, addition.class);
                startActivity(intent);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, subraction.class);
                startActivity(intent);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, multiply.class);
                startActivity(intent);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, division.class);
                startActivity(intent);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, percentage.class);
                startActivity(intent);
            }
        });

        celsius.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, celsius.class);
                startActivity(intent);
            }
        });

        fahrenheit.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fahrenheit.class);
                startActivity(intent);
            }
        });


    }
}