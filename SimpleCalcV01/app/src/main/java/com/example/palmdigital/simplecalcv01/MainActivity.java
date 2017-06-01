package com.example.palmdigital.simplecalcv01;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView TextViewTop;
    //fields

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    ImageView imageViewPlus;

    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;

    TextView TextViewNext;
    ImageView imageViewEquals;

    TextView TextViewAnswer;

    int number, numberTwo, sum;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //references

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView6 = (ImageView)findViewById(R.id.imageView6);

        imageViewPlus = (ImageView)findViewById(R.id.imageViewPlus);
        imageViewEquals = (ImageView)findViewById(R.id.imageViewEquals);

        imageView1.setBackgroundColor(Color.rgb(255,0,0));
        imageView2.setBackgroundColor(Color.rgb(0,255,0));
        imageView3.setBackgroundColor(Color.rgb(0,0,255));
        imageView4.setBackgroundColor(Color.rgb(0,0,255));
        imageView5.setBackgroundColor(Color.rgb(0,255,0));
        imageView6.setBackgroundColor(Color.rgb(255,0,0));

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);  //setting click listener
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);

//        imageViewPlus.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);

        TextViewTop = (TextView)findViewById(R.id.TextViewTop);
        TextViewNext = (TextView)findViewById(R.id.TextViewNext);
        TextViewAnswer = (TextView)findViewById(R.id.TextViewAnswer);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
            TextViewTop.setText("1");
            number = 1;
        }
        else if (view.getId() == R.id.imageView2)
        {
            TextViewTop.setText("2");
            number = 2;
        }
        else if(view.getId() == R.id.imageView3)
        {
            TextViewTop.setText("3");
            number = 3;
        }

//        else if (view.getId() == R.id.imageViewPlus)
//        {
//             sum = number + numberTwo;
//        }

        else if (view.getId() == R.id.imageView4)
        {
            TextViewNext.setText("4");
            numberTwo = 4;
        }
        else if(view.getId() == R.id.imageView5)
        {
            TextViewNext.setText("5");
            numberTwo = 5;
        }
        else if(view.getId() == R.id.imageView6)
        {
            TextViewNext.setText("6");
            numberTwo = 6;
        }

        else if(view.getId() == R.id.imageViewEquals)
        {
            sum = number + numberTwo;
            TextViewAnswer.setText("" + (sum));
//          Log.i("info", "" + sum);
        }

    }
}
