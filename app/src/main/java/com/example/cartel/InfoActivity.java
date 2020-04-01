package com.example.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

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

    }



}
