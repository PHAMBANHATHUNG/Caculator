package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
EditText edone;
EditText edtwo;
TextView resu;
Button fione;
Button fitwo;
Button fithree;
Button fifour;
Button fifive;
Button fisix;
Button fiseven;
Button fieight;
Button finine;
Button del;
Button res;
Button ext;
RadioButton rdp;
RadioButton rdr;
RadioButton rds;
RadioButton rde;
Double a;
Double b;
Double rs;
boolean addition = false, subtract = false, multiply = false, divide = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edone = (EditText) findViewById(R.id.first);
        edtwo = (EditText) findViewById(R.id.second);
        resu=(TextView)findViewById(R.id.result);
        fione = (Button)findViewById(R.id.one);
        fitwo = (Button)findViewById(R.id.two);
        fithree = (Button)findViewById(R.id.three);
        fifour = (Button)findViewById(R.id.four);
        fifive = (Button)findViewById(R.id.five);
        fisix = (Button)findViewById(R.id.six);
        fiseven = (Button)findViewById(R.id.seven);
        fieight = (Button)findViewById(R.id.eight);
        finine = (Button)findViewById(R.id.nine);
        del = (Button)findViewById(R.id.Del);
        res = (Button)findViewById(R.id.Res);
        ext = (Button)findViewById(R.id.Ex);
        rdp =(RadioButton)findViewById(R.id.plus);
        rdr = (RadioButton)findViewById(R.id.remove);
        rds = (RadioButton)findViewById(R.id.sqr);
        rde = (RadioButton)findViewById(R.id.split);

        del.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                // nội dung thực thi
                b = Double.parseDouble(edtwo.getText().toString());
                if(addition){
                    rs = a + b;
                } else if (subtract){
                    rs = a - b;
                } else if (multiply){
                    rs = a * b;
                } else if (divide){
                    rs = a / b;
                } else {
                    rs = rs + 0;
                }
                resu.setText(rs.toString());

                if(rdp.isChecked()){
                    setVar1();
                    addition = true;
                }
                else if(rdr.isChecked()) {
                    setVar1();
                    subtract = true;
                }
                else if(rds.isChecked()) {
                    setVar1();
                    multiply = true;
                }
                else if(rde.isChecked()) {
                    setVar1();
                    divide = true;
                }
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                // nội dung thực thi
                reset();
            }
        });

        ext.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                // nội dung thực thi
                System.exit(0);
            }
        });
    }
    public void reset(){
        del.setEnabled(true);
        rdp.setEnabled(true);
        rdr.setEnabled(true);
        rds.setEnabled(true);
        rde.setEnabled(true);

        edone.setText("0");
        edtwo.setText("0");
    }

    public void setVar1(){
        a = Double.parseDouble(edone.getText().toString());
    }
}
