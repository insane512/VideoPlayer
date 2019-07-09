package com.example.myapplication;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.MediaController;

import android.widget.VideoView;



public class MainActivity extends AppCompatActivity {


   private VideoView videoplayerA;
   private MediaController mediaController;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       videoplayerA = (VideoView) findViewById(R.id.videoPlayerA);

       mediaController = new MediaController(this);
       videoplayerA.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
       mediaController.setAnchorView(videoplayerA);
       videoplayerA.setMediaController(mediaController);
       videoplayerA.start();



    }





}
