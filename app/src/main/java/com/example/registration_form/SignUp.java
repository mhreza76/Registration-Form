package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private EditText name,mob,email,pass;
    private Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.name);
        mob= findViewById(R.id.mob);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        reg=findViewById(R.id.reg);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names,mobs,emails,passs;
                names=name.getText().toString();
                mobs=mob.getText().toString();
                emails=email.getText().toString();
                passs=pass.getText().toString();
                if(names.length()<3 )
                    name.setError("At least 3 character");
                else if(mobs.length()<11)
                    mob.setError("at least 11");
                else if(emails.length()<8)
                    email.setError("atleast 8");
                else if (passs.length()<6)
                     pass.setError("atleast 6");
                else{
                    Toast.makeText(SignUp.this,"Successfilly Registered",Toast.LENGTH_LONG).show();
                    Intent regintnt=new Intent(SignUp.this,Info.class);
                    regintnt.putExtra("nam",names);
                    regintnt.putExtra("phn",mobs);
                    regintnt.putExtra("mail",emails);
                    startActivity(regintnt);
                }


            }
        });
    }
}
