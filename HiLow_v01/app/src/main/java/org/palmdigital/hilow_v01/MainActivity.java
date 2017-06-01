package org.palmdigital.hilow_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int min;
    int max;
    int num_guess;
    int randomAnswer;
    Button How_close;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomAnswer = (int) (Math.random()*100);




    }

    public void click_here(View veiew)
    {  //start of click_here
        int clicks = 0;
        clicks++;
        if(clicks <= 8)
        {
        for (int i = 0; i < clicks; i++)
        {

        randomAnswer = 43;
            EditText guess = (EditText) findViewById(R.id.editText_guess);
            String str_guess = guess.getText().toString();
            num_guess = Integer.parseInt(str_guess);
//        Random Answer = new Random();
            TextView How_Close = (TextView) findViewById(R.id.How_Close);

//        System.out.println("Number generated: " + randomAnswer);


                if (num_guess == randomAnswer)
                {
//                Sound.playBeep();
                    How_Close.setText("You've won!");
//                System.exit(0);
                }
                else if (num_guess > randomAnswer)
                {
                    How_Close.setText("Too high!");
                }
                else if (num_guess < randomAnswer)
                {
                    How_Close.setText("Too Low!");
                }

                else if (i == 8)
                {
                    How_Close.setText("You have lost...");
                    System.exit(0);
                }


//
//        Toast.makeText(this, "" + randomAnswer, Toast.LENGTH_SHORT).show();
        } //end of for
        }
        else if (clicks >= 8)
        {
            How_close.setEnabled(false);
            How_close.setText("You have lost...");
        }
    } //end of click_here
} //end of main


