package com.example.palmdigital.button04;

import android.content.DialogInterface;
import android.util.Log;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.ButtonMyButton1);
        button1.setText("red pill");
        button1.setOnClickListener(this);
        button1.setBackgroundColor(Color.argb(100,255,0,0));
//        button1.set;

        Button button2 = (Button)findViewById(R.id.ButtonMyButton2);
        button2.setText("green pill");
        button2.setOnClickListener(this);
        button2.setBackgroundColor(Color.argb(100,0,255,0));
//        button2.setPadding(0,10,0,20);

        Button button3 = (Button)findViewById(R.id.ButtonMyButton3);
        button3.setText("blue pill");
        button3.setOnClickListener(this);
        button3.setBackgroundColor(Color.argb(100,0,0,255));
//        button3.setPadding(0,10,0,20);

    }
    public void onClick(View view)
    {
//        Toast.makeText(MainActivity.this, "Dab on them", Toast.LENGTH_SHORT).show();
        if(view.getId() == R.id.ButtonMyButton1)
        {
            Toast.makeText(MainActivity.this, "this is Philip Defranco, and I am dank", Toast.LENGTH_SHORT).show();
            Log.i("info", "you chose the red pill");

        }
        else if(view.getId() == R.id.ButtonMyButton2)
        {
            Toast.makeText(MainActivity.this, "why am i still getting hate?", Toast.LENGTH_SHORT).show();
            Log.i("info", "you chose the green pill");

        }
        else if(view.getId() == R.id.ButtonMyButton3)
        {
            Toast.makeText(MainActivity.this, "what is up, drama alert nation?", Toast.LENGTH_SHORT).show();
            Log.i("info", "you the the blue pill");
        }
        }
}

