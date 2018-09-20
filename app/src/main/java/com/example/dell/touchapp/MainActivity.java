package com.example.dell.touchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String TAG="gdchent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN){
            Log.d(TAG, "=================Activity dispatchTouchEvent Action: ");
        }
        if(ev.getAction()==MotionEvent.ACTION_UP) {
            Log.d(TAG, "=================Activity 抬起dispatchTouchEvent Action: ");
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN){
            Log.d(TAG, "=================Activity onTouchEvent Action: ");
        }
        if(ev.getAction()==MotionEvent.ACTION_UP){
            Log.d(TAG, "=================Activity抬起事件 onTouchEvent Action: ");
        }
        return super.onTouchEvent(ev);
    }


}
