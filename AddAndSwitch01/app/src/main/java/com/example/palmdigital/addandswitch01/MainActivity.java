package com.example.palmdigital.addandswitch01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.Switch);
        myButton.setOnClickListener(this);


    }

    public void onClick(View view)
    {
        Intent i = new Intent(this, WakeUp.class);
        startActivity(i);

    }
}
