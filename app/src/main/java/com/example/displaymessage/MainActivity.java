package com.example.displaymessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText msg1;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg1= findViewById(R.id.ET1_main);
        send = findViewById(R.id.btn_main);

        Intent getMessage = new Intent(MainActivity.this,DisplayActivity.class);
        String name = msg1.getText().toString();
        getMessage.putExtra("TextMessage",name);
        startActivity(getMessage);

    }
}
