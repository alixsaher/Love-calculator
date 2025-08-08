package com.example.lovecalculator;

import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText firstNameEditText, secondNameEditText;
    Button calculateButton;
    Button refreshButton;

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Links this activity to the XML layout file

        firstNameEditText = findViewById(R.id.editName1);
        secondNameEditText = findViewById(R.id.editName2);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);
        refreshButton = findViewById(R.id.refreshButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstNameEditText.getText().toString().isEmpty() || !secondNameEditText.getText().toString().isEmpty()){
                    Random randomPercentage = new Random();
                    resultTextView.setText(String.format("%s", randomPercentage.nextInt(100)));
                    refreshButton.setVisibility(VISIBLE);
                }

            }
        });

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNameEditText.clearComposingText();
                secondNameEditText.clearComposingText();
                resultTextView.setText("");
            }
        });


    }
}
