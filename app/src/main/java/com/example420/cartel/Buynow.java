package com.example420.cartel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Buynow extends AppCompatActivity {

    private Bundle extras;
    private Button paynow;
    private TextView nametag;
    private TextView pricetag;
    private EditText cardnum;
    private EditText count;
    private EditText cvv;
    private EditText expiry;
    private TextView pr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buynow);

        extras=getIntent().getExtras();
        nametag=(TextView) findViewById(R.id.nametagid);
        pricetag=(TextView) findViewById(R.id.pricetagid);
        cardnum=(EditText) findViewById(R.id.carddetailsid);
        cvv=(EditText) findViewById(R.id.cvvid);
        expiry=(EditText) findViewById(R.id.expiryid);
        count=(EditText) findViewById(R.id.countdetailsid);
        pr=(TextView) findViewById(R.id.Priceibuyd);
        paynow=(Button) findViewById(R.id.paynowid);
        String price=" ";
        String x=" ";
        if(extras!=null)
        {
            nametag.setText(extras.getString("name"));
            price=extras.getString("price");
            x=extras.getString("number");


        }

        final String finalPrice = price;
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num;
                num=Integer.valueOf(count.getText().toString());
                int po=Integer.parseInt(finalPrice);
                System.out.println(finalPrice);
                int tot=po*num;
                pricetag.setText(Integer.toString(tot));
            }
        });



//        paynow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.setComponent(new ComponentName("com.example.downloadmanager","com.example.downloadmanager.MainActivity"));
//                startActivity(intent);
//            }
//        });


    }
}
