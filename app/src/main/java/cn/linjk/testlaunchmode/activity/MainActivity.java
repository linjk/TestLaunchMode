package cn.linjk.testlaunchmode.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import cn.linjk.testlaunchmode.base.activity.BaseActivity;
import cn.linjk.testlaunchmode.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "[Task ID]" + getTaskId());

        btnStartNewActivity = (Button)findViewById(R.id.btn_start_new_activity);

        btnStartNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {
                startActivity(new Intent(MainActivity.this, ActivitySecond.class));
            }
        });
    }

    //////////////////////////////////////////////////////

    private Button btnStartNewActivity;

}
