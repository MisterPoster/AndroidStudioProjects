package org.palmdigital.putintent_test_prev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Get_Name_Here extends AppCompatActivity implements View.OnClickListener
{
    TextView Answer;
    String passHere;
    String please;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get__name__here);

        Answer          = (TextView) findViewById(R.id.Question_TextView);
        Button Back     = (Button) findViewById(R.id.PutExtra_Button);

        Back.setOnClickListener(this);


        Bundle bundle = getIntent().getExtras();

        passHere = bundle.getString("passHere");

        if (bundle.getString("passHere")!= null)
        {
//            please = bundle.getString("passHere");
            Answer.setText("" + passHere);
        }
        else
        {
            Answer.setText("" + passHere);
        }
    }

    public void onClick(View cena)
    {
        if(cena.getId() == R.id.PutExtra_Button)
        {
            String passHere;

            Intent WontonCena     = new Intent(Get_Name_Here.this, MainActivity.class);
//            Get_Name_EditText.getText().toString();
//            String passHere = Get_Name_EditText.getText().toString();
//            WontonCena.putExtra(passHere, passHere);
//            Toast.makeText(this, "" + passHere, Toast.LENGTH_SHORT).show();
            startActivity(WontonCena);

        }

    }
}
