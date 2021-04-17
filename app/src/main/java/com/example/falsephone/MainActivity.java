package com.example.falsephone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumber = findViewById(R.id.tvNumber);

        if(getIntent().getData() != null)
        {
            tvNumber.setText(getIntent().getData().toString());
        }
        else
        {
            tvNumber.setText("Number not found");
        }
    }
}