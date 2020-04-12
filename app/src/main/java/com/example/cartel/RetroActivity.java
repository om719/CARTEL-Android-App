package com.example.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RetroActivity extends AppCompatActivity implements View.OnClickListener {

    private Button supermariobros;
    private Button donkeykong;
    private Button sonic;
    private Button legendofzelda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro);

        supermariobros=(Button) findViewById(R.id.supermariobros);
        donkeykong=(Button) findViewById(R.id.donkeykong);
        sonic=(Button) findViewById(R.id.sonic);
        legendofzelda=(Button) findViewById(R.id.legendofzelda);


        supermariobros.setOnClickListener(this);
        donkeykong.setOnClickListener(this);
        sonic.setOnClickListener(this);
        legendofzelda.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.supermariobros:
                Intent marioIntent=new Intent(RetroActivity.this,InfoActivity.class);
                marioIntent.putExtra("Name","Super Mario Bros");
                marioIntent.putExtra("Bio","Super Mario Bros. is a platform game developed Nintendo. Released in North America for the Nintendo Entertainment System in 1985. Players control Mario, or his brother Luigi to rescue Princess Toadstool from Bowser.");
                marioIntent.putExtra("Price","999");
                startActivity(marioIntent);
                break;
            case R.id.donkeykong:
                Intent donkeyIntent=new Intent(RetroActivity.this,InfoActivity.class);
                donkeyIntent.putExtra("Name","Donkey Kong");
                donkeyIntent.putExtra("Bio","Donkey Kong is a series of video games featuring the adventures of a gorilla character called Donkey Kong.This game is a single-screen platform/action puzzle types, featuring Donkey Kong as the opponent in an industrial construction setting");
                donkeyIntent.putExtra("Price","1500");
                startActivity(donkeyIntent);
                break;
            case R.id.sonic:
                Intent sonicIntent=new Intent(RetroActivity.this,InfoActivity.class);
                sonicIntent.putExtra("Name","Sonic The Hedgehog");
                sonicIntent.putExtra("Bio","Sonic the Hedgehog is a Japanese video game series and media franchise created and owned by Sega. The franchise follows Sonic, an anthropomorphic blue hedgehog who battles the evil Doctor Eggman, a mad scientist.");
                sonicIntent.putExtra("Price","3500");
                startActivity(sonicIntent);
                break;
            case R.id.legendofzelda:
                Intent zeldaIntent=new Intent(RetroActivity.this,InfoActivity.class);
                zeldaIntent.putExtra("Name","Legend Of Zelda");
                zeldaIntent.putExtra("Bio","The Legend of Zelda: Breath of the Wild is an action-adventure game developed by Nintendo, released on March 3, 2017. The player controls Link, who awakens from a hundred-year slumber to defeat Calamity Ganon before it can destroy the kingdom of Hyrule.");
                zeldaIntent.putExtra("Price","1500");
                startActivity(zeldaIntent);
                break;
        }
    }
}
