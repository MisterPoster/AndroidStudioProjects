package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FaintActivity extends AppCompatActivity implements View.OnClickListener
{ // start of MainActivity

    //fields
    Button LeftButton;
    Button RightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start of onCreate()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);

        //references


        //TextView
        TextView TextView_Story    = (TextView) findViewById(R.id.TextView_Story);

        //Buttons

        //setting  text
        TextView_Story.setText("You made a delicious soup! Yum! The end.");


        //setting click listeners


    } //end of onCreate()
    public void onClick(View view)
    {

    }

}  // end of MainActivity
;