package com.example.workshop1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BoxFragment extends Fragment implements View.OnTouchListener {
    //    View view2,view3,view4,view5,vie6;
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


//        SharedPreferences preferences1 = this.getActivity().getSharedPreferences("pref1", Context.MODE_PRIVATE);
        float x1 = sharedPrefenceHelper.getViewx1();
        float y1 = sharedPrefenceHelper.getViewy1();

//        SharedPreferences preferences2 = this.getActivity().getSharedPreferences("pref2", Context.MODE_PRIVATE);
        float x2 = sharedPrefenceHelper.getViewx2();
        float y2 = sharedPrefenceHelper.getViewy2();

//        SharedPreferences preferences3 = this.getActivity().getSharedPreferences("pref3", Context.MODE_PRIVATE);
        float x3 = sharedPrefenceHelper.getViewx3();
        float y3 = sharedPrefenceHelper.getViewy3();

//        SharedPreferences preferences4 = this.getActivity().getSharedPreferences("pref4", Context.MODE_PRIVATE);
        float x4 = sharedPrefenceHelper.getViewx1();
        float y4 = sharedPrefenceHelper.getViewx1();

//        SharedPreferences preferences5 = this.getActivity().getSharedPreferences("pref5", Context.MODE_PRIVATE);
        float x5 =sharedPrefenceHelper.getViewx1();
        float y5 = sharedPrefenceHelper.getViewx1();



        dragView1.setX(x1);
        dragView1.setY(y1);
        dragView2.setX(x2);
        dragView2.setY(y2);
        dragView3.setX(x3);
        dragView3.setY(y3);
        dragView4.setX(x4);
        dragView4.setY(y4);
        dragView5.setX(x5);
        dragView5.setY(y5);

        dragView1.setOnTouchListener(this);
        dragView2.setOnTouchListener(this::onTouch2);
        dragView3.setOnTouchListener(this::onTouch3);
        dragView4.setOnTouchListener(this::onTouch4);
        dragView5.setOnTouchListener(this::onTouch5);

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
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY1);
                v.setX(event.getRawX() + dX1);
                lastAction = MotionEvent.ACTION_MOVE;
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                SharedPreferences preferences1 = this.getActivity().getSharedPreferences("pref1", Context.MODE_PRIVATE);
//                SharedPreferences.Editor editor = preferences1.edit();
//                float value11 = event.getRawX() + dX1;
//                float value12 = event.getRawY() + dY1;
                float value11 = v.getX();
                float value12 = v.getY();
                sharedPrefenceHelper.setViewx1(value11);
                sharedPrefenceHelper.setViewy1(value12);
//                editor.putFloat("key11", value11);
//                editor.putFloat("key12", value12);
//                editor.apply();
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
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY2);
                v.setX(event.getRawX() + dX2);
                lastAction = MotionEvent.ACTION_MOVE;
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                SharedPreferences preferences2 = this.getActivity().getSharedPreferences("pref2", Context.MODE_PRIVATE);
//                SharedPreferences.Editor editor = preferences2.edit();
//                float value21 = event.getRawX() + dX2;
//                float value22 = event.getRawY() + dY2;
                float value21 = v.getX();
                float value22 = v.getY();
                sharedPrefenceHelper.setViewx2(value21);
                sharedPrefenceHelper.setViewy2(value22);
//                editor.putFloat("key21", value21);
//                editor.putFloat("key22", value22);
//                editor.apply();
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
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY3);
                v.setX(event.getRawX() + dX3);
                lastAction = MotionEvent.ACTION_MOVE;
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
                SharedPreferences preferences3 = this.getActivity().getSharedPreferences("pref3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences3.edit();
//                float value31 = event.getRawX() + dX3;
//                float value32 = event.getRawY() + dY3;
                float value31 = v.getX();
                float value32 = v.getY();
                sharedPrefenceHelper.setViewx3(value31);
                sharedPrefenceHelper.setViewy3(value32);
//                editor.putFloat("key31", value31);
//                editor.putFloat("key32", value32);
//                editor.apply();
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
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY4);
                v.setX(event.getRawX() + dX4);
                lastAction = MotionEvent.ACTION_MOVE;
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
                SharedPreferences preferences4 = this.getActivity().getSharedPreferences("pref4", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences4.edit();
//                float value41 = event.getRawX() + dX4;
//                float value42 = event.getRawY() + dY4;
                float value41 = v.getX();
                float value42 = v.getY();
                sharedPrefenceHelper.setViewx4(value41);
                sharedPrefenceHelper.setViewy4(value42);
//                editor.putFloat("key41", value41);
//                editor.putFloat("key42", value42);
//                editor.apply();
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
                break;

            case MotionEvent.ACTION_MOVE:
                v.setY(event.getRawY() + dY5);
                v.setX(event.getRawX() + dX5);
                lastAction = MotionEvent.ACTION_MOVE;
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN)
                    Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
                SharedPreferences preferences5 = this.getActivity().getSharedPreferences("pref5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences5.edit();
//                float value51 = event.getRawX() + dX5;
//                float value52 = event.getRawY() + dY5;
                float value51 = v.getX();
                float value52 = v.getY();
                sharedPrefenceHelper.setViewx5(value51);
                sharedPrefenceHelper.setViewy5(value52);
//                editor.putFloat("key51", value51);
//                editor.putFloat("key52", value52);
//                editor.apply();
                break;

            default:
                return false;
        }
        return true;

    }

}