package com.example.basicmathcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class percentage extends AppCompatActivity implements View.OnClickListener {
    EditText etPercent, etNumber;
    String strPercent, strNumber, resultMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.percentlayout);

        Button btnCompute = (Button) findViewById(R.id.btnCompute);

        btnCompute.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Computing....", Toast.LENGTH_SHORT).show();
        ComputeResult();
    }

    public void ComputeResult(){
        etPercent = (EditText) findViewById(R.id.etPercent);
        etNumber = (EditText) findViewById(R.id.etNumber);
        if(etPercent.getText().toString().isEmpty() || etNumber.getText().toString().isEmpty()){
            strPercent = "0";
            strNumber = "0";
        }else{
            strPercent = etPercent.getText().toString();
            strNumber = etNumber.getText().toString();
        }
        double rawPercent = Double.parseDouble(strPercent);
        double rawNumber = Double.parseDouble(strNumber);

        rawPercent = ToDecimal(rawPercent);

        double result = rawPercent * rawNumber;
        // Casted result to int type, remove to show decimal value
        resultMessage = (int) result + " is " + strPercent +"% of " +strNumber;

        // Create Bundle instance, this will allow transfer of data from Activity to DialogFragment
        Bundle args = new Bundle();
        args.putString("result", resultMessage);

        // Create a dialog instance
        dialogfrag dialogFragmentImp = new dialogfrag();
        // Pass on dialog argument(args), the result
        dialogFragmentImp.setArguments(args);
        // Display the Dialog
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        // Reset EditTexts
        clearEditText();
    }
    public void clearEditText(){
        etNumber.getText().clear();
        etPercent.getText().clear();
        etPercent.requestFocus();
    }
    public double ToDecimal(double nbr){
        nbr = nbr/100;
        return nbr;
    }
}

