package com.rtctapp.masa.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtRes ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtRes = (TextView) findViewById(R.id.txtRes) ;

        Bundle bundle = getIntent().getExtras();
        if ( bundle != null){
            String message = (bundle.getString("ResKey"));

            txtRes.setText(""+message);

        }

    }
}
