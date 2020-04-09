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
                startActivity(acreedIntent);
                break;
            case R.id.watchdogsid:
                Intent watchIntent=new Intent(AdventureActivity.this,InfoActivity.class);
                startActivity(watchIntent);
                break;
            case R.id.cyberpunkid:
                Intent cyberIntent=new Intent(AdventureActivity.this,InfoActivity.class);
                startActivity(cyberIntent);
                break;
            case R.id.witcher3id:
                Intent witcherIntent=new Intent(AdventureActivity.this,InfoActivity.class);
                startActivity(witcherIntent);
                break;
        }
    }
}
