package com.example.cartel;

//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Forgotpwd extends AppCompatActivity {
Button sendmail;
EditText email;
FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth= FirebaseAuth.getInstance();
        setContentView(R.layout.activity_forgotpwd);
        sendmail=findViewById(R.id.sendmail);
        email=findViewById(R.id.email);

        sendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailid=email.getText().toString();

                if(TextUtils.isEmpty(mailid)){
                    Toast.makeText(Forgotpwd.this, "Enter a valid email id", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    mAuth.sendPasswordResetEmail(mailid).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(Forgotpwd.this, "Email to reset password has been sent", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Forgotpwd.this,LoginActivity.class));
                            }
                            else
                            {
                                String message= task.getException().getMessage();
                                Toast.makeText(Forgotpwd.this, "An Error has occurred. Try again later"+message, Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

    }
}
