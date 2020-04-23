package com.example.triskafirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.triskafirstapp.R;

public class views2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc2);
        getSupportActionBar().setTitle("Description");
    }
}
