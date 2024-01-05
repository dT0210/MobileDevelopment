package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan2SecondActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_second);

        tv1 = findViewById(R.id.tuan2tv1);

        Intent i1 = getIntent();

        String str1 = i1.getExtras().getString("num1");
        String str2 = i1.getExtras().getString("num2");

        float num1 = Float.parseFloat(str1);
        float num2 = Float.parseFloat(str2);

        tv1.setText(String.valueOf(num1 + num2));
    }
}