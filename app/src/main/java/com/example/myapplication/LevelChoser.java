package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelChoser extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_choser);
        Button act_change_to_one;
        Button act_change_to_two;
        Button act_change_to_three;
        Button act_change_to_four;
        Button act_change_to_five;
        Button changeToChose;
        act_change_to_one = (Button) findViewById(R.id.Level_one);
        act_change_to_two = (Button) findViewById(R.id.Level_two);
        act_change_to_three = (Button) findViewById(R.id.Level_three);
        act_change_to_four = (Button) findViewById(R.id.Level_four);
        act_change_to_five = (Button) findViewById(R.id.Level_five);
        changeToChose = (Button) findViewById(R.id.title_activity_level_choser);



        act_change_to_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_1();
            }
        });
        act_change_to_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_5();
            }
        });
        act_change_to_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_4();
            }
        });
        act_change_to_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_3();
            }
        });
        act_change_to_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_2();
            }
        });
        changeToChose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityVs();
            }
        });
    }
    public void change_1(){
        Intent intentChose = new Intent(this, MainActivityLevelOne.class);
        LevelChoser.this.startActivity(intentChose);
    }
    public void change_2(){
        Intent intentChose = new Intent(this, MainActivityLevelTwo.class);
        LevelChoser.this.startActivity(intentChose);
    }
    public void change_3(){
        Intent intentChose = new Intent(this, MainActivityLevelThree.class);
        LevelChoser.this.startActivity(intentChose);
    }
    public void change_4(){
        Intent intentChose = new Intent(this, MainActivityLevelFour.class);
        LevelChoser.this.startActivity(intentChose);
    }
    public void change_5(){
        Intent intentChose = new Intent(this, MainActivityLevelFive.class);
        LevelChoser.this.startActivity(intentChose);
    }
    public void openActivityVs(){
        Intent intentVs = new Intent(this, PlayerVsPlayer.class);
        LevelChoser.this.startActivity(intentVs);
    }


};



