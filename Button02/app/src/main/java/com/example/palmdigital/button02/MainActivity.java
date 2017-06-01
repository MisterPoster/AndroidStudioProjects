package com.example.palmdigital.button02;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton2);
        buttonObject1.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        Log.i("info", "yeah, boi, you pressed button1");
        Toast.makeText(MainActivity.this, "us", Toast.LENGTH_SHORT).show();
    }
}
