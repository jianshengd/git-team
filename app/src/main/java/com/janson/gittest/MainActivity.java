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
        int aa = 2;
        int b = 3;
        System.out.println(aa+b+"");
    }

    public  void a(){
        System.out.println("a");

    }

}