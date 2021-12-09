package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pwd;
    String u = "Dhanusha";
    String p = "dhanu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }
        public void login(View v){
            if (v.getId()==R.id.b1) {
                user = (EditText) findViewById(R.id.ed1);
                pwd = (EditText) findViewById(R.id.ed2);
                String a = user.getText().toString();
                String b = pwd.getText().toString();
                if (a.equals(u) && b.equals(p))
                    Toast.makeText(this, "Successful login", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Invalid login", Toast.LENGTH_SHORT).show();
            }




            }
}
