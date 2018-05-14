package com.tencent.tmgp.util;

import android.util.Log;

public class LogHelper {
    final static String LOG_TAG = "gameparser";
    public static void e(String msg){
        Log.e(LOG_TAG,msg);
        //printStackTrace();
    }
    
    public static void d(String msg){
        Log.d(LOG_TAG,msg);
        //printStackTrace();
    }
    
    public static void printStackTrace()
    {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        Log.e(LOG_TAG,"=============================================================");
        for (int i = 1; i < elements.length; i++) {
            StackTraceElement s = elements[i];
            Log.e(LOG_TAG,"\tat " + s.getClassName() + "." + s.getMethodName() + "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
        }
        Log.e(LOG_TAG,"=============================================================");

    }

}
