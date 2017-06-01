package com.example.palmdigital.consolelog_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
//fields - class variables
    private int myInt;
    private double myDouble;
    private boolean myBoolean;
    private float myFloat;
    private String myString;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt is now " + myInt);

        double myDouble = setDoubleValue();
        Log.i("info","myDouble is now " + myDouble);

        boolean myBoolean = setBooleanValue();
        Log.i("info","myBoolean is now " + myBoolean);

        float myFloat = setFloatValue();
        Log.i("info", "myFloat is now " + myFloat);

        String myString = setStringValue();
        Log.i("info","myString is now " + myString);
    }

    public int setIntValue()
    {
        return (123 * 123);
    }

    public double setDoubleValue()
    {
        return 6.9;
    }

    public boolean setBooleanValue()
    {
        return true;
    }
    public float setFloatValue()
    {
        return 4.56f;
    }

    public String setStringValue()
    {
        return "pen pineapple apple pen";
    }
}
