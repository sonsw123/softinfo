package com.example.softinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity001 extends AppCompatActivity {

    private Button Sub_Btn_1;
    private Button Sub_Btn_2;
    private Button Sub_Btn_3;
    private Button Sub_Btn_4;
    private Button Sub_Btn_5;
    private Button Sub_Btn_6;
    private Button Sub_Btn_7;
    private Button Sub_Btn_8;
    private Button Sub_Btn_9;
    private Button Sub_Btn_10;
    private Button Sub_Btn_11;
    private Button Sub_Btn_12;
    private Button Sub_Btn_13;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main001);

        Sub_Btn_1 = findViewById(R.id.Sub_Btn_1);
        Sub_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        Sub_Btn_2 = findViewById(R.id.Sub_Btn_2);
        Sub_Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        Sub_Btn_3 = findViewById(R.id.Sub_Btn_3);
        Sub_Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        Sub_Btn_4 = findViewById(R.id.Sub_Btn_4);
        Sub_Btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        Sub_Btn_5 = findViewById(R.id.Sub_Btn_5);
        Sub_Btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        Sub_Btn_6 = findViewById(R.id.Sub_Btn_6);
        Sub_Btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity7.class);
                startActivity(intent);
            }
        });

        Sub_Btn_7 = findViewById(R.id.Sub_Btn_7);
        Sub_Btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        Sub_Btn_8 = findViewById(R.id.Sub_Btn_8);
        Sub_Btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity9.class);
                startActivity(intent);
            }
        });

        Sub_Btn_9 = findViewById(R.id.Sub_Btn_9);
        Sub_Btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        Sub_Btn_10 = findViewById(R.id.Sub_Btn_10);
        Sub_Btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity11.class);
                startActivity(intent);
            }
        });

        Sub_Btn_11 = findViewById(R.id.Sub_Btn_11);
        Sub_Btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity12.class);
                startActivity(intent);
            }
        });

        Sub_Btn_12 = findViewById(R.id.Sub_Btn_12);
        Sub_Btn_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity13.class);
                startActivity(intent);
            }
        });

        Sub_Btn_13 = findViewById(R.id.Sub_Btn_13);
        Sub_Btn_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity001.this, MainActivity14.class);
                startActivity(intent);
            }
        });
    }


}