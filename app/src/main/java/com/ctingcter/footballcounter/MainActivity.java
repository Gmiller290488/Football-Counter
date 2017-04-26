package com.ctingcter.footballcounter;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int HomeGoalsNum = 0;
    int AwayGoalsNum = 0;
    int HomeYellowsNum = 0;
    int AwayYellowsNum = 0;
    int HomeRedsNum = 0;
    int AwayRedsNum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // All the Home team buttons
        Button HomeTeamGoal = (Button) findViewById(R.id.HomeGoalBtn);
        HomeTeamGoal.setOnClickListener(this);
        Button HomeYellowCard = (Button) findViewById(R.id.HomeYellowBtn);
        HomeYellowCard.setOnClickListener(this);
        Button HomeRedCard = (Button) findViewById(R.id.HomeRedBtn);
        HomeRedCard.setOnClickListener(this);

        // All the Away team buttons
        Button AwayTeamGoal = (Button) findViewById(R.id.AwayGoalBtn);
        AwayTeamGoal.setOnClickListener(this);
        Button AwayYellowCard = (Button) findViewById(R.id.AwayYellowBtn);
        AwayYellowCard.setOnClickListener(this);
        Button AwayRedCard = (Button) findViewById(R.id.AwayRedBtn);
        AwayRedCard.setOnClickListener(this);

        // Reset all button
        Button Reset = (Button) findViewById(R.id.Reset);
        Reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView HomeGoals = (TextView) findViewById(R.id.HomeTeamGoals);
        TextView AwayGoals = (TextView) findViewById(R.id.AwayTeamGoals);
        TextView HomeScore = (TextView) findViewById(R.id.HomeTeamScore);
        TextView AwayScore = (TextView) findViewById(R.id.AwayTeamScore);
        TextView HomeYellow = (TextView) findViewById(R.id.HomeTeamYellowCards);
        TextView AwayYellow = (TextView) findViewById(R.id.AwayTeamYellowCards);
        TextView HomeRed = (TextView) findViewById(R.id.HomeTeamRedCards);
        TextView AwayRed = (TextView) findViewById(R.id.AwayTeamRedCards);


        switch (v.getId()) {
            // Goal for Home team
            case R.id.HomeGoalBtn:
                HomeGoalsNum++;
                HomeScore.setText(String.valueOf(HomeGoalsNum));
                HomeGoals.setText(String.valueOf(HomeGoalsNum));
                break;

            // Goal for Away team
            case R.id.AwayGoalBtn:
                AwayGoalsNum++;
                AwayScore.setText(String.valueOf(AwayGoalsNum));
                AwayGoals.setText(String.valueOf(AwayGoalsNum));
                break;

            // Yellow card for Home team
            case R.id.HomeYellowBtn:
                HomeYellowsNum++;
                HomeYellow.setText(String.valueOf(HomeYellowsNum));
                break;

            // Yellow card for Away team
            case R.id.AwayYellowBtn:
                AwayYellowsNum++;
                AwayYellow.setText(String.valueOf(AwayYellowsNum));

                // Red card for Home team
            case R.id.HomeRedBtn:
                HomeRedsNum++;
                HomeRed.setText(String.valueOf(HomeRedsNum));
                break;

            // Red card for Away team
            case R.id.AwayRedBtn:
                AwayRedsNum++;
                AwayRed.setText(String.valueOf(AwayRedsNum));
                break;

            // Reset all scores - But doesn't reset Team name
            case R.id.Reset:
                HomeGoalsNum = 0;
                AwayGoalsNum = 0;
                HomeYellowsNum = 0;
                AwayYellowsNum = 0;
                HomeRedsNum = 0;
                AwayRedsNum = 0;
                HomeGoals.setText(String.valueOf(HomeGoalsNum));
                AwayGoals.setText(String.valueOf(AwayGoalsNum));
                HomeScore.setText(String.valueOf(HomeGoalsNum));
                AwayScore.setText(String.valueOf(AwayGoalsNum));
                HomeYellow.setText(String.valueOf(HomeYellowsNum));
                AwayYellow.setText(String.valueOf(AwayYellowsNum));
                HomeRed.setText(String.valueOf(HomeRedsNum));
                AwayRed.setText(String.valueOf(AwayRedsNum));

                break;
        }


    }


}
