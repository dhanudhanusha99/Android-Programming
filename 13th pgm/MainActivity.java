package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements TextWatcher, CompoundButton.OnCheckedChangeListener {
    EditText ed1;
    ToggleButton b1;
    TextView t1;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed1);
        l1=(LinearLayout)findViewById((R.id.l1));
        t1=(TextView)findViewById(R.id.t1);
        b1=(ToggleButton)findViewById(R.id.b1);
        ed1.addTextChangedListener(this);
        b1.setOnCheckedChangeListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        float num=0;
        String s=editable.toString();
        if(s!=null && !s.isEmpty())
            num=Float.parseFloat(editable.toString());
        if(num>300)
            editable.replace(0,editable.length(),"100");

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            l1.setBackgroundColor(Color.parseColor("#757575"));
            ed1.setTextColor(Color.parseColor("#ffffff"));
            t1.setTextColor(Color.parseColor("#ffffff"));

        }
        else {
            l1.setBackgroundColor(Color.parseColor("#ffffff"));
            ed1.setTextColor(Color.parseColor("#000000"));
            t1.setTextColor(Color.parseColor("#000000"));
        }
    }
}
