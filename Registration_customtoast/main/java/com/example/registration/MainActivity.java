package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sp;
    EditText u,p;
    Button b1;
    String a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("Mypref", MODE_PRIVATE);
        u=(EditText)findViewById(R.id.usr);
        p=(EditText)findViewById(R.id.pwd);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        SharedPreferences.Editor editor = sp.edit();
        a=u.getText().toString();
        b=p.getText().toString();
        editor.putString("Username", a);
        editor.putString("Password", b);
        editor.apply();
        Toast.makeText(this, "Registration successful", Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, Main2Activity.class));
    }
}
