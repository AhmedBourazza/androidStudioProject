package com.example.windowscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,begal,bplus,bmulti,bdiv,bmoin,bdelete;
    TextView resutatView,operationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.btn0);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        bdiv=findViewById(R.id.btnDivision);
        begal=findViewById(R.id.btnEgal);
        bmoin=findViewById(R.id.btnMoin);
        bmulti=findViewById(R.id.btnMult);
        bplus=findViewById(R.id.btnPlus);
        bdelete=findViewById(R.id.btnDelete);
        resutatView=findViewById(R.id.resultatV);
        operationView=findViewById(R.id.opV);
        operationView.setVisibility(View.GONE);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"0");

                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("0");




            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"1");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("1");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }
              /*  if(operationView.getText().toString().length()-1>=0)
                {
                    char ch = operationView.getText().toString().charAt(operationView.getText().toString().length()-1);
                if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
                {
                    resutatView.setText("1");

                }
            }*/
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"2");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("2");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"3");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("3");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"4");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("4");

                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"5");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("5");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"6");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("6");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"7");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("7");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"8");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("8");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setText(operationView.getText().toString()+"9");


                if(operationView.getVisibility()==View.GONE)
                    resutatView.setText("9");
                if (operationView.getText().toString().length()>1)
                {
                    operationView.setVisibility(View.VISIBLE);
                    resutatView.setText(operationView.getText());

                }

            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationView.getText().toString().length()-1>=0) {

                    operationView.setVisibility(View.VISIBLE);
                char ch = operationView.getText().toString().charAt(operationView.getText().toString().length()-1);
                if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
                    operationView.setText(operationView.getText().toString().substring(0,operationView.getText().toString().length() - 1));
                operationView.setText(operationView.getText().toString()+"+");

            }}
        });
        bmoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationView.getText().toString().length()-1>=0) {

                    operationView.setVisibility(View.VISIBLE);
                char ch = operationView.getText().toString().charAt(operationView.getText().toString().length()-1);
                if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
                    operationView.setText(operationView.getText().toString().substring(0,operationView.getText().toString().length() - 1));
                operationView.setText(operationView.getText().toString()+"-");

            }}
        });
        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationView.getText().toString().length()-1>=0) {

                    operationView.setVisibility(View.VISIBLE);
                    char ch = operationView.getText().toString().charAt(operationView.getText().toString().length() - 1);
                    if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
                        operationView.setText(operationView.getText().toString().substring(0, operationView.getText().toString().length() - 1));
                    operationView.setText(operationView.getText().toString() + "*");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationView.getText().toString().length()-1>=0) {

                    operationView.setVisibility(View.VISIBLE);
                char ch = operationView.getText().toString().charAt(operationView.getText().toString().length()-1);
                if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
                {
                    operationView.setText(operationView.getText().toString().substring(0,operationView.getText().toString().length() - 1));

                }}

                operationView.setText(operationView.getText().toString()+"/");

            }
        });
        begal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (operationView.getText().toString().length()-1>=0) {
                  char ch = operationView.getText().toString().charAt(operationView.getText().toString().length() - 1);
                  if(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/')
                  {
                  resutatView.setText(String.valueOf(solveFromString(operationView.getText().toString())) );
                  operationView.setText("");
                  operationView.setVisibility(View.GONE);
              }

              }
              else {

              }


            }
        });
        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationView.setVisibility(View.GONE);
                operationView.setText("");
                resutatView.setText("");
            }
        });
    }
    double solveFromString(String s)
    {
        char c[]=s.toCharArray();
        String num1="";
        int opPosition=0;
        int index=0;
        char operator=' ';

        for(char ch:c)
        {
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                operator=ch;
                opPosition=index;
            }
            else {
                 num1=num1+ch;
                 index++;
            }
        }
        String num2=num1.substring(opPosition,num1.length());
        num1=num1.substring(0,opPosition);
        double resultat=0;
        switch (operator)
        {
            case '+':
                resultat=Double.parseDouble(num1)+Double.parseDouble(num2);
                break;
            case '-':
                resultat=Double.parseDouble(num1)-Double.parseDouble(num2);
                break;
            case '*':
                resultat=Double.parseDouble(num1)*Double.parseDouble(num2);
                break;
            case '/':
                resultat=Double.parseDouble(num1)/Double.parseDouble(num2);
                break;

        }
        return resultat;
    }
}