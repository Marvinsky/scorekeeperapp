package com.example.android.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int foulsTeamA = 0;
    int offsidesTeamA = 0;
    int cornersTeamA = 0;
    int possesionTeamA = 0;

    int goalsTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;
    int foulsTeamB = 0;
    int offsidesTeamB = 0;
    int cornersTeamB = 0;
    int possesionTeamB = 0;

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

    private void displayFoulsTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    private void displayOffsidesA(int offsides) {
        TextView offsideView = (TextView) findViewById(R.id.team_a_offsides);
        offsideView.setText(String.valueOf(offsides));
    }

    private void displayCornersA(int corners) {
        TextView cornersView = (TextView) findViewById(R.id.team_a_corners);
        cornersView.setText(String.valueOf(corners));
    }

    private void displayPossesionA(int possesion) {
        TextView possesionView = (TextView) findViewById(R.id.team_a_possession);
        possesionView.setText(possesionTeamA() + "%");
    }

    private String possesionTeamA() {
        return String.valueOf(Math.round(possesionTeamA/(possesionTeamA + possesionTeamB)));
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

    private void displayFoulsTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    private void displayOffsidesB(int offsides) {
        TextView offsideView = (TextView) findViewById(R.id.team_b_offsides);
        offsideView.setText(String.valueOf(offsides));
    }

    private void displayCornersB(int corners) {
        TextView cornersView = (TextView) findViewById(R.id.team_b_corners);
        cornersView.setText(String.valueOf(corners));
    }

    private void displayPossesionB(int possesion) {
        TextView possesionView = (TextView) findViewById(R.id.team_b_possession);
        possesionView.setText(possesionTeamB() + "%");
    }

    private String possesionTeamB() {
        return String.valueOf(Math.round(possesionTeamB/(possesionTeamA + possesionTeamB)));
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

    public void addFoulsForTeamA(View view) {
        foulsTeamA += 1;
        displayFoulsTeamA(foulsTeamA);
    }

    public void addOffsidesForTeamA(View view) {
        offsidesTeamA += 1;
        displayOffsidesA(offsidesTeamA);
    }

    public void addCornersForTeamA(View view) {
        cornersTeamA += 1;
        displayCornersA(cornersTeamA);
    }

    public void addPosessionForTeamA(View view) {
        possesionTeamA += 1;
        displayPossesionA(possesionTeamA);
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

    public void addFoulsForTeamB(View view) {
        foulsTeamB += 1;
        displayFoulsTeamB(foulsTeamB);
    }

    public void addOffsidesForTeamB(View view) {
        offsidesTeamB += 1;
        displayOffsidesB(offsidesTeamB);
    }

    public void addCornersForTeamB(View view) {
        cornersTeamB += 1;
        displayCornersB(cornersTeamB);
    }

    public void addPosessionForTeamB(View view) {
        possesionTeamB += 1;
        displayPossesionB(possesionTeamB);
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

