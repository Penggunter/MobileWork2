package com.example.mobilework2;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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

        Button btnReg = (Button) findViewById(R.id.button4);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("MainActivity", "Button work");

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("messange", textLine.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}