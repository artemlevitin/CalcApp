package com.example.levitin.calculapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resTextView;
    char operationName  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resTextView = (TextView) findViewById(R.id.resTextView);
    }

    public void clickNumKey(View view){
        Button but = (Button)view;
        resTextView.append(but.getText());
    }
    public void clickOperationKey(View view){
        Button but = (Button)view;

        resTextView.setText(but.getText());
    }
}
