package com.example.palmdigital.textviewoutput01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textView;
    TextView textViewAnswer;
    TextView textViewPlus;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView1.setOnClickListener(this);

        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setOnClickListener(this);

        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.setOnClickListener(this);

        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setOnClickListener(this);

        ImageView imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView5.setOnClickListener(this);

        ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView6.setOnClickListener(this);

        ImageView imageViewEquals = (ImageView)findViewById(R.id.imageViewEquals);

        textView = (TextView)findViewById(R.id.textView);

        textViewAnswer= (TextView)findViewById(R.id.textViewAnswer);
    }

    public void onClick(View view)
    {
    if(view.getId() == R.id.imageView1)
    {
        textView.setText("1");
        int var1 = 1;
//        Log.i("info", var1);
    }
        else if(view.getId() == R.id.imageView2)
    {
        textView.setText("2");
        int var2 = 2;
    }
        else if (view.getId() == R.id.imageView3)
    {
        textView.setText("3");
        int var3 = 3;
    }
    else if (view.getId() == R.id.imageView4)
    {
        textViewPlus.setText("4");
        int var4 = 4;
    }
    else if (view.getId() == R.id.imageView5)
    {
        textViewPlus.setText("5");
        int var5 = 5;
    }
    else if (view.getId() == R.id.imageView6)
    {
        textViewPlus.setText("6");
        int var6 = 6;
    }
        if (view.getId() == R.id.imageViewEquals)
        {

        }
    }
}
