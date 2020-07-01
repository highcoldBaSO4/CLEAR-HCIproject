package com.example.clear;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class PatientInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_in);

        Button btn_yes=findViewById(R.id.btn_yes);
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PatientInActivity.this,PatientOftenActivity.class);
                startActivity(intent);
            }
        });

        Button btn_no=findViewById(R.id.btn_no);
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PatientInActivity.this,PatientPast1Activity.class);
                startActivity(intent);
            }
        });

        Button btn_back=findViewById(R.id.btn_back_0);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PatientInActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        final MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this,R.raw.voice);

        Button btn_voice=findViewById(R.id.btn_voice);
        btn_voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }

}
