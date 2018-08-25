package com.example.levitin.calculapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numTextView;
    Double numberLast = null;
    String operationLast = null  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numTextView = (TextView) findViewById(R.id.screenTextView);
    }

    public void clickNumKey(View view){
        Button but = (Button)view;
        numTextView.append(but.getText());
    }

    public void clickOperationKey(View view){
        Button but = (Button)view;
        if(numberLast == null) {
            operationLast = but.getText().toString();
            numberLast=Double.valueOf(numTextView.getText().toString());
            numTextView.setText("");
        }
        else {
            numTextView.setText(Calc.execute(numberLast, Double.valueOf(numTextView.getText().toString()), operationLast));
            operationLast = but.getText().toString();
            numberLast = null;
        }

    }

    public void clickClearKey(View view){
        Button but = (Button)view;
        if(but.getText().equals("C")) {
            numTextView.setText("");
            numberLast = null;
        }
    }
}
