package com.example.androidpl_hw_7;

import android.util.Log;

public class Calculator {

     private static final String TAG = "Calculator";

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        Log.e(TAG, "divide: деление на ноль невозможно!");
        return 0;
    }
}
