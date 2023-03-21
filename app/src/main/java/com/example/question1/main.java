package com.example.question1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class main extends Activity {
    EditText e1,e2;
    Button b1,b2,b3;
    TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        t=findViewById(R.id.t);
    }
    public void sub(View v){
        String s=e1.getText().toString();
        String p=e2.getText().toString();
        if(s.equals("cbit@gmail.com") && p.equals("123")){
            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Login not Successful",Toast.LENGTH_LONG).show();
        }
    }
    public void face(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(i);
    }
    public void goog(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.google.com/"));
        startActivity(i);
    }
    public void forgot(View v){
        t.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(main.this, second.class);
                startActivity(intent);
            }
        });
    }
}
