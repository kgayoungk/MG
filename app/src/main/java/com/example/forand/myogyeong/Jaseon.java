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

public class Jaseon extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sajeong);

        // 세자 등장 애니메이션
        ImageView jaseon_seja = (ImageView) findViewById(R.id.jaseon_seja);
        Animation jaseon_seja_anim = AnimationUtils.loadAnimation(this, R.anim.character_in_anim);
        jaseon_seja.startAnimation(jaseon_seja_anim);

        // 대화창 애니메이션
        ImageButton jaseon_dialog = (ImageButton) findViewById(R.id.jaseon_dialog);
        Animation jaseon_dialog_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        jaseon_dialog.startAnimation(jaseon_dialog_anim);

        // 이름표 애니메이션
        ImageView jaseon_nametag = (ImageView) findViewById(R.id.jaseon_nametag);
        Animation jaseon_nametag_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        jaseon_nametag.startAnimation(jaseon_nametag_anim);

        // 이름 애니메이션
        TextView jaseon_name = (TextView) findViewById(R.id.jaseon_name);
        Animation jaseon_name_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        jaseon_name.startAnimation(jaseon_name_anim);

        /// 텍스트 전환
        changeView(i);
        jaseon_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeView(i);
            }
        });
    }

    // 텍스트 전환
    public void changeView(int index){
        TextView tv1 = (TextView) findViewById(R.id.jaseon_seja_s1);





    }

}
