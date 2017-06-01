package com.example.palmdigital.buttonchallenge01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

        Button buttonObject1 = (Button)findViewById(R.id.ButtonMyButton01);
        buttonObject1.setText("Contacts");
        buttonObject1.setBackgroundColor(Color.argb(100,255,0,0));
        buttonObject1.setOnClickListener(this);

        Button buttonObject2 = (Button)findViewById(R.id.ButtonMyButton02);
        buttonObject2.setText("Email");
        buttonObject2.setBackgroundColor(Color.argb(100,0,255,0));
        buttonObject2.setOnClickListener(this);

        Button buttonObject3 = (Button)findViewById(R.id.ButtonMyButton03);
        buttonObject3.setText("Messages");
        buttonObject3.setBackgroundColor(Color.argb(100,0,0,255));
        buttonObject3.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.ButtonMyButton01)
        {
            Toast.makeText(MainActivity.this, "Which contact do you want?", Toast.LENGTH_LONG).show();
            Log.i("info", "What contact do you want?");
        }
        else if(view.getId() == R.id.ButtonMyButton02)
        {
            Toast.makeText(MainActivity.this, "What E-Mail do you want?", Toast.LENGTH_SHORT).show();
            Log.i("info", "What E-Mail do you want?");
        }
        else if(view.getId() == R.id.ButtonMyButton03)
        {
            Toast.makeText(MainActivity.this, "What message do you want?", Toast.LENGTH_SHORT).show();
            Log.i("info", "What message do you want?");
        }
    }
}
