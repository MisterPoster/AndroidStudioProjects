package org.palmdigital.madlibs_v02;

import android.util.Log;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
{
    String firstSentence;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        if (savedInstanceState == null)
        {
            Bundle america = getIntent().getExtras();

            if(america == null)
            {
                firstSentence = null;
            }
            else
            {
                firstSentence = america.getString("FirstSentence");
            }
        }
//what is true? savedInstanceState != null
        else
        {
            firstSentence = (String) savedInstanceState.getSerializable("FirstSentence");
        }



    }

    public void clickHere(View view)
    {
        EditText noun_01 = (EditText) findViewById(R.id.EdiTextNoun);
        EditText adj_02  = (EditText) findViewById(R.id.EdiTextAdjective2);
        EditText noun_02 = (EditText) findViewById(R.id.EdiTextNoun2);

        String noun_1    = noun_01.getText().toString();
        String adj_2     = adj_02.getText().toString();
        String noun_2    = noun_02.getText().toString();

        String SecondSentence = "To make a pizza, you need to a lump of " + noun_1 + ", and make a thin, round " + adj_2 + " " +
                noun_2 + ".";

        Intent newCena = new Intent(this, Main3Activity.class);
        newCena.putExtra("SecondSentence", SecondSentence);
        newCena.putExtra("FirstSentence", firstSentence);
        startActivity(newCena);


//        Toast.makeText(this, "" + firstSentence + SecondSentence, Toast.LENGTH_SHORT).show();
    }
}
