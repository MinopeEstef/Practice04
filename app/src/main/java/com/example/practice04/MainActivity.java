
package com.example.practice04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText value1,value2,value3,value4,value5;
    Button buttonClear,buttonCalculator;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        value3 = findViewById(R.id.value3);
        value4 = findViewById(R.id.value4);
        value5 = findViewById(R.id.value5);
        buttonClear = findViewById(R.id.buttonClear);
        buttonCalculator = findViewById(R.id.buttonCalculator);
        result = findViewById(R.id.result);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1.getText().clear();
                value2.getText().clear();
                value3.getText().clear();
                value4.getText().clear();
                value5.getText().clear();
            }
        });
    }
}
