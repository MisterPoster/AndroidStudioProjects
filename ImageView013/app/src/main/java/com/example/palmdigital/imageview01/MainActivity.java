package com.example.palmdigital.imageview01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView button1 = (ImageView)findViewById(R.id.Image_Contacts);
//        button1.setBackgroundColor(Color.argb(100,50,50,50));
        button1.setOnClickListener(this);

        ImageView button2 = (ImageView)findViewById(R.id.Image_Email);
//       button2.setBackgroundColor(Color.argb(100,100,100,100));
        button2.setOnClickListener(this);

        ImageView button3 =(ImageView)findViewById(R.id.Image_Messages);
//        button3.setBackgroundColor(Color.argb(100,150,150,150));
        button3.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.Image_Contacts)
        {
            Toast.makeText(this,"this is your contact",Toast.LENGTH_LONG);
        }
        else if (view.getId() == R.id.Image_Email)
        {
            Toast.makeText(this, "this is your email", Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.Image_Messages)
        {
            Toast.makeText(this, "what messages do you want?", Toast.LENGTH_SHORT).show();
        }
    }
}
