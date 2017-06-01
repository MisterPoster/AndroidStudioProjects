package org.palmdigital.intents_putextrav01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{ //start  class

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    } //end onCreate

    public void firstClick(View view)
    {
        EditText ET_ADJ1 = (EditText) findViewById(R.id.EditText_Adjective_1);

        String str_adj01 = ET_ADJ1.getText().toString();

        String StartStory = "Pizza was invented by a " + str_adj01 + " chef.";


        Intent America = new Intent(this, Main2Activity.class);
        America.putExtra("STARTSTORY", StartStory);
        startActivity(America);

    }
} //end class
