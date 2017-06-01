package com.example.palmdigital.simplecalcv04;
//
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

//
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{  //start of class
    //fields -- buttons
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

    ImageView ImageViewAdd;
    ImageView ImageViewSubtract;
    ImageView ImageViewDivide;
    ImageView ImageViewMultiply;
    ImageView ImageViewClear;

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


    //fields -- textviews
    TextView TextViewTop;
    TextView TextViewMiddle;
    TextView TextViewAnswer;

    //fields -- variables
    double num1;
    double num2;

    double result;

    int operator;
    //1 = +
    //2 = -
    //3 = *
    //4 = /
    //5 = clear


    @Override
    protected void onCreate(Bundle savedInstanceState)
    { //start of create method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declarations
        ImageView00_1 = (ImageView) findViewById(R.id.ImageView00_1);
        ImageView01_1 = (ImageView) findViewById(R.id.ImageView01_1);
        ImageView02_1 = (ImageView) findViewById(R.id.ImageView02_1);
        ImageView03_1 = (ImageView) findViewById(R.id.ImageView03_1);
        ImageView04_1 = (ImageView) findViewById(R.id.ImageView04_1);
        ImageView05_1 = (ImageView) findViewById(R.id.ImageView05_1);
        ImageView06_1 = (ImageView) findViewById(R.id.ImageView06_1);
        ImageView07_1 = (ImageView) findViewById(R.id.ImageView07_1);
        ImageView08_1 = (ImageView) findViewById(R.id.ImageView08_1);
        ImageView09_1 = (ImageView) findViewById(R.id.ImageView09_1);


        TextViewTop = (TextView) findViewById(R.id.TextViewTop);
//
        ImageViewAdd = (ImageView) findViewById(R.id.ImageViewAdd);
        ImageViewSubtract =(ImageView) findViewById(R.id.ImageViewSubtract);
        ImageViewDivide = (ImageView) findViewById(R.id.ImageViewDivide);
        ImageViewMultiply = (ImageView) findViewById(R.id.ImageViewMultiply);
        ImageViewClear = (ImageView) findViewById(R.id.ImageViewClear);
////
        TextViewMiddle = (TextView) findViewById(R.id.TextViewMiddle);
//
        ImageView00_2 = (ImageView) findViewById(R.id.ImageView00_2);
        ImageView01_2 = (ImageView) findViewById(R.id.ImageView01_2);
        ImageView02_2 = (ImageView) findViewById(R.id.ImageView02_2);
        ImageView03_2 = (ImageView) findViewById(R.id.ImageView03_2);
        ImageView04_2 = (ImageView) findViewById(R.id.ImageView04_2);
        ImageView05_2 = (ImageView) findViewById(R.id.ImageView05_2);
        ImageView06_2 = (ImageView) findViewById(R.id.ImageView06_2);
        ImageView07_2 = (ImageView) findViewById(R.id.ImageView07_2);
        ImageView08_2 = (ImageView) findViewById(R.id.ImageView08_2);
        ImageView09_2 = (ImageView) findViewById(R.id.ImageView09_2);
////
        ImageViewEquals = (ImageView) findViewById(R.id.ImageViewEquals);

        TextViewAnswer = (TextView) findViewById(R.id.TextViewAnswer);
//
//        //setting click listeners
        ImageView00_1.setOnClickListener(this);
        ImageView01_1.setOnClickListener(this);
        ImageView02_1.setOnClickListener(this);
        ImageView03_1.setOnClickListener(this);
        ImageView04_1.setOnClickListener(this);
        ImageView05_1.setOnClickListener(this);
        ImageView06_1.setOnClickListener(this);
        ImageView07_1.setOnClickListener(this);
        ImageView08_1.setOnClickListener(this);
        ImageView09_1.setOnClickListener(this);
//
        ImageViewAdd.setOnClickListener(this);
        ImageViewSubtract.setOnClickListener(this);
        ImageViewMultiply.setOnClickListener(this);
        ImageViewDivide.setOnClickListener(this);
        ImageViewClear.setOnClickListener(this);
//
        ImageView00_2.setOnClickListener(this);
        ImageView01_2.setOnClickListener(this);
        ImageView02_2.setOnClickListener(this);
        ImageView03_2.setOnClickListener(this);
        ImageView04_2.setOnClickListener(this);
        ImageView05_2.setOnClickListener(this);
        ImageView06_2.setOnClickListener(this);
        ImageView07_2.setOnClickListener(this);
        ImageView08_2.setOnClickListener(this);
        ImageView09_2.setOnClickListener(this);
//
        ImageViewEquals.setOnClickListener(this);


    }

    //
    public void onClick(View view)
    { //start of onClick

        if (view.getId() == R.id.ImageView00_1)
        {
            TextViewTop.setText("0");
            num1 = 0;
        }
        else if (view.getId() == R.id.ImageView01_1)
        {
            TextViewTop.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.ImageView02_1)
        {
            TextViewTop.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.ImageView03_1)
        {
            TextViewTop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.ImageView04_1)
        {
            TextViewTop.setText("4");
            num1 = 4;
        }
        else if (view.getId() == R.id.ImageView05_1)
        {
            TextViewTop.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.ImageView06_1)
        {
            TextViewTop.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.ImageView07_1)
        {
            TextViewTop.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.ImageView08_1)
        {
            TextViewTop.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.ImageView09_1)
        {
            TextViewTop.setText("9");
            num1 = 9;
        }

        else if (view.getId() == R.id.ImageViewAdd)
        {
            result = num1 + num2;
            operator = 1;
            ImageViewAdd.setBackgroundColor(Color.rgb(255,0,0));
            ImageViewSubtract.setBackgroundColor(0);
            ImageViewDivide.setBackgroundColor(0);
            ImageViewMultiply.setBackgroundColor(0);
            ImageViewClear.setBackgroundColor(0);
        }
        else if (view.getId() == R.id.ImageViewSubtract)
        {
            result = num1 - num2;
            operator = 2;
            ImageViewAdd.setBackgroundColor(0);
            ImageViewSubtract.setBackgroundColor(Color.rgb(255,0,0));
            ImageViewDivide.setBackgroundColor(0);
            ImageViewMultiply.setBackgroundColor(0);
            ImageViewClear.setBackgroundColor(0);

        }
        else if (view.getId() == R.id.ImageViewMultiply)
        {
            result = num1 * num2;
            operator = 3;
            ImageViewAdd.setBackgroundColor(0);
            ImageViewSubtract.setBackgroundColor(0);
            ImageViewDivide.setBackgroundColor(0);
            ImageViewMultiply.setBackgroundColor(Color.rgb(255,0,0));
            ImageViewClear.setBackgroundColor(0);

        }
        else if (view.getId() == R.id.ImageViewDivide)
        {
            result = num1 / num2;
            operator = 4;
            ImageViewAdd.setBackgroundColor(0);
            ImageViewSubtract.setBackgroundColor(0);
            ImageViewDivide.setBackgroundColor(Color.rgb(255,0,0));
            ImageViewMultiply.setBackgroundColor(0);
            ImageViewClear.setBackgroundColor(0);

//        if(num2 == 0)
//        {
//            TextViewAnswer.setText("ERROR");
//        }
        }
        else if (view.getId() == R.id.ImageViewClear)
        {
            operator = 5;
            TextViewTop.setText("");
            TextViewMiddle.setText("");
            TextViewAnswer.setText("");

            ImageViewAdd.setBackgroundColor(0);
            ImageViewSubtract.setBackgroundColor(0);
            ImageViewDivide.setBackgroundColor(0);
            ImageViewMultiply.setBackgroundColor(0);
            ImageViewClear.setBackgroundColor(Color.rgb(255,0,0));
        }

        else if (view.getId() == R.id.ImageView00_2)
        {
            TextViewMiddle.setText("0");
            num2 = 0;
        } else if (view.getId() == R.id.ImageView01_2)
        {
            TextViewMiddle.setText("1");
            num2 = 1;
        } else if (view.getId() == R.id.ImageView02_2)
        {
            TextViewMiddle.setText("2");
            num2 = 2;
        } else if (view.getId() == R.id.ImageView03_2)
        {
            TextViewMiddle.setText("3");
            num2 = 3;
        } else if (view.getId() == R.id.ImageView04_2)
        {
            TextViewMiddle.setText("4");
            num2 = 4;
        } else if (view.getId() == R.id.ImageView05_2)
        {
            TextViewMiddle.setText("5");
            num2 = 5;
        } else if (view.getId() == R.id.ImageView06_2)
        {
            TextViewMiddle.setText("6");
            num2 = 6;
        } else if (view.getId() == R.id.ImageView07_2)
        {
            TextViewMiddle.setText("7");
            num2 = 7;
        } else if (view.getId() == R.id.ImageView08_2)
        {
            TextViewMiddle.setText("8");
            num2 = 8;
        } else if (view.getId() == R.id.ImageView09_2)
        {
            TextViewMiddle.setText("9");
            num2 = 9;
        }

        else if (view.getId() == R.id.ImageViewEquals)
        {
            if (operator == 1)
            {
                result = num1 + num2;
                operator = 1;
                setColor(view);
                TextViewAnswer.setText("" + result);
            }
            else if (operator == 2)
            {
                result = num1 - num2;
                operator = 2;
                setColor(view);
                TextViewAnswer.setText("" + result);
            }
            else if (operator == 3)
            {
                result = num1 * num2;
                operator = 3;
                setColor(view);
                TextViewAnswer.setText("" + result);
            }
            else if (operator == 4)
            {
                result = num1 / num2;
                operator = 4;
                setColor(view);
                TextViewAnswer.setText("" + result);
                if (num2 == 0)
                {
                    TextViewAnswer.setText("ERROR");
                }
            }


        }



    } // end of onclick

    public void setColor(View view)
    { //start of setColor
        if (operator == 1)
        {
            ImageViewAdd.setBackgroundColor(Color.rgb(255,0,0));
        }
        else if (operator == 2)
        {
            ImageViewSubtract.setBackgroundColor(Color.rgb(255,0,0));
            if(operator != 2)
            {
                ImageViewSubtract.setBackgroundColor(Color.rgb(255,255,255));
            }
        }
        else if (operator == 3)
        {
            ImageViewMultiply.setBackgroundColor(Color.rgb(255,0,0));
            if (operator != 3)
            {
                ImageViewMultiply.setBackgroundColor(Color.rgb(255,255,255));
            }
        }
        else if (operator == 4)
        {
            ImageViewDivide.setBackgroundColor(Color.rgb(255,0,0));
            if (operator != 4)
            {
                ImageViewDivide.setBackgroundColor(Color.rgb(255,255,255));
            }
        }
        else if (operator == 5)
        {
            ImageViewClear.setBackgroundColor(Color.rgb(255,0,0));
        }

    }//end of setColor
//
////    public void operator(View view)
////    {
////
////    }
} // end of class

