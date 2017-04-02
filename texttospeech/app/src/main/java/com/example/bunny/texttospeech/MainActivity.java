package com.example.bunny.texttospeech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Locale;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextToSpeech t1;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ed1=(EditText)findViewById(R.id.editText);
        //b1=(Button)findViewById(R.id.button);

        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                    String toSpeak = "Birthdays come around every year, but friends like you only come once in a lifetime. So glad you came into our life. Best wishes on your special day.Happy Birthday       Harshini.";
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });


    }
    public void viewAlbum(View view){
        Intent start = new Intent(this,Activityalbum.class);
        startActivity(start);
    }
    public void viewwish(View view){
        Intent start = new Intent(this,Activitywishe.class);
        startActivity(start);
    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }
}

