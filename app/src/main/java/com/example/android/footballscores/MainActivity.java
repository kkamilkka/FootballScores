package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;

        displayGoalForTeamA(scoreTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * +1 goal
     */

    public void oneGoalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }

    /**
     * Displays the fouls for Team A.
     */

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * +1 foul
     */

    public void oneFoulA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * +1 goal
     */

    public void oneGoalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }

    /**
     * Displays the fouls for Team B.
     */

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * +1 foul
     */

    public void oneFoulB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

}
