package com.hejiafeng.jitpack;

import android.text.TextUtils;

public class PhoneUtils {


    public static String getPHONE() {
        return PHONE;
    }

    private static String PHONE;


    private static boolean isModify = false;

    public static boolean isEmpty() {
        if (TextUtils.isEmpty(PHONE)) {
            return true;
        }
        return false;
    }

    public static boolean isModify(){
        return isModify;
    }
}
