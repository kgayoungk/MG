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

public class Hyangwon extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sajeong);

        // 태양이 등장 애니메이션
        ImageView hyangwon_cat3 = (ImageView) findViewById(R.id.hyangwon_cat3);
        Animation hyangwon_cat3_anim = AnimationUtils.loadAnimation(this, R.anim.character_in_anim);
        hyangwon_cat3.startAnimation(hyangwon_cat3_anim);

        // 대화창 애니메이션
        ImageButton hyangwon_dialog = (ImageButton) findViewById(R.id.hyangwon_dialog);
        Animation hyangwon_dialog_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        hyangwon_dialog.startAnimation(hyangwon_dialog_anim);

        // 이름표 애니메이션
        ImageView hyangwon_nametag = (ImageView) findViewById(R.id.hyangwon_nametag);
        Animation hyangwon_nametag_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        hyangwon_nametag.startAnimation(hyangwon_nametag_anim);

        // 이름 애니메이션
        TextView hyangwon_name = (TextView) findViewById(R.id.hyangwon_name);
        Animation hyangwon_name_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        hyangwon_name.startAnimation(hyangwon_name_anim);

        /// 텍스트 전환
        changeView(i);
        hyangwon_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeView(i);
            }
        });
    }

    // 텍스트 전환
    public void changeView(int index){
        TextView tv1 = (TextView) findViewById(R.id.hyangwon_cat3_s1);





    }

}
