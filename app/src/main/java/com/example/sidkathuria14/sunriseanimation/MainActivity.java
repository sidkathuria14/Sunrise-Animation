package com.example.sidkathuria14.sunriseanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static android.media.CamcorderProfile.get;

public class MainActivity extends AppCompatActivity {

    Animation up,fadeIn,fadeOut,background_fade;
    RelativeLayout light_mountain,layout,mountain_layout,background_layout,sun,yellow_background;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView)findViewById(R.id.img_sun);
//        layout = (RelativeLayout)findViewById(R.id.);
        mountain_layout = (RelativeLayout)findViewById(R.id.mountain_layout);
//        light_mountain = (RelativeLayout)findViewById(R.id.light_mountain);
        yellow_background = (RelativeLayout)findViewById(R.id.yellow_background) ;


//        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
//          light_mountain.startAnimation(fadeIn);

        fadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
          mountain_layout.startAnimation(fadeOut);
        fadeOut.setFillAfter(true);

        up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_anim);
        image.startAnimation(up);
        up.setFillAfter(true);

        background_fade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.background_fadein);
        yellow_background.startAnimation(background_fade);
    }
}