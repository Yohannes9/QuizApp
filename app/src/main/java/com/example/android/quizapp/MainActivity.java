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


    //Bundle extras = getIntent().getExtras();
    String playerNamed = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        //Bundle extras = getIntent().getExtras();
        playerNamed =  intent.getStringExtra("player");


    }

    public void evaluate(View v) {
        CheckBox question1_Answer1 = (CheckBox) findViewById(R.id.question1_option1);
        CheckBox question1_Answer2 = (CheckBox) findViewById(R.id.question1_option3);
        CheckBox question1_Answer3 = (CheckBox) findViewById(R.id.question1_option4);
        CheckBox question1_noneAnswer = (CheckBox) findViewById(R.id.question1_option2);
        //answ for question 2

        RadioButton question2_Answer = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton question2_notAnswer = (RadioButton) findViewById(R.id.radioButton);
        //answer for question 3

        RadioButton question3_Answer = (RadioButton) findViewById(R.id.radioButton32);
        RadioButton question3_notAnswer1 = (RadioButton) findViewById(R.id.radioButton31);
        RadioButton question3_notAnswer2 = (RadioButton) findViewById(R.id.radioButton33);
        RadioButton question3_notAnswer3 = (RadioButton) findViewById(R.id.radioButton34);

        //answer for question 4

        EditText question4_Answer = (EditText) findViewById(R.id.question4_answer);

        //getting the input from the text editer
        String question4StringHolder = question4_Answer.getText().toString();
        int score = 0;
        //double percentage = 0;

        //answers for question 1


        //add 1 point for each correct answer
        if (question1_Answer1.isChecked()) {
            score = score + 1;
        }
        if (question1_Answer2.isChecked()) {
            score = score + 1;
        }
        if (question1_Answer3.isChecked()) {
            score = score + 1;
        }
        if (question2_Answer.isChecked()) {
            score = score + 1;
        }
        if (question3_Answer.isChecked()) {
            score = score + 1;
        }
        if (question4StringHolder.equalsIgnoreCase("Lake Victoria") || question4StringHolder.equalsIgnoreCase("Victoria")) {
            score = score + 1;
        }

        double percentage = ((double) score / 6) * 100;
        Toast.makeText(this, playerNamed + "Score is: " + String.format("%.2f", percentage),
                Toast.LENGTH_LONG).show();
        Log.v("MainActivity", ":" + percentage);
    }

    public void reset(View v) {

        CheckBox question1_Answer1 = (CheckBox) findViewById(R.id.question1_option1);
        CheckBox question1_Answer2 = (CheckBox) findViewById(R.id.question1_option3);
        CheckBox question1_Answer3 = (CheckBox) findViewById(R.id.question1_option4);
        CheckBox question1_noneAnswer = (CheckBox) findViewById(R.id.question1_option2);
        //answ for question 2

        RadioButton question2_Answer = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton question2_notAnswer = (RadioButton) findViewById(R.id.radioButton);
        //answer for question 3

        RadioButton question3_Answer = (RadioButton) findViewById(R.id.radioButton32);
        RadioButton question3_notAnswer1 = (RadioButton) findViewById(R.id.radioButton31);
        RadioButton question3_notAnswer2 = (RadioButton) findViewById(R.id.radioButton33);
        RadioButton question3_notAnswer3 = (RadioButton) findViewById(R.id.radioButton34);

        //answer for question 4

        EditText question4_Answer = (EditText) findViewById(R.id.question4_answer);
        question1_Answer1.setChecked(false);
        question1_Answer2.setChecked(false);
        question1_noneAnswer.setChecked(false);
        question1_Answer3.setChecked(false);

        question2_notAnswer.setChecked(false);
        question2_Answer.setChecked(false);

        question3_Answer.setChecked(false);
        question3_notAnswer1.setChecked(false);
        question3_notAnswer2.setChecked(false);
        question1_Answer3.setChecked(false);

        question4_Answer.setText("");
    }

}
