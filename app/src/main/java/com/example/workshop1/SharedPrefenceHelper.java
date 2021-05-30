package com.example.workshop1;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefenceHelper {
    public static final String SHARED_PREFS = "sharedPrefs";
    private Context context;


    private static final String X1 = "x1";
    private static final String Y1 = "y1";
    private static final String X2 = "x2";
    private static final String Y2 = "y2";
    private static final String X3 = "x3";
    private static final String Y3 = "y3";
    private static final String X4 = "x4";
    private static final String Y4 = "y4";
    private static final String X5 = "x5";
    private static final String Y5 = "y5";

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPrefenceHelper(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(SHARED_PREFS,Context.MODE_PRIVATE);

    }

    public void setViewx1(float x1){
        editor  = sharedPreferences.edit();
        editor.putFloat(X1,x1);
        editor.apply();
    }

    public void setViewy1(float y1){
        editor  = sharedPreferences.edit();
        editor.putFloat(Y1,y1);
        editor.apply();
    }


    public float getViewx1() {
        return sharedPreferences.getFloat(X1,0);
    }
    public float getViewy1() {
        return sharedPreferences.getFloat(Y1,0);
    }

    public void setViewx2(float x2){
        editor  = sharedPreferences.edit();
        editor.putFloat(X2,x2);
        editor.apply();
    }

    public void setViewy2(float y2){
        editor  = sharedPreferences.edit();
        editor.putFloat(Y2,y2);
        editor.apply();
    }


    public float getViewx2() {
        return sharedPreferences.getFloat(X2,0);
    }
    public float getViewy2() {
        return sharedPreferences.getFloat(Y2,0);
    }

    public void setViewx3(float x3){
        editor  = sharedPreferences.edit();
        editor.putFloat(X3,x3);
        editor.apply();
    }

    public void setViewy3(float y3){
        editor  = sharedPreferences.edit();
        editor.putFloat(Y3,y3);
        editor.apply();
    }


    public float getViewx3() {
        return sharedPreferences.getFloat(X3,0);
    }
    public float getViewy3() {
        return sharedPreferences.getFloat(Y3,0);
    }

    public void setViewx4(float x4){

        editor  = sharedPreferences.edit();
        editor.putFloat(X4,x4);
        editor.apply();
    }

    public void setViewy4(float y4){
        editor  = sharedPreferences.edit();
        editor.putFloat(Y4,y4);
        editor.apply();
    }


    public float getViewx4() {
        return sharedPreferences.getFloat(X4,0);
    }
    public float getViewy4() {
        return sharedPreferences.getFloat(Y4,0);
    }

    public void setViewx5(float x5){
        editor  = sharedPreferences.edit();
        editor.putFloat(X5,x5);
        editor.apply();
    }

    public void setViewy5(float y5){
        editor  = sharedPreferences.edit();
        editor.putFloat(Y5,y5);
        editor.apply();
    }


    public float getViewx5() {
        return sharedPreferences.getFloat(X5,0);
    }
    public float getViewy5() {
        return sharedPreferences.getFloat(Y5,0);
    }



}
