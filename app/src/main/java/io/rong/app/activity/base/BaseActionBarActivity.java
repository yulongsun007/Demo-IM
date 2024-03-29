package io.rong.app.activity.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import io.rong.app.R;


/*
 * PROJECT_NAME :IM_DEMO
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 7/29/2015 4:40 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 * 主要功能：
 * 1.对ActionBar进行设置
 * 2.
 */
public abstract class BaseActionBarActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.mipmap.ic_launcher);        //产品Logo
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.mipmap.de_actionbar_back);   //
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //当点击Home键的时候结束当前Activtity
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
