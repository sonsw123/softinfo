package com.example.softinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Pr_Btn_1;
    Button Pr_Btn_2;
    Button Pr_Btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pr_Btn_1 = (Button)findViewById(R.id.Pr_Btn_1);
        Pr_Btn_2 = (Button)findViewById(R.id.Pr_Btn_2);
        Pr_Btn_3 = (Button)findViewById(R.id.Pr_Btn_3);

        Pr_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}