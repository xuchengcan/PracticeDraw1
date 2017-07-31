package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        float x = 200, y = 100, dx = 1200, dy = 600;
        Paint paint = new Paint();

        paint.setColor(Color.WHITE);
        canvas.drawLine(x, y, x, dy, paint);
        canvas.drawLine(x, dy, dx, dy, paint);

        {
            paint.setTextSize(50);
            canvas.drawText("直方图", 620, 800, paint);

            paint.setTextSize(30);
            canvas.drawText("Froyo", x + 60, dy + 20, paint);

            canvas.drawText("GB", x + 60 + 150, dy + 20, paint);

            canvas.drawText("ICS", x + 60 + 300, dy + 20, paint);

            canvas.drawText("JB", x + 60 + 450, dy + 20, paint);

            canvas.drawText("KitKat", x + 60 + 600, dy + 20, paint);

            canvas.drawText("L", x + 60 + 750, dy + 20, paint);

            canvas.drawText("M", x + 60 + 900, dy + 20, paint);
        }

        {
            paint.setColor(Color.GREEN);
            canvas.drawRect(x + 40, dy - 10, x + 40 + 100, dy, paint);

            canvas.drawRect(x + 60 + 150, dy - 20, x + 60 + 150 + 100, dy, paint);

            canvas.drawRect(x + 60 + 300, dy - 20, x + 60 + 300 + 100, dy, paint);

            canvas.drawRect(x + 60 + 450, dy - 220, x + 60 + 450 + 100, dy, paint);

            canvas.drawRect(x + 60 + 600, dy - 380, x + 60 + 600 + 100, dy, paint);

            canvas.drawRect(x + 60 + 750, dy - 430, x + 60 + 750 + 100, dy, paint);

            canvas.drawRect(x + 60 + 900, dy - 200, x + 60 + 900 + 100, dy, paint);
        }
    }
}
