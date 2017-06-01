package org.palmdigital.caeser_cipher_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class MainActivity extends AppCompatActivity
{
    EditText Encrypt_Here;
    Button Encrypt;
    TextView Encrypt_Result;
    int size;
    String Input;
    String Encrypt_Result_Here;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Input = "DOGS ARE GREAT";
//        Encrypt_Result_Here = EncryptHere();
////        Encrypt_Result.setText(" " + output);
//        EditText Shift = (EditText) findViewById(R.id.Shift);



        //start on adding 'shift' to decryption


    }
    public void EncryptHere(View view)
        {  //start Encrypt_here
//            int random = 1+2+3+4+5+6+7+8+9;
//            Log.i("info", "" + random);
            //getting string
            EditText input = (EditText) findViewById(R.id.Encrypt_This);
            String str_input = input.getText().toString();


            //getting shift
            EditText shift = (EditText) findViewById(R.id.Shift);
            String str_shift = shift.getText().toString();
            int Shift = Integer.parseInt(str_shift);



            int size = 26;

            char[] Caeser = new char[size];
            Caeser[0] = 'A';
            Caeser[1] = 'B';
            Caeser[2] = 'C';
            Caeser[3] = 'D';
            Caeser[4] = 'E';
            Caeser[5] = 'F';
            Caeser[6] = 'G';
            Caeser[7] = 'H';
            Caeser[8] = 'I';
            Caeser[9] = 'J';
            Caeser[10] = 'K';
            Caeser[11] = 'L';
            Caeser[12] = 'M';
            Caeser[13] = 'N';
            Caeser[14] = 'O';
            Caeser[15] = 'P';
            Caeser[16] = 'Q';
            Caeser[17] = 'R';
            Caeser[18] = 'S';
            Caeser[19] = 'T';
            Caeser[20] = 'U';
            Caeser[21] = 'V';
            Caeser[22] = 'W';
            Caeser[23] = 'X';
            Caeser[24] = 'Y';
            Caeser[25] = 'Z';

            int shiftCharIndex;
            int fixedCharIndex;
            String output = "";
            String toUpperCase = str_input.toUpperCase();

            for (int i = 0; i < input.length(); i++)
            {  //start for i -- outer

                for (int j = 0; j < Caeser.length; j++)
                {  //start for i -- inner

                    if (toUpperCase.charAt(i) == Caeser[j])
                    {

                        shiftCharIndex = j + Shift;
                        fixedCharIndex = shiftCharIndex % 26;
                        output = output + Caeser[fixedCharIndex];

                    }

                }  //start for i -- inner

                if (str_input.charAt(i) == ' ')
                {
                    output += " ";
                }
            } //end for i  -- outer
            TextView Result = (TextView) findViewById(R.id.Encrypted_Result);
            Result.setText(output);
        } // end Encrypt_Here

    public void DecryptHere(View view)
    {  //start Decrypt_here
//        int random = 1+2+3+4+5+6+7+8+9;
//        Log.i("info", "" + random);
        //getting string
        int Shift;

        EditText Second_Input = (EditText) findViewById(R.id.editText_Encrypted_Text);
        String str_input = Second_Input.getText().toString();


        //getting shift
        EditText new_shift = (EditText) findViewById(R.id.Second_Shift);
        String str_shift = new_shift.getText().toString();
        if (str_shift.isEmpty())
        {
            Shift = 0;
            Toast.makeText(this, "Please enter a shift.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Shift = Integer.parseInt(str_shift);
        }



        int size = 26;

        char[] Caeser = new char[size];
        Caeser[0] = 'A';
        Caeser[1] = 'B';
        Caeser[2] = 'C';
        Caeser[3] = 'D';
        Caeser[4] = 'E';
        Caeser[5] = 'F';
        Caeser[6] = 'G';
        Caeser[7] = 'H';
        Caeser[8] = 'I';
        Caeser[9] = 'J';
        Caeser[10] = 'K';
        Caeser[11] = 'L';
        Caeser[12] = 'M';
        Caeser[13] = 'N';
        Caeser[14] = 'O';
        Caeser[15] = 'P';
        Caeser[16] = 'Q';
        Caeser[17] = 'R';
        Caeser[18] = 'S';
        Caeser[19] = 'T';
        Caeser[20] = 'U';
        Caeser[21] = 'V';
        Caeser[22] = 'W';
        Caeser[23] = 'X';
        Caeser[24] = 'Y';
        Caeser[25] = 'Z';

        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = str_input.toUpperCase();

        for (int i = 0; i < toUpperCase.length(); i++)
        {  //start for i -- outer

            for (int j = 0; j < Caeser.length; j++)
            {  //start for i -- inner

                if (toUpperCase.charAt(i) == Caeser[j])
                {

                    shiftCharIndex = j - Shift;
                    fixedCharIndex = shiftCharIndex % 26;
                    output = output + Caeser[fixedCharIndex];

                }

            }  //start for i -- inner

            if (toUpperCase.charAt(i) == ' ')
            {
                output += " ";
            }
        } //end for i  -- outer
//        output = "obama";
        TextView Decrypt_Result = (TextView) findViewById(R.id.TextView_Decrypt_Result);
        Decrypt_Result.setText(output);
    } // end Decrypt_Here
}



