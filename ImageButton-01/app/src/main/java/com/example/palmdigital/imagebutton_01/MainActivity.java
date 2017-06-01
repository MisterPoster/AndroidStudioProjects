package com.example.palmdigital.imagebutton_01;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button01 = (ImageButton)findViewById(R.id.ImageButton01);
        button01.setBackgroundColor(Color.argb(100,100,100,100));
        button01.setOnClickListener(this);

        ImageButton button02 = (ImageButton)findViewById(R.id.ImageButton02);
        button02.setBackgroundColor(Color.argb(100,175,175,175));
        button02.setOnClickListener(this);


        ImageButton button03 = (ImageButton)findViewById(R.id.ImageButton03);
        button03.setBackgroundColor(Color.argb(100,200,200,200));
        button03.setOnClickListener(this);

    }

    public void onClick(View view)
    {
    if (view.getId() == R.id.ImageButton01)
    {
        Toast.makeText(MainActivity.this,"Downloading for Windows...", Toast.LENGTH_LONG).show();
    }
    else if(view.getId() == R.id.ImageButton02)
    {
        Toast.makeText(MainActivity.this,"Downloading for Mac...", Toast.LENGTH_LONG).show();
    }
    else if(view.getId() == R.id.ImageButton03)
    {
        Toast.makeText(MainActivity.this,"Downloading for Linux...", Toast.LENGTH_LONG).show();
    }
    }
}
