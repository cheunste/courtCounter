package com.example.stephen.courtcounter;

import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeA(View v){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);

    }

    public void addTwoA(View v){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA   );
    }

    public void freeThrowA(View v){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeB(View v){
        scoreTeamB+=3;
        displayForTeamA(scoreTeamB);

    }

    public void addTwoB(View v){
        scoreTeamB+=2;
        displayForTeamA(scoreTeamB   );
    }

    public void freeThrowB(View v){
        scoreTeamB+=1;
        displayForTeamA(scoreTeamB);
    }

    public void reset(View v){

        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
