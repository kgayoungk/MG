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

public class SajeongIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sajeong_in);

        // 묘종 등장 애니메이션
        ImageView myojong1 = (ImageView) findViewById(R.id.myojong1);
        Animation myojong_anim1 = AnimationUtils.loadAnimation(this, R.anim.character_in_anim);
        myojong1.startAnimation(myojong_anim1);

        // 대화창, 이름표, 다음 버튼 애니메이션
        final ImageView dialog1 = (ImageView) findViewById(R.id.dialog1);
        final Animation dialog_anim1 = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        dialog1.startAnimation(dialog_anim1);

        final TextView nametag1 = (TextView) findViewById(R.id.nametag1);
        final Animation nametag_anim1 = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        nametag1.startAnimation(nametag_anim1);

        final ImageButton dialog_next1 = (ImageButton) findViewById(R.id.dialog_next1);
        final Animation dialog_next_anim1 = AnimationUtils.loadAnimation(this, R.anim.dialog_in_anim);
        dialog_next1.startAnimation(dialog_next_anim1);

        dialog_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환
                Intent i3 = new Intent(getApplicationContext(), Sajeong.class);
                startActivity(i3);
            }
        });
    }

}
