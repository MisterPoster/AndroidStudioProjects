package org.palmdigital.intents_putextrav01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        if (savedInstanceState == null)
        {
            Bundle cena = getIntent().getExtras();

            if(cena == null)
            {
                newString = null;
            }
            else
            {
                newString = cena.getString("STARTSTORY");
            }
        }

        else
        {
            newString = (String) savedInstanceState.getSerializable("STARTSTORY");
        }




    }

    public void secondClick(View view)
    {

        EditText ET_NAT = (EditText) findViewById(R.id.EditText_Nationality);


        String str_nat = ET_NAT.getText().toString();

        String str_adj01;


//        String NewStory = "Pizza was invented by a " + str_nat + " chef from" + ;
        Intent America = new Intent(this, Main3Activity.class);
        America.putExtra("NEWSTORY", NewStory);
        startActivity(America);
    }
}
