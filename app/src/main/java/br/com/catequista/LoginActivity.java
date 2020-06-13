package br.com.catequista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCalc;

    private Button btOne;
    private Button btTwo;
    private Button btThree;
    private Button btFour;
    private Button btFive;
    private Button btSix;
    private Button btSeven;
    private Button btEight;
    private Button btNine;

    private Button btSum;
    private Button btMinus;
    private Button btEquals;

    private String operator;
    private int calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtCalc = findViewById(R.id.txtCalc);

        btOne = findViewById(R.id.btOne);
        btTwo = findViewById(R.id.btTwo);
        btThree = findViewById(R.id.btThree);
        btFour = findViewById(R.id.btFour);
        btFive = findViewById(R.id.btFive);
        btSix = findViewById(R.id.btSix);
        btSeven = findViewById(R.id.btSeven);
        btEight = findViewById(R.id.btEight);
        btNine = findViewById(R.id.btNine);

        btSum = findViewById(R.id.btSum);
        btMinus = findViewById(R.id.btMinus);
        btEquals = findViewById(R.id.btEquals);

        btOne.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btFive.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btEight.setOnClickListener(this);
        btNine.setOnClickListener(this);

        btSum.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btEquals.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String number = String.valueOf(txtCalc.getText());

        if (view == btOne){
            number = number + "1";
        }else if (view == btTwo){
            number = number + "2";
        }else if (view == btThree){
            number = number + "3";
        }else if (view == btFour){
            number = number + "4";
        }else if (view == btFive){
            number = number + "5";
        }else if (view == btSix){
            number = number + "6";
        }else if (view == btSeven){
            number = number + "7";
        }else if (view == btEight){
            number = number + "8";
        }else if (view == btNine){
            number = number + "9";
        }else if (view == btSum || view == btMinus){
            calc = Integer.parseInt(number);
            number = "0";

            if (view == btSum){
                operator = "sum";
            }else{
                operator = "minus";
            }
        }else if (view == btEquals){
            if (operator == "sum"){
                calc = calc + Integer.parseInt(number);
            }else{
                calc = calc - Integer.parseInt(number);
            }

            number = String.valueOf(calc);
        }

        number = String.valueOf(Integer.parseInt(number));

        txtCalc.setText(number);
    }
}