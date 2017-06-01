package org.palmdigital.fizzbuzz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = (EditText) findViewById(R.id.Input);

    }

    public void clickHere(View view)
    {
        EditText text     = (EditText) findViewById(R.id.Input);
        TextView texthere = (TextView) findViewById(R.id.FizzBuzzAnswer);

        String number_str = text.getText().toString();

        int number = Integer.parseInt(number_str);


         if(number % 5 == 0)
        {
            if(number % 3 == 0)
            {
                texthere.setText("FizzBuzz");
            }
            else
            {
                texthere.setText("Buzz");
            }
        }

        else if(number % 3 == 0)
        {
            texthere.setText("Fizz");
        }
        else if(number == 0)
        {
            texthere.setText("Invalid");
        }

         else if(number_str == null)
         {
             texthere.setText("Does not work");

         }
        else
        {
            texthere.setText(number + " is not divisible." +
                    "");
        }
    }

}
