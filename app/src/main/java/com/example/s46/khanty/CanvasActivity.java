package com.example.s46.khanty;

import android.app.Activity;
import android.content.Intent;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.Prediction;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class CanvasActivity extends Activity {


    ImageView pr, left, right;
    int letKey = 1;


    private GestureLibrary gLibrary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

       gLibrary = GestureLibraries.fromRawResource(this, R.raw.gesture);
        gLibrary.load();
        GestureOverlayView gOverlay = (GestureOverlayView) findViewById(R.id.gOverlay);
        gOverlay.addOnGesturePerformedListener(handleGestureListener);



    }




    public OnGesturePerformedListener handleGestureListener = new OnGesturePerformedListener() {
        @Override
        public void onGesturePerformed(GestureOverlayView gestureView,
                                       Gesture gesture) {

            ArrayList<Prediction> predictions = gLibrary.recognize(gesture);
            Log.w("TAG", "predict");

            Intent j = getIntent();
            int key = j.getIntExtra("id", 0);

            if (predictions.size() > 0 && predictions.get(0).score > 1.0) {
                Double score = predictions.get(0).score;
                String name = predictions.get(0).name;
                Log.w("TAG", name);
                Log.w("TAG", String.valueOf(score));

                //Toast.makeText(CanvasActivity.this, action,
                            //Toast.LENGTH_SHORT).show();
                if (name.equals("a") && key ==1){
                    Toast.makeText(CanvasActivity.this, "alif",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("b") && key ==2){
                    Toast.makeText(CanvasActivity.this, "ba",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("t") && key ==3){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("tsa") && key ==4){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("ja") && key ==5){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("kha") && key ==6){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("kho") && key ==7){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("dal") && key ==8){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("dzal") && key ==9){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("ra") && key ==10){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("za") && key ==11){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("sin") && key ==12){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("syin") && key ==13){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("shod") && key ==14){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("dhod") && key ==15){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("tho") && key ==16){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("dhlo") && key ==17){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("'ain") && key ==18){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("ghoin") && key ==19){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("fa") && key ==20){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("qof") && key ==21){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("kaf") && key ==22){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("lam") && key ==23){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("mim") && key ==24){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("nun") && key ==25){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("waw") && key ==26){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("ha") && key ==27){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("lam-alif") && key ==28){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("hamzah") && key ==29){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
                else if (name.equals("ya") && key ==30){
                    Toast.makeText(CanvasActivity.this, "haloo",
                            Toast.LENGTH_SHORT).show();
                    Log.w("TAG", name);
                    Log.w("TAG", String.valueOf(score));
                    Log.w("TAG", String.valueOf(key));
                }
            }

            else {
                    Toast.makeText(CanvasActivity.this, "Gambar salah, silahkan coba lagi",
                            Toast.LENGTH_SHORT).show();


                    Log.w("TAG", "salah");
                }



            /*
            // one prediction needed
            if (predictions.size() > 0) {
                Prediction prediction = predictions.get(0);
                // checking prediction
                if (prediction.score > 1.0) {
                    // and action
                    Toast.makeText(CanvasActivity.this, prediction.name,
                            Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(CanvasActivity.this, "Gambar salah, silahkan coba lagi",
                            Toast.LENGTH_SHORT).show();

                    Log.w("TAG", "salah");
                }
            }*/
        }
    };
}