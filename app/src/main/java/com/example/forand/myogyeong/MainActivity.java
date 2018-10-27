package com.example.forand.myogyeong;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // 배경음악
        final SoundPool bgm1 = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        final int drum = bgm1.load(this, R.raw.drum, 1);
        final int meow = bgm1.load(this, R.raw.meow, 1);

        // 고양이 쓰다듬기
        final ImageButton pat_cat = (ImageButton) findViewById(R.id.cat1_main);
        pat_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 고양이 울음소리
                bgm1.play(meow, 1, 1, 1, 0, 1);
                // 화면 전환
                Intent i1 = new Intent(getApplicationContext(), Intro.class);
                startActivity(i1);
            }
        });

        // 타이틀 애니메이션
        ImageView title = (ImageView) findViewById(R.id.title);
        Animation title_anim = AnimationUtils.loadAnimation(this, R.anim.main_title_anim);
        title_anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // 북소리
                bgm1.play(drum, 1, 1, 0, 0, 1);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        title.startAnimation(title_anim);

        // 쓰다듬어 주세요 애니메이션
        TextView pat = (TextView) findViewById(R.id.patme);
        Animation pat_anim = AnimationUtils.loadAnimation(this, R.anim.main_pat_anim);
        pat.startAnimation(pat_anim);

        // 고양이 애니메이션
        Animation cat_anim = AnimationUtils.loadAnimation(this, R.anim.main_cat_anim);
        cat_anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation cat_anim_move = AnimationUtils.loadAnimation(MainActivity.this, R.anim.main_cat_anim_move);
                pat_cat.startAnimation(cat_anim_move);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        pat_cat.startAnimation(cat_anim);
    }

}
