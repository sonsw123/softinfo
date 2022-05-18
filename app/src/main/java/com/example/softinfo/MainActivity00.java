package com.example.softinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity00 extends AppCompatActivity {

    Button Num_Btn_1;
    Button Num_Btn_2;
    Button Num_Btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main00);

        Num_Btn_1 = (Button)findViewById(R.id.Num_Btn_1);
        Num_Btn_2 = (Button)findViewById(R.id.Num_Btn_2);
        Num_Btn_3 = (Button)findViewById(R.id.Num_Btn_3);

        Num_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "02-940-5120");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"전화번호가 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Num_Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "02-940-5210");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"전화번호가 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Num_Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "02-940-5144");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"전화번호가 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}