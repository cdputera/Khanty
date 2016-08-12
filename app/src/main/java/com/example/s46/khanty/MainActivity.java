package com.example.s46.khanty;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    int k = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void menu1(View v) {
        Intent a = new Intent(MainActivity.this, MainActivity1.class);
        startActivity(a);
    }

    public void menu2(View v) {
        Intent a = new Intent(MainActivity.this, Quiz2.class);
        startActivity(a);
    }

    public void menu3(View v) {
        Intent a = new Intent(MainActivity.this, Quiz2.class);
        startActivity(a);
    }
}





