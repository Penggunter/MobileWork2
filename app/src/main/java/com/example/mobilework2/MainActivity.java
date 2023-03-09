package com.example.mobilework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView loadTitle = (TextView)findViewById(R.id.textmain);
        loadTitle.setText(R.string.helloworld);
        ImageView loadPicture = (ImageView)findViewById(R.id.kartinka);
        loadPicture.setImageResource(R.drawable.money);
    }
}