package com.tencent.tmgp.speedmobile;

import com.tencent.tmgp.util.LogHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class TwoActivity extends Activity implements View.OnClickListener{

    Button btnStartActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LogHelper.d("TwoActivity::onCreate");
        LogHelper.printStackTrace();
        btnStartActivity = (Button)findViewById(R.id.id_btn_activity_two);
        btnStartActivity.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClick(View v)
    {
        Intent intent = new Intent(this,ThreeActivity.class);
        startActivity(intent);
    }
    
    protected void onResume(){
        super.onResume();
        LogHelper.d("TwoActivity::onResume");
        LogHelper.printStackTrace();
    }

}
