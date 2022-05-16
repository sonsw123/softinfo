package com.example.softinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button Pr_Btn_1;
    Button Pr_Btn_2;
    Button Pr_Btn_3;
    Button Pr_Btn_4;
    Button Pr_Btn_5;
    Button Pr_Btn_6;
    Button Pr_Btn_7;
    Button Pr_Btn_8;
    Button Pr_Btn_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Pr_Btn_1 = (Button)findViewById(R.id.Pr_Btn_1);
        Pr_Btn_2 = (Button)findViewById(R.id.Pr_Btn_2);
        Pr_Btn_3 = (Button)findViewById(R.id.Pr_Btn_3);
        Pr_Btn_4 = (Button)findViewById(R.id.Pr_Btn_4);
        Pr_Btn_5 = (Button)findViewById(R.id.Pr_Btn_5);
        Pr_Btn_6 = (Button)findViewById(R.id.Pr_Btn_6);
        Pr_Btn_7 = (Button)findViewById(R.id.Pr_Btn_7);
        Pr_Btn_8 = (Button)findViewById(R.id.Pr_Btn_8);
        Pr_Btn_9 = (Button)findViewById(R.id.Pr_Btn_9);

        Pr_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "ljhar@kw.ac.kr");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "deer9988@hanmail.net");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "astokaze@naver.com");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "letters0514@naver.com");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "ssje07@naver.com");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "kwsomang@naver.com");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "kupsiwoo@naver.com");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "bbr2004@hanmail.net");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Pr_Btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("label", "gabalson@hanmail.net");

                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"이메일이 복사되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}