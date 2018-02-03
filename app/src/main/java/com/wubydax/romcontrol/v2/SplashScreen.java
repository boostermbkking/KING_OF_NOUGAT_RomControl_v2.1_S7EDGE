package com.wubydax.romcontrol.v2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

/**
 * Created by boostermbkking on 02/02/2018.
 */

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(2000)
                .withBackgroundResource(android.R.color.holo_blue_dark)
                .withBackgroundColor(Color.parseColor("#ff273238"))
                .withLogo(R.drawable.logobig)
                .withHeaderText("KING OF NOUGAT")
                .withFooterText("Copyright 2018");



        //change text color
        config.getHeaderTextView().setTextColor(Color.parseColor("#009184"));
        config.getFooterTextView().setTextColor(Color.parseColor("#009184"));

        //finally create the view
        View easySplashScreenView = config.create();
        setContentView(easySplashScreenView);
    }
}
