package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtVal1, edtVal2;
    TextView txtRes;
    Button btnSoma, btnSub, btnMul, btnDiv;
    double val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVal1=findViewById(R.id.edtValue1);
        edtVal2=findViewById(R.id.edtValue2);
        txtRes=findViewById(R.id.txtResult);
        btnSoma=findViewById(R.id.btnSum);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);


        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1=Double.parseDouble(edtVal1.getText().toString());
                val2=Double.parseDouble(edtVal2.getText().toString());
                double res=val1+val2;

                txtRes.setText(Double.toString(res));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(edtVal1.getText().toString());
                val2=Double.parseDouble(edtVal2.getText().toString());
                double res=val1-val2;

                txtRes.setText(Double.toString(res));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(edtVal1.getText().toString());
                val2=Double.parseDouble(edtVal2.getText().toString());
                double res=val1*val2;

                txtRes.setText(Double.toString(res));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(edtVal1.getText().toString());
                val2=Double.parseDouble(edtVal2.getText().toString());
                double res=val1/val2;

                txtRes.setText(Double.toString(res));
            }
        });
    }
}