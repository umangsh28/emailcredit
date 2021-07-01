package com.example.emailcredit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText mtxt1;
    private EditText mtxt2;
    private Button mbtn1;

    private String validation="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intiviews();





        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isemail() && ispassword()){
                    Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                    intent.putExtra("key",mtxt1.getText().toString());
                    startActivity(intent);
                }
            }
        });



    }
    private void intiviews(){
        mbtn1=findViewById(R.id.btn1);
        mtxt1=findViewById(R.id.txt1);
        mtxt2=findViewById(R.id.txt2);

    }
    private boolean isemail(){
        if(mtxt1.getText().toString().matches(validation)){
            return true;
        }else{
            mtxt1.setError("Invalid");
            return false;
        }
    }

    private boolean ispassword(){
        if(mtxt2.getText().toString().length()>=6){
            return true;
        }else{
            mtxt2.setError("wrong");
            return false;
        }


    }


}