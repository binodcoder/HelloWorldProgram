package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hello;
    Button a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello=findViewById(R.id.tv1);
        a=findViewById(R.id.btn1);
        b=findViewById(R.id.btn2);
        c=findViewById(R.id.btn3);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello.setText("This is A button");
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello.setText("This is B button");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello.setText("This is C button");
            }
        });
    }
}