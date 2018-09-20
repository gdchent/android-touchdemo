package com.example.dell.touchapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;


public class MyVg2TextView extends AppCompatTextView{


    private String TAG="gdchent";
    public MyVg2TextView(Context context) {
        super(context);
    }

    public MyVg2TextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyVg2TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            Log.i(TAG, "MyVg2TextView--onTouchEvent: ");
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            Log.i(TAG,"MyVg2TextView--dispatchTouchEvent");
        }
        return super.dispatchTouchEvent(event);
    }

}
