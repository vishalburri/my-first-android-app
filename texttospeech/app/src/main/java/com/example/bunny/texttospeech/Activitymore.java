package com.example.bunny.texttospeech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activitymore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymore);
    }
    public void backto(View view){
        Intent sta = new Intent(this,MainActivity.class);
        startActivity(sta);
    }
}
