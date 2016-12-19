package com.zxiu.vikisutils;

import android.util.Log;

/**
 * Created by Xiu on 12/18/2016.
 */

public class L {

    public static void i(String text) {
        L.i(VikisUtils.getTAG(), text);
    }

    public static void d(String text) {
        L.d(VikisUtils.getTAG(), text);
    }

    public static void e(String text) {
        L.e(VikisUtils.getTAG(), text);
    }

    public static void v(String text) {
        L.v(VikisUtils.getTAG(), text);
    }

    public static void i(String tag, String msg) {
        if (VikisUtils.isDEBUG()) {
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (VikisUtils.isDEBUG()) {
            Log.i(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (VikisUtils.isDEBUG()) {
            Log.i(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (VikisUtils.isDEBUG()) {
            Log.i(tag, msg);
        }

    }
}
