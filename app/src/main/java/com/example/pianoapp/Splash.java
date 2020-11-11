package com.example.pianoapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.nio.channels.SelectionKey;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {

    ImageView imageViewS;
    TextView textViewS;

    private static final int EXIT_CODE = 100;
//    private static final int PERMISSION_CONSTANT = 100;
//    private static final int REQUEST_PERMISSION_SETTING = 101;
//
//    String[] permissionRequired = new String[]{
//            Manifest.permission.WRITE_EXTERNAL_STORAGE,
//            Manifest.permission.RECORD_AUDIO
//    };

    private SharedPreferences permissionsStatus;

//    private boolean sentToSettings = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageViewS = (ImageView) findViewById(R.id.imageViewSplash);
        textViewS = (TextView) findViewById(R.id.textViewSplash);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.transition);

        imageViewS.startAnimation(animation);
        textViewS.startAnimation(animation);

        proceedAfterPermission();

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    permissionsStatus = getSharedPreferences("permissionStatus", MODE_PRIVATE);
//
//                    if(ActivityCompat.checkSelfPermission(Splash.this, permissionRequired[0]) != PackageManager.PERMISSION_GRANTED
//                            || ActivityCompat.checkSelfPermission(Splash.this, permissionRequired[1]) != PackageManager.PERMISSION_GRANTED){
//
//                        if(ActivityCompat.shouldShowRequestPermissionRationale(Splash.this, permissionRequired[0])
//                                || ActivityCompat.shouldShowRequestPermissionRationale(Splash.this, permissionRequired[1])){
//
//                            AlertDialog.Builder builder = new AlertDialog.Builder(Splash.this);
//                            builder.setTitle("Need Multiple Permissions");
//                            builder.setMessage("This app needs Storage and Record Audio Permissions");
//                            builder.setPositiveButton("Grant", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//                                    ActivityCompat.requestPermissions(Splash.this, permissionRequired, PERMISSION_CONSTANT);
//                                }
//                            });
//                            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//                                    dialogInterface.cancel();
//                                }
//                            });
//                            builder.show();
//
//                        } else if (permissionsStatus.getBoolean(permissionRequired[0], false)){
//
//                            AlertDialog.Builder builder = new AlertDialog.Builder(Splash.this);
//                            builder.setTitle("Need Multiple Permissions");
//                            builder.setMessage("This app needs Storage and Record Audio Permissions");
//                            builder.setPositiveButton("Grant", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//                                    dialogInterface.cancel();
//                                    sentToSettings = true;
//
//                                    Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
//                                    Uri uri = Uri.fromParts("package", getPackageName(), null);
//                                    intent.setData(uri);
//                                    startActivityForResult(intent, REQUEST_PERMISSION_SETTING);
//                                }
//                            });
//                            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialogInterface, int i) {
//                                    dialogInterface.cancel();
//                                }
//                            });
//                            builder.show();
//
//                        } else {
//                            ActivityCompat.requestPermissions(Splash.this, permissionRequired, PERMISSION_CONSTANT);
//                        }
//                    } else {
//                        proceedAfterPermission();
//                    }
//                }
//            }
//        });
//
//        thread.start();
    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//
//        if (requestCode == PERMISSION_CONSTANT){
//
//            boolean allgranted = true;
//
//            for (int i = 0; i<grantResults.length;i++){
//                if(grantResults[i] == PackageManager.PERMISSION_GRANTED){
//                    allgranted = true;
//                } else {
//                    allgranted = false;
//                }
//            }
//
//            if (allgranted){
//                proceedAfterPermission();
//            } else if(ActivityCompat.shouldShowRequestPermissionRationale(Splash.this, permissionRequired[0])
//                    || ActivityCompat.shouldShowRequestPermissionRationale(Splash.this, permissionRequired[1])){
//                AlertDialog.Builder builder = new AlertDialog.Builder(Splash.this);
//                builder.setTitle("Need Multiple Permissions");
//                builder.setMessage("This app needs Storage and Record Audio Permissions");
//                builder.setPositiveButton("Grant", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.cancel();
//                        sentToSettings = true;
//
//                        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
//                        Uri uri = Uri.fromParts("package", getPackageName(), null);
//                        intent.setData(uri);
//                        startActivityForResult(intent, REQUEST_PERMISSION_SETTING);
//                    }
//                });
//                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.cancel();
//                    }
//                });
//                builder.show();
//            } else {
//
//                Toast.makeText(this, "Unable to Get Permissions", Toast.LENGTH_SHORT).show();
//                Toast.makeText(this, "App will not work properly", Toast.LENGTH_SHORT).show();
//
//            }
//        }
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == REQUEST_PERMISSION_SETTING){
//            if(ActivityCompat.checkSelfPermission(Splash.this, permissionRequired[0]) == PackageManager.PERMISSION_GRANTED){
//                proceedAfterPermission();
//            }
//        }
//
//        if (requestCode == EXIT_CODE){
//            if (requestCode == RESULT_OK){
//                if (data.getBooleanExtra("EXIT", true));
//                    finish();
//            }
//        }
//    }

    private void proceedAfterPermission() {

        // this code crashes when reopening the app
//        Toast.makeText(this, "Got All Permissions", Toast.LENGTH_SHORT).show();

        startActivityForResult(new Intent(Splash.this, MainActivity.class), EXIT_CODE);
        finish();

    }
}