package com.tencent.tmgp.speedmobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class FourActivity extends Activity implements View.OnClickListener{

    Button btnStartActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        
        btnStartActivity = (Button)findViewById(R.id.id_btn_activity_four);
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
        Intent intent = new Intent(this,FiveActivity.class);
        startActivity(intent);
    }

}
