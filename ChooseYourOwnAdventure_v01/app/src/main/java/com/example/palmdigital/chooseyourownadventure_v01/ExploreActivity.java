package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ExploreActivity extends AppCompatActivity implements View.OnClickListener
{ // start of MainActivity

    //fields
    Button LeftButton;
    Button RightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start of onCreate()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        //references


        //TextView
        TextView TextView_Story    = (TextView) findViewById(R.id.TextView_Story);
        TextView TextView_Question = (TextView) findViewById(R.id.TextView_Question);

        //Buttons
        LeftButton                 = (Button)   findViewById(R.id.LeftButton);
        RightButton                = (Button)   findViewById(R.id.RightButton);

        //setting  text
        TextView_Story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
        TextView_Question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");

        LeftButton.setText("Toilet");
        RightButton.setText("Backyard");

        //setting click listeners
        LeftButton.setOnClickListener(this);
        RightButton.setOnClickListener(this);


    } //end of onCreate()
    public void onClick(View view)
    { //start of onClick()
        if (view.getId() == R.id.LeftButton)  //toilet
        {
            Intent c = new Intent(this, PourIntoToiletActivity.class);
            startActivity(c);
        }
        else if (view.getId() == R.id.RightButton) //backyard
        {
            Intent d = new Intent(this, PourIntoBackyardActivity.class);
            startActivity(d);
//
        }

    } //end of onClick()


}  // end of MainActivity
