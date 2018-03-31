package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // public String playerNamed = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void evaluate(View v){

        Intent intent = getIntent();

        //Bundle extras = getIntent().getExtras();
        String playerNamed = (String)intent.getStringExtra("player");
        int score = 0;
        //double percentage = 0;

        //answers for question 1
        CheckBox question1_Answer1 = (CheckBox) findViewById(R.id.question1_option1);
        CheckBox question1_Answer2 = (CheckBox) findViewById(R.id.question1_option3);
        CheckBox question1_Answer3 = (CheckBox) findViewById(R.id.question1_option4);

        //answer for question 2

        RadioButton question2_Answer = (RadioButton) findViewById(R.id.radioButton2);

        //answer for question 3

        RadioButton question3_Answer = (RadioButton) findViewById(R.id.radioButton32);

        //answer for question 4

        EditText question4_Answer = (EditText) findViewById(R.id.question4_answer);
        //getting the input from the text editer
        String question4StringHolder = question4_Answer.getText().toString();

        //add 1 point for each correct answer
        if(question1_Answer1.isChecked()){
            score = score + 1;
        }
        if(question1_Answer2.isChecked()){
            score = score + 1;
        }
        if(question1_Answer3.isChecked()){
            score = score + 1;
        }
        if(question2_Answer.isChecked()){
            score = score + 1;
        }
        if(question3_Answer.isChecked()){
            score = score + 1;
        }
        if(question4StringHolder.equalsIgnoreCase("Lake Victoria") || question4StringHolder.equalsIgnoreCase("Victoria")){
            score = score + 1;
        }

        double percentage = ((double)score/6) * 100;
        Toast.makeText(this, playerNamed +"Score is: " + String.format("%.2f", percentage),
                Toast.LENGTH_LONG).show();
        Log.v("MainActivity", ":" + percentage);
    }
}
