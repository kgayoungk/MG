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

public class Naesoju extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sajeong);

        // 상궁 등장 애니메이션
        ImageView naesoju_sanggung = (ImageView) findViewById(R.id.naesoju_sanggung);
        Animation naesoju_sanggung_anim = AnimationUtils.loadAnimation(this, R.anim.character_in_anim);
        naesoju_sanggung.startAnimation(naesoju_sanggung_anim);

        // 대화창 애니메이션
        ImageButton naesoju_dialog = (ImageButton) findViewById(R.id.naesoju_dialog);
        Animation naesoju_dialog_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        naesoju_dialog.startAnimation(naesoju_dialog_anim);

        // 이름표 애니메이션
        ImageView naesoju_nametag = (ImageView) findViewById(R.id.naesoju_nametag);
        Animation naesoju_nametag_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        naesoju_nametag.startAnimation(naesoju_nametag_anim);

        // 이름 애니메이션
        TextView naesoju_name = (TextView) findViewById(R.id.naesoju_name);
        Animation naesoju_name_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        naesoju_name.startAnimation(naesoju_name_anim);

        /// 텍스트 전환
        changeView(i);
        naesoju_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeView(i);
            }
        });
    }

    // 텍스트 전환
    public void changeView(int index){
        TextView tv1 = (TextView) findViewById(R.id.naesoju_sanggung_s1);





    }
}
