package com.example.mobilework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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


        // Программный способ
        Button btnReg = (Button) findViewById(R.id.button2);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("MainActivity", "Data transferred");
            }
        });
    }

    // Декларативный способ
    public void onClickLog(View view) {
        Log.i("MainActivity", "Data transferred");
    }
}