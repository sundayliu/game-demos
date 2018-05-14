package com.tencent.tmgp.speedmobile;

import com.tencent.tmgp.util.LogHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    
    Button btnStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogHelper.d("MainActivity::onCreate");
        LogHelper.printStackTrace();
        setContentView(R.layout.activity_main);
        
        btnStartActivity = (Button)findViewById(R.id.id_btn_activity_one);
        btnStartActivity.setOnClickListener(this);
        findViewById(R.id.id_btn_start_sgame).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClick(View v)
    {
        int id = v.getId();
        switch(id){
        case R.id.id_btn_activity_one:
        {
            Intent intent = new Intent(this,TwoActivity.class);
            startActivity(intent);
        }
            break;
        case R.id.id_btn_start_sgame:
        {
            Intent intent = getPackageManager().
                    getLaunchIntentForPackage("com.tencent.tmgp.sgame");
            if (intent != null){
                LogHelper.d("intent:" + intent);
                startActivity(intent);
            }
        }
            break;
        default:
            break;
        }
        
    }
    
    protected void onResume(){
        super.onResume();
        LogHelper.d("MainActivity::onResume");
        LogHelper.printStackTrace();
    }

}
