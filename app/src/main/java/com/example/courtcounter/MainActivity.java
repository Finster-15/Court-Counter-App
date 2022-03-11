package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0 , scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }

    /**
     * This method is called when +3 POINTS button is clicked for Team A.
     */
    public void threePointsForTeamA(View view)
    {
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    /**
     * This method is called when +2 POINTS button is clicked for Team A.
     */
    public void twoPointsForTeamA(View view)
    {
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    /**
     * This method is called when FREE THROW button is clicked for Team A.
     */
    public void onePointForTeamA(View view)
    {
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when +3 POINTS button is clicked for Team B.
     */
    public void threePointsForTeamB(View view)
    {
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    /**
     * This method is called when +2 POINTS button is clicked for Team B.
     */
    public void twoPointsForTeamB(View view)
    {
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    /**
     * This method is called when FREE THROW button is clicked for Team B.
     */
    public void onePointForTeamB(View view)
    {
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset score for both teams back to 0.
     */
    public void resetAll(View view)
    {
        scoreA = scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}