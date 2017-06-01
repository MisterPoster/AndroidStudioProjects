package org.palmdigital.mad_lib_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{   //start class
    String Startstory;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void MakeStory(View cena)
    {
        Startstory = "Pizza was invented by a ";
        String StartStoryContinued = " chef named ";

        String SecondSentence = "To make a pizza, you need to take a lump of ";
        String SecondSentenceContinued = ", and make a thin, round ";

        String ThirdSentence = "Then you cover it with";
        String ThirdSentenceContinued = " sauce, ";
        String ThirdSentenceContinued2 = " cheese, and fresh chopped ";
        String ThirdSentenceContinued3 = ".";

        EditText Adjective = (EditText) findViewById(R.id.EnterAdjective);
        EditText Nationality = (EditText) findViewById(R.id.EnterNationality);
        EditText PersonName = (EditText) findViewById(R.id.EnterPerson);
        EditText SecondAdjective = (EditText) findViewById(R.id.EnterAdjective2);
        EditText FirstNoun = (EditText) findViewById(R.id.EnterNoun);
        EditText ThirdAdjective = (EditText) findViewById(R.id.EnterAdjective3);
        EditText SecondNoun = (EditText) findViewById(R.id.EnterNoun2);
        EditText FourthAdjective = (EditText) findViewById(R.id.EnterAdjective4);
        EditText ThirdNoun = (EditText) findViewById(R.id.EnterNoun3);
        EditText FourthNoun = (EditText) findViewById(R.id.EnterNoun4);

        TextView storyView = (TextView) findViewById(R.id.Story);

        String Adj1 = Adjective.getText().toString();
        String Nation = Nationality.getText().toString();
        String Person = PersonName.getText().toString();
        String Adj2 = SecondAdjective.getText().toString();
        String Noun1 = FirstNoun.getText().toString();
        String Adj3 = ThirdAdjective.getText().toString();
        String Noun2 = SecondNoun.getText().toString();
        String Adj4 = FourthAdjective.getText().toString();
        String Noun3 = ThirdNoun.getText().toString();
        String Noun4 = FourthNoun.getText().toString();


        checkForVowel(Adj1);
        String sammy = "Samuel";

        String FullStory = Startstory + Adj1 + " " + Nation + "" + StartStoryContinued + Person + "." + " " + SecondSentence + " " + Adj2 +" "+ Noun1 + SecondSentenceContinued + "" + Adj3 + " " + Noun4 +"."+ " "+ ThirdSentence + " " + Adj4 + " "+ Noun2 + ThirdSentenceContinued+ Adj4 + ThirdSentenceContinued2 + Noun3 + ThirdSentenceContinued3;
        //on the third sentence

        storyView.setText(FullStory);
        Toast.makeText(this, "" + FullStory, Toast.LENGTH_SHORT).show();

    }

    public void checkForVowel(String adj1)
    {
        if (adj1.startsWith("a") || adj1.startsWith("A"))
        {
            Startstory = "Pizza was invented by an ";

        }
        else if (adj1.startsWith("e") || adj1.startsWith("E"))
        {
            Startstory = "Pizza was invented by an ";
        }
        else if (adj1.startsWith("i") || adj1.startsWith("I"))
        {
            Startstory = "Pizza was invented by an ";
        }
        else if (adj1.startsWith("0") || adj1.startsWith("o"))
        {
            Startstory = "Pizza was invented by an ";
        }
        else if (adj1.startsWith("uk") || adj1.startsWith("U"))
        {
            Startstory = "Pizza was invented by an ";
        }
    }


}  //end class
