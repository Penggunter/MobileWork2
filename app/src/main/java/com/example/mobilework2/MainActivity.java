package com.example.mobilework2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text;
    TextView loadTitle;

    ActivityResultLauncher<Intent> dataRecieverActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == RESULT_OK){
                    Intent data = result.getData();

                    assert data != null;
                    loadTitle.setText(data.getStringExtra("messange"));
                }
            });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadTitle = (TextView)findViewById(R.id.textmain);
        loadTitle.setText(R.string.helloworld);
        ImageView loadPicture = (ImageView)findViewById(R.id.kartinka);
        loadPicture.setImageResource(R.drawable.money);


        text = (EditText)findViewById(R.id.messengetext);
        // Программный способ
        Button btnReg = (Button) findViewById(R.id.button2);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("MainActivity", "Button work");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("messange", text.getText().toString());
                dataRecieverActivityResultLauncher.launch(intent);
            }
        });
    }

    // Декларативный способ
    public void onClickLog(View view) {
        Log.i("MainActivity", "Button work");

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("messange", text.getText().toString());
        dataRecieverActivityResultLauncher.launch(intent);
    }
}