package cn.linjk.testlaunchmode.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import cn.linjk.testlaunchmode.R;
import cn.linjk.testlaunchmode.base.activity.BaseActivity;
import cn.linjk.testlaunchmode.utils.ActivityStackManager;

/**
 * Created by LinJK on 05/12/2016.
 */

public class ActivitySecond extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("ActivitySecond", "[Task ID]" + getTaskId());

        btnStartNewActivity = (Button)findViewById(R.id.btn_start_new_activity);

        btnStartNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {
                startActivity(new Intent(ActivitySecond.this, ActivitySecond.class));
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.d("ActivitySecond", "[Task ID]" + getTaskId());
        ActivityStackManager.getINSTANCE().printAllActivityName();

    }

    //////////////////////////////////////////////////////

    private Button btnStartNewActivity;
}
