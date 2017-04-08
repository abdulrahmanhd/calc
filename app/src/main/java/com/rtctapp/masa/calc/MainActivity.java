package com.rtctapp.masa.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1 , txtNum2 , txtOper ;
    double res ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        txtOper = (EditText) findViewById(R.id.txtOper);
    }

    public void getOper (View v) {
        String oper = txtOper.getText().toString();
        switch (oper)
        {
            case "+" :
                res = Double.parseDouble( txtNum1.getText().toString()) + Double.parseDouble( txtNum2.getText().toString()) ;
                break ;

            case "-" :
                res = Double.parseDouble( txtNum1.getText().toString()) - Double.parseDouble( txtNum2.getText().toString()) ;
                break ;

            case "*" :
                res = Double.parseDouble( txtNum1.getText().toString()) * Double.parseDouble( txtNum2.getText().toString()) ;
                break ;

            case "/" :
                res = Double.parseDouble( txtNum1.getText().toString()) / Double.parseDouble( txtNum2.getText().toString()) ;
                break ;

        }
        Intent intent = new Intent(MainActivity.this , Main2Activity.class) ;

        oper = String.valueOf(res);
        intent.putExtra("ResKey" , oper) ;

        startActivity(intent);
    }
}
