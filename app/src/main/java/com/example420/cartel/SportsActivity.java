package com.example420.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SportsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button nba2k20;
    private Button fifa20;
    private Button motorsport7;
    private Button dirtrally2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        nba2k20=(Button) findViewById(R.id.nba2k20button);
        fifa20=(Button) findViewById(R.id.fifa20button);
        motorsport7=(Button) findViewById(R.id.motorsportbutton);
        dirtrally2=(Button) findViewById(R.id.dirtrally2button);


        nba2k20.setOnClickListener(this);
        fifa20.setOnClickListener(this);
        motorsport7.setOnClickListener(this);
        dirtrally2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.nba2k20button:
                Intent nba2k20Intent=new Intent(SportsActivity.this,InfoActivity.class);
                nba2k20Intent.putExtra("Name","NBA 2k20");
                nba2k20Intent.putExtra("Bio","NBA 2K20 is a basketball simulation video game developed by Visual Concepts and published by 2K Sports. NBA 2K20 is a basketball simulation game which, like the previous games in the series, strives to realistically depict the National Basketball Association(NBA)");
                nba2k20Intent.putExtra("Price","999");
                startActivity(nba2k20Intent);
                break;
            case R.id.fifa20button:
                Intent fifaIntent=new Intent(SportsActivity.this,InfoActivity.class);
                fifaIntent.putExtra("Name","FIFA 20");
                fifaIntent.putExtra("Bio","FIFA 20 is a football simulation video game published by Electronic Arts. Gameplay changes to FIFA 20 focus primarily on a new feature titled VOLTA Football.The mode, which translates to 'return' in Portuguese, focuses on street football rather than the traditional matches associated with the FIFA series");
                fifaIntent.putExtra("Price","1500");
                startActivity(fifaIntent);
                break;
            case R.id.motorsportbutton:
                Intent motorsportIntent=new Intent(SportsActivity.this,InfoActivity.class);
                motorsportIntent.putExtra("Name","Forza Motorsport 7");
                motorsportIntent.putExtra("Bio","Forza Motorsport 7 is a racing video game developed by Turn 10 Studios.Forza Motorsport 7 is a racing video game featuring over 700 cars and more than 200 different configurations to race on across 32 locations at launch");
                motorsportIntent.putExtra("Price","1000");
                startActivity(motorsportIntent);
                break;
            case R.id.dirtrally2button:
                Intent dirtrallyIntent=new Intent(SportsActivity.this,InfoActivity.class);
                dirtrallyIntent.putExtra("Name","Dirt Rally 2.0");
                dirtrallyIntent.putExtra("Bio","Dirt Rally 2.0 is a racing video game developed and published by Codemasters. Dirt Rally 2.0 is focused on rallying and rallycross. Players compete in timed stage events on tarmac and off-road terrain in varying weather conditions.");
                dirtrallyIntent.putExtra("Price","1500");
                startActivity(dirtrallyIntent);
                break;
        }
    }
}
