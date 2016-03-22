package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;
    private TextView scoreViewA;
    private TextView scoreViewB;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public TextView getScoreViewA() {
        return scoreViewA;
    }

    public void setScoreViewA(TextView scoreViewA) {
        this.scoreViewA = scoreViewA;
    }

    public TextView getScoreViewB() {
        return scoreViewB;
    }

    public void setScoreViewB(TextView scoreViewB) {
        this.scoreViewB = scoreViewB;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setScoreTeamA(0);
        setScoreTeamB(0);

        setScoreViewA((TextView) findViewById(R.id.team_a_score));
        setScoreViewB((TextView) findViewById(R.id.team_b_score));
    }

    /**
     * Displays the given score for Team.
     */
    public void displayForTeam(int score, View view) {
        String panel = ((View) view.getParent()).getTag().toString();

        if (panel == "team_a_score_panel") {
            setScoreTeamA(score + getScoreTeamA());
            getScoreViewA().setText(String.valueOf(getScoreTeamA()));
        }
        if (panel == "team_b_score_panel") {
            setScoreTeamB(score + getScoreTeamB());
            getScoreViewB().setText(String.valueOf(getScoreTeamB()));
        }

    }

    public void pointMarkThree(View view) {
        displayForTeam(3, view);
    }

    public void pointMarkTwo(View view) {
        displayForTeam(2, view);
    }

    public void pointMarkOne(View view) {
        displayForTeam(1, view);
    }
}
