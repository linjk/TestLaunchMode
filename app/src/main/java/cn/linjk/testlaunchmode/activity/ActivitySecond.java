package cn.linjk.testlaunchmode.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.linjk.testlaunchmode.R;
import cn.linjk.testlaunchmode.base.activity.BaseActivity;

/**
 * Created by LinJK on 05/12/2016.
 */

public class ActivitySecond extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnStartNewActivity = (Button)findViewById(R.id.btn_start_new_activity);

        btnStartNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {
                startActivity(new Intent(ActivitySecond.this, ActivitySecond.class));
            }
        });
    }

    //////////////////////////////////////////////////////

    private Button btnStartNewActivity;
}
