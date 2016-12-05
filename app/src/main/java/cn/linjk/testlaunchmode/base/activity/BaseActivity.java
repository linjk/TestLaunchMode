package cn.linjk.testlaunchmode.base.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import cn.linjk.testlaunchmode.utils.ActivityStackManager;

/**
 * Created by LinJK on 05/12/2016.
 */

public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        ActivityStackManager.getINSTANCE().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityStackManager.getINSTANCE().removeActivity(this);
    }

}
