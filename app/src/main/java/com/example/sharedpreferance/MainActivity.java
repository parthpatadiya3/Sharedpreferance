package com.example.sharedpreferance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3;
    EditText e1;
    TextView tv;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        e1 = findViewById(R.id.edittext);
        tv = findViewById(R.id.view);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                sp = (SharedPreferences) getSharedPreferences("HELLO WORLD", 0);
                SharedPreferences.Editor editor = sp.edit();

                editor.putInt("PARTH", 0);

                editor.putString("PATADIYA", e1.getText().toString());

                editor.commit();
               /* Intent intent=new Intent(MainActivity.this,check.class);
                startActivity(intent);*/

                // finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sp = getSharedPreferences("HELLO WORLD" +
                        "", 0);

                int a = sp.getInt("PARTH", 0);

                String b = sp.getString("PATADIYA", "HELLO");

                tv.setText(a + " " + b);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, check.class);
                startActivity(intent);

            }
        });
    }
}
