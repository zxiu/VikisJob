package com.zxiu.vikisutils;


import android.content.Context;
import android.util.TypedValue;

/**
 * Display units utils.
 */
public class DensityUtils {
    private DensityUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * dp to px
     *
     * @param dpVal
     * @return
     */
    public static int dp2px(float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, VikisUtils.getCONTEXT().getResources().getDisplayMetrics());
    }

    /**
     * sp to px
     *
     * @param spVal
     * @return
     */
    public static int sp2px(float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, VikisUtils.getCONTEXT().getResources().getDisplayMetrics());
    }

    /**
     * px to dp
     *
     * @param pxVal
     * @return
     */
    public static float px2dp(float pxVal) {
        final float scale = VikisUtils.getCONTEXT().getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * px to sp
     *
     * @param pxVal
     * @return
     */
    public static float px2sp(float pxVal) {
        return (pxVal / VikisUtils.getCONTEXT().getResources().getDisplayMetrics().scaledDensity);
    }

}