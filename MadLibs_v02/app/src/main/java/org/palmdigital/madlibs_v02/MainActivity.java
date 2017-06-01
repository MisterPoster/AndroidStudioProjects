package org.palmdigital.madlibs_v02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{  //start class

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void clickHere(View view)
    {
        EditText adjective   = (EditText) findViewById(R.id.EdiTextAdjective);
        EditText nationality = (EditText) findViewById(R.id.EdiTextNationality);
        EditText name        = (EditText) findViewById(R.id.EdiTextPersonName);

        String adj_01   = adjective.getText().toString();
        String nat      = nationality.getText().toString();
        String newName  = name.getText().toString();

        String FirstSentence = "Pizza was invented by a " + adj_01 +" " + nat + " chef named " + newName + ".";

        Intent cena = new Intent(this, Main2Activity.class);
        cena.putExtra("FirstSentence", FirstSentence);
        startActivity(cena);

//        Toast.makeText(this, "" + FirstSentence, Toast.LENGTH_SHORT).show();

    }
} //end class
