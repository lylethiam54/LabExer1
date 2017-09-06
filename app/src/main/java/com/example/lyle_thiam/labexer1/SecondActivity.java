package com.example.lyle_thiam.labexer1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity{

    EditText rs;
    EditText fs;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rs = (EditText) findViewById(R.id.rsGrade);
        fs = (EditText) findViewById(R.id.fsGrade);
        btn_back = (Button) findViewById(R.id.goBackToMain);

        String rg = getIntent().getExtras().getString("rsGrade");
        rs.setText(rg);
        String fn = getIntent().getExtras().getString("fsGrade");
        fs.setText(fn);
    }

    public void goBackToMain (View view){
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
