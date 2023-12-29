package com.example.myapplication.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan1MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn1;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        btn1 = findViewById(R.id.calcButton);
        tv1 = findViewById(R.id.sumTxt);

        btn1.setOnClickListener(v->{
            tinhTong();
        });
    }

    private void tinhTong() {
        String str1 = txt1.getText().toString();
        Float num1 = Float.parseFloat(str1);
        String str2 = txt2.getText().toString();
        Float num2 = Float.parseFloat(str2);

        tv1.setText("Sum: " + String.valueOf(num1+num2));
    }
}