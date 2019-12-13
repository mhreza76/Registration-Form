package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        String xxname, phone, email;
        Bundle data = getIntent().getExtras();
        TextView xxnam,xxphone,xxemail;
        xxnam=findViewById(R.id.sname);
        xxphone=findViewById(R.id.smob);
        xxemail=findViewById(R.id.smail);
        xxnam.setText(data.getString("nam"));
        xxphone.setText(data.getString("phn"));
        xxemail.setText(data.getString("mail"));



    }
}