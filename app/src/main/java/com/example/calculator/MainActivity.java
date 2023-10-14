package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtInput;
    TextView txtOutput;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnC;
    Button btnDivider;
    Button btnMultiply;
    Button btnSum;
    Button btnMunuise;

    Button btnEqual;
    Button btnPoint;
    double firstValue;
    double secondValue;

    double output=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetUpView();
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                    txtInput.setText("");
                    output=0;
                }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }
                txtInput.setText(txtInput.getText()+"8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(output == Double.parseDouble("0"+(txtInput.getText().toString()))) {
                        txtInput.setText("");
                        output=0;
                    }}catch(Exception ex){
                }

                txtInput.setText(txtInput.getText()+"9");

            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(txtInput.getText()+".");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText("");
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"+");

            }
        });
        btnMunuise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"-");

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"x");

            }
        });
        btnDivider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"÷");

            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c;
                if((int)firstValue == firstValue) {
                    int index = (firstValue + "").length();

                    secondValue = Double.parseDouble(txtInput.getText().toString().substring(index - 1));
                    String exp = txtInput.getText().toString();
                    c = exp.charAt(index - 2);
                }
                else {
                    int index = (firstValue+"").length();
                    secondValue = Double.parseDouble(txtInput.getText().toString().substring(index +1));
                    String exp = txtInput.getText().toString();
                     c = exp.charAt(index );
                }
                double res= calculation(firstValue,secondValue,c);
                if ((int)res == res){
                    int resaultIntegar=(int)res;
                    txtInput.setText(resaultIntegar+"");
                }
                else
                txtInput.setText(res+"");
                output=res;
            }
        });


    }

    private double calculation(double firstValue,double secondValue , char operator){

        switch (operator){
            case '+':return (firstValue+secondValue) ;
            case '-':return (firstValue-secondValue);
            case 'x':return (firstValue*secondValue);
            case '÷':return (firstValue/secondValue);
        }
        return 0;
    }
    public void SetUpView() {
        txtInput = findViewById(R.id.txtInput);
        txtOutput = findViewById(R.id.txtOutput);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnC = findViewById(R.id.btnC);
        btnDivider = findViewById(R.id.btnDivider);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnSum = findViewById(R.id.btnSum);
        btnMunuise = findViewById(R.id.btnMinuse);
        btnEqual = findViewById(R.id.btnEqual);
        btnPoint = findViewById(R.id.btnPoint);

    }
}