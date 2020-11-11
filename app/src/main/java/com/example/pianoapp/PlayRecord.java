package com.example.pianoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class PlayRecord extends AppCompatActivity {

    private MediaPlayer mPlayer;
    private Button brecord1,brecord2,brecord3,brecord4,brecord5,brecord6;

    private boolean isplaying;
    private boolean isplaying1;
    private boolean isplaying2;
    private boolean isplaying3;
    private boolean isplaying4;
    private boolean isplaying5;
    private boolean isplaying6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_record);

        brecord1 = (Button) findViewById(R.id.button);
        brecord2 = (Button) findViewById(R.id.button2);
        brecord3 = (Button) findViewById(R.id.button3);
        brecord4 = (Button) findViewById(R.id.button4);
        brecord5 = (Button) findViewById(R.id.button5);
        brecord6 = (Button) findViewById(R.id.button6);

        brecord1.setBackgroundResource(R.drawable.playsoundshape);
        brecord2.setBackgroundResource(R.drawable.playsoundshape);
        brecord3.setBackgroundResource(R.drawable.playsoundshape);
        brecord4.setBackgroundResource(R.drawable.playsoundshape);
        brecord5.setBackgroundResource(R.drawable.playsoundshape);
        brecord6.setBackgroundResource(R.drawable.playsoundshape);

        isplaying = false;
        isplaying1 = false;
        isplaying2 = false;
        isplaying3 = false;
        isplaying4 = false;
        isplaying5 = false;
        isplaying6 = false;

    }

    public void play1(View view) {

        if (!isplaying1 && !isplaying){
            brecord1.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(1);
            isplaying = true;
            isplaying1 = true;
        } else if (!isplaying1 && !isplaying) {
            stopPlaying();

            brecord1.setBackgroundResource(R.drawable.playsoundshape);
            brecord2.setBackgroundResource(R.drawable.playsoundshape);
            brecord3.setBackgroundResource(R.drawable.playsoundshape);
            brecord4.setBackgroundResource(R.drawable.playsoundshape);
            brecord5.setBackgroundResource(R.drawable.playsoundshape);
            brecord6.setBackgroundResource(R.drawable.playsoundshape);

            isplaying1 = false;
            isplaying2 = false;
            isplaying3 = false;
            isplaying4 = false;
            isplaying5 = false;
            isplaying6 = false;

            brecord1.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(1);
            isplaying1 = true;
        } else {
            brecord1.setBackgroundResource(R.drawable.playsoundshape);
            stopPlaying();
        }

    }

    public void play2(View view) {
        if (!isplaying2 && !isplaying){
            brecord2.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(2);
            isplaying = true;
            isplaying2 = true;
        } else if (!isplaying2 && !isplaying) {
            stopPlaying();

            brecord1.setBackgroundResource(R.drawable.playsoundshape);
            brecord2.setBackgroundResource(R.drawable.playsoundshape);
            brecord3.setBackgroundResource(R.drawable.playsoundshape);
            brecord4.setBackgroundResource(R.drawable.playsoundshape);
            brecord5.setBackgroundResource(R.drawable.playsoundshape);
            brecord6.setBackgroundResource(R.drawable.playsoundshape);

            isplaying1 = false;
            isplaying2 = false;
            isplaying3 = false;
            isplaying4 = false;
            isplaying5 = false;
            isplaying6 = false;

            brecord2.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(2);
            isplaying2 = true;
        } else {
            brecord2.setBackgroundResource(R.drawable.playsoundshape);
            stopPlaying();
        }
    }

    public void play3(View view) {
        if (!isplaying3 && !isplaying){
            brecord3.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(3);
            isplaying = true;
            isplaying3 = true;
        } else if (!isplaying3 && !isplaying) {
            stopPlaying();

            brecord1.setBackgroundResource(R.drawable.playsoundshape);
            brecord2.setBackgroundResource(R.drawable.playsoundshape);
            brecord3.setBackgroundResource(R.drawable.playsoundshape);
            brecord4.setBackgroundResource(R.drawable.playsoundshape);
            brecord5.setBackgroundResource(R.drawable.playsoundshape);
            brecord6.setBackgroundResource(R.drawable.playsoundshape);

            isplaying1 = false;
            isplaying2 = false;
            isplaying3 = false;
            isplaying4 = false;
            isplaying5 = false;
            isplaying6 = false;

            brecord3.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(3);
            isplaying3 = true;
        } else {
            brecord3.setBackgroundResource(R.drawable.playsoundshape);
            stopPlaying();
        }
    }

    public void play4(View view) {
        if (!isplaying4 && !isplaying){
            brecord4.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(4);
            isplaying = true;
            isplaying4 = true;
        } else if (!isplaying4 && !isplaying) {
            stopPlaying();

            brecord1.setBackgroundResource(R.drawable.playsoundshape);
            brecord2.setBackgroundResource(R.drawable.playsoundshape);
            brecord3.setBackgroundResource(R.drawable.playsoundshape);
            brecord4.setBackgroundResource(R.drawable.playsoundshape);
            brecord5.setBackgroundResource(R.drawable.playsoundshape);
            brecord6.setBackgroundResource(R.drawable.playsoundshape);

            isplaying1 = false;
            isplaying2 = false;
            isplaying3 = false;
            isplaying4 = false;
            isplaying5 = false;
            isplaying6 = false;

            brecord4.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(4);
            isplaying4 = true;
        } else {
            brecord4.setBackgroundResource(R.drawable.playsoundshape);
            stopPlaying();
        }
    }

    public void play5(View view) {
        if (!isplaying5 && !isplaying){
            brecord1.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(5);
            isplaying = true;
            isplaying5 = true;
        } else if (!isplaying5 && !isplaying) {
            stopPlaying();

            brecord1.setBackgroundResource(R.drawable.playsoundshape);
            brecord2.setBackgroundResource(R.drawable.playsoundshape);
            brecord3.setBackgroundResource(R.drawable.playsoundshape);
            brecord4.setBackgroundResource(R.drawable.playsoundshape);
            brecord5.setBackgroundResource(R.drawable.playsoundshape);
            brecord6.setBackgroundResource(R.drawable.playsoundshape);

            isplaying1 = false;
            isplaying2 = false;
            isplaying3 = false;
            isplaying4 = false;
            isplaying5 = false;
            isplaying6 = false;

            brecord5.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(5);
            isplaying5 = true;
        } else {
            brecord5.setBackgroundResource(R.drawable.playsoundshape);
            stopPlaying();
        }
    }

    public void play6(View view) {
        if (!isplaying6 && !isplaying){
            brecord6.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(6);
            isplaying = true;
            isplaying6 = true;
        } else if (!isplaying6 && !isplaying) {
            stopPlaying();

            brecord1.setBackgroundResource(R.drawable.playsoundshape);
            brecord2.setBackgroundResource(R.drawable.playsoundshape);
            brecord3.setBackgroundResource(R.drawable.playsoundshape);
            brecord4.setBackgroundResource(R.drawable.playsoundshape);
            brecord5.setBackgroundResource(R.drawable.playsoundshape);
            brecord6.setBackgroundResource(R.drawable.playsoundshape);

            isplaying1 = false;
            isplaying2 = false;
            isplaying3 = false;
            isplaying4 = false;
            isplaying5 = false;
            isplaying6 = false;

            brecord6.setBackgroundResource(R.drawable.playsoundshapepressed);
            startPlaying(6);
            isplaying6 = true;
        } else {
            brecord6.setBackgroundResource(R.drawable.playsoundshape);
            stopPlaying();
        }
    }

    private void startPlaying(int recordingno) {

        mPlayer = new MediaPlayer();

        try {
            switch (recordingno){
                case 1:
                    mPlayer.setDataSource(MainActivity.mFilename1);
                    break;
                case 2:
                    mPlayer.setDataSource(MainActivity.mFilename2);
                    break;
                case 3:
                    mPlayer.setDataSource(MainActivity.mFilename3);
                    break;
                case 4:
                    mPlayer.setDataSource(MainActivity.mFilename4);
                    break;
                case 5:
                    mPlayer.setDataSource(MainActivity.mFilename5);
                    break;
                case 6:
                    mPlayer.setDataSource(MainActivity.mFilename6);
                    break;
            }

            mPlayer.prepare();
            mPlayer.start();

        } catch (IOException e){
            Log.e("failed", "Fails");
        }

    }


    private void stopPlaying() {

        mPlayer.release();
        mPlayer = null;

    }

    @Override
    protected void onPause() {
        super.onPause();

        if(mPlayer!=null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        if(mPlayer!=null){
            mPlayer.release();
            mPlayer = null;
        }
    }
}