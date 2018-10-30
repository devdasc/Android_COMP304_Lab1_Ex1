package com.example.dev.devdaschatterjee_comp304_lab1_lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declare UI controls here
    private EditText eMessage;
    private Button btnSend;
    public static final String EXTRA_MESSAGE="com.example.DevdasChatterjee_Message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eMessage= (EditText) findViewById(R.id.eTxt);
        btnSend=(Button)findViewById(R.id.btnSend);

    }
    public void btnSend_ClickHandler(View v){
        //read the text from the text box
        String message=eMessage.getText().toString();
        //send the message to the MessageActivity
        Intent intent= new Intent(this,MessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }
}
