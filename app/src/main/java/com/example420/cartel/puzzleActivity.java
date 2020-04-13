package com.example420.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class puzzleActivity extends AppCompatActivity implements View.OnClickListener {

    private Button brotherstale;
    private Button portal2;
    private Button wayout;
    private Button theroom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        brotherstale=(Button) findViewById(R.id.brotherstalebutton);
        portal2=(Button) findViewById(R.id.portal2button);
        theroom=(Button) findViewById(R.id.theroomButton);
        wayout=(Button) findViewById(R.id.wayoutbutton);


        brotherstale.setOnClickListener(this);
        portal2.setOnClickListener(this);
        theroom.setOnClickListener(this);
        wayout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.brotherstalebutton:
                Intent brothersIntent=new Intent(puzzleActivity.this,InfoActivity.class);
                brothersIntent.putExtra("Name","Brothers");
                brothersIntent.putExtra("Bio","Brothers: A Tale of Two Sons is an adventure game developed by Starbreeze Studios. Two brothers venture into an adventure to save their dying father by retrieving water from the tree of life.");
                brothersIntent.putExtra("Price","999");
                startActivity(brothersIntent);
                break;
            case R.id.portal2button:
                Intent portalIntent=new Intent(puzzleActivity.this,InfoActivity.class);
                portalIntent.putExtra("Name","Portal 2");
                portalIntent.putExtra("Bio","Portal 2 is a puzzle-platform game developed by Valve.Players solve puzzles by placing portals and teleporting between them. Portal 2 adds features including tractor beams, lasers, light bridge that alter player movement.");
                portalIntent.putExtra("Price","1500");
                startActivity(portalIntent);
                break;
            case R.id.theroomButton:
                Intent roomIntent=new Intent(puzzleActivity.this,InfoActivity.class);
                roomIntent.putExtra("Name","The Room");
                roomIntent.putExtra("Bio","The Room is a puzzle video game developed by Fireproof Games.The Room presents the player with a series of strange puzzle boxes that feature a number of physical mechanisms");
                roomIntent.putExtra("Price","100");
                startActivity(roomIntent);
                break;
            case R.id.wayoutbutton:
                Intent wayoutIntent=new Intent(puzzleActivity.this,InfoActivity.class);
                wayoutIntent.putExtra("Name","A Way Out");
                wayoutIntent.putExtra("Bio","A Way Out is an action-adventure game developed by Hazelight Studios. In the game, players control Leo and Vincent, two convicted prisoners who must break out of prison and stay on the run from authorities.");
                wayoutIntent.putExtra("Price","1500");
                startActivity(wayoutIntent);
                break;
        }
    }
}
