    package com.example.workshop1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BoxFragment extends Fragment implements View.OnTouchListener {
    private static final String TAG ="box" ;
    float dX1, dX2, dX3, dX4, dX5;
    float dY1, dY2, dY3, dY4, dY5;
    int lastAction;
    SharedPrefenceHelper sharedPrefenceHelper;

    public BoxFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_boxes, container, false);

        final View dragView1 = view.findViewById(R.id.view2);
        final View dragView2 = view.findViewById(R.id.view3);
        final View dragView3 = view.findViewById(R.id.view4);
        final View dragView4 = view.findViewById(R.id.view5);
        final View dragView5 = view.findViewById(R.id.view6);
        sharedPrefenceHelper = new SharedPrefenceHelper(this.getContext());


        float x1 = sharedPrefenceHelper.getViewx1();
        float y1 = sharedPrefenceHelper.getViewy1();

        Log.d(TAG, "onTouch: 1st view coordinates sharedprefs" + x1 + " " + y1);


        float x2 = sharedPrefenceHelper.getViewx2();
        float y2 = sharedPrefenceHelper.getViewy2();

        Log.d(TAG, "onTouch: 2st view coordinates sharedprefs" + x2  + " " +y2);


        float x3 = sharedPrefenceHelper.getViewx3();
        float y3 = sharedPrefenceHelper.getViewy3();

        Log.d(TAG, "onTouch: 3st view coordinates sharedprefs" + x3+ " " +y3);


        float x4 = sharedPrefenceHelper.getViewx4();
        float y4 = sharedPrefenceHelper.getViewy4();

        Log.d(TAG, "onTouch: 4st view coordinates sharedprefs" + x4+ " " +y4);


        float x5 =sharedPrefenceHelper.getViewx5();
        float y5 = sharedPrefenceHelper.getViewy5();

        Log.d(TAG, "onTouch: 5st view coordinates sharedprefs" + x5+ " " +y5);


//        dragView1.setX(100);
//        dragView1.setY(100);
//        dragView2.setX(100);
//        dragView2.setY(100);
//        dragView3.setX(100);
//        dragView3.setY(100);
//        dragView4.setX(100);
//        dragView4.setY(100);
//        dragView5.setX(100);
//        dragView5.setY(100);

        dragView1.setX(x1);
        dragView1.setY(y1);
        dragView2.setX(x2);
        dragView2.setY(y2);
        dragView3.setX(x3);
        dragView3.setY(y3);
        dragView4.setX(x4);
        dragView4.setY(y4);
        dragView5.setX(x5/2);
        dragView5.setY(y5/2);

        dragView1.setOnTouchListener(this);
        dragView2.setOnTouchListener(this ::onTouch2);
        dragView3.setOnTouchListener(this ::onTouch3);
        dragView4.setOnTouchListener(this ::onTouch4);
        dragView5.setOnTouchListener(this ::onTouch5);

        return view;
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                dX1 = v.getX() - event.getRawX();
                dY1 = v.getY() - event.getRawY();
                lastAction = MotionEvent.ACTION_DOWN;
                Log.d(TAG, "onTouch: 1st view get" + " " + v.getX() + " " + v.getY());
                Log.d(TAG, "onTouch: 1st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch: 1st view DX" + " " + dX1+ " " +dY1);


                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY1);
                v.setX(event.getRawX() + dX1);
                lastAction = MotionEvent.ACTION_MOVE;
                Log.d(TAG, "onTouch: ACTION_MOVE 1st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch: ACTION_MOVE 1st view DX" + " " + dX1+ " " +dY1);
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                float value11 = v.getX() + event.getRawX() ;
//                float value12 = v.getY() + event.getRawY() ;
                float value11 = event.getRawX() + dX1 ;
                float value12 = event.getRawY() + dY1 ;
                sharedPrefenceHelper.setViewx1(value11);
                sharedPrefenceHelper.setViewy1(value12);
                Log.d(TAG, "onTouch: 1st view" + value11 + " " + value12);
                break;

            default:
                return false;
        }
        return true;

    }


    public boolean onTouch2(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                dX2 = v.getX() - event.getRawX();
                dY2 = v.getY() - event.getRawY();
                lastAction = MotionEvent.ACTION_DOWN;
                Log.d(TAG, "onTouch: 2st view get" + " " + v.getX() + " " + v.getY());
                Log.d(TAG, "onTouch: 2st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch: 2st view DX" + " " + dX2+ " " +dY2);
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY2);
                v.setX(event.getRawX() + dX2);
                lastAction = MotionEvent.ACTION_MOVE;
                Log.d(TAG, "onTouch:ACTION_MOVE 2st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch: ACTION_MOVE 2st view DX" + " " + dX2+ " " +dY2);

                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                float value21 = v.getX() + event.getRawX() ;
//                float value22 = v.getY() + event.getRawY() ;
                float value21 = dX2 + event.getRawX() ;
                float value22 = dY2 + event.getRawY() ;
                Log.d(TAG, "onTouch: 2st view" + value21+ " " + value22);
                sharedPrefenceHelper.setViewx2(value21);
                sharedPrefenceHelper.setViewy2(value22);
                break;

            default:
                return false;
        }
        return true;

    }


    public boolean onTouch3(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                dX3 = v.getX() - event.getRawX();
                dY3 = v.getY() - event.getRawY();
                lastAction = MotionEvent.ACTION_DOWN;
                Log.d(TAG, "onTouch: 3st view get" + " " + v.getX() + " " + v.getY());
                Log.d(TAG, "onTouch: 3st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch: 3st view DX" + " " + dX3+ " " +dY3);
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY3);
                v.setX(event.getRawX() + dX3);
                lastAction = MotionEvent.ACTION_MOVE;
                Log.d(TAG, "onTouch: ACTION_MOVE 3st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch: ACTION_MOVE 3st view DX" + " " + dX3+ " " +dY3);
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                float value31 = v.getX() + event.getRawX() ;
//                float value32 = v.getY() + event.getRawY() ;
                float value31 = dX3  + event.getRawX() ;
                float value32 = dY3  + event.getRawY() ;
                Log.d(TAG, "onTouch: 3st view" + value31 + " "+ value32);

                sharedPrefenceHelper.setViewx3(value31);
                sharedPrefenceHelper.setViewy3(value32);
                break;

            default:
                return false;
        }
        return true;

    }


    public boolean onTouch4(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                dX4 = v.getX() - event.getRawX();
                dY4 = v.getY() - event.getRawY();
                lastAction = MotionEvent.ACTION_DOWN;
                Log.d(TAG, "onTouch: 4st view get" + " " + v.getX() + " " + v.getY());
                Log.d(TAG, "onTouch: 4st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch: 4st view DX" + " " + dX4+ " " +dY4);
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY4);
                v.setX(event.getRawX() + dX4);
                lastAction = MotionEvent.ACTION_MOVE;
                Log.d(TAG, "onTouch:ACTION_MOVE 4st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch:ACTION_MOVE 4st view DX" + " " + dX4+ " " +dY4);
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                float value41 = v.getX() + event.getRawX() ;
//                float value42 = v.getY() + event.getRawY() ;
                float value41 = dX4 + event.getRawX() ;
                float value42 = dY4 + event.getRawY() ;
                sharedPrefenceHelper.setViewx4(value41);
                sharedPrefenceHelper.setViewy4(value42);
                Log.d(TAG, "onTouch: 4st view" + value41+ " " + value42);

                break;

            default:
                return false;
        }
        return true;

    }


    public boolean onTouch5(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                dX5 = v.getX() - event.getRawX();
                dY5 = v.getY() - event.getRawY();
                lastAction = MotionEvent.ACTION_DOWN;
                Log.d(TAG, "ACTION_DOWN: 5st view get" + " " + v.getX() + " " + v.getY());
                Log.d(TAG, "ACTION_DOWN: 5st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "ACTION_DOWN: 5st view DX" + " " + dX5+ " " +dY5);
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY5);
                v.setX(event.getRawX() + dX5);
                lastAction = MotionEvent.ACTION_MOVE;
                Log.d(TAG, "onTouch:ACTION_MOVE 5st view RAW" + " " + event.getRawX() + " " +event.getRawY());
                Log.d(TAG, "onTouch:ACTION_MOVE 5st view DX" + " " + dX5+ " " +dY5);
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                float value51 = v.getX() + event.getRawX() ;
//                float value52 = v.getY() + event.getRawY() ;
                float value51 = dX5 + event.getRawX() ;
                float value52 = dY5 + event.getRawY() ;
                sharedPrefenceHelper.setViewx5(value51);
                sharedPrefenceHelper.setViewy5(value52);
                Log.d(TAG, "onTouch: 5st view" + value51+ " " + value52);

                break;

            default:
                return false;
        }
        return true;

    }

}