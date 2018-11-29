package com.example.itay.bigsmall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Random rnd=new Random();
Button btn,big,eq,sm;
TextView num1,num2,TF;
int x=0,y=0;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn=(Button) findViewById(R.id.btn);
    big=(Button) findViewById(R.id.big);
    eq=(Button) findViewById(R.id.eq);
    sm=(Button) findViewById(R.id.sm);
    num1=(TextView) findViewById(R.id.num1);
    num2=(TextView) findViewById(R.id.num2);
    TF=(TextView) findViewById(R.id.TF);

    }

    public void big(View view) {
    if(x>y){TF.setText("True");}
         else{TF.setText("False");}
    }

    public void eq(View view) {
        if(x==y){TF.setText("True");}
        else{TF.setText("False");}
    }

    public void sm(View view) {
        if(x<y){TF.setText("True");}
        else{TF.setText("False");}
    }

    public void btn(View view) {
    x=rnd.nextInt(11);
    y=rnd.nextInt(11);
    num1.setText(""+x);
    num2.setText(""+y);
    }
}
