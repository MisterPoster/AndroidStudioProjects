package org.palmdigital.edittext01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button NameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NameButton = (Button) findViewById(R.id.fullName);
        NameButton.setOnClickListener(this);


    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.fullName)
        {
            TextView result = (TextView) findViewById(R.id.textViewResult);
            EditText first  = (EditText) findViewById(R.id.editText);
            EditText last = (EditText) findViewById(R.id.editText2);

            String firstName = first.getText().toString();
            String lastName  = last.getText().toString();
            //error!!!

            result.setText("Your name is: " + firstName +" " + lastName);

        }

    }
}
