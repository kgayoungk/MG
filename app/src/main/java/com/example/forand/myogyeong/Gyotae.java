package com.example.forand.myogyeong;

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

public class Gyotae extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sajeong);

        // 묘현왕후 등장 애니메이션
        ImageView gyotae_myohyeon = (ImageView) findViewById(R.id.gyotae_myohyeon);
        Animation gyotae_myohyeon_anim = AnimationUtils.loadAnimation(this, R.anim.character_in_anim);
        gyotae_myohyeon.startAnimation(gyotae_myohyeon_anim);

        // 대화창 애니메이션
        ImageButton gyotae_dialog = (ImageButton) findViewById(R.id.gyotae_dialog);
        Animation gyotae_dialog_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        gyotae_dialog.startAnimation(gyotae_dialog_anim);

        // 이름표 애니메이션
        ImageView gyotae_nametag = (ImageView) findViewById(R.id.gyotae_nametag);
        Animation gyotae_nametag_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        gyotae_nametag.startAnimation(gyotae_nametag_anim);

        // 이름 애니메이션
        TextView gyotae_name = (TextView) findViewById(R.id.gyotae_name);
        Animation gyotae_name_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        gyotae_name.startAnimation(gyotae_name_anim);

        /// 텍스트 전환
        changeView(i);
        gyotae_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeView(i);
            }
        });
    }

    // 텍스트 전환
    public void changeView(int index){
        TextView tv1 = (TextView) findViewById(R.id.gyotae_myohyeon_s1);





    }

}
