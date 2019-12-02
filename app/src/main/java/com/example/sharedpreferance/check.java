package com.example.sharedpreferance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class check extends AppCompatActivity
{
    TextView textView;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        textView=findViewById(R.id.textview);
        sp=getSharedPreferences("HELLO WORLD",0);

        int a=sp.getInt("PARTH",0);
        String b=sp.getString("PATADIYA","HELLO");
        textView.setText(a+""+b);


    }
}
