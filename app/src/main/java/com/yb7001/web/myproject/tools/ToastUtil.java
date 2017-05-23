package com.yb7001.web.myproject.tools;

import android.widget.Toast;

import com.yb7001.web.myproject.global.MyApplication;

/**
 * 单例Toast
 */

public class ToastUtil {

    private static Toast mToast;

    public static void showToast(String text) {
        if (mToast == null) {
            mToast = Toast.makeText(MyApplication.getInstance(), text, Toast.LENGTH_SHORT);
        }
        mToast.setText(text);
        mToast.show();
    }
}
