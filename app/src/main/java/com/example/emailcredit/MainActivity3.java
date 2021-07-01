package com.example.emailcredit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView mtxt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mtxt4=findViewById(R.id.txt4);
        String name=getIntent().getStringExtra("key");
        mtxt4.setText("your email is "+ name);
    }
}