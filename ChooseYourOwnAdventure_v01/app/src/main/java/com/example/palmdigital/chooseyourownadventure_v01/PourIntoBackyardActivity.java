package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PourIntoBackyardActivity extends AppCompatActivity implements View.OnClickListener
{ // start of MainActivity

    //fields
    Button LeftButton;
    Button RightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start of onCreate()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pour_into_backyard);

        //references


        //TextView
        TextView TextView_Story    = (TextView) findViewById(R.id.TextView_Story);
        TextView TextView_Question = (TextView) findViewById(R.id.TextView_Question);

        //Buttons
        LeftButton                 = (Button)   findViewById(R.id.LeftButton);
        RightButton                = (Button)   findViewById(R.id.RightButton);

        //setting  text
        TextView_Story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
        TextView_Question.setText("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");

        LeftButton.setText("Scream");
        RightButton.setText("Faint");

        //setting click listeners
        LeftButton.setOnClickListener(this);
        RightButton.setOnClickListener(this);


    } //end of onCreate()
    public void onClick(View view)
    { //start of onClick()
        if (view.getId() == R.id.LeftButton)  //scream
        {
            Intent a = new Intent(this, MainActivity.class);
            startActivity(a);

        }
        else if (view.getId() == R.id.RightButton) //faint
        {
           Intent e = new Intent(this, FaintActivity.class);
           startActivity(e);
        }

    } //end of onClick()


}  // end of MainActivity
