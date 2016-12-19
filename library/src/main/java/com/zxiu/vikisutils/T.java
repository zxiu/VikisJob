package com.zxiu.vikisutils;

import android.widget.Toast;

/**
 * Created by Xiu on 12/18/2016.
 */

public class T {
    public static void show(String text){
        Toast.makeText(VikisUtils.getCONTEXT(), text, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(String text){
        Toast.makeText(VikisUtils.getCONTEXT(), text, Toast.LENGTH_LONG).show();
    }
}
