package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);

        canvas.drawArc(550, 200, 900, 500, 180, 60, false, paint);  //起始的度数180°，偏移的度数顺时针60°，是否画到圆心

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(550, 200, 900, 500, 250, 90, true, paint);

        canvas.drawArc(550, 200, 900, 500, 20, 140, false, paint);  //偏移20°开始，偏移量140°，再加20°偏移才是完整180°

    }
}
