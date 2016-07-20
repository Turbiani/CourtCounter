package com.example.user.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Resets Score for both Teams.
     */
    public void resetScores(View view){
        scoreTeamA = 0 ;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0 ;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increases score for Team A.
     */
    public void add3ForTeamA(View view){
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
    }
    public void add2ForTeamA(View view){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);
    }
    public void addFreeThrowForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increases score for Team B.
     */
    public void add3ForTeamB(View view){
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB(scoreTeamB);
    }
    public void add2ForTeamB(View view){
        scoreTeamB = scoreTeamB + 2 ;
        displayForTeamB(scoreTeamB);
    }
    public void addFreeThrowForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
