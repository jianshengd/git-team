package com.janson.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void base(){
        int a = 2;
        int bb = 4;
        System.out.println(a+bb+"");
    }

    public void b(){
        System.out.println("b");
    }

}