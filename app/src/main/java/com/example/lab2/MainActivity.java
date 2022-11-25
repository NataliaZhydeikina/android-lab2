package com.example.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task1);
    }
    public void goToTask2(View view) {
        setContentView(R.layout.task2);
    }
    public void goToTask3(View view) {
        setContentView(R.layout.task3);
    }
    public void goToTask4(View view) {
        setContentView(R.layout.task4);
    }
    public void goToTask1(View view) {
        setContentView(R.layout.task1);
    }
}