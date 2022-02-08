package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sp;
    EditText u, p;
    Button b1, b2;
    String a,b;
    Toast t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp=getSharedPreferences("Mypref", MODE_PRIVATE);
        u=(EditText)findViewById(R.id.u1);
        p=(EditText)findViewById(R.id.p1);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.b2)
            startActivity(new Intent(this, MainActivity.class));
        else {
            a = u.getText().toString();
            b = p.getText().toString();

            SharedPreferences.Editor editor = sp.edit();

            if(a.equals(sp.getString("Username", "")) && b.equals(sp.getString("Password", ""))) {
                t = Toast.makeText(this, "Login successful", Toast.LENGTH_LONG);
                t.setGravity(Gravity.TOP, 0, 200);
                LayoutInflater lin = getLayoutInflater();
                View appear = lin.inflate(R.layout.mytoast, (ViewGroup) findViewById(R.id.toast_id));
                t.setView(appear);
                t.show();
            } else
                Toast.makeText(this, "Login unsuccessful", Toast.LENGTH_LONG).show();
        }
    }
}

