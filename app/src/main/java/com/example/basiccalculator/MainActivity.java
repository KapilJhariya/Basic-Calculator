package com.example.basiccalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;

    Button bac;
    Button bbrac;
    Button bmod;
    Button bdiv;
    Button bmulti;
    Button bminus;
    Button bplus;
    Button bequal;

    Button bdot;
    Button bclr;

    TextView input;
    TextView output;
    static final int[] open = {0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            b1 = findViewById(R.id.button14);
            b2 = findViewById(R.id.button8);
            b3 = findViewById(R.id.button3);
            b4 = findViewById(R.id.button13);
            b5 = findViewById(R.id.button7);
            b6 = findViewById(R.id.button4);
            b7 = findViewById(R.id.button12);
            b8 = findViewById(R.id.button6);
            b9 = findViewById(R.id.button5);
            b0 = findViewById(R.id.button);

            bac = findViewById(R.id.button16);
            bbrac = findViewById(R.id.button11);
            bmod = findViewById(R.id.button10);
            bdiv = findViewById(R.id.button15);
            bmulti = findViewById(R.id.button18);
            bminus = findViewById(R.id.button19);
            bplus = findViewById(R.id.button17);
            bequal = findViewById(R.id.button20);

            bdot = findViewById(R.id.button9);
            bclr = findViewById(R.id.button2);

            input = findViewById(R.id.textView);
            output = findViewById(R.id.textView2);
        }
        final String[] ip = {""};
        {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b1.getText());
                    input.setText(ip[0]);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b2.getText());
                    input.setText(ip[0]);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b3.getText());
                    input.setText(ip[0]);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b4.getText());
                    input.setText(ip[0]);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b5.getText());
                    input.setText(ip[0]);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b6.getText());
                    input.setText(ip[0]);
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b7.getText());
                    input.setText(ip[0]);
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b8.getText());
                    input.setText(ip[0]);
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ip[0] = String.join("", ip[0], (String) b9.getText());
                    input.setText(ip[0]);
                }
            });
            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());
                    ip[0] = String.join("", ip[0], (String) b0.getText());
                    Log.d("ip", (String) b0.getText());
                    input.setText(ip[0]);
                }
            });
            bminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());
                    ip[0] = String.join("", ip[0], (String) bminus.getText());
                    Log.d("ip", (String) b0.getText());
                    input.setText(ip[0]);
                }
            });
            bplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());
                    ip[0] = String.join("", ip[0], (String) bplus.getText());
                    Log.d("ip", (String) b0.getText());
                    input.setText(ip[0]);
                }
            });
            bmulti.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());


                        ip[0] = String.join("", ip[0], (String) bmulti.getText());
                        Log.d("ip", (String) b0.getText());
                        input.setText(ip[0]);

                }
            });
            bmod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());
                    ip[0] = String.join("", ip[0], "3.14");
                    Log.d("ip", "3.14");
                    input.setText(ip[0]);

                }
            });
            bac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());
                    ip[0] = "";
                    Log.d("ip", (String) bac.getText());
                    input.setText(ip[0]);
                    output.setText("");
                }
            });
            bdiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());
                    ip[0] = String.join("", ip[0], (String) bdiv.getText());
                    Log.d("ip", (String) bdiv.getText());
                    input.setText(ip[0]);
                }
            });
            bdot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ip.concat(String) b0.getText());
                    ip[0] = String.join("", ip[0], (String) bdot.getText());
                    Log.d("ip", ".");
                    input.setText(ip[0]);
                }
            });

            bbrac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String test = ip[0];
                    int len = test.length();
                    if (open[0] > 0 && ip[0].length()!=open[0] && (test.charAt(len - 1) != '/' && (test.charAt(len - 1) != '*' && test.charAt(len - 1) != 'X' && test.charAt(len - 1) != '-' && test.charAt(len - 1) != '+'))) {
                        ip[0] = String.join("", ip[0], ")");
                        open[0]--;
                    } else {
                        ip[0] = String.join("", ip[0], "(");
                        open[0]++;
                    }
                    Log.d("ip", (String) b0.getText());
                    input.setText(ip[0]);




                }
            });
            bclr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ip[0].length()>0) {
                        String test = ip[0];
                        int len = test.length();
                        String test2 = test.substring(0, len - 1);
                        ip[0] = test2;
                        Log.d("ip", (String) b0.getText());
                        input.setText(ip[0]);
                    }
                }
            });
        }
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ip[0].length()>0) {
                    String test2 = ip[0];
                    if(test2.charAt(test2.length()-1)=='/' || test2.charAt(test2.length()-1)=='-' || test2.charAt(test2.length()-1)=='*' || test2.charAt(test2.length()-1)=='+' || test2.charAt(test2.length()-1)=='('){
                        output.setText("Error");
                    }
                    else if (open[0]!=0) {
                        output.setText("Close the Brackets");
                    } else {
                        try {
                            double result = evaluateExpression(ip[0]);
                            System.out.println("Result: " + result);
                            String temp = "" + result;
                            output.setText(temp);
                            Log.d("Result: ", String.valueOf(result));
                        } catch (Exception e) {
                            //Log.d("Result: ", e.getMessage());
                            output.setText("Error");
                        }
                    }
                }
                else{
                    output.setText("Error");
                }



            }
        });


    }


    public static double evaluateExpression(String expression) {
        char[] tokens = expression.toCharArray();

        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ') {
                continue;
            }

            if (tokens[i] == '-' && (i == 0 || tokens[i - 1] == '(')) {
                // Handle negative sign
                StringBuilder num = new StringBuilder("-");
                i++;
                while (i < tokens.length && (tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.')) {
                    num.append(tokens[i]);
                    i++;
                }
                values.push(Double.parseDouble(num.toString()));
                i--;
            } else if (tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.') {
                StringBuilder num = new StringBuilder();
                while (i < tokens.length && (tokens[i] >= '0' && tokens[i] <= '9' || tokens[i] == '.')) {
                    num.append(tokens[i]);
                    i++;
                }
                values.push(Double.parseDouble(num.toString()));
                i--;
            } else if (tokens[i] == '(') {
                operators.push(tokens[i]);
            } else if (tokens[i] == ')') {
                while (operators.peek() != '(') {
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(tokens[i]);
            } else if (tokens[i] == '*' || tokens[i] == '/') {
                while (!operators.isEmpty() && hasPrecedence(tokens[i], operators.peek())) {
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(tokens[i]);
            }
        }

        while (!operators.isEmpty()) {
            values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-');
    }

    public static double applyOperator(char operator, double b, double a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
        }
        return 0;
    }

}