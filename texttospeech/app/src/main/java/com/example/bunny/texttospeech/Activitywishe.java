package com.example.bunny.texttospeech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activitywishe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitywishe);
    }
    public void morewish(View view){
        Intent sta = new Intent(this,Activitymore.class);
        startActivity(sta);
    }
}
