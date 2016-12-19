package com.zxiu.vikisutils;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by Xiu on 12/18/2016.
 */

public class SPUtils {
    /**
     * File Name for Shared Preference
     */
    public static final String FILE_NAME = "share_data";

    /**
     * @param key
     * @param object
     */
    public static void put(String key, Object object) {

        SharedPreferences sp = VikisUtils.getCONTEXT().getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        if (object instanceof String) {
            editor.putString(key, (String) object);
        } else if (object instanceof Integer) {
            editor.putInt(key, (Integer) object);
        } else if (object instanceof Boolean) {
            editor.putBoolean(key, (Boolean) object);
        } else if (object instanceof Float) {
            editor.putFloat(key, (Float) object);
        } else if (object instanceof Long) {
            editor.putLong(key, (Long) object);
        } else {
            editor.putString(key, object.toString());
        }
        editor.apply();
    }

    /**
     * @param key
     * @param defaultObject
     * @return
     */
    public static Object get(String key, Object defaultObject) {
        SharedPreferences sp = VikisUtils.getCONTEXT().getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);

        if (defaultObject instanceof String) {
            return sp.getString(key, (String) defaultObject);
        } else if (defaultObject instanceof Integer) {
            return sp.getInt(key, (Integer) defaultObject);
        } else if (defaultObject instanceof Boolean) {
            return sp.getBoolean(key, (Boolean) defaultObject);
        } else if (defaultObject instanceof Float) {
            return sp.getFloat(key, (Float) defaultObject);
        } else if (defaultObject instanceof Long) {
            return sp.getLong(key, (Long) defaultObject);
        }

        return null;
    }

    /**
     * Remove the value related to a key.
     *
     * @param key
     */
    public static void remove(String key) {
        SharedPreferences sp = VikisUtils.getCONTEXT().getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.remove(key);
        editor.apply();
    }

    /**
     * Clear all Data
     */
    public static void clear() {
        SharedPreferences sp = VikisUtils.getCONTEXT().getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.apply();
    }

    /**
     * If a key contained
     *
     * @param key
     * @return
     */
    public static boolean contains(String key) {
        SharedPreferences sp = VikisUtils.getCONTEXT().getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        return sp.contains(key);
    }

    /**
     * return all value-pair
     *
     * @param context
     * @return
     */
    public static Map<String, ?> getAll(Context context) {
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        return sp.getAll();
    }

}