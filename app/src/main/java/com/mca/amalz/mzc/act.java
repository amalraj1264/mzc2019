package com.mca.amalz.mzc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class act extends AppCompatActivity {
EditText ed1,ed2;
Button but;
String getUSN,getPASS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act);
        ed1 = (EditText) findViewById(R.id.usn);
        ed2 = (EditText) findViewById(R.id.pass);
        but = (Button) findViewById(R.id.loginbut);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUSN=ed1.getText().toString();
                getPASS=ed2.getText().toString();
//                Toast.makeText(getApplicationContext(),"Hello World",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getUSN,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPASS,Toast.LENGTH_LONG).show();
            }
        });

    }
}
