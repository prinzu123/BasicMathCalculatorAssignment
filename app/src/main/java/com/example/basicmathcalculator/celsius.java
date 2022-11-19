package com.example.basicmathcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class celsius  extends AppCompatActivity implements View.OnClickListener {
    EditText etnumber;
    String  strnumber, resultMessage;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ftoclayout);

        Button btnCompute = (Button) findViewById(R.id.btnCompute);

        btnCompute.setOnClickListener(this);

    }

    public void onClick(View v){
        Toast.makeText(this, "Adding numbers...", Toast.LENGTH_SHORT).show();
        ComputeResult();
    }

    public void ComputeResult(){
        etnumber = (EditText) findViewById(R.id.etNumber);
        if(etnumber.getText().toString().isEmpty()){
            strnumber = "0";
        }
        else{
            strnumber = etnumber.getText().toString();

        }
        double rawNumber = Double.parseDouble(strnumber);


        double result = rawNumber - 32 * 5/9;

        resultMessage = (int) result + " " + "is the Celsius of " + strnumber +" Fahrenheit";

        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        dialogfrag dialogFragmentImp = new dialogfrag();
        dialogFragmentImp.setArguments(args);
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        clearEditText();
    }

    public void clearEditText(){
        etnumber.getText().clear();
        etnumber.requestFocus();
    }

}