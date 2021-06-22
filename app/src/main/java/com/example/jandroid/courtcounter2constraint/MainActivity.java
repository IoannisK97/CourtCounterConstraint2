package com.example.jandroid.courtcounter2constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsA=0;
    int goalsB=0;
    int foulsA=0;
    int foulsB=0;
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }
    public void displayGoalsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_fouls);
        scoreView.setText("Number of fouls: "+String.valueOf(score));
    }
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_fouls);
        scoreView.setText("Number of fouls: "+String.valueOf(score));
    }

    public void scoredGoalA(View view){
        goalsA = goalsA + 1;
        displayGoalsForTeamA(goalsA);
    }
    public void scoredGoalB(View view){
        goalsB = goalsB + 1;
        displayGoalsForTeamB(goalsB);
    }
    public void commitFoulA(View view){
        foulsA = foulsA + 1;
        displayFoulsForTeamA(foulsA);
    }
    public void commitFoulB(View view){
        foulsB = foulsB + 1;
        displayFoulsForTeamB(foulsB);
    }
    public void reset_all(View view){
        TextView textView=(TextView) findViewById(R.id.text_view_message);
        if (goalsA>goalsB){
            textView.setText("Team A won the previous match");
        }
        else if (goalsB>goalsA){
            textView.setText("Team B won the previous match");
        }
        else{
            textView.setText("The last match was a draw");
        }
        goalsA=0;
        goalsB=0;
        foulsB=0;
        foulsA=0;
        displayFoulsForTeamA(foulsA);
        displayFoulsForTeamB(foulsB);
        displayGoalsForTeamA(goalsA);
        displayGoalsForTeamB(goalsB);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}