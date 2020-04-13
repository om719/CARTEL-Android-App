package com.example420.cartel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import Model.ListItem;

public class InfoActivity extends AppCompatActivity {

    private ImageView gameimage;
    private TextView  gamename;
    private TextView gameprice;
    private TextView gamebio;
    private Bundle extras;
    private Button buy;
    DatabaseReference reff;
    Products products;
    long Maxid=0;
    private List<ListItem> listItems;
    public String[] myProducts;
    private ImageView cartbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        gameimage=(ImageView) findViewById(R.id.gameimageid);
        gamename=(TextView) findViewById(R.id.gamenameid);
        gameprice=(TextView) findViewById(R.id.priceid);
        gamebio=(TextView) findViewById(R.id.gameinfoid);
        buy=(Button) findViewById(R.id.buynowid);
        cartbut=(ImageView) findViewById(R.id.cartimageid);
        extras=getIntent().getExtras();
        products =new Products();
        reff= FirebaseDatabase.getInstance().getReference().child("Products");

        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists())
                {
                    Maxid=dataSnapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        if(extras!=null)
        {
            String gameb=extras.getString("Bio");
            String gamen=extras.getString("Name");
            String gamep=extras.getString("Price");

            setUp(gameb,gamen,gamep);
        }


        final String gamen2=extras.getString("Name");
        final String gamep2=extras.getString("Price");


        cartbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                products.setName(gamen2);
                products.setPrice(gamep2);
                //reff.push().setValue(products);
                reff.child(String.valueOf(Maxid + 1)).setValue(products);


                Intent cartintent=new Intent(InfoActivity.this,CartActivity.class);
                cartintent.putExtra("Product_name",gamen2);
                cartintent.putExtra("Product_price",gamep2);
                startActivity(cartintent);
            }
        });


        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payintent=new Intent(InfoActivity.this,Buynow.class);
                payintent.putExtra("name",gamen2);
                payintent.putExtra("price",gamep2);
                payintent.putExtra("number","1");
                startActivity(payintent);
            }
        });

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

        if(name.equals("Satisfactory"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.satisfactory_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Flight Simulator"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.flight_sim_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("The Sims"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.the_sims_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Theme Park"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.theme_park_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("NBA 2k20"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.nba2k20image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("FIFA 20"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.fifa20image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Forza Motorsport 7"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.motorsport7));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }
        if(name.equals("Dirt Rally 2.0"))
        {
            gameimage.setImageDrawable(getResources().getDrawable(R.drawable.dirt_rally_image));
            gamebio.setText(bio);
            gameprice.setText(price);
            gamename.setText(name);

        }







    }



}
