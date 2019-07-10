package com.example.htmlsplashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread splash= new Thread(){
            @Override
            public void run() {
                //Tell it to sleep ndo idelay
                try {
                    sleep(2000);
                    Intent enda= new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(enda);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splash.start();
    }
}
