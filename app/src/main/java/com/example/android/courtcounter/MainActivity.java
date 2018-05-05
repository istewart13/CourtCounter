package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_LONG_SHOT = 3;
    final int POINTS_FOR_SHORT_SHOT = 2;
    final int POINTS_FOR_FREE_THROW = 1;
    final int INITIAL_SCORE = 0;

    int teamAScore = INITIAL_SCORE;
    int teamBScore = INITIAL_SCORE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementTeamAScore(View view) {
        switch (view.getId()) {
            case R.id.teamA3Points:
                teamAScore += POINTS_FOR_LONG_SHOT;
                break;
            case R.id.teamA2Points:
                teamAScore += POINTS_FOR_SHORT_SHOT;
                break;
            case R.id.teamAFreeThrow:
                teamAScore += POINTS_FOR_FREE_THROW;
                break;
        }
        updateTeamAScoreTextView();
    }

    public void incrementTeamBScore(View view) {
        switch (view.getId()) {
            case R.id.teamB3Points:
                teamBScore += POINTS_FOR_LONG_SHOT;
                break;
            case R.id.teamB2Points:
                teamBScore += POINTS_FOR_SHORT_SHOT;
                break;
            case R.id.teamBFreeThrow:
                teamBScore += POINTS_FOR_FREE_THROW;
                break;
        }
        updateTeamBScoreTextView();
    }

    public void updateTeamAScoreTextView() {
        TextView teamAScoreTextView = (TextView) findViewById(R.id.teamAScore);
        teamAScoreTextView.setText(String.valueOf(teamAScore));
    }

    public void updateTeamBScoreTextView() {
        TextView teamBScoreTextView = (TextView) findViewById(R.id.teamBScore);
        teamBScoreTextView.setText(String.valueOf(teamBScore));
    }

    public void resetScores(View view) {
        teamAScore = INITIAL_SCORE;
        teamBScore = INITIAL_SCORE;
        updateTeamAScoreTextView();
        updateTeamBScoreTextView();
    }
}
