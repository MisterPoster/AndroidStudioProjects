package com.example.palmdigital.toastpractice02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"My name is Samuel Sparenga.", Toast.LENGTH_LONG).show();

        Toast.makeText(MainActivity.this,"My favorite animal is the cheetah.", Toast.LENGTH_LONG).show();
    }
}
