package com.example.pgm4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username,password;
    SharedPreferences sp;
    Button bttn_login,bttn_prev;
    Toast t;
    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sp=getSharedPreferences("MyPref",MODE_PRIVATE);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        bttn_login=(Button)findViewById(R.id.bttn_login);
        bttn_prev=(Button)findViewById(R.id.bttn_prev);
        bttn_login.setOnClickListener(this);
        bttn_prev.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bttn_prev)
            startActivity(new Intent(this,MainActivity.class));
        else{
            a=username.getText().toString();
            b=password.getText().toString();
            SharedPreferences.Editor editor=sp.edit();
            if(a.equals(sp.getString("username",""))&&b.equals(sp.getString("password",""))){
                t=Toast.makeText(this,"Login Success",Toast.LENGTH_LONG);
                t.show();

                LayoutInflater lin=getLayoutInflater();
                View appear=lin.inflate(R.layout.mytoast,(ViewGroup)findViewById(R.id.toast_id));

            }
            else {
                t=Toast.makeText(this," Can't Login ",Toast.LENGTH_LONG);
                t.show();
            }
        }

    }


}
