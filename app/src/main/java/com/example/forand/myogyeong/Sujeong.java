package com.example.forand.myogyeong;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Sujeong extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sajeong);

        // 내시 등장 애니메이션
        ImageView sujeong_naesi = (ImageView) findViewById(R.id.sujeong_naesi);
        Animation sujeong_naesi_anim = AnimationUtils.loadAnimation(this, R.anim.character_in_anim);
        sujeong_naesi.startAnimation(sujeong_naesi_anim);

        // 대화창 애니메이션
        ImageButton sujeong_dialog = (ImageButton) findViewById(R.id.sujeong_dialog);
        Animation sujeong_dialog_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        sujeong_dialog.startAnimation(sujeong_dialog_anim);

        // 이름표 애니메이션
        ImageView sujeong_nametag = (ImageView) findViewById(R.id.sujeong_nametag);
        Animation sujeong_nametag_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        sujeong_nametag.startAnimation(sujeong_nametag_anim);

        // 이름 애니메이션
        TextView sujeong_name = (TextView) findViewById(R.id.sujeong_name);
        Animation sujeong_name_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        sujeong_name.startAnimation(sujeong_name_anim);

        /// 텍스트 전환
        changeView(i);
        sujeong_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeView(i);
            }
        });
    }

    // 텍스트 전환
    public void changeView(int index){
        TextView tv1 = (TextView) findViewById(R.id.sujeong_naesi_s1);





    }

}
