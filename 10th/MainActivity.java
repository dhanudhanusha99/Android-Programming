package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    String a;
    Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et = (EditText) findViewById(R.id.ed1);
        EditText et2 = (EditText) findViewById(R.id.ed2);
        Button clear = (Button) findViewById(R.id.clear);
    }
    public void clear(View v) {
        a=ed1.getText().toString();
        ed1.setText(" ");
        ed2.getText().clear();
        ed3.getText().clear();
        ed4.getText().clear();
    }
}
