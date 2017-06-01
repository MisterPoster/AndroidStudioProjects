package com.example.palmdigital.toast_practice_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Samuel Sparenga", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "January 11, 2017", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "bye, Obama", Toast.LENGTH_LONG).show();
    }
}
