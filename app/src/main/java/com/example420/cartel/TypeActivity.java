package com.example420.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TypeActivity extends AppCompatActivity implements View.OnClickListener {


    private Button bat;
    private Button god;
    private Button blood;
    private Button gta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        bat=(Button) findViewById(R.id.batmanid);
        god=(Button) findViewById(R.id.godofwarid);
        blood=(Button) findViewById(R.id.bloodborneid);
        gta=(Button) findViewById(R.id.gtaid);

        bat.setOnClickListener(this);
        god.setOnClickListener(this);
        blood.setOnClickListener(this);
        gta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.batmanid:
                Intent batIntent=new Intent(TypeActivity.this, InfoActivity.class);
                //Toast.makeText(TypeActivity.this,"Batman is pressed",Toast.LENGTH_LONG).show();
                batIntent.putExtra("Name","Arkham Knight");
                batIntent.putExtra("Bio","Batman: Arkham Knight is a 2015 action-adventure game developed by Rocksteady Studios. Based on the DC Comics superhero Batman, it is the successor to the 2013 video game Batman: Arkham Origins.");
                batIntent.putExtra("Price","1500");
                startActivity(batIntent);
                break;

            case R.id.godofwarid:
                Intent godIntent=new Intent(TypeActivity.this, InfoActivity.class);
                godIntent.putExtra("Name","God Of War");
                godIntent.putExtra("Bio","God of War is an action-adventure game developed by Santa Monica Studio. It is the eighth installment in the God of War series, the eighth chronologically, and the sequel to 2010's God of War III.");
                godIntent.putExtra("Price","2000");
                startActivity(godIntent);
                break;

            case R.id.gtaid:
                Intent gtaIntent=new Intent(TypeActivity.this, InfoActivity.class);
                gtaIntent.putExtra("Name","GTA 5");
                gtaIntent.putExtra("Bio","Grand Theft Auto V is a 2013 action-adventure game developed by Rockstar North and published by Rockstar Games. It is the first main entry in the Grand Theft Auto series since 2008's Grand Theft Auto IV.");
                gtaIntent.putExtra("Price","1950");
                startActivity(gtaIntent);
                break;

            case R.id.bloodborneid:
                Intent bloodIntent=new Intent(TypeActivity.this, InfoActivity.class);
                bloodIntent.putExtra("Name","Bloodborne");
                bloodIntent.putExtra("Bio","Bloodborne is a action role-playing game developed by FromSoftware. Bloodborne follows the player's character in Victorian era-inspired city of Yharnam, whose inhabitants have been afflicted with an abnormal blood-borne disease.");
                bloodIntent.putExtra("Price","1120");
                startActivity(bloodIntent);
                break;
        }

    }
}
