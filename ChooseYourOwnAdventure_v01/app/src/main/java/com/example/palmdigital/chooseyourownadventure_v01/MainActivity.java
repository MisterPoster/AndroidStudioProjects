package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{ // start of MainActivity

    //fields
    Button LeftButton;
    Button RightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start of onCreate()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //references


        //TextView
        TextView TextView_Story    = (TextView) findViewById(R.id.TextView_Story);
        TextView TextView_Question = (TextView) findViewById(R.id.TextView_Question);

        //Buttons
        LeftButton                 = (Button)   findViewById(R.id.LeftButton);
        RightButton                = (Button)   findViewById(R.id.RightButton);

        //setting  text
        TextView_Story.setText("One morning the Tortoise woke up in a dream.");
        TextView_Question.setText("Do you want to 'wake up' or 'explore' the dream?");

        LeftButton.setText("Wake Up");
        RightButton.setText("Explore");

        //setting click listeners
        LeftButton.setOnClickListener(this);
        RightButton.setOnClickListener(this);


    } //end of onCreate()
    public void onClick(View view)
    { //start of onClick()
        if (view.getId() == R.id.LeftButton)  //wake up
        {
            Intent a = new Intent(this, WakeUpActivity.class);
            startActivity(a);
        }
        else if (view.getId() == R.id.RightButton) //explore
        {
            Intent b = new Intent(this, ExploreActivity.class);
            startActivity(b);
        }

    } //end of onClick()


}  // end of MainActivity