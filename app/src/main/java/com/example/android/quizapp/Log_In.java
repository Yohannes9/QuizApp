package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class Log_In extends AppCompatActivity {
    public String playerName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);



    }
    public void startQuiz(View v){

        EditText text = (EditText) findViewById(R.id.namePlayer);
        playerName = text.toString();
        Intent homepage = new Intent(this, MainActivity.class);
        homepage.putExtra("player",playerName);
        startActivity(homepage);
    }

}
