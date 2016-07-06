package com.example.s46.khanty;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        View rootView = getWindow().getDecorView().findViewById(android.R.id.content);


    }

    public void cap(View v) {
        getScreenShot();
        Log.w("TAG", "screenshot");
    };

    public void shr(View v) {
        //openScreenshot();
        Log.w("TAG", "share");
    }


    public void getScreenShot() {
        Log.w("TAG", "screenshot");
        Date now = new Date();
        android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);
        try {
        String dirPath = Environment.getExternalStorageDirectory().toString() + "/PICTURES/Screenshots/" + now + ".jpg";
        Log.w("TAG", String.valueOf(dirPath));

        View rootView = getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(rootView.getDrawingCache());
        rootView.setDrawingCacheEnabled(false);

        File imageFile = new File(dirPath);

            Log.w("TAG", String.valueOf(imageFile));

            FileOutputStream fOut = new FileOutputStream(imageFile);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, fOut);
            fOut.flush();
            fOut.close();

            MediaScannerConnection.scanFile(this,
                    new String[]{imageFile.toString()}, null,
                    new MediaScannerConnection.OnScanCompletedListener() {
                        public void onScanCompleted(String path, Uri uri) {
                            Log.i("ExternalStorage", "Scanned " + path + ":");
                            Log.i("ExternalStorage", "-> uri=" + uri);
                        }
                    });
                openScreenshot(imageFile);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void openScreenshot(File imageFile) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        Uri uri = Uri.fromFile(imageFile);
        intent.setDataAndType(uri, "image/*");
        startActivity(intent);
    }

    private void shareImage() {
        Uri uri = Uri.fromFile(new File("/Screenshots/hasil.jpg"));

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("image/*");

        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "");
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(intent, "Share Screenshot"));
    }

}
