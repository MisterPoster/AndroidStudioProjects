package com.example.palmdigital.addandswitch01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WakeUp extends AppCompatActivity  implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        Button ButtonBack = (Button) findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }
}
