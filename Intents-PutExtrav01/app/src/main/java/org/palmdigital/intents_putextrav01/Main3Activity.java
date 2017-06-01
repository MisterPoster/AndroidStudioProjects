package org.palmdigital.intents_putextrav01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView TextView_Story = (TextView) findViewById(R.id.TextView_Story);



        if (savedInstanceState == null)
        {
            Bundle cena = getIntent().getExtras();

            if(cena == null)
            {
                newString = null;
            }
            else
            {
                newString = cena.getString("NEWSTORY");
            }
        }

        else
        {
            newString = (String) savedInstanceState.getSerializable("NEWSTORY");
        }


        TextView_Story.setText("" + newString);
    }
}
