package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        float l = 300, t = 200, r = 1000, b = 900;
        Paint paint = new Paint();

        paint.setColor(Color.parseColor("#EF2A2A"));
        canvas.drawArc(l, t, r, b, 180, 120, true, paint);

        paint.setColor(Color.parseColor("#FDB50D"));
        canvas.drawArc(l + 10, t + 10, r + 10, b + 10, 300, 60, true, paint);

        paint.setColor(Color.parseColor("#8800A0"));
        canvas.drawArc(l + 10, t + 10, r + 10, b + 10, 2, 5, true, paint);

        paint.setColor(Color.parseColor("#8C8C8C"));
        canvas.drawArc(l + 10, t + 10, r + 10, b + 10, 10, 8, true, paint);

        paint.setColor(Color.parseColor("#118574"));
        canvas.drawArc(l + 10, t + 10, r + 10, b + 10, 20, 50, true, paint);

        paint.setColor(Color.parseColor("#1E81F0"));
        canvas.drawArc(l + 10, t + 10, r + 10, b + 10, 72, 105, true, paint);
    }
}
