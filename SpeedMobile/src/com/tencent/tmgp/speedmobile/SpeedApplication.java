package com.tencent.tmgp.speedmobile;

import com.tencent.tmgp.util.LogHelper;

import android.app.Application;
import android.content.Context;

public class SpeedApplication extends Application {
    
    public void onCreate(){
        super.onCreate();
        
        LogHelper.d("SpeedApplication::onCreate");
        LogHelper.printStackTrace();
    }
    
    protected void attachBaseContext(Context base){
        super.attachBaseContext(base);
        LogHelper.d("SpeedApplication::attachBase");
        LogHelper.d(base.getClass().toString());
        LogHelper.printStackTrace();
    }

}
