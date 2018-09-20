package com.example.dell.touchapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyViewGroup1 extends LinearLayout {

    private String TAG="gdchent";
    public MyViewGroup1(Context context) {
        this(context,null);
    }

    public MyViewGroup1(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyViewGroup1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            Log.i(TAG, "vg1===onTouchEvent: ");
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "vg1===onInterceptTouchEvent:");
        }
        return super.onInterceptTouchEvent(ev);
    }

}
