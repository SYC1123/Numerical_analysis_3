package com.example.numerical_analysis_3;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }
    private void init(){
        ConstraintLayout constraintLayout=findViewById(R.id.root);
        DrawView drawView=new DrawView(this);
        drawView.setMinimumHeight(constraintLayout.getLayoutParams().width);
        drawView.setMinimumWidth(constraintLayout.getLayoutParams().height/2);
        drawView.invalidate();
        constraintLayout.addView(drawView);

    }
}
