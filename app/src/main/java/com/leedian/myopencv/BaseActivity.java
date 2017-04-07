package com.leedian.myopencv;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    static {
        if (OpenCVLoader.initDebug()) {
            Log.d(TAG, "static initializer: success");
        } else {
            Log.d(TAG, "static initializer: fail");
        }

    }

}
