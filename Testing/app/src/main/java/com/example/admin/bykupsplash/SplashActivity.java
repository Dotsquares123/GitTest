package com.example.admin.bykupsplash;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.admin.R;

/**
 * Created by admin on 03-10-2016.
 */

public class SplashActivity extends AppCompatActivity {

    private ImageView imvStart;
    private ImageView imvEnd;
    private ImageView imvRidee;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imvStart = (ImageView) findViewById(R.id.imvStart);
        imvEnd = (ImageView) findViewById(R.id.imvEnd);
        imvRidee = (ImageView) findViewById(R.id.imvRidee);

        final Animation startMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.start_move);
        final Animation endMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.end_move);

        startMove.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imvEnd.setVisibility(View.VISIBLE);
                        imvStart.setVisibility(View.GONE);
                        imvRidee.setVisibility(View.GONE);
                        imvEnd.startAnimation(endMove);
                    }
                }, 1000);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        endMove.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                imvStart.setVisibility(View.VISIBLE);
                imvEnd.setVisibility(View.GONE);
                imvRidee.setVisibility(View.VISIBLE);
                imvStart.startAnimation(startMove);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        imvStart.setVisibility(View.VISIBLE);
        imvStart.startAnimation(startMove);
    }
}
