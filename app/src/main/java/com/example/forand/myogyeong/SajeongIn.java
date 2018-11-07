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

import org.w3c.dom.Text;

public class SajeongIn extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sajeong_in);

        // 묘종 등장 애니메이션
        ImageView sajeong_in_myojong = (ImageView) findViewById(R.id.sajeong_in_myojong);
        Animation sajeong_in_myojong_anim = AnimationUtils.loadAnimation(this, R.anim.character_in_anim);
        sajeong_in_myojong.startAnimation(sajeong_in_myojong_anim);

        // 대화창 애니메이션
        ImageButton sajeong_in_dialog = (ImageButton) findViewById(R.id.sajeong_in_dialog);
        Animation sajeong_in_dialog_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        sajeong_in_dialog.startAnimation(sajeong_in_dialog_anim);

        // 이름표 애니메이션
        ImageView sajeong_in_nametag = (ImageView) findViewById(R.id.sajeong_in_nametag);
        Animation sajeong_in_nametag_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        sajeong_in_nametag.startAnimation(sajeong_in_nametag_anim);

        // 이름 애니메이션
        TextView sajeong_in_name = (TextView) findViewById(R.id.sajeong_in_name);
        Animation sajeong_in_name_anim = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        sajeong_in_name.startAnimation(sajeong_in_name_anim);

        /// 텍스트 전환
        changeView(i);
        sajeong_in_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                changeView(i);
            }
        });
    }

    // 텍스트 전환
    public void changeView(int index){
        TextView tv1 = (TextView) findViewById(R.id.sajeong_in_myojong_s1);
        TextView tv2 = (TextView) findViewById(R.id.sajeong_in_myojong_s2);
        TextView tv3 = (TextView) findViewById(R.id.sajeong_in_myojong_s3);
        TextView tv4 = (TextView) findViewById(R.id.sajeong_in_myojong_s4);
        TextView tv5 = (TextView) findViewById(R.id.sajeong_in_myojong_s5);
        TextView tv6 = (TextView) findViewById(R.id.sajeong_in_myojong_s6);
        TextView tv7 = (TextView) findViewById(R.id.sajeong_in_myojong_s7);

        switch(index){
            case 0:
                tv1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv6.setVisibility(View.INVISIBLE);
                tv7.setVisibility(View.INVISIBLE);
                i++;
                break;
            case 1:
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv6.setVisibility(View.INVISIBLE);
                tv7.setVisibility(View.INVISIBLE);
                i++;
                break;
            case 2:
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv6.setVisibility(View.INVISIBLE);
                tv7.setVisibility(View.INVISIBLE);
                i++;
                break;
            case 3:
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv6.setVisibility(View.INVISIBLE);
                tv7.setVisibility(View.INVISIBLE);
                i++;
                break;
            case 4:
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.INVISIBLE);
                tv7.setVisibility(View.INVISIBLE);
                i++;
                break;
            case 5:
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv6.setVisibility(View.VISIBLE);
                tv7.setVisibility(View.INVISIBLE);
                i++;
                break;
            case 6:
                tv1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                tv3.setVisibility(View.INVISIBLE);
                tv4.setVisibility(View.INVISIBLE);
                tv5.setVisibility(View.INVISIBLE);
                tv6.setVisibility(View.INVISIBLE);
                tv7.setVisibility(View.VISIBLE);
                i++;
                break;
        }
    }

}
