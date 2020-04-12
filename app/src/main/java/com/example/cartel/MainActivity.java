package com.example.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button actn;
    private Button advn;
    private Button pzle;
    private Button sim;
    private Button sports;
    private Button retro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actn=(Button) findViewById(R.id.actionid);
        advn=(Button) findViewById(R.id.adventureid);
        pzle=(Button) findViewById(R.id.puzzleid);
        sim=(Button) findViewById(R.id.simulationid);
        sports=(Button) findViewById(R.id.sportsid);
        retro=(Button) findViewById(R.id.retroid);

        actn.setOnClickListener(this);
        pzle.setOnClickListener(this);
        advn.setOnClickListener(this);
        sim.setOnClickListener(this);
        retro.setOnClickListener(this);
        sports.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.actionid:
            Intent newintent = new Intent(MainActivity.this, TypeActivity.class);
            startActivity(newintent);
            break;
            case R.id.adventureid:
                Intent adIntent=new Intent(MainActivity.this,AdventureActivity.class);
                startActivity(adIntent);
                break;
            case R.id.retroid:
                Intent retroIntent = new Intent(MainActivity.this,RetroActivity.class);
                startActivity(retroIntent);

            case R.id.puzzleid:
                Intent puzzleIntent = new Intent(MainActivity.this,puzzleActivity.class);
                startActivity(puzzleIntent);
            case R.id.simulationid:
                Intent simulationIntent = new Intent(MainActivity.this,SimulationActivity.class);
                startActivity(simulationIntent);
            case R.id.sportsid:
                Intent sportsIntent = new Intent(MainActivity.this,SportsActivity.class);
                startActivity(sportsIntent);

        }

    }
}
