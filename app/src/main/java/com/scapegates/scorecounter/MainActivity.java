package com.scapegates.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homePoints = 0;
    int awayPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void homeThreePointer(View view) {
        homePoints += 3;
        display(homePoints);
    }

    public void homeTwoPointer(View view) {
        homePoints += 2;
        display(homePoints);
    }

    public void homeFreeThrow(View view) {
        homePoints += 1;
        display(homePoints);
    }

    private void display(int points) {
        TextView score = (TextView) findViewById(R.id.homeTeamPoints);
        String strScore = "" + homePoints;
        if (score != null) {
            score.setText(strScore);
        }
    }
}
