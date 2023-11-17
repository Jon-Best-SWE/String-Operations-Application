package com.example.codingtheapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.annotation.SuppressLint;

public class MainActivity extends AppCompatActivity {

    public EditText e1, e2;
    TextView t1;
    Button stringsum;
    int count1 = 0;
    int count2 = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.input_1);
        e2 = (EditText) findViewById(R.id.input_2);
        t1 = (TextView) findViewById(R.id.result);
        stringsum = (Button) findViewById(R.id.add_button);
    }

    @SuppressLint("SetTextI18n")
    public void doSum(View v) {
        String str1 = e1.getText().toString();
        String str2 = e2.getText().toString();
        if((str1.length() != 0) && (str2.length() != 0))
            t1.setText(str1 + " " + str2);
        else
            t1.setText("Please Input Required Strings");
    }
    @SuppressLint("SetTextI18n")
    public void doComp(View v) {
        String str1 = e1.getText().toString();
        String str2 = e2.getText().toString();
        if( str1.equals( str2 ) )
            t1.setText("Matching");
        else
            t1.setText("Not Matching");
        if((str1.length() == 0) || (str2.length() == 0))
            t1.setText("Please Input Required Strings");
    }
    @SuppressLint("SetTextI18n")
    public void doCount(View v) {
        String str1 = e1.getText().toString();
        String str2 = e2.getText().toString();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e'
                    || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o'
                    || str1.charAt(i) == 'u') {
                count1++;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e'
                    || str2.charAt(i) == 'i'
                    || str2.charAt(i) == 'o'
                    || str2.charAt(i) == 'u') {
                count2++;
            }
        }

        int vowelTotal = count1 + count2;

        if((str1.length() != 0) && (str2.length() != 0))
            t1.setText("Total Number of Vowels: " + vowelTotal);
        else
            t1.setText("Please Input Required Strings");
        count1 = 0;
        count2 = 0;
    }
    @SuppressLint("SetTextI18n")
    public void doClear(View v) {
        e1.setText("");
        e2.setText("");
        t1.setText("");
    }
}