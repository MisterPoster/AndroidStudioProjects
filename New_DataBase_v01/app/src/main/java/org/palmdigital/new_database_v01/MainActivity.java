package org.palmdigital.new_database_v01;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText StudentName;
    private EditText StudentID;
    private EditText PhoneDescription;

    String Name;
    String ID;
    String Phone;

    SharedPreferences info;
    SharedPreferences.Editor editor;

    String dateBaseName = "Phone Repo";
    String keyName = "studentNameKey";
    String keyID = "StudentIDKey";
    String keyPhone = "PhoneDescriptionKey";
    String defaulter = "no info needed";

    Button Save;
    Button Load;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Save = (Button) findViewById(R.id.Save);
        Load = (Button) findViewById(R.id.Load);

        StudentName      = (EditText) findViewById(R.id.EditText_Name);
        StudentID        = (EditText) findViewById(R.id.EditText_ID);
        PhoneDescription = (EditText) findViewById(R.id.EditText_Description);

        info   = getSharedPreferences("phone repo", MODE_PRIVATE);
        editor = info.edit();
    }
    public void rightHere(View america)
    {
        switch(america.getId())
        {
            //case part
        }

    }
}
