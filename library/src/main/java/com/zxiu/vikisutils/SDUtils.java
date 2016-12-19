package com.zxiu.vikisutils;

/**
 * Created by Xiu on 12/18/2016.
 */

import java.io.File;

import android.os.Environment;
import android.os.StatFs;

/**
 * SD卡相关的辅助类
 */
public class SDUtils {
    private SDUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * If SD is valid
     *
     * @return
     */
    public static boolean isSDEnable() {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);

    }

    /**
     * 获取SD卡路径
     *
     * @return
     */
    public static String getSDPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + File.separator;
    }

    /**
     * get all size of SD by byte
     *
     * @return
     */
    public static long getSDAllSize() {
        if (isSDEnable()) {
            StatFs stat = new StatFs(getSDPath());
            // 获取空闲的数据块的数量
            long availableBlocks = (long) stat.getAvailableBlocks() - 4;
            // 获取单个数据块的大小（byte）
            long freeBlocks = stat.getAvailableBlocks();
            return freeBlocks * availableBlocks;
        }
        return 0;
    }

    /**
     * get free size of SD by byte
     *
     * @param filePath
     * @return free size of SD
     */
    public static long getFreeBytes(String filePath) {
        // 如果是sd卡的下的路径，则获取sd卡可用容量
        if (filePath.startsWith(getSDPath())) {
            filePath = getSDPath();
        } else {// 如果是内部存储的路径，则获取内存存储的可用容量
            filePath = Environment.getDataDirectory().getAbsolutePath();
        }
        StatFs stat = new StatFs(filePath);
        long availableBlocks = (long) stat.getAvailableBlocks() - 4;
        return stat.getBlockSize() * availableBlocks;
    }

    /**
     * get Root Path
     *
     * @return
     */
    public static String getRootDirectoryPath() {
        return Environment.getRootDirectory().getAbsolutePath();
    }


}