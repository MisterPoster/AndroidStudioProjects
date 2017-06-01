package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// outside the MainActivity
// outside any method

//Understanding scope is very important!!


public class MainActivity extends AppCompatActivity
{ // class start

    //in the class, but out any method
    //fields can be seen by anyone method, and be used
    String myString;

    double enemyHealth;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    { // create start
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //in both the class(mainactivity) and create(oncreate)

        //declaring variables use the format:
        // datatype dataname;

        //examples:
        int myInt; // this is a int variable named myInt
        double myDouble; //this is a double variable named myDouble
        float myFloat; //this is a float variable named myFloat
        TextView TextView_Story; //this is a TextView variable named TextView_Story
        ImageView ImageView_Image; //this is a ImageView variable named ImageView_Image
        Button myButton; //this is a Button variable named myButton

        //Assigning an value to a declared variable
        // after declaring variables, you can assign values to it
        // variable = someValueOfSameType;

        //examples
        myInt = 10; //setting the value on myInt to 10, myInt has int of 10.
        myDouble = 20.12; //setting the value on myDouble to 20.12, myDouble has double of 20.12
        TextView_Story = (TextView) findViewById(R.id.TextViewStory); //setting the value on TextView_Story to TextViewStory, casting (TextView) to it.
                                                                        //TextView_Story to UI element
        ImageView_Image = (ImageView)findViewById(R.id.ImageView_Image); //setting the value on ImageView_Image to the UI element ImageViewImage

        // you can declare and assign in the same step
        // dataType name = someValue;
        //examples:

        int newInt = 25; // this is declaration + assignment
        newInt = 50; //this is only assignment

        myString = "obama"; //declaration + assignment
        myString = "trump"; // reassignment of myString
        //where a variable is declared, it affects the scope

        String myNewString = "WAR,  WAR NEVER CHANGES";

        //if(variable is in Create method)
        //{
        // only create method can see it
        //}

        Log.i("america" , "" + myNewString);

        enemyHealth = 69;
    } // create end

    public void coolMethod()
    { //coolmethod start
        myString = "nuclear war";
        enemyHealth = 100.69;
    } //coolmethod end

    public void coolMethod2()
    {
        enemyHealth = .2;

    }
} // class end
//don't do anything
