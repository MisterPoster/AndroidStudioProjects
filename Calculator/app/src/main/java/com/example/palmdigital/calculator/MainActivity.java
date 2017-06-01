package com.example.palmdigital.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = (Button)findViewById(R.id.Button01);
        button01.setOnClickListener(this);
        button01.setText("1");

        Button button02 = (Button)findViewById(R.id.Button02);
        button02.setOnClickListener(this);
        button02.setText("2");

        Button button03 = (Button)findViewById(R.id.Button03);
        button03.setOnClickListener(this);
        button03.setText("3");

        Button button04 = (Button)findViewById(R.id.Button04);
        button04.setOnClickListener(this);
        button04.setText("4");

        Button button05 = (Button)findViewById(R.id.Button05);
        button05.setOnClickListener(this);
        button05.setText("5");

        Button button06 = (Button)findViewById(R.id.Button06);
        button06.setOnClickListener(this);
        button06.setText("6");

        Button button07 = (Button)findViewById(R.id.Button07);
        button07.setOnClickListener(this);
        button07.setText("7");

        Button button08 = (Button)findViewById(R.id.Button08);
        button08.setOnClickListener(this);
        button08.setText("8");

        Button button09 = (Button)findViewById(R.id.Button09);
        button09.setOnClickListener(this);
        button09.setText("9");

        Button button00 = (Button)findViewById(R.id.Button00);
        button00.setOnClickListener(this);
        button00.setText("0");

        Button buttonPlus = (Button)findViewById(R.id.ButtonPlus);
        buttonPlus.setOnClickListener(this);
        buttonPlus.setText("+");

        Button buttonEquals = (Button)findViewById(R.id.ButtonExecute);
        buttonEquals.setOnClickListener(this);
        buttonEquals.setText("=");

    }

    public void onClick(View view)
    {

    }
}
