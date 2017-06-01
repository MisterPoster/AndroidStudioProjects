package org.palmdigital.putintent_test_prev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText Get_Name_EditText;
    String passHere;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Get_Name_EditText          = (EditText) findViewById(R.id.EditText_Name);
        Button PutExtra_Button     = (Button)   findViewById(R.id.PutExtra_Button);

        PutExtra_Button.setOnClickListener(this);
    }

    public void onClick(View DK)
    {
        if(DK.getId() == R.id.PutExtra_Button)
        {
            Intent cena     = new Intent(MainActivity.this, Get_Name_Here.class);
//            Get_Name_EditText.getText().toString();
            passHere = Get_Name_EditText.getText().toString();
//            Log.i("info", "" + passHere);
            Toast.makeText(this, ""  + passHere, Toast.LENGTH_SHORT).show();
            cena.putExtra(passHere, passHere );
            startActivity(cena);

        }

    }
}
