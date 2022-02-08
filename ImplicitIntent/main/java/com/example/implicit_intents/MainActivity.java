package com.example.implicit_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent, chooser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View v) {
        if(v.getId()==R.id.map)
        {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:10.065206,76.629128"));
        chooser = Intent.createChooser(intent, "launch maps");
        startActivity(chooser);
    }
        if(v.getId()==R.id.play)
        {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Meta+Platforms,+Inc."));
            chooser = Intent.createChooser(intent, "launch store");
            startActivity(chooser);
        }
        if(v.getId()==R.id.email)
        {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto"));
            String to[]={"malavikamalu@gmail.com"};
            intent.putExtra(intent.EXTRA_EMAIL,to);
            intent.putExtra(intent.EXTRA_SUBJECT,"from emulator");
            intent.putExtra(intent.EXTRA_TEXT,"test mail");
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"email application");
            startActivity(chooser);

        }
        if(v.getId()==R.id.msg)
        {
            intent=new Intent(Intent.ACTION_SEND);
            Uri img=Uri.parse("android.resource://implictintent/drawable/+R.drawable.hello");
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_STREAM,img);
            intent.putExtra(Intent.EXTRA_TEXT,"image");
            chooser=Intent.createChooser(intent,"messenger");
            startActivity(chooser);

        }
}
}