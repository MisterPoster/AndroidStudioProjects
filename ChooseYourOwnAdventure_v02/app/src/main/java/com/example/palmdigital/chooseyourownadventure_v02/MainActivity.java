package com.example.palmdigital.chooseyourownadventure_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.app.Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{ //start of MainActivity

    Button LeftButton;
    Button RightButton;
    TextView TextView_Story;
    TextView TextView_Question;

    int answer;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start of onCreate()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Starting();




    } //end of onCreate()

    private void Starting()
    {
        TextView_Story    = (TextView) findViewById(R.id.TextView_Story);
        TextView_Question = (TextView) findViewById(R.id.TextView_Question);

        LeftButton  = (Button) findViewById(R.id.LeftButton);
        RightButton = (Button) findViewById(R.id.RightButton);

        TextView_Story.setText("One morning, the Tortoise woke up in a dream.");
        TextView_Question.setText("Do you want to 'wake up' or 'explore' the dream?");


        LeftButton.setText("Wake Up");
        RightButton.setText("Explore");

        LeftButton.setOnClickListener(this);
        RightButton.setOnClickListener(this);

    }

    public void onClick(View view)
    { //start of onClick()
        if (view.getId() == R.id.LeftButton) //wake up
        {
            WakeUp_Ending();
        }
        else if (view.getId() == R.id.RightButton) //explore
        {
            ExploreScene(view);
            answer = 1;



        }

            //end of RightButton




    } //end of onClick()

    public void ExploreScene(View view)
    {
        TextView_Story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
        TextView_Question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");

        TextView_Story.setTextSize(24.5f);
        TextView_Question.setTextSize(24.5f);

        LeftButton.setText("Toilet");
        RightButton.setText("Backyard");




        if (view.getId() == R.id.LeftButton && answer == 1)  //toilet
        {
            NinjaAskingToBe();
            answer = 2;
            Log.i("AMERICA", "" + answer);

            if (view.getId() == R.id.LeftButton && answer == 2 || view.getId() == R.id.RightButton && answer == 2) //yes -- HECK YES
            {
                TextView_Story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
                TextView_Question.setText("");

                LeftButton.setVisibility(View.INVISIBLE);
                RightButton.setVisibility(View.INVISIBLE);
            }

        }

        else if (view.getId() == R.id.RightButton && answer == 1)  //backyard
        {
            TextView_Story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
            TextView_Question.setText("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");

            TextView_Story.setTextSize(20.5f);
            TextView_Question.setTextSize(20.5f);


            LeftButton.setText("Scream");
            RightButton.setText("Faint");

            answer = 3;

            if (view.getId() == R.id.LeftButton && answer == 3) //scream
            {
                Starting();

            }
            else if (view.getId() == R.id.RightButton && answer == 3) //faint
            {
                TextView_Story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
                TextView_Question.setText("");

                LeftButton.setVisibility(View.INVISIBLE);
                RightButton.setVisibility(View.INVISIBLE);
            }

        }  //end of else if backyard
    }   //end of ExploreScene

    public void NinjaAskingToBe()
    {
        TextView_Story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
        TextView_Question.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");

        LeftButton.setText("Yes");
        RightButton.setText("HECK YES");

//        answer = 2;
    }

    public void WakeUp_Ending()
    {
        TextView_Story.setText("You wake up and have a boring day. The end.");
        TextView_Question.setText("");

        LeftButton.setVisibility(View.INVISIBLE);
        RightButton.setVisibility(View.INVISIBLE);

        answer = 0;
    }




//    public void ExploreScene()
//    {
//        TextView_Story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucketk");
//        TextView_Question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
//
//        LeftButton.setText("Toilet");
//        RightButton.setText("Backyard");
//
//        answer = 1;
//    }
//
//    public void NinjaAskingToBe()
//    {
//        TextView_Story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
//        TextView_Question.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
//
//        LeftButton.setText("Yes");
//        RightButton.setText("HECK YES");
//
//        answer = 2;
//    }
//
//    public void WakeUp_Ending()
//    {
//        TextView_Story.setText("You wake up and have a boring day. The end.");
//        TextView_Question.setText("");
//
//        LeftButton.setVisibility(View.INVISIBLE);
//        RightButton.setVisibility(View.INVISIBLE);
//
//        answer = 0;
//    }
} //end of MainActivity
