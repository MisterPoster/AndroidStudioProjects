package org.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Get_Name =      (Button) findViewById(R.id.Get_Name_Button);
        Button Toast_Name =    (Button) findViewById(R.id.Toast_Button);
        Button Random_Button = (Button) findViewById(R.id.Random_Button);


    }
    public void Get_Name(View john_cena)
    {
        if(john_cena.getId() == R.id.Get_Name_Button)
        {

            Toast.makeText(this, "the button works", Toast.LENGTH_LONG).show();
            Log.i("JOHN", "CENA");
        }
        else if (john_cena.getId() == R.id.Toast_Button)
        {
            EditText name = (EditText) findViewById(R.id.Edit_Text_First);
            String first = name.getText().toString();
            Toast.makeText(this, "Your name is: " + first, Toast.LENGTH_SHORT).show();
        }
    }
}
