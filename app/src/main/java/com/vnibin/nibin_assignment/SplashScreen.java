package com.vnibin.nibin_assignment;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private  static int SPLASH_TIME_OUT=5000;
    ProgressBar mprogressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mprogressBar=(ProgressBar)findViewById(R.id.progressBar);



    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            mprogressBar.setVisibility(View.VISIBLE);
            Intent i=new Intent(SplashScreen.this,MainActivity.class);
            startActivity(i);
            finish();
        }
    },SPLASH_TIME_OUT);



    }
}
