package com.example.cartel;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    private ImageView gameimage;
    private TextView  gamename;
    private TextView gameprice;
    private TextView gamebio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        gameimage=(ImageView) findViewById(R.id.gameimageid);
        gamename=(TextView) findViewById(R.id.gamenameid);
        gameprice=(TextView) findViewById(R.id.priceid);
        gamebio=(TextView) findViewById(R.id.gameinfoid);

        extras=getIntent().getExtras();

        if(extras!=null)
        {
            String gameb=extras.getString("Bio");
            String gamen=extras.getString("Name");
            String gamep=extras.getString("Price");

            setUp(gameb,gamen,gamep);
        }

    }

    public void setUp(String bio,String name,String price)
    {
        if(name.equals("God Of War"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.god_of_war));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Arkham Knight"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.poster_panel));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("GTA 5"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.armed));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Bloodborne"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.blood_poster));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }

        if(name.equals("Assassin's Creed"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.acreed_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Watch Dogs 2"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.watchdogsimage));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("CyberPunk 2077"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.cyberpunk));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Witcher-3"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.witcher3image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Super Mario Bros"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.nes_supermariobros));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Donkey Kong"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.gb_donkeykong1));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Sonic The Hedgehog"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.genesis_sonicthehedgehog));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Legend Of Zelda"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.legend_of_zelda_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }

        if(name.equals("Brothers"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.brotherstale_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }

        if(name.equals("Portal 2"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.portal2image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }

        if(name.equals("The Room"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.theroom));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }

        if(name.equals("A Way Out"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.awayoutimage));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }


    }



}
