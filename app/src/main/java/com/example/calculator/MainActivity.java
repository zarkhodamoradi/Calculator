package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

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
    Button btnOpeningParanthese ;
    Button btnClosingParanthese;
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
               // firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"+");

            }
        });
        btnMunuise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"-");

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"x");

            }
        });
        btnDivider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   firstValue=Double.parseDouble(txtInput.getText().toString()) ;
                txtInput.setText(txtInput.getText()+"÷");

            }
        });



        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String exp = txtInput.getText().toString();
                String postfixExp= infixToPostfix(exp);
                int result  = evaluatePostfx(postfixExp);

//                char c;
//                if((int)firstValue == firstValue) {
//                    int index = (firstValue + "").length();
//
//                    secondValue = Double.parseDouble(txtInput.getText().toString().substring(index - 1));
//                    String exp = txtInput.getText().toString();
//                    c = exp.charAt(index - 2);
//                }
//                else {
//                    int index = (firstValue+"").length();
//                    secondValue = Double.parseDouble(txtInput.getText().toString().substring(index +1));
//                    String exp = txtInput.getText().toString();
//                     c = exp.charAt(index );
//                }
//                double res= calculation(firstValue,secondValue,c);
//                if ((int)result == result){
//                    int resaultIntegar=(int)result;
//                    txtInput.setText(resaultIntegar+"");
//                }
//                else
                txtInput.setText(result+"");
                output=result;
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


    private boolean isOperator(char c)
    {
        if (c == '+' || c == '-' || c == 'x' || c == '÷')
            return true;
        return false;
    }

   private boolean isOpeningParanthese(char c)
    {
        if (c == '{' || c == '[' || c == '(')
            return true;
        return false;
    }

    private boolean isClosingParanethese(char c)
    {
        if (c == '}' || c == ']' || c == ')')
            return true;
        return false;
    }
  private  int GetWeightOfOperator(char c)
    {
        int weight = -1;
        if (c == 'x' || c == '÷')
            weight = 2;
        if (c == '+' || c == '-')
            weight = 1;

        return weight;
    }
   private int calculate(int operand1, int operand2, char Operator)
    {
        switch (Operator)
        {
            case '+':
                return operand1 + operand2;

            case '-':
                return operand1 - operand2;

            case 'x':
                return operand1 * operand2;

            case '÷':
                return operand1 / operand2;

            default:
                return -1;



        }
    }
    private boolean isNumicDigit(char c)
    {
        if (c >= '0' && c <= '9')
            return true;
        return false;
    }
  private  int evaluatePostfx(String str)
    {
        Stack<Integer> s= new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ' || str.charAt(i) == ',')
                continue;
            else if (isOperator(str.charAt(i)))
            {
                int operand2 = s.pop();

                int operand1 = s.pop();

                s.push(calculate(operand1, operand2, str.charAt(i)));
            }
            else if (isNumicDigit(str.charAt(i)))
            {
                int operand = 0;
                try{
                while (isNumicDigit(str.charAt(i)) && i < str.length())
                {
                    operand = operand * 10 + (Integer.parseInt(str.charAt(i)+""));
                    i++;
                }}catch (Exception ex){}
                i--;
                s.push(operand);
            }
        }
        int top = s.peek();
        return top;
    }
    private boolean isHigherPrec(char topOfStack, char currentChracter)
    {
        if (GetWeightOfOperator(topOfStack) >= GetWeightOfOperator(currentChracter))
        {
            return true;
        }
        return false;
    }
    String infixToPostfix(String str)
    {
        Stack <Character> st = new Stack<>();
        String res = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ' || str.charAt(i)== ',')
                continue;
            else if (isOpeningParanthese(str.charAt(i)))
            {
                st.push(str.charAt(i));
            }
            else if (isNumicDigit(str.charAt(i)))
            {
                try{ while(isNumicDigit(str.charAt(i)) && (i< str.length())) {
                    res = (res + str.charAt(i) + "");
                    i++;

                }}catch (Exception ex){}
                res = res + " ";
                i--;
            }
            else if (isOperator(str.charAt(i)))
            {
                if(!st.empty()){
                    while (!st.empty() && isHigherPrec(st.peek(), str.charAt(i)) && !isOpeningParanthese(st.peek()))
                    {
                        res = (res + st.pop() + " ");

                    }
                }

                st.push(str.charAt(i));
            }
            else if (isClosingParanethese(str.charAt(i)))
            {
                if(!st.empty())
                while (!isOpeningParanthese(st.peek()) && !st.empty())
                {
                    res = (res + st.pop() + " ");

                }
            }
        }

        while (!st.empty())
        {
            res = (res + st.pop() + " ");

        }
        return res;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
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
        btnOpeningParanthese= findViewById(R.id.btnOpeningParanthese);
        btnClosingParanthese= findViewById(R.id.btnClosingParanthese);


    }
}