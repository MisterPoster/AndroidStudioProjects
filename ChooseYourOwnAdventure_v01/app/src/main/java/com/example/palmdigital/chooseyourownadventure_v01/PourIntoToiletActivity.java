package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PourIntoToiletActivity extends AppCompatActivity implements View.OnClickListener
{ // start of MainActivity

    //fields
    Button LeftButton;
    Button RightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start of onCreate()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pour_into_toilet);

        //references


        //TextView
        TextView TextView_Story    = (TextView) findViewById(R.id.TextView_Story);
        TextView TextView_Question = (TextView) findViewById(R.id.TextView_Question);

        //Buttons
        LeftButton                 = (Button)   findViewById(R.id.LeftButton);
        RightButton                = (Button)   findViewById(R.id.RightButton);

        //setting  text
        TextView_Story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
        TextView_Question.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");

        LeftButton.setText("Yes");
        RightButton.setText("HECK YES");

        //setting click listeners
        LeftButton.setOnClickListener(this);
        RightButton.setOnClickListener(this);


    } //end of onCreate()
    public void onClick(View view)
    { //start of onClick()
        if (view.getId() == R.id.LeftButton)  //yes
        {
            Intent e = new Intent(this, PizzaEndingActivity.class);
            startActivity(e);
        }
        else if (view.getId() == R.id.RightButton) //heck yes
        {
            Intent f = new Intent(this, PizzaEndingActivity.class);
            startActivity(f);
        }

    } //end of onClick()


}  // end of MainActivity