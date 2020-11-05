package com.example.android.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int goalsTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void displayGoalsForTeamA(int goals) {
        TextView goalsView  = (TextView) findViewById(R.id.team_a_goals);
        goalsView.setText(String.valueOf(goals));
    }

    private void displayYellowCardsForTeamA(int cards) {
        TextView yellowView  = (TextView) findViewById(R.id.team_a_yellow_cards);
        yellowView.setText(String.valueOf(cards));
    }

    private void displayRedCardsForTeamA(int cards) {
        TextView redView  = (TextView) findViewById(R.id.team_a_red_cards);
        redView.setText(String.valueOf(cards));
    }

    private void displayGoalsForTeamB(int goals) {
        TextView goalsView  = (TextView) findViewById(R.id.team_b_goals);
        goalsView.setText(String.valueOf(goals));
    }

    private void displayYellowCardsForTeamB(int cards) {
        TextView yellowView  = (TextView) findViewById(R.id.team_b_yellow_cards);
        yellowView.setText(String.valueOf(cards));
    }

    private void displayRedCardsForTeamB(int cards) {
        TextView redView  = (TextView) findViewById(R.id.team_b_red_cards);
        redView.setText(String.valueOf(cards));
    }




    public void addGoalForTeamA(View view) {
        goalsTeamA += 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    public void addYelloCardForTeamA(View view) {
        yellowCardsTeamA += 1;
        displayYellowCardsForTeamA(yellowCardsTeamA);
    }

    public void addRedCardForTeamA(View view) {
        redCardsTeamA += 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }


    public void addGoalForTeamB(View view) {
        goalsTeamB += 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    public void addYelloCardForTeamB(View view) {
        yellowCardsTeamB += 1;
        displayYellowCardsForTeamB(yellowCardsTeamB);
    }

    public void addRedCardForTeamB(View view) {
        redCardsTeamB += 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }


    public void resetPlayers(View view) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayYellowCardsForTeamA(yellowCardsTeamA);
        displayRedCardsForTeamA(redCardsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayYellowCardsForTeamB(yellowCardsTeamB);
        displayRedCardsForTeamB(redCardsTeamB);
    }

}

