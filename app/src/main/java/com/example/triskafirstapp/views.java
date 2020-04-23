package com.example.triskafirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.triskafirstapp.R;

public class views extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc);
        getSupportActionBar().setTitle("Description");
    }
}
