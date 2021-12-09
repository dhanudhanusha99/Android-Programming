package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tx1,tx2;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sp=getSharedPreferences("MyPref",MODE_PRIVATE);
        tx1=(TextView)findViewById(R.id.t1);
        tx2=(TextView)findViewById(R.id.t2);
        if(sp.contains("Name"))
            tx1.setText(sp.getString("Name",""));
        if(sp.contains("Email"))
            tx2.setText(sp.getString("Email",""));

        }
        public void MainActivity(View v) {

            System.out.println("Previous Activity");
            startActivity(new Intent(this, MainActivity.class));


    }
}
