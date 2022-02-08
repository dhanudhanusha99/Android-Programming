package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText e1,e2,e3,e4;
Button b1,b2;
String a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.mail);
        e2=(EditText)findViewById(R.id.fl);
        e3=(EditText)findViewById(R.id.la);
        e4=(EditText)findViewById(R.id.pwd);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     e1.getText().clear();
     e2.getText().clear();
     e3.getText().clear();
     e4.getText().clear();
    }
    
}
