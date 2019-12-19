package com.example.randomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tvProcess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvProcess = findViewById(R.id.tvNum);

        //Create random
        Random myRandom = new Random();
        int num = myRandom.nextInt(101);//0-100

        tvProcess.setText(""+num);
    }

    public void process(View view) {
        //Create random
        Random myRandom = new Random();
        int num = myRandom.nextInt(101);//0-100

        tvProcess.setText(""+num);
    }
}
