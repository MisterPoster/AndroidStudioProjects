package com.example.palmdigital.button3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implentments View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Object1 = (Button)findViewById(R.id.ButtonMyButton3);
        Object1.setOnClickListener(this);
    }
    public void OnClick(View view)
        {
        
        }
}
