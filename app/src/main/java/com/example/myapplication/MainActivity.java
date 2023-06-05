package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button changeToChose;
    public Button changeToVs;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeToChose = (Button) findViewById(R.id.title_activity_level_choser);
        changeToVs = (Button) findViewById(R.id.playerVsPlayer);
        changeToChose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityChose();
            }
        });
        changeToChose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityVs();
            }
        });
    }

    public void openActivityChose(){
        Intent intentChose = new Intent(this, LevelChoser.class);
        MainActivity.this.startActivity(intentChose);
    }
    public void openActivityVs(){
        Intent intentVs = new Intent(this, PlayerVsPlayer.class);
        MainActivity.this.startActivity(intentVs);
    }

}