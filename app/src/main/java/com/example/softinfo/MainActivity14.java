package com.example.softinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity14 extends AppCompatActivity {

    Button Pr_Btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        Pr_Btn_1 = (Button)findViewById(R.id.Pr_Btn_1);

        Pr_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "tomato9247@naver.com");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}