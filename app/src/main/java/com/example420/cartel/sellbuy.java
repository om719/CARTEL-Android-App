package com.example420.cartel;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

//import android.support.v7.app.AppCompatActivity;

public class sellbuy extends AppCompatActivity {
Button logout,sell,buy,delete;

    private FirebaseAuth.AuthStateListener mAuthstateListener;
    FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellbuy);
        buy = (Button) findViewById( R.id.buy);
        sell=findViewById(R.id.sellbutton);
        logout=(Button)findViewById(R.id.logout);
       // delete=findViewById(R.id.delete);


/*
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 AlertDialog.Builder del=new AlertDialog.Builder(sellbuy.this);
                 del.setTitle("Delete Account");
                 del.setMessage("Selecting delete will permanently delete your account");
                 del.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                        mFirebaseAuth.getCurrentUser().delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful())
                                {
                                    Intent i = new Intent(
                                            sellbuy.this,MainActivity_ad.class);
                                    startActivity( i );
                                    Toast.makeText(sellbuy.this, "your account has been deleted", Toast.LENGTH_SHORT).show();
                                }
                                else
                                {
                                    Toast.makeText(sellbuy.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                     }
                 });

                 del.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         dialog.dismiss();
                     }
                 });
                 AlertDialog alert=del.create();
                 alert.show();
            }
        });*/


       logout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(
                        sellbuy.this,MainActivity_ad.class);
                startActivity( i );
            }
        } );

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sellbuy.this,MainActivity.class);
                startActivity(i);
            }
        });


        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(sellbuy.this);
                builder.setCancelable(true);
                builder.setTitle("Sell item");
                builder.setMessage("write email to cartel with the details of product and a picture of the game");

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Compose Email", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       Intent sendmail=new Intent(Intent.ACTION_SENDTO);
                       sendmail.setData(Uri.parse("mailto:aditihk@gmail.com"));
                       startActivity(Intent.createChooser(sendmail,"send email via:"));
                       // startActivity(sendmail);
                    }
                });
                builder.show();
            }
        });
    }
}
