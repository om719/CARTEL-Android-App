package com.example.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimulationActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        Button satisfactoryid = (Button) findViewById(R.id.satisfactorybutton);
        Button flightsimid = (Button) findViewById(R.id.flight_simulatorbutton);
        Button themepark = (Button) findViewById(R.id.themeParkbutton);
        Button thesimsid = (Button) findViewById(R.id.thesimsbutton);


        satisfactoryid.setOnClickListener(this);
        flightsimid.setOnClickListener(this);
        themepark.setOnClickListener(this);
        thesimsid.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.satisfactorybutton:
                Intent satisfacIntent=new Intent(SimulationActivity.this,InfoActivity.class);
                satisfacIntent.putExtra("Name","Satisfactory");
                satisfacIntent.putExtra("Bio","Satisfactory is a simulation game created by Coffee Stain Studios. As an engineer, the player is dropped onto an alien planet with a handful of tools and must harvest the planet's natural resources to construct increasingly complex factories for automating all resource needs.");
                satisfacIntent.putExtra("Price","999");
                startActivity(satisfacIntent);
                break;
            case R.id.flight_simulatorbutton:
                Intent flightIntent=new Intent(SimulationActivity.this,InfoActivity.class);
                flightIntent.putExtra("Name","Flight Simulator");
                flightIntent.putExtra("Bio","Microsoft Flight Simulator is a flight simulator program, for Microsoft Windows operating systems, and earlier for MS-DOS and Classic Mac OS. It is one of the longest-running, best-known, and most comprehensive home flight simulator programs on the market.");
                flightIntent.putExtra("Price","1500");
                startActivity(flightIntent);
                break;
            case R.id.thesimsbutton:
                Intent simsIntent=new Intent(SimulationActivity.this,InfoActivity.class);
                simsIntent.putExtra("Name","The Sims");
                simsIntent.putExtra("Bio","The Sims is a series of life simulation video games developed by Maxis and published by Electronic Arts. The player creates virtual people called \"Sims\" places them in houses and helps direct their moods and satisfy their desires");
                simsIntent.putExtra("Price","3500");
                startActivity(simsIntent);
                break;
            case R.id.themeParkbutton:
                Intent tparkIntent=new Intent(SimulationActivity.this,InfoActivity.class);
                tparkIntent.putExtra("Name","Theme Park");
                tparkIntent.putExtra("Bio","Theme Park is a construction and management simulation video game developed by Bullfrog Productions.  The player designs and operates an amusement park, with the goal of making money and creating theme parks worldwide.");
                tparkIntent.putExtra("Price","1500");
                startActivity(tparkIntent);
                break;
        }
    }
}
