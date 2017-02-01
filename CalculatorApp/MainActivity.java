package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button BOne,BTwo,BThree,BFour,BFive,BSix,BSeven,BEight,BNine,BZero;
    Button BPlus,BMinus,BDivi,BMult,BEqual;
    TextView calculation;
    boolean addOperation = false, minusOperation = false,multOperation=false,diviOperation=false;
    int firstNumber, secondNumber;
    int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Buttons
        BOne = (Button) findViewById(R.id.BOne);
        BTwo = (Button) findViewById(R.id.BTwo);
        BThree = (Button) findViewById(R.id.BThree);
        BFour = (Button) findViewById(R.id.BFour);
        BFive = (Button) findViewById(R.id.BFive);
        BSix = (Button) findViewById(R.id.Bsix);
        BSeven = (Button) findViewById(R.id.BSeven);
        BEight = (Button) findViewById(R.id.BEight);
        BNine = (Button) findViewById(R.id.BNine);
        BZero = (Button) findViewById(R.id.BZero);

        BPlus = (Button) findViewById(R.id.BPlus);
        BMinus = (Button) findViewById(R.id.BMinus);
        BDivi = (Button) findViewById(R.id.BDivi);
        BMult = (Button) findViewById(R.id.BMult);
        BEqual = (Button) findViewById(R.id.BEqual);

        calculation = (TextView) findViewById(R.id.calculation);

        BEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!calculation.getText().toString().equals("")){
                    secondNumber = Integer.parseInt(calculation.getText().toString());
                    if(addOperation){
                        result = firstNumber + secondNumber;
                        calculation.setText(Integer.toString(result));
                        addOperation = false;
                    }
                    if(minusOperation){
                        result = firstNumber - secondNumber;
                        calculation.setText(Integer.toString(result));
                        minusOperation = false;
                    }
                    if(multOperation){
                        result = firstNumber * secondNumber;
                        calculation.setText(Integer.toString(result));
                        multOperation = false;
                    }
                    if(diviOperation){
                        result = firstNumber / secondNumber;
                        calculation.setText(Integer.toString(result));
                        diviOperation = false;
                    }

                }
            }
        });

    }
    public  void BOne(View view){
        calculation.setText(calculation.getText()+"1");
    }
    public  void BTwo(View view){
        calculation.setText(calculation.getText()+"2");
    }
    public  void BThree(View view){
        calculation.setText(calculation.getText()+"3");
    }
    public  void BFour(View view){
        calculation.setText(calculation.getText()+"4");
    }
    public  void BFive(View view){
        calculation.setText(calculation.getText()+"5");
    }
    public  void BSix(View view){
        calculation.setText(calculation.getText()+"6");
    }
    public  void BSeven(View view){
        calculation.setText(calculation.getText()+"7");
    }
    public  void BEight(View view){
        calculation.setText(calculation.getText()+"8");
    }
    public  void BNine(View view){
        calculation.setText(calculation.getText()+"9");
    }
    public  void BZero(View view){
        calculation.setText(calculation.getText()+"0");
    }

    public  void BPlus(View view){
        addOperation = true;
        if(!calculation.getText().toString().equals("")){
            firstNumber = Integer.parseInt(calculation.getText().toString());
        }
        calculation.setText("");

    }
    public  void BMinus(View view){
        minusOperation = true;
        if(!calculation.getText().toString().equals("")){
            firstNumber = Integer.parseInt(calculation.getText().toString());
        }
        calculation.setText("");

    }
    public  void BMult(View view){
        multOperation = true;
        if(!calculation.getText().toString().equals("")){
            firstNumber = Integer.parseInt(calculation.getText().toString());
        }
        calculation.setText("");

    }
    public  void BDivi(View view){
        diviOperation = true;
        if(!calculation.getText().toString().equals("")){
            firstNumber = Integer.parseInt(calculation.getText().toString());
        }
        calculation.setText("");

    }
    public void BClear(View view){
        calculation.setText("");
    }



}