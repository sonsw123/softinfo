package com.example.softinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Sel_Btn_1;
    private Button Sel_Btn_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sel_Btn_1 = findViewById(R.id.Sel_Btn_1);
        Sel_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity001.class);
                startActivity(intent);
            }
        });

        Sel_Btn_2 = findViewById(R.id.Sel_Btn_2);
        Sel_Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity00.class);
                startActivity(intent);
            }
        });

    }


}