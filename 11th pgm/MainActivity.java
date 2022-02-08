package com.example.birthday_card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView i1;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView)findViewById(R.id.img1);
        l1 = (LinearLayout) findViewById(R.id.line1);
        i1.setOnClickListener(this);
        l1.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId()==R.id.img1){
            i1.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);
        }
        else {
            i1.setVisibility(View.VISIBLE);
            l1.setVisibility(View.GONE);
        }
    }
}
