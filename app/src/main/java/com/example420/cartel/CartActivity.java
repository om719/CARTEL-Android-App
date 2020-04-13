package com.example420.cartel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//import com.google.firebase.database.ChildEventListener;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class CartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;
    private Bundle extras;
    private Button cancel;
    public int[] mycount=new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
    // DatabaseReference reff;
    DatabaseReference reff;
    private Button shows;
    //private Button shows;
    public String[] myProducts=new String[]{" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public String[] myPrices=new String[]{" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        int j=0;

        extras=getIntent().getExtras();
        recyclerView=(RecyclerView) findViewById(R.id.reciclerviewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //shows=(Button) findViewById(R.id.showid);
        listItems=new ArrayList<>();
        //System.out.println("hello 1");
        final String[][][] namep = {{new String[1]}};
        final String[][][] pricep = {{new String[1]}};
        //cancel=(Button) findViewById(R.id.)
        final Button shows = (Button) findViewById(R.id.showid);


        reff=FirebaseDatabase.getInstance().getReference("Products");
        //final String finalNamep = namep;
        reff.addChildEventListener(new ChildEventListener() {
            //System.out.println("hello1");
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                //System.out.println("hello1");
                String Value=dataSnapshot.getValue(Products.class).toString();
                String[] parts = Value.split("-");
                String namepro=parts[0];
                String pricepro=parts[1];
                String count=parts[2];
                int i=0;
                int flag=0;
                for(i=0;i<100;i++)
                {
                    if(myProducts[i].equals(" "))
                    {
                        if(flag==1)
                            break;
                        else {
                            myProducts[i] = namepro;
                            mycount[i] = 1;
                            myPrices[i] = pricepro;
                            break;
                        }


                    }
                    else
                    {

                        if(myProducts[i].equals(namepro)) {
                            {
                                mycount[i]++;
                                flag=1;
                                //System.out.println(namepro + "=" + mycount[i]);
                            }
                        }
                    }
                }

                //System.out.println("hello "+myProducts+" "+mycount);
                //ListItem item=new ListItem(namepro,pricepro,"0","X");
                //listItems.add(item);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



        shows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shows.setEnabled(false);
                String nameproduct=" ";
                String priceproduct=" ";
                int flag=0;
                if(extras!=null)
                {
                    nameproduct=extras.getString("Product_name");

                    priceproduct=extras.getString("Product_price");

                }
                int i=0;
                for(i=0;i<100;i++)
                {
                    if(myProducts[i].equals(" "))
                    {
                        System.out.println(myProducts[0]);
                        if(flag==1)
                        {
                            break;
                        }
                        else{
                            ListItem item=new ListItem(nameproduct,priceproduct,"1");
                            listItems.add(item);
                            System.out.println("These items did not exist:");
                            System.out.println("name="+myProducts[i]+" Price="+myPrices[i]+"count="+mycount[i]);
                        }
                    }
                    else
                    {
                        if(myProducts[i].equals(nameproduct))
                        {
                            flag=1;
                        }
                        String c=Integer.toString(mycount[i]);
                        ListItem item=new ListItem(myProducts[i],myPrices[i],c);
                        listItems.add(item);
                        System.out.println("These items already existed:");
                        System.out.println("name="+myProducts[i]+" Price="+myPrices[i]+"count="+mycount[i]);
                    }
                }

                adapter=new MyAdapter(CartActivity.this,listItems);
                recyclerView.setAdapter(adapter);
            }
        });

        //System.out.println(myProducts[0]+" "+mycount[0]);
//        if(extras!=null)
//        {
//            nameproduct=extras.getString("Product_name");
//
//             priceproduct=extras.getString("Product_price");
////            ListItem item=new ListItem(namep,pricep,"0","X");
////            listItems.add(item);
//        }



    }
}

