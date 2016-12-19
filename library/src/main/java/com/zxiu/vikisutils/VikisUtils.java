package com.zxiu.vikisutils;

import android.content.Context;

/**
 * Created by Xiu on 12/18/2016.
 */

public class VikisUtils {
    private static Context CONTEXT;
    private static String TAG;
    private static boolean DEBUG = false;

    /**
     * @param applicationContext
     */
    public static void initiate(Context applicationContext) {
        initiate(applicationContext, DEBUG);
    }


    public static void initiate(Context applicationContext, boolean debug) {
        if (applicationContext == null) throw new NullPointerException();
        setDEBUG(debug);
        VikisUtils.CONTEXT = applicationContext;
    }

    public static void setCONTEXT(Context CONTEXT) {
        VikisUtils.CONTEXT = CONTEXT;
    }

    public static Context getCONTEXT() {
        return CONTEXT;
    }

    public static void setTAG(String tag) {
        TAG = tag;
    }

    public static String getTAG() {
        return TAG;
    }

    public static boolean isDEBUG() {
        return DEBUG;
    }

    public static void setDEBUG(boolean debug) {
        DEBUG = debug;
    }


}
