package com.example.basicmathcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class division extends AppCompatActivity implements View.OnClickListener {
    EditText  etnumber1, etnumber;
    String  strnumber1, strnumber, resultMessage;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dividelayout);

        Button btnCompute = (Button) findViewById(R.id.btnCompute);

        btnCompute.setOnClickListener(this);

    }

    public void onClick(View v){
        Toast.makeText(this, "Adding numbers...", Toast.LENGTH_SHORT).show();
        ComputeResult();
    }

    public void ComputeResult(){
        etnumber = (EditText) findViewById(R.id.etNumber);
        etnumber1 = (EditText) findViewById(R.id.etnumber1);
        if(etnumber.getText().toString().isEmpty() || etnumber1.getText().toString().isEmpty()){
            strnumber = "0";
            strnumber1 = "0";
        }
        else{
            strnumber = etnumber.getText().toString();
            strnumber1 = etnumber1.getText().toString();

        }
        double rawNumber = Double.parseDouble(strnumber);
        double rawNumber1 = Double.parseDouble(strnumber1);


        double result = rawNumber / rawNumber1;

        resultMessage = (int) result + " " + "is the Quotient of " + strnumber + " ➗ " +strnumber1;

        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        dialogfrag dialogFragmentImp = new dialogfrag();
        dialogFragmentImp.setArguments(args);
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        clearEditText();
    }

    public void clearEditText(){
        etnumber.getText().clear();
        etnumber1.getText().clear();
        etnumber.requestFocus();
    }

}

