package com.example.lyle_thiam.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText quiz1;
    EditText quiz2;
    EditText seatworks;
    EditText labexer;
    EditText majorexam;

    Button btn_Comp;

    Double rs;
    Double fs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz1 = (EditText) findViewById(R.id.Quiz1);
        quiz2 = (EditText) findViewById(R.id.Quiz2);
        seatworks = (EditText) findViewById(R.id.Seatworks);
        labexer = (EditText) findViewById(R.id.LabExer);
        majorexam = (EditText) findViewById(R.id.MajorExam);

        btn_Comp = (Button) findViewById(R.id.compute);


    }

    public void callSecondActivity(View view) {

        Double q1Score = Double.parseDouble(quiz1.getText().toString());
        Double q2Score = Double.parseDouble(quiz2.getText().toString());
        Double seatworkScore = Double.parseDouble(seatworks.getText().toString());
        Double labexerScore = Double.parseDouble(labexer.getText().toString());
        Double majorScore = Double.parseDouble(majorexam.getText().toString());

        rs = (q1Score * .1) + (q2Score * .1) + (seatworkScore * .1) + (labexerScore * .4) + (majorScore * .3);

        if (rs < 60) {
            fs = 5.0;
        } else if (rs >= 60 && rs < 66) {
            fs = 3.0;
        } else if (rs >= 66 && rs < 71) {
            fs = 2.75;
        } else if (rs >= 71 && rs < 76) {
            fs = 2.5;
        } else if (rs >= 76 && rs < 81) {
            fs = 2.0;
        } else if (rs >= 81 && rs < 86) {
            fs = 1.75;
        } else if (rs >= 86 && rs < 91) {
            fs = 1.5;
        } else if (rs >= 91 && rs < 93) {
            fs = 1.25;
        } else if (rs >= 93 && rs < 100) {
            fs = 1.0;
        } else {
            fs = 0.0;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("rsGrade", rs.toString());
        intent.putExtra("fsGrade", fs.toString());

        startActivity(intent);
    }
}
