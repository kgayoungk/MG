package com.example.forand.myogyeong;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_intro);

        // 인트로 애니메이션
        TextView intro_txt1 = (TextView) findViewById(R.id.intro_txt1);
        Animation intro_anim1 = AnimationUtils.loadAnimation(this, R.anim.intro_anim);
        intro_txt1.startAnimation(intro_anim1);

        TextView intro_txt2 = (TextView) findViewById(R.id.intro_txt2);
        Animation intro_anim2 = AnimationUtils.loadAnimation(this, R.anim.intro_anim2);
        intro_txt2.startAnimation(intro_anim2);

        // 화면 자동 전환
        Handler myHandler = new Handler();
        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i2 = new Intent(Intro.this, SajeongIn.class);
                startActivity(i2);
                finish();
            }
        }, 13500);

        // 배경음악
    }

}
