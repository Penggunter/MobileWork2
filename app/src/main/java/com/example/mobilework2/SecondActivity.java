package com.example.mobilework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textLine = (TextView)findViewById(R.id.mes);

        Intent catchIntent = getIntent();
        textLine.setText(catchIntent.getExtras().get("messange").toString());
    }
}