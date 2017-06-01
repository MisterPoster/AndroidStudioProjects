package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

    //fields
    int thisNewInt;
    double thisNewDouble;
    Button thisNewButton;
    TextView thisNewTextView;
    String thisNewString;
    ImageView thisNewImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void method()
    {
        int thisInt = 2;
        double thisDouble = 3.45;
        String thisString = "war";
        Button thisButton = (Button) findViewById(R.id.button);
        TextView thisTextView = (TextView) findViewById(R.id.textView);

        thisNewButton = (Button) findViewById(R.id.button);
        thisInt = 3;


    }
    public void method2()
    {
        int thisInt = 2;
        double thisDouble;
        String thisString = "war";
        Button thisButton = (Button) findViewById(R.id.button);
        TextView thisTextView = (TextView)findViewById(R.id.scp);

        thisNewImageView = (ImageView) findViewById(R.id.imageView);
        thisNewTextView = (TextView) findViewById(R.id.textView);



    }
    public void method3()
    {
        int thisInt = 2;
        double thisDouble;
        String thisString = "war";
        Button thisButton = (Button) findViewById(R.id.button);
        TextView thisTextView = (TextView)findViewById(R.id.scp);

        thisNewDouble = 6.7;
        thisNewString = "donald";


    }
    public void method4()
    {
        int thisInt = 2;
        double thisDouble;
        String thisString = "war";
        Button thisButton = (Button) findViewById(R.id.button);
        TextView thisTextView = (TextView)findViewById(R.id.scp);

        thisNewDouble = 6.5;


    }
    public void method5()
    {
        int thisInt = 2;
        double thisDouble;
        String thisString = "war";
        Button thisButton = (Button) findViewById(R.id.button);
        TextView thisTextView = (TextView)findViewById(R.id.scp);

        thisNewImageView = (ImageView) findViewById(R.id.imageView);


    }

}
