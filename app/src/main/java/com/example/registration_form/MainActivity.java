package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user,pass;
    private Button log,sign;
    private String mypass,myid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.username);
        pass=findViewById(R.id.password);
        log=(Button) findViewById(R.id.login);
        sign=findViewById(R.id.signup);
        myid="1105060";
        mypass="#1105060";

        log.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                String usr,pswd;
                usr=user.getText().toString();
                pswd=pass.getText().toString();
                if(usr.equals(myid) && pswd.equals(mypass))
                {
                    Toast.makeText(MainActivity.this,"Successfully login",Toast.LENGTH_SHORT).show();
                    Intent logintnt=new Intent(MainActivity.this,Info.class);
                    logintnt.putExtra("nam","Reza");
                    logintnt.putExtra("phn","01633613553");
                    logintnt.putExtra("mail","rezabaiust@gmail.com");
                    startActivity(logintnt);

                }
                else
                {
                    if(!usr.equals(myid) && !pswd.equals(mypass))
                        Toast.makeText(MainActivity.this, "Both are wrong", Toast.LENGTH_SHORT).show();
                    else if (!usr.equals(myid))
                        Toast.makeText(MainActivity.this,"user id wrong", Toast.LENGTH_SHORT).show();
                    else
                    {

                        Toast.makeText(MainActivity.this,"Password wrong",Toast.LENGTH_SHORT).show();

                    }
                }



            }

        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupintent= new Intent(MainActivity.this,SignUp.class);
                startActivity(signupintent);
            }
        });

    }
}
