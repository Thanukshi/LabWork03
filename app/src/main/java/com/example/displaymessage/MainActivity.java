package com.example.displaymessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.example.displaymessage.Message";
    EditText msg1;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg1 = findViewById(R.id.ET1_main);
        send = findViewById(R.id.btn_main);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendMessage = new Intent(MainActivity.this, DisplayActivity.class);
                String message = msg1.getText().toString();

                sendMessage.putExtra(EXTRA_MESSAGE,message);
                startActivity(sendMessage);
            }
        });

    }
}
