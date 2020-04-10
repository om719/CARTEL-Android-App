package com.example.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdventureActivity extends AppCompatActivity implements View.OnClickListener {

    private Button ascreed;
    private Button wathid;
    private Button witcherid;
    private Button cyberid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        ascreed=(Button) findViewById(R.id.acreedid);
        wathid=(Button) findViewById(R.id.watchdogsid);
        cyberid=(Button) findViewById(R.id.cyberpunkid);
        witcherid=(Button) findViewById(R.id.witcher3id);


        ascreed.setOnClickListener(this);
        wathid.setOnClickListener(this);
        cyberid.setOnClickListener(this);
        witcherid.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.acreedid:
                Intent acreedIntent=new Intent(AdventureActivity.this,InfoActivity.class);
                acreedIntent.putExtra("Name","Assassin's Creed");
                acreedIntent.putExtra("Bio","Assassin's Creed is an action-adventure stealth video game. It depicts a centuries-old struggle, now and then, between the Assassins, who fight for peace with free will, and the Templars, who desire peace through control.");
                acreedIntent.putExtra("Price","999");
                startActivity(acreedIntent);
                break;
            case R.id.watchdogsid:
                Intent watchIntent=new Intent(AdventureActivity.this,InfoActivity.class);
                watchIntent.putExtra("Name","Watch Dogs 2");
                watchIntent.putExtra("Bio","Watch Dogs 2 is a 2016 action-adventure game developed by Ubisoft. Players control Marcus Holloway, a hacker who works with the hacking group DedSec to take down the city's advanced surveillance system known as ctOS.");
                watchIntent.putExtra("Price","1500");
                startActivity(watchIntent);
                break;
            case R.id.cyberpunkid:
                Intent cyberIntent=new Intent(AdventureActivity.this,InfoActivity.class);
                cyberIntent.putExtra("Name","CyberPunk 2077");
                cyberIntent.putExtra("Bio","Cyberpunk 2077 is a role-playing video game developed and published by CD Projekt. It takes place in dystopian Night City.Players assume the role of the customisable mercenary V in a first-person perspective");
                cyberIntent.putExtra("Price","3500");
                startActivity(cyberIntent);
                break;
            case R.id.witcher3id:
                Intent witcherIntent=new Intent(AdventureActivity.this,InfoActivity.class);
                witcherIntent.putExtra("Name","Witcher-3");
                witcherIntent.putExtra("Bio","The Witcher 3: Wild Hunt is a 2015 action role-playing game developed and published by CD Projekt. Players control protagonist Geralt of Rivia, a monster slayer who is looking for his missing adopted daughter on the run.");
                witcherIntent.putExtra("Price","1500");
                startActivity(witcherIntent);
                break;
        }
    }
}
