package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView i1;
    LinearLayout lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView) findViewById(R.id.img1);
        lin = (LinearLayout) findViewById(R.id.lin1);
        i1.setOnClickListener(this);
        lin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.img1) {
            i1.setVisibility(View.GONE);
            lin.setVisibility(View.VISIBLE);
        } else {
            i1.setVisibility(View.VISIBLE);
            lin.setVisibility(View.GONE);
        }
    }
}





