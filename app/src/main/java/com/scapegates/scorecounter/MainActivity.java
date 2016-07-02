package com.scapegates.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int THREE_POINTS = 3;
    final int TWO_POINTS = 2;
    final int FREE_THROW = 1;
    TextView currentView;
    int homePoints = 0;
    int awayPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void homeThreePointer(View view) {
        if(currentView == findViewById(R.id.homeTeamPoints)) {
            homePoints += THREE_POINTS;
            display(homePoints);
        } else {
            awayPoints += THREE_POINTS;
            display(awayPoints);
        }
    }

    public void homeTwoPointer(View view) {
        if(currentView == findViewById(R.id.homeTeamPoints)) {
            homePoints += TWO_POINTS;
            display(homePoints);
        } else {
            awayPoints += TWO_POINTS;
            display(awayPoints);
        }
    }

    public void homeFreeThrow(View view) {
        if(currentView == findViewById(R.id.homeTeamPoints)) {
            homePoints += FREE_THROW;
            display(homePoints);
        } else {
            awayPoints += FREE_THROW;
            display(awayPoints);
        }
    }

    private void display(int points) {
        String strScore = "" + points;
        if (currentView != null) {
            currentView.setText(strScore);
        }
    }

    public void pickHome(View view) {
        currentView = (TextView) findViewById(R.id.homeTeamPoints);
    }

    public void pickAway(View view) {
        currentView = (TextView) findViewById(R.id.awayTeamPoints);
    }
}
