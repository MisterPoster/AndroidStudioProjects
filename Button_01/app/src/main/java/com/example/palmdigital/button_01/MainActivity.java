package com.example.palmdigital.button_01;

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

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setText("Button A");
        buttonObject1.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        Log.i("info", "you pressed a button. pause.");
        Toast.makeText(MainActivity.this, "you pressed a button, pause", Toast.LENGTH_LONG).show();
    }
}
