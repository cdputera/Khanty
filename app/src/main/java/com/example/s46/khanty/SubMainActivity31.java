package com.example.s46.khanty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SubMainActivity31 extends AppCompatActivity {

    int a, point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main31);
        question();
        answer();


    }

    public void question() {
        Random rand = new Random();

        int n = rand.nextInt(10) + 1;
        Log.w("TAG", String.valueOf(+n));
        if (n == 1) {
            Log.w("TAG", String.valueOf(+n));
            TextView mTextView = (TextView) findViewById(R.id.textView2);
            mTextView.setText("Pertanyaan 1");
        } else if (n == 2) {
            Log.w("TAG", String.valueOf(+n));
            TextView mTextView = (TextView) findViewById(R.id.textView2);
            mTextView.setText("Pertanyaan 2");
        }


    }

    public void answer() {
        if (a == 1 && point ==1) {
            Log.w("TAG", String.valueOf(+a));
            TextView mTextView = (TextView) findViewById(R.id.textView2);
            mTextView.setText("Pertanyaan 1");
        } else if (a == 2) {
            Log.w("TAG", String.valueOf(+a));
        }
    }
    public void option_a (View v){
        point = 1;
        Log.w("TAG", "a");
    }

    public void option_b (View v){
        point = 2;
        Log.w("TAG", "b");
    }

    public void option_c (View v){
        point = 3;
        Log.w("TAG", "c");
    }

    public void option_d (View v){
        point = 4;
        Log.w("TAG", "d");
    }



}


