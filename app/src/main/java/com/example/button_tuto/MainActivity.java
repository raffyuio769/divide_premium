package com.example.button_tuto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText num01;
private EditText num02;
private Button button01;
private TextView Add01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num01 = (EditText) findViewById(R.id.txtNum01);
        num02 = (EditText) findViewById(R.id.txtNum02);
        button01 = (Button) findViewById(R.id.button01);
        Add01 = (TextView) findViewById(R.id.Answer01);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myNumber1 = Integer.parseInt(num01.getText().toString());
                int myNumber2 = Integer.parseInt(num02.getText().toString());
                int sum = myNumber1 / myNumber2;
                Add01.setText(" Answer: " +sum);
            }
        });

    }
}