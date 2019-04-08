package com.example.numerical_analysis_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x[]= {0,10,20,30,40,50,60,70,80,90};
        float y[]= {68,67.1f,66.4f,65.6f,64.6f,61.8f,61,60.8f,60.4f,60};
        Paint p=new Paint();
        p.setStrokeWidth(10);
        p.setAntiAlias(true);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.FILL);
        for(int i=0;i<x.length;i++){
            canvas.drawPoint(x[i]*10,y[i]*10+500,p);
        }
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
        Paint p1=new Paint();
        p1.setStrokeWidth(5);
        p1.setAntiAlias(true);
        p1.setColor(Color.GREEN);
        p1.setStyle(Paint.Style.FILL);
        float x1=0,y1=0;
        for(int i=0;i<100;i++){
            canvas.drawLine(x1*10,y1*10+500,i*10,(a*i+b)*10+500,p1);
            x1=i;
            y1=(a*i+b);
        }
    }
}
