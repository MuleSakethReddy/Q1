package com.example.question1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class second extends Activity {
    Spinner sp;
    EditText e;
    Button b;
    String[] q={"Where do you stay","What is your age","What is your nick name"};
    String[] a={"Hyderabad","20","Sunny"};
    int p=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        sp=findViewById(R.id.s);
        e=findViewById(R.id.e);
        b=findViewById(R.id.b);
        ArrayAdapter<String> s=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,q);
        s.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                p=i;
                Toast.makeText(getApplicationContext(),q[i]+" is selected ",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp.setAdapter(s);
    }
    public void submit(View v){
        String l=e.getText().toString();
        if(l.equals(a[p])){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Not a Correct Answer", Toast.LENGTH_SHORT).show();
        }
    }
}
