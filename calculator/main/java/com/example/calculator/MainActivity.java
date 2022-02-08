package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.SensorAdditionalInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double sum=0.0;
    String op,text;
    EditText res;
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,dot,clr,equ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        add = (Button) findViewById(R.id.badd);
        sub = (Button) findViewById(R.id.bsub);
        div = (Button) findViewById(R.id.bdiv);
        mul = (Button) findViewById(R.id.bmul);
        dot = (Button) findViewById(R.id.bdot);
        clr = (Button) findViewById(R.id.bc);
        equ = (Button) findViewById(R.id.bequ);
        res = (EditText) findViewById(R.id.edt1);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        dot.setOnClickListener(this);
        clr.setOnClickListener(this);
        equ.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
    }

        public void onClick (View v)
        {
            text = res.getText().toString();
            if (v.getId() == R.id.b0)
                res.setText(text + "0");

            if (v.getId() == R.id.b1)
                res.setText(text + "1");

            if (v.getId() == R.id.b2)
                res.setText(text + "2");

            if (v.getId() == R.id.b3)
                res.setText(text + "3");
            if (v.getId() == R.id.b4)
                res.setText(text + "4");
            if (v.getId() == R.id.b5)
                res.setText(text + "5");
            if (v.getId() == R.id.b6)
                res.setText(text + "6");

            if (v.getId() == R.id.b7)
                res.setText(text + "7");
            if (v.getId() == R.id.b8)
                res.setText(text + "8");

            if (v.getId() == R.id.b9)
                res.setText(text + "9");
            if (v.getId() == R.id.bdot)
                res.setText(text + ".");


            if (v.getId() == R.id.badd) {
                res.setText(text + "+");
                sum = Double.valueOf(res.getText().toString());
                res.setText("");

            }
            if (v.getId() == R.id.bsub) {
                res.setText(text + "-");
                sum = Double.valueOf(res.getText().toString());
                res.setText("");

            }
            if (v.getId() == R.id.bmul) {
                res.setText(text + "*");
                sum = Double.valueOf(res.getText().toString());
                res.setText("");

            }
            if (v.getId() == R.id.bdiv) {
                res.setText(text + "/");
                sum = Double.valueOf(res.getText().toString());
                res.setText("");

            }
            if (v.getId() == R.id.bequ) {
                if (op.equals("-")) {
                    sum = sum - Float.valueOf(res.getText().toString());
                    res.setText(String.valueOf(sum));
                    sum = 0.0;
                } else if (op.equals("+")) {
                    sum = sum + Float.valueOf(res.getText().toString());
                    res.setText(String.valueOf(sum));
                    sum = 0.0;
                } else if (op.equals("*")) {
                    sum = sum * Float.valueOf(res.getText().toString());
                    res.setText(String.valueOf(sum));
                    sum = 0.0;
                } else if (op.equals("/")) {
                    sum = sum / Float.valueOf(res.getText().toString());
                    res.setText(String.valueOf(sum));
                    sum = 0.0;
                }
            }
            if (v.getId() == R.id.bc)
                res.setText("");
        }
    }
