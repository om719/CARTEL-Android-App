package com.example.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                batIntent.putExtra("Bio","Batman: Arkham Knight is a 2015 action-adventure game developed by Rocksteady Studios and published \n by Warner Bros. Interactive Entertainment. Based on the DC Comics superhero Batman, it is the \n successor to the 2013 video game Batman: Arkham Origins, and the fourth main installment in \n the Batman: Arkham series.");
                batIntent.putExtra("Price","1500");
                startActivity(batIntent);
                break;

            case R.id.godofwarid:
                Intent godIntent=new Intent(TypeActivity.this, InfoActivity.class);
                godIntent.putExtra("Name","God Of War");
                godIntent.putExtra("Bio","God of War[a] is an action-adventure game developed by Santa Monica Studio  and published \n by Sony Interactive Entertainment (SIE). Released on April 20, 2018, for the PlayStation 4 (PS4), it \n is the eighth installment in the God of War series, the eighth chronologically, and the \n sequel to 2010's God of War III. ");
                godIntent.putExtra("Price","2000");
                startActivity(godIntent);
                break;
        }

    }
}
