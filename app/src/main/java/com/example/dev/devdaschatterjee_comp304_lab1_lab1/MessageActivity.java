package com.example.dev.devdaschatterjee_comp304_lab1_lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        //get the intent that started this activity and extract the string
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //capture the layout's textview and set the string as its text
        TextView textView=findViewById(R.id.msgTextView);
        textView.setText(message);
    }
}
