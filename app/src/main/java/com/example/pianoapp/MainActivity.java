package com.example.pianoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Coding for recording of the audio
    private MediaRecorder mediaRecorder;
    public static String mFilename1 = null;
    public static String mFilename2 = null;
    public static String mFilename3 = null;
    public static String mFilename4 = null;
    public static String mFilename5 = null;
    public static String mFilename6 = null;

    boolean mStartRecording = true;

    public int recordingno;

    private SoundPool soundPool;
    int c3, c3black, d3, d3black, e3, f3, f3black, g3, g3black, a3, a3black, b3;
    int c4, c4black, d4, d4black, e4, f4, f4black, g4, g4black, a4, a4black, b4;
    int c5, c5black, d5, d5black, e5, f5, f5black, g5, g5black, a5, a5black, b5;
    int c6, c6black, d6, d6black, e6, f6, f6black, g6, g6black, a6, a6black, b6;
    int c7, c7black, d7, d7black, e7, f7, f7black, g7, g7black, a7, a7black, b7;

    private HorizontalScrollView scrollView;

    private Button leftNavigation, rightNavigation, recordButton, playButton;

    private Button buttonC3;
    private Button buttonC3black;
    private Button buttonD3;
    private Button buttonD3black;
    private Button buttonE3;
    private Button buttonF3;
    private Button buttonF3black;
    private Button buttonG3;
    private Button buttonG3black;
    private Button buttonA3;
    private Button buttonA3black;
    private Button buttonB3;

    private Button buttonC4;
    private Button buttonC4black;
    private Button buttonD4;
    private Button buttonD4black;
    private Button buttonE4;
    private Button buttonF4;
    private Button buttonF4black;
    private Button buttonG4;
    private Button buttonG4black;
    private Button buttonA4;
    private Button buttonA4black;
    private Button buttonB4;

    private Button buttonC5;
    private Button buttonC5black;
    private Button buttonD5;
    private Button buttonD5black;
    private Button buttonE5;
    private Button buttonF5;
    private Button buttonF5black;
    private Button buttonG5;
    private Button buttonG5black;
    private Button buttonA5;
    private Button buttonA5black;
    private Button buttonB5;

    private Button buttonC6;
    private Button buttonC6black;
    private Button buttonD6;
    private Button buttonD6black;
    private Button buttonE6;
    private Button buttonF6;
    private Button buttonF6black;
    private Button buttonG6;
    private Button buttonG6black;
    private Button buttonA6;
    private Button buttonA6black;
    private Button buttonB6;

    private Button buttonC7;
    private Button buttonC7black;
    private Button buttonD7;
    private Button buttonD7black;
    private Button buttonE7;
    private Button buttonF7;
    private Button buttonF7black;
    private Button buttonG7;
    private Button buttonG7black;
    private Button buttonA7;
    private Button buttonA7black;
    private Button buttonB7;

    private TextView tc3;
    private TextView td3;
    private TextView te3;
    private TextView tf3;
    private TextView tg3;
    private TextView ta3;
    private TextView tb3;

    private TextView tc4;
    private TextView td4;
    private TextView te4;
    private TextView tf4;
    private TextView tg4;
    private TextView ta4;
    private TextView tb4;

    private TextView tc5;
    private TextView td5;
    private TextView te5;
    private TextView tf5;
    private TextView tg5;
    private TextView ta5;
    private TextView tb5;

    private TextView tc6;
    private TextView td6;
    private TextView te6;
    private TextView tf6;
    private TextView tg6;
    private TextView ta6;
    private TextView tb6;

    private TextView tc7;
    private TextView td7;
    private TextView te7;
    private TextView tf7;
    private TextView tg7;
    private TextView ta7;
    private TextView tb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is used for testing sound only
//        gototestActivity();

        //Initialize the scroll view
        scrollView = findViewById(R.id.scrollView);

        // Method for All Piano Keys
        initialiseAllPianoKeys();

        // Method for All Piano Key Labels TextViews
        initialiseTextViewLabelsOnPianoKeys();

        // Code for SoundPool
        soundPool = new SoundPool.Builder()
                .setMaxStreams(6)
                .build();

        c3 = soundPool.load(this, R.raw.c3, 1);
        c3black = soundPool.load(this, R.raw.c3black, 1);
        d3 = soundPool.load(this, R.raw.d3, 1);
        d3black = soundPool.load(this, R.raw.d3black, 1);
        e3 = soundPool.load(this, R.raw.e3, 1);
        f3 = soundPool.load(this, R.raw.f3, 1);
        f3black = soundPool.load(this, R.raw.f3black, 1);
        g3 = soundPool.load(this, R.raw.g3, 1);
        g3black = soundPool.load(this, R.raw.g3black, 1);
        a3 = soundPool.load(this, R.raw.a3, 1);
        a3black = soundPool.load(this, R.raw.a3black, 1);
        b3 = soundPool.load(this, R.raw.b3, 1);

        c4 = soundPool.load(this, R.raw.c4, 1);
        c4black = soundPool.load(this, R.raw.c4black, 1);
        d4 = soundPool.load(this, R.raw.d4, 1);
        d4black = soundPool.load(this, R.raw.d4black, 1);
        e4 = soundPool.load(this, R.raw.e4, 1);
        f4 = soundPool.load(this, R.raw.f4, 1);
        f4black = soundPool.load(this, R.raw.f4black, 1);
        g4 = soundPool.load(this, R.raw.g4, 1);
        g4black = soundPool.load(this, R.raw.g4black, 1);
        a4 = soundPool.load(this, R.raw.a4, 1);
        a4black = soundPool.load(this, R.raw.a4black, 1);
        b4 = soundPool.load(this, R.raw.b4, 1);

        c5 = soundPool.load(this, R.raw.c5, 1);
        c5black = soundPool.load(this, R.raw.c5black, 1);
        d5 = soundPool.load(this, R.raw.d5, 1);
        d5black = soundPool.load(this, R.raw.d5black, 1);
        e5 = soundPool.load(this, R.raw.e5, 1);
        f5 = soundPool.load(this, R.raw.f5, 1);
        f5black = soundPool.load(this, R.raw.f5black, 1);
        g5 = soundPool.load(this, R.raw.g5, 1);
        g5black = soundPool.load(this, R.raw.g5black, 1);
        a5 = soundPool.load(this, R.raw.a5, 1);
        a5black = soundPool.load(this, R.raw.a5black, 1);
        b5 = soundPool.load(this, R.raw.b5, 1);

        c6 = soundPool.load(this, R.raw.c6, 1);
        c6black = soundPool.load(this, R.raw.c6black, 1);
        d6 = soundPool.load(this, R.raw.d6, 1);
        d6black = soundPool.load(this, R.raw.d6black, 1);
        e6 = soundPool.load(this, R.raw.e6, 1);
        f6 = soundPool.load(this, R.raw.f6, 1);
        f6black = soundPool.load(this, R.raw.f6black, 1);
        g6 = soundPool.load(this, R.raw.g6, 1);
        g6black = soundPool.load(this, R.raw.g6black, 1);
        a6 = soundPool.load(this, R.raw.a6, 1);
        a6black = soundPool.load(this, R.raw.a6black, 1);
        b6 = soundPool.load(this, R.raw.b6, 1);

        c7 = soundPool.load(this, R.raw.c7, 1);
        c7black = soundPool.load(this, R.raw.c7black, 1);
        d7 = soundPool.load(this, R.raw.d7, 1);
        d7black = soundPool.load(this, R.raw.d7black, 1);
        e7 = soundPool.load(this, R.raw.e7, 1);
        f7 = soundPool.load(this, R.raw.f7, 1);
        f7black = soundPool.load(this, R.raw.f7black, 1);
        g7 = soundPool.load(this, R.raw.g7, 1);
        g7black = soundPool.load(this, R.raw.g7black, 1);
        a7 = soundPool.load(this, R.raw.a7, 1);
        a7black = soundPool.load(this, R.raw.a7black, 1);
        b7 = soundPool.load(this, R.raw.b7, 1);

        leftNavigation = (Button) findViewById(R.id.bt_left_navigation);
        rightNavigation = (Button) findViewById(R.id.bt_right_navigation);
//        playButton = (Button) findViewById(R.id.bt_play_recording);
//        recordButton = (Button) findViewById(R.id.bt_record);

        leftNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.scrollTo((int) scrollView.getScrollX() - 60, (int) scrollView.getScrollX());
            }
        });

        rightNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.scrollTo((int) scrollView.getScrollX() + 60, (int) scrollView.getScrollY());
            }
        });

        // Recording code
//        mFilename1 = getExternalCacheDir().getAbsolutePath();
//        mFilename1 += "/audiorecordtest1.3gp";
//        mFilename2 = getExternalCacheDir().getAbsolutePath();
//        mFilename2 += "/audiorecordtest2.3gp";
//        mFilename3 = getExternalCacheDir().getAbsolutePath();
//        mFilename3 += "/audiorecordtest3.3gp";
//        mFilename4 = getExternalCacheDir().getAbsolutePath();
//        mFilename4 += "/audiorecordtest4.3gp";
//        mFilename5 = getExternalCacheDir().getAbsolutePath();
//        mFilename5 += "/audiorecordtest5.3gp";
//        mFilename6 = getExternalCacheDir().getAbsolutePath();
//        mFilename6 += "/audiorecordtest6.3gp";
//
//        SharedPreferences prefs = getSharedPreferences("FILENO", MODE_PRIVATE);
//        recordingno = prefs.getInt("fileno", 1);
    }

    void initialiseTextViewLabelsOnPianoKeys() {

        tc3 = (TextView) findViewById(R.id.tc3);
        td3 = (TextView) findViewById(R.id.td3);
        te3 = (TextView) findViewById(R.id.te3);
        tf3 = (TextView) findViewById(R.id.tf3);
        tg3 = (TextView) findViewById(R.id.tg3);
        ta3 = (TextView) findViewById(R.id.ta3);
        tb3 = (TextView) findViewById(R.id.tb3);

        tc4 = (TextView) findViewById(R.id.tc4);
        td4 = (TextView) findViewById(R.id.td4);
        te4 = (TextView) findViewById(R.id.te4);
        tf4 = (TextView) findViewById(R.id.tf4);
        tg4 = (TextView) findViewById(R.id.tg4);
        ta4 = (TextView) findViewById(R.id.ta4);
        tb4 = (TextView) findViewById(R.id.tb4);

        tc5 = (TextView) findViewById(R.id.tc5);
        td5 = (TextView) findViewById(R.id.td5);
        te5 = (TextView) findViewById(R.id.te5);
        tf5 = (TextView) findViewById(R.id.tf5);
        tg5 = (TextView) findViewById(R.id.tg5);
        ta5 = (TextView) findViewById(R.id.ta5);
        tb5 = (TextView) findViewById(R.id.tb5);

        tc6 = (TextView) findViewById(R.id.tc6);
        td6 = (TextView) findViewById(R.id.td6);
        te6 = (TextView) findViewById(R.id.te6);
        tf6 = (TextView) findViewById(R.id.tf6);
        tg6 = (TextView) findViewById(R.id.tg6);
        ta6 = (TextView) findViewById(R.id.ta6);
        tb6 = (TextView) findViewById(R.id.tb6);

        tc7 = (TextView) findViewById(R.id.tc7);
        td7 = (TextView) findViewById(R.id.td7);
        te7 = (TextView) findViewById(R.id.te7);
        tf7 = (TextView) findViewById(R.id.tf7);
        tg7 = (TextView) findViewById(R.id.tg7);
        ta7 = (TextView) findViewById(R.id.ta7);
        tb7 = (TextView) findViewById(R.id.tb7);

        tc3.setOnClickListener(this);
        td3.setOnClickListener(this);
        te3.setOnClickListener(this);
        tf3.setOnClickListener(this);
        tg3.setOnClickListener(this);
        ta3.setOnClickListener(this);
        tb3.setOnClickListener(this);

        tc4.setOnClickListener(this);
        td4.setOnClickListener(this);
        te4.setOnClickListener(this);
        tf4.setOnClickListener(this);
        tg4.setOnClickListener(this);
        ta4.setOnClickListener(this);
        tb4.setOnClickListener(this);

        tc5.setOnClickListener(this);
        td5.setOnClickListener(this);
        te5.setOnClickListener(this);
        tf5.setOnClickListener(this);
        tg5.setOnClickListener(this);
        ta5.setOnClickListener(this);
        tb5.setOnClickListener(this);

        tc6.setOnClickListener(this);
        td6.setOnClickListener(this);
        te6.setOnClickListener(this);
        tf6.setOnClickListener(this);
        tg6.setOnClickListener(this);
        ta6.setOnClickListener(this);
        tb6.setOnClickListener(this);

        tc7.setOnClickListener(this);
        td7.setOnClickListener(this);
        te7.setOnClickListener(this);
        tf7.setOnClickListener(this);
        tg7.setOnClickListener(this);
        ta7.setOnClickListener(this);
        tb7.setOnClickListener(this);

    }

    void initialiseAllPianoKeys() {

        buttonC3 = (Button) findViewById(R.id.p1);
        buttonC3black = (Button) findViewById(R.id.b1);
        buttonD3 = (Button) findViewById(R.id.p2);
        buttonD3black = (Button) findViewById(R.id.b2);
        buttonE3 = (Button) findViewById(R.id.p3);
        buttonF3 = (Button) findViewById(R.id.p4);
        buttonF3black = (Button) findViewById(R.id.b3);
        buttonG3 = (Button) findViewById(R.id.p5);
        buttonG3black = (Button) findViewById(R.id.b4);
        buttonA3 = (Button) findViewById(R.id.p6);
        buttonA3black = (Button) findViewById(R.id.b5);
        buttonB3 = (Button) findViewById(R.id.p7);

        buttonC4 = (Button) findViewById(R.id.p8);
        buttonC4black = (Button) findViewById(R.id.b6);
        buttonD4 = (Button) findViewById(R.id.p9);
        buttonD4black = (Button) findViewById(R.id.b7);
        buttonE4 = (Button) findViewById(R.id.p10);
        buttonF4 = (Button) findViewById(R.id.p11);
        buttonF4black = (Button) findViewById(R.id.b8);
        buttonG4 = (Button) findViewById(R.id.p12);
        buttonG4black = (Button) findViewById(R.id.b9);
        buttonA4 = (Button) findViewById(R.id.p13);
        buttonA4black = (Button) findViewById(R.id.b10);
        buttonB4 = (Button) findViewById(R.id.p14);

        buttonC5 = (Button) findViewById(R.id.p15);
        buttonC5black = (Button) findViewById(R.id.b11);
        buttonD5 = (Button) findViewById(R.id.p16);
        buttonD5black = (Button) findViewById(R.id.b12);
        buttonE5 = (Button) findViewById(R.id.p17);
        buttonF5 = (Button) findViewById(R.id.p18);
        buttonF5black = (Button) findViewById(R.id.b13);
        buttonG5 = (Button) findViewById(R.id.p19);
        buttonG5black = (Button) findViewById(R.id.b14);
        buttonA5 = (Button) findViewById(R.id.p20);
        buttonA5black = (Button) findViewById(R.id.b15);
        buttonB5 = (Button) findViewById(R.id.p21);

        buttonC6 = (Button) findViewById(R.id.p22);
        buttonC6black = (Button) findViewById(R.id.b16);
        buttonD6 = (Button) findViewById(R.id.p23);
        buttonD6black = (Button) findViewById(R.id.b17);
        buttonE6 = (Button) findViewById(R.id.p24);
        buttonF6 = (Button) findViewById(R.id.p25);
        buttonF6black = (Button) findViewById(R.id.b18);
        buttonG6 = (Button) findViewById(R.id.p26);
        buttonG6black = (Button) findViewById(R.id.b19);
        buttonA6 = (Button) findViewById(R.id.p27);
        buttonA6black = (Button) findViewById(R.id.b20);
        buttonB6 = (Button) findViewById(R.id.p28);

        buttonC7 = (Button) findViewById(R.id.p29);
        buttonC7black = (Button) findViewById(R.id.b21);
        buttonD7 = (Button) findViewById(R.id.p30);
        buttonD7black = (Button) findViewById(R.id.b22);
        buttonE7 = (Button) findViewById(R.id.p31);
        buttonF7 = (Button) findViewById(R.id.p32);
        buttonF7black = (Button) findViewById(R.id.b23);
        buttonG7 = (Button) findViewById(R.id.p33);
        buttonG7black = (Button) findViewById(R.id.b24);
        buttonA7 = (Button) findViewById(R.id.p34);
        buttonA7black = (Button) findViewById(R.id.b25);
        buttonB7 = (Button) findViewById(R.id.p35);

        buttonC3.setOnClickListener(this);
        buttonC3black.setOnClickListener(this);
        buttonD3.setOnClickListener(this);
        buttonD3black.setOnClickListener(this);
        buttonE3.setOnClickListener(this);
        buttonF3.setOnClickListener(this);
        buttonF3black.setOnClickListener(this);
        buttonG3.setOnClickListener(this);
        buttonG3black.setOnClickListener(this);
        buttonA3.setOnClickListener(this);
        buttonA3black.setOnClickListener(this);
        buttonB3.setOnClickListener(this);

        buttonC4.setOnClickListener(this);
        buttonC4black.setOnClickListener(this);
        buttonD4.setOnClickListener(this);
        buttonD4black.setOnClickListener(this);
        buttonE4.setOnClickListener(this);
        buttonF4.setOnClickListener(this);
        buttonF4black.setOnClickListener(this);
        buttonG4.setOnClickListener(this);
        buttonG4black.setOnClickListener(this);
        buttonA4.setOnClickListener(this);
        buttonA4black.setOnClickListener(this);
        buttonB4.setOnClickListener(this);

        buttonC5.setOnClickListener(this);
        buttonC5black.setOnClickListener(this);
        buttonD5.setOnClickListener(this);
        buttonD5black.setOnClickListener(this);
        buttonE5.setOnClickListener(this);
        buttonF5.setOnClickListener(this);
        buttonF5black.setOnClickListener(this);
        buttonG5.setOnClickListener(this);
        buttonG5black.setOnClickListener(this);
        buttonA5.setOnClickListener(this);
        buttonA5black.setOnClickListener(this);
        buttonB5.setOnClickListener(this);

        buttonC6.setOnClickListener(this);
        buttonC6black.setOnClickListener(this);
        buttonD6.setOnClickListener(this);
        buttonD6black.setOnClickListener(this);
        buttonE6.setOnClickListener(this);
        buttonF6.setOnClickListener(this);
        buttonF6black.setOnClickListener(this);
        buttonG6.setOnClickListener(this);
        buttonG6black.setOnClickListener(this);
        buttonA6.setOnClickListener(this);
        buttonA6black.setOnClickListener(this);
        buttonB6.setOnClickListener(this);

        buttonC7.setOnClickListener(this);
        buttonC7black.setOnClickListener(this);
        buttonD7.setOnClickListener(this);
        buttonD7black.setOnClickListener(this);
        buttonE7.setOnClickListener(this);
        buttonF7.setOnClickListener(this);
        buttonF7black.setOnClickListener(this);
        buttonG7.setOnClickListener(this);
        buttonG7black.setOnClickListener(this);
        buttonA7.setOnClickListener(this);
        buttonA7black.setOnClickListener(this);
        buttonB7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            // Piano Key Number 3
            case R.id.tc3:
            case R.id.p1:
                soundPool.play(c3, 1, 1, 0, 0, 1);
                break;

            case R.id.b1:
                soundPool.play(c3black, 1, 1, 0, 0, 1);
                break;

            case R.id.td3:
            case R.id.p2:
                soundPool.play(d3, 1, 1, 0, 0, 1);
                break;

            case R.id.b2:
                soundPool.play(d3black, 1, 1, 0, 0, 1);
                break;

            case R.id.te3:
            case R.id.p3:
                soundPool.play(e3, 1, 1, 0, 0, 1);
                break;

            case R.id.tf3:
            case R.id.p4:
                soundPool.play(f3, 1, 1, 0, 0, 1);
                break;

            case R.id.b3:
                soundPool.play(f3black, 1, 1, 0, 0, 1);
                break;

            case R.id.tg3:
            case R.id.p5:
                soundPool.play(g3, 1, 1, 0, 0, 1);
                break;

            case R.id.b4:
                soundPool.play(g3black, 1, 1, 0, 0, 1);
                break;

            case R.id.ta3:
            case R.id.p6:
                soundPool.play(a3, 1, 1, 0, 0, 1);
                break;

            case R.id.b5:
                soundPool.play(a3black, 1, 1, 0, 0, 1);
                break;

            case R.id.tb3:
            case R.id.p7:
                soundPool.play(b3, 1, 1, 0, 0, 1);
                break;

            // Piano Key Number 4
            case R.id.tc4:
            case R.id.p8:
                soundPool.play(c4, 1, 1, 0, 0, 1);
                break;

            case R.id.b6:
                soundPool.play(c4black, 1, 1, 0, 0, 1);
                break;

            case R.id.td4:
            case R.id.p9:
                soundPool.play(d4, 1, 1, 0, 0, 1);
                break;

            case R.id.b7:
                soundPool.play(d4black, 1, 1, 0, 0, 1);
                break;

            case R.id.te4:
            case R.id.p10:
                soundPool.play(e4, 1, 1, 0, 0, 1);
                break;

            case R.id.tf4:
            case R.id.p11:
                soundPool.play(f4, 1, 1, 0, 0, 1);
                break;

            case R.id.b8:
                soundPool.play(f4black, 1, 1, 0, 0, 1);
                break;

            case R.id.tg4:
            case R.id.p12:
                soundPool.play(g4, 1, 1, 0, 0, 1);
                break;

            case R.id.b9:
                soundPool.play(g4black, 1, 1, 0, 0, 1);
                break;

            case R.id.ta4:
            case R.id.p13:
                soundPool.play(a4, 1, 1, 0, 0, 1);
                break;

            case R.id.b10:
                soundPool.play(a4black, 1, 1, 0, 0, 1);
                break;

            case R.id.tb4:
            case R.id.p14:
                soundPool.play(b4, 1, 1, 0, 0, 1);
                break;

            // Piano Key Number 5
            case R.id.tc5:
            case R.id.p15:
                soundPool.play(c5, 1, 1, 0, 0, 1);
                break;

            case R.id.b11:
                soundPool.play(c5black, 1, 1, 0, 0, 1);
                break;

            case R.id.td5:
            case R.id.p16:
                soundPool.play(d5, 1, 1, 0, 0, 1);
                break;

            case R.id.b12:
                soundPool.play(d5black, 1, 1, 0, 0, 1);
                break;

            case R.id.te5:
            case R.id.p17:
                soundPool.play(e5, 1, 1, 0, 0, 1);
                break;

            case R.id.tf5:
            case R.id.p18:
                soundPool.play(f5, 1, 1, 0, 0, 1);
                break;

            case R.id.b13:
                soundPool.play(f5black, 1, 1, 0, 0, 1);
                break;

            case R.id.tg5:
            case R.id.p19:
                soundPool.play(g5, 1, 1, 0, 0, 1);
                break;

            case R.id.b14:
                soundPool.play(g5black, 1, 1, 0, 0, 1);
                break;

            case R.id.ta5:
            case R.id.p20:
                soundPool.play(a5, 1, 1, 0, 0, 1);
                break;

            case R.id.b15:
                soundPool.play(a5black, 1, 1, 0, 0, 1);
                break;

            case R.id.tb5:
            case R.id.p21:
                soundPool.play(b5, 1, 1, 0, 0, 1);
                break;

            // Piano Key Number 6
            case R.id.tc6:
            case R.id.p22:
                soundPool.play(c6, 1, 1, 0, 0, 1);
                break;

            case R.id.b16:
                soundPool.play(c6black, 1, 1, 0, 0, 1);
                break;

            case R.id.td6:
            case R.id.p23:
                soundPool.play(d6, 1, 1, 0, 0, 1);
                break;

            case R.id.b17:
                soundPool.play(d6black, 1, 1, 0, 0, 1);
                break;

            case R.id.te6:
            case R.id.p24:
                soundPool.play(e6, 1, 1, 0, 0, 1);
                break;

            case R.id.tf6:
            case R.id.p25:
                soundPool.play(f6, 1, 1, 0, 0, 1);
                break;

            case R.id.b18:
                soundPool.play(f6black, 1, 1, 0, 0, 1);
                break;

            case R.id.tg6:
            case R.id.p26:
                soundPool.play(g6, 1, 1, 0, 0, 1);
                break;

            case R.id.b19:
                soundPool.play(g6black, 1, 1, 0, 0, 1);
                break;

            case R.id.ta6:
            case R.id.p27:
                soundPool.play(a6, 1, 1, 0, 0, 1);
                break;

            case R.id.b20:
                soundPool.play(a6black, 1, 1, 0, 0, 1);
                break;

            case R.id.tb6:
            case R.id.p28:
                soundPool.play(b6, 1, 1, 0, 0, 1);
                break;

            // Piano Key Number 7
            case R.id.tc7:
            case R.id.p29:
                soundPool.play(c7, 1, 1, 0, 0, 1);
                break;

            case R.id.b21:
                soundPool.play(c7black, 1, 1, 0, 0, 1);
                break;

            case R.id.td7:
            case R.id.p30:
                soundPool.play(d7, 1, 1, 0, 0, 1);
                break;

            case R.id.b22:
                soundPool.play(d7black, 1, 1, 0, 0, 1);
                break;

            case R.id.te7:
            case R.id.p31:
                soundPool.play(e7, 1, 1, 0, 0, 1);
                break;

            case R.id.tf7:
            case R.id.p32:
                soundPool.play(f7, 1, 1, 0, 0, 1);
                break;

            case R.id.b23:
                soundPool.play(f7black, 1, 1, 0, 0, 1);
                break;

            case R.id.tg7:
            case R.id.p33:
                soundPool.play(g7, 1, 1, 0, 0, 1);
                break;

            case R.id.b24:
                soundPool.play(g7black, 1, 1, 0, 0, 1);
                break;

            case R.id.ta7:
            case R.id.p34:
                soundPool.play(a7, 1, 1, 0, 0, 1);
                break;

            case R.id.b25:
                soundPool.play(a7black, 1, 1, 0, 0, 1);
                break;

            case R.id.tb7:
            case R.id.p35:
                soundPool.play(b7, 1, 1, 0, 0, 1);
                break;
        }
    }

    public void play(View view) {
        Intent intent = new Intent(this, PlayRecord.class);
        startActivity(intent);
    }

    public void record(View view) {

        onRecord(mStartRecording);
        if (mStartRecording) {
            recordButton.setText("Finish");
        } else {
            recordButton.setText("Record");
        }

        mStartRecording = !mStartRecording;

    }

    private void startRecording() {

        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);

        switch (recordingno) {

            case 1:
                mediaRecorder.setOutputFile(mFilename1);
                recordingno++;
                if (recordingno == 7)
                    recordingno = 1;
                break;

            case 2:
                mediaRecorder.setOutputFile(mFilename2);
                recordingno++;
                if (recordingno == 7)
                    recordingno = 1;
                break;

            case 3:
                mediaRecorder.setOutputFile(mFilename3);
                recordingno++;
                if (recordingno == 7)
                    recordingno = 1;
                break;

            case 4:
                mediaRecorder.setOutputFile(mFilename4);
                recordingno++;
                if (recordingno == 7)
                    recordingno = 1;
                break;

            case 5:
                mediaRecorder.setOutputFile(mFilename5);
                recordingno++;
                if (recordingno == 7)
                    recordingno = 1;
                break;

            case 6:
                mediaRecorder.setOutputFile(mFilename6);
                recordingno++;
                if (recordingno == 7)
                    recordingno = 1;
                break;

        }

        SharedPreferences.Editor editor = getSharedPreferences("FILENO", MODE_PRIVATE).edit();
        editor.putInt("fileno", recordingno);
        editor.commit();

        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);

        try {
            mediaRecorder.prepare();
        } catch (IOException e) {
            Log.e("prepare is fail", "Failed");
        }
        mediaRecorder.start();

    }

    private void stopRecording() {
        mediaRecorder.stop();
        mediaRecorder.release();
        mediaRecorder = null;
    }

    private void onRecord(boolean start) {

        if (start) {
            startRecording();
        } else {
            stopRecording();
            if (recordingno == 1) {
                Toast recordingmsg = Toast.makeText(getApplicationContext(), "Song " + recordingno + " saved", Toast.LENGTH_SHORT);
                recordingmsg.show();
            } else {
                int temprecordingno = recordingno - 1;
                Toast recordingmsg = Toast.makeText(getApplicationContext(), "Song " + temprecordingno + " saved", Toast.LENGTH_SHORT);
                recordingmsg.show();
            }
        }
    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setTitle("Do you want to exit?")
                .setTitle("Are you sure to exit?")
                .setNegativeButton(R.string.no, null)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        setResult(RESULT_OK, new Intent().putExtra("EXIT", true));
                        finish();
                    }
                }).create().show();
    }


    // This is used for testing sound only
//    void gototestActivity(){
//        Intent intent = new Intent(MainActivity.this, TestSound.class);
//        startActivity(intent);
//    }
}