package com.example.htmlsplashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView pageYangu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pageYangu=findViewById(R.id.webYangu);
        //Kuactivate Javascript
        WebSettings settings =pageYangu.getSettings();
        settings.setJavaScriptEnabled(true);
        //Ensure ni underscore
       pageYangu.loadUrl("file:///android_asset/home.html");
       //Unaezaeka a live website like the case below

       //pageYangu.loadUrl("https://www.emobilis.ac.ke/");
    }
}
