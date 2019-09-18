package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SurfaceView sv = findViewById(R.id.surfaceView);
        sv.setBackgroundColor(0xFFFFFFFF);
        //ImageView im = findViewById(R.id.imageView9);
        //im.setVisibility(View.VISIBLE);
    }   //^^ Dr. Tribelhorn tried this to get the avatars to show up but it didn't work
}
