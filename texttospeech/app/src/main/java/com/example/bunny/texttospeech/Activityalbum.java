package com.example.bunny.texttospeech;

import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import java.util.Locale;

public class Activityalbum extends AppCompatActivity {
    TextToSpeech t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityalbum);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                    String toSpeak = "Here is your birthday album";
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

        VideoView bvideo = (VideoView) findViewById(R.id.videoView);
        String videopath = "android.resource://com.example.bunny.texttospeech/"+R.raw.happy;
        Uri uri = Uri.parse(videopath);
        bvideo.setVideoURI(uri);
        bvideo.start();
    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        VideoView bvideo = (VideoView) findViewById(R.id.videoView);
        bvideo.pause();
        super.onPause();
    }
}
