package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // declare Mydatabase class as myDatabase
    MyDatabase myDatabase;
    Button buttonSignup,buttonloing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call Mydatabase class to create database
        myDatabase = new MyDatabase(this);

        buttonSignup = findViewById(R.id.btnsignup);
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupInten = new Intent(MainActivity.this,SignUp.class);
                startActivity(signupInten);
            }
        });


        buttonloing = findViewById(R.id.btnlogin);
        buttonloing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupInten = new Intent(MainActivity.this,SignUp.class);
                startActivity(signupInten);
            }
        });

    }
}