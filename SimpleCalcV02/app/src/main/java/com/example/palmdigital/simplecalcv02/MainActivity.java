package com.example.palmdigital.simplecalcv02;
//
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
//
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView TextViewFirst;
    ImageView ImageView00_1;
    ImageView ImageView01_1;
    ImageView ImageView02_1;
    ImageView ImageView03_1;
    ImageView ImageView04_1;
    ImageView ImageView05_1;
    ImageView ImageView06_1;
    ImageView ImageView07_1;
    ImageView ImageView08_1;
    ImageView ImageView09_1;

    ImageView ImageViewSubtract;
    ImageView ImageViewAddition;


    TextView TextViewSecondNumber;

    ImageView ImageView00_2;
    ImageView ImageView01_2;
    ImageView ImageView02_2;
    ImageView ImageView03_2;
    ImageView ImageView04_2;
    ImageView ImageView05_2;
    ImageView ImageView06_2;
    ImageView ImageView07_2;
    ImageView ImageView08_2;
    ImageView ImageView09_2;

    ImageView ImageViewEquals;
    TextView TextViewAnswer;

    int num1, num2;
    int sum;
//    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView00_1 = (ImageView) findViewById(R.id.ImageView00_1);
        ImageView00_1.setOnClickListener(this);

        ImageView01_1 = (ImageView) findViewById(R.id.ImageView01_1);
        ImageView01_1.setOnClickListener(this);

        ImageView02_1 = (ImageView) findViewById(R.id.ImageView02_1);
        ImageView02_1.setOnClickListener(this);

        ImageView03_1 = (ImageView) findViewById(R.id.ImageView03_1);
        ImageView03_1.setOnClickListener(this);

        ImageView04_1 = (ImageView) findViewById(R.id.ImageView04_1);
        ImageView04_1.setOnClickListener(this);
        // we're good to here
        ImageView05_1 = (ImageView) findViewById(R.id.ImageView05_1);
        ImageView05_1.setOnClickListener(this);

        ImageView06_1 = (ImageView) findViewById(R.id.ImageView06_1);
        ImageView06_1.setOnClickListener(this);

        ImageView07_1 = (ImageView) findViewById(R.id.ImageView07_1);
        ImageView07_1.setOnClickListener(this);

        ImageView08_1 = (ImageView) findViewById(R.id.ImageView08_1);
        ImageView08_1.setOnClickListener(this);

        ImageView09_1 = (ImageView) findViewById(R.id.ImageView09_1);
        ImageView09_1.setOnClickListener(this);


        TextViewFirst = (TextView) findViewById(R.id.TextViewFirst);

        ImageViewAddition = (ImageView) findViewById(R.id.ImageViewAddition);
        ImageViewAddition.setOnClickListener(this);
        ImageViewSubtract = (ImageView) findViewById(R.id.ImageViewSubtract);
        ImageViewSubtract.setOnClickListener(this);


        ImageView00_2 = (ImageView) findViewById(R.id.ImageView00_2);
        ImageView00_2.setOnClickListener(this);

        ImageView01_2 = (ImageView) findViewById(R.id.ImageView01_2);
        ImageView01_2.setOnClickListener(this);

        ImageView02_2 = (ImageView) findViewById(R.id.ImageView02_2);
        ImageView02_2.setOnClickListener(this);

        ImageView03_2 = (ImageView) findViewById(R.id.ImageView03_2);
        ImageView03_2.setOnClickListener(this);

        ImageView04_2 = (ImageView) findViewById(R.id.ImageView04_2);
        ImageView04_2.setOnClickListener(this);

        ImageView05_2 = (ImageView) findViewById(R.id.ImageView05_2);
        ImageView05_2.setOnClickListener(this);

        ImageView06_2 = (ImageView) findViewById(R.id.ImageView06_2);
        ImageView06_2.setOnClickListener(this);

        ImageView07_2 = (ImageView) findViewById(R.id.ImageView07_2);
        ImageView07_2.setOnClickListener(this);

        ImageView08_2 = (ImageView) findViewById(R.id.ImageView08_2);
        ImageView08_2.setOnClickListener(this);

        ImageView09_2 = (ImageView) findViewById(R.id.ImageView09_2);
        ImageView09_2.setOnClickListener(this);

        TextViewSecondNumber = (TextView) findViewById(R.id.TextViewSecondNumber);

        ImageViewEquals = (ImageView) findViewById(R.id.ImageViewEquals);
        ImageViewEquals.setOnClickListener(this);

        TextViewAnswer = (TextView) findViewById(R.id.TextViewAnswer);


    }

    //
    public void onClick(View view)
    {

        if (view.getId() == R.id.ImageView00_1) {
            TextViewFirst.setText("0");
            num1 = 0;
        } else if (view.getId() == R.id.ImageView01_1) {
            TextViewFirst.setText("1");
            num1 = 1;
        } else if (view.getId() == R.id.ImageView02_1) {
            TextViewFirst.setText("2");
            num1 = 2;
        } else if (view.getId() == R.id.ImageView03_1) {
            TextViewFirst.setText("3");
            num1 = 3;
        } else if (view.getId() == R.id.ImageView04_1) {
            TextViewFirst.setText("4");
            num1 = 4;
        } else if (view.getId() == R.id.ImageView05_1) {
            TextViewFirst.setText("5");
            num1 = 5;
        } else if (view.getId() == R.id.ImageView06_1) {
            TextViewFirst.setText("6");
            num1 = 6;
        } else if (view.getId() == R.id.ImageView07_1) {
            TextViewFirst.setText("7");
            num1 = 7;
        } else if (view.getId() == R.id.ImageView08_1) {
            TextViewFirst.setText("8");
            num1 = 8;
        } else if (view.getId() == R.id.ImageView09_1) {
            TextViewFirst.setText("9");
            num1 = 9;
        }

        else if (view.getId() == R.id.ImageView00_2) {
            TextViewSecondNumber.setText("0");
            num2 = 0;
        } else if (view.getId() == R.id.ImageView01_2) {
            TextViewSecondNumber.setText("1");
            num2 = 1;
        } else if (view.getId() == R.id.ImageView02_2) {
            TextViewSecondNumber.setText("2");
            num2 = 2;
        } else if (view.getId() == R.id.ImageView03_2) {
            TextViewSecondNumber.setText("3");
            num2 = 3;
        } else if (view.getId() == R.id.ImageView04_2) {
            TextViewSecondNumber.setText("4");
            num2 = 4;
        } else if (view.getId() == R.id.ImageView05_2) {
            TextViewSecondNumber.setText("5");
            num2 = 5;
        } else if (view.getId() == R.id.ImageView06_2) {
            TextViewSecondNumber.setText("6");
            num2 = 6;
        } else if (view.getId() == R.id.ImageView07_2) {
            TextViewSecondNumber.setText("7");
            num2 = 7;
        } else if (view.getId() == R.id.ImageView08_2) {
            TextViewSecondNumber.setText("8");
            num2 = 8;
        } else if (view.getId() == R.id.ImageView09_2) {
            TextViewSecondNumber.setText("9");
            num2 = 9;
        }

        else if (view.getId() == R.id.ImageViewAddition)
        {
            ImageViewSubtract.setBackgroundColor(0);
            ImageViewAddition.setBackgroundColor(0xffff0000);
            sum = num1 + num2;
        }
        else if (view.getId() == R.id.ImageViewSubtract)
        {
            ImageViewAddition.setBackgroundColor(0);
            ImageViewSubtract.setBackgroundColor(0xffff0000);
            sum = num1 - num2;
        }
        else if (view.getId() == R.id.ImageViewEquals)
        {
            TextViewAnswer.setText("" + sum);
        }

    }

//    private void setColor(View view)
//    {
//        if(view.getId() == R.id.ImageViewAddition)
//    {
//        ImageViewAddition.setBackgroundColor(Color.rgb(0,0,255));
//    }
//        else if (view.getId() == R.id.ImageViewSubtract)
//        {
//            ImageViewSubtract.setBackgroundColor(Color.rgb(0,0,255));
//        }
//
//    }

} // end of class
