package com.example.s46.khanty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Radio extends AppCompatActivity {
    private static RadioGroup radio_g;
    private static RadioButton r1, r2, r3;
    private static Button button_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
    }
}
