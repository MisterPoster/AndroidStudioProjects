package org.palmdigital.madlibs_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    String SecondSentence;
    String FirstSentence;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        if (savedInstanceState == null)
        {
            Bundle america = getIntent().getExtras();

            if(america == null)
            {
                SecondSentence = null;
            }
            else
            {
                SecondSentence = america.getString("SecondSentence");
            }
        }
//what is true? savedInstanceState != null
        else
        {
            SecondSentence = (String) savedInstanceState.getSerializable("SecondSentence");
        }


        if (savedInstanceState == null)
        {
            Bundle america = getIntent().getExtras();

            if(america == null)
            {
                FirstSentence = null;
            }
            else
            {
                FirstSentence = america.getString("FirstSentence");
            }
        }
//what is true? savedInstanceState != null
        else
        {
            FirstSentence = (String) savedInstanceState.getSerializable("FirstSentence");
        }

        String Story = FirstSentence + " " + SecondSentence;
        TextView Story_View = (TextView) findViewById(R.id.Story);
        Story_View.setText(Story);
    }
}
