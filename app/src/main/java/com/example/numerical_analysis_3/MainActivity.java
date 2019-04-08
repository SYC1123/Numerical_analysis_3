package com.example.numerical_analysis_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=findViewById(R.id.editText);
                TextView textView=findViewById(R.id.textView);
                int a1=Integer.parseInt(editText.getText().toString());
                int x[]= {0,10,20,30,40,50,60,70,80,90};
                float y[]= {68,67.1f,66.4f,65.6f,64.6f,61.8f,61,60.8f,60.4f,60};
                float sum_xx=0,sum_y=0,sum_x=0,sum_xy=0;
                float a,b;
                for(int i=0;i<x.length;i++) {
                    sum_xx+=x[i]*x[i];
                    sum_x+=x[i];
                    sum_y+=y[i];
                    sum_xy+=x[i]*y[i];
                }
                b=(sum_xx*sum_y-sum_x*sum_xy)/(x.length*sum_xx-sum_x*sum_x);
                a=(x.length*sum_xy-sum_x*sum_y)/(x.length*sum_xx-sum_x*sum_x);
                textView.setText(a*a1+b+"");
            }
        });
    }
}
