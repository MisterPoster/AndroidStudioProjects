package org.palmdigital.fizzbuzz_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    EditText NumberHere;
    TextView FizzBuzzHere;
    Integer  FizzBuzz;
    String   numberTransmorph;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberHere                 = (EditText) findViewById(R.id.EditText_Number);
        Button FizzBuzz            = (Button)   findViewById(R.id.FizzBuzz);
        FizzBuzzHere      = (TextView) findViewById(R.id.FizzBuzzAnswer);


    }
   public void fizzBuzz(View cena)
   {
          numberTransmorph = NumberHere.getText().toString();

          FizzBuzz = Integer.parseInt(numberTransmorph);


       if(FizzBuzz % 3 == 0 && FizzBuzz % 5 == 0)
       {
           FizzBuzzHere.setText("FizzBuzz");

       }

     else if (FizzBuzz % 3 == 0)
     {
              FizzBuzzHere.setText("Fizz");

     }
     else if (FizzBuzz % 5 == 0)
     {
               FizzBuzzHere.setText("Buzz");

     }

     else if(FizzBuzz % 3 != 0 || FizzBuzz % 5 != 0 || FizzBuzz == null)
     {
         FizzBuzzHere.setText("Does not work");

     }

       else if(FizzBuzz == 0)
       {
           FizzBuzzHere.setText("Invalid");
       }



    }
}
