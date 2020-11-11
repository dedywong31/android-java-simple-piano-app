package com.example.pianoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundTesting extends AppCompatActivity implements View.OnClickListener {

    Button bt1, bt2, bt3, bt4;
    MediaPlayer mediaPlayerob;

    SoundPool soundPoolob;
    int c3, c3black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundtesting);

        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        bt4 = (Button) findViewById(R.id.button4);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

        soundPoolob = new SoundPool.Builder()
                            .setMaxStreams(6)
                            .build();

        c3 = soundPoolob.load(this, R.raw.c3, 1);
        c3black = soundPoolob.load(this, R.raw.c3black, 1);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.button:
                mediaPlayerob = MediaPlayer.create(getApplicationContext(), R.raw.c3);
                mediaPlayerob.start();
                break;

            case R.id.button2:
                mediaPlayerob = MediaPlayer.create(getApplicationContext(), R.raw.c3black);
                mediaPlayerob.start();
                break;

            case R.id.button3:
                soundPoolob.play(c3, 1, 1, 0, 0, 1);
                break;

            case R.id.button4:
                soundPoolob.play(c3black, 1, 1, 0, 0, 1);
                break;

        }

    }
}