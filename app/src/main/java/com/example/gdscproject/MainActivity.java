package com.example.gdscproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout background;
TextView songtitle;
TextView subtitle;
ImageView darkmood;
TextView p1;
TextView p2;
TextView tt;
SeekBar se;
ProgressBar progressBar;
    boolean isWhite = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        tt = findViewById(R.id.tt);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        background = findViewById( R.id.background);
        darkmood = findViewById(R.id.darkmood);
        subtitle = findViewById(R.id.subtitle);
        se = findViewById(R.id.se);

        songtitle = findViewById(R.id.songtitle);

  progressBar = findViewById(R.id.progressBar);
        se.setProgressTintList(ColorStateList.valueOf(Color.BLUE));

                progressBar.setVisibility(View.VISIBLE);
                progressBar.isActivated();


        darkmood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleBackgroundColor();

            }
        });
    }
    private void toggleBackgroundColor() {
        if (isWhite) {

            background.setBackgroundColor((Color.BLACK));

            songtitle.setTextColor(Color.WHITE);
            p1.setTextColor(Color.WHITE);
            subtitle.setTextColor(Color.WHITE);

            p2.setTextColor(Color.WHITE);
            tt.setTextColor(Color.WHITE);
        } else {
            background.setBackgroundColor(Color.WHITE);
            songtitle.setTextColor(Color.BLACK);
            p1.setTextColor(Color.BLACK);
            subtitle.setTextColor(Color.BLACK);

            p2.setTextColor(Color.BLACK);
            tt.setTextColor(Color.BLACK);
        }
        isWhite = !isWhite;
    }

}