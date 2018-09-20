package com.example.dell.touchapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MyViewGroup extends LinearLayout {

    private String TAG="gdchent";
    public MyViewGroup(Context context) {
        this(context,null);
    }

    public MyViewGroup(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.i(TAG,"FOUR_constructor");
        setOrientation(VERTICAL);
    }

//    @Override
//    public void setOnTouchListener(OnTouchListener l) {
//        super.setOnTouchListener(l);
//    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "viewgroup---dispatchTouchEvent: ");
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction()==MotionEvent.ACTION_DOWN){
              //
            Log.i(TAG, "viewgroup----onTouchEvent: ");
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN){
            Log.i(TAG, "viewgroup---onInterceptTouchEvent: ");
        }
        return super.onInterceptTouchEvent(ev);
    }

}
