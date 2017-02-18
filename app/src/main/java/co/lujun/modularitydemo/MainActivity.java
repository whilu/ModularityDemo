package co.lujun.modularitydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import co.lujun.activityhelper.ActivityLaunchHelper;
import co.lujun.activityhelper.ActivityList;
import co.lujun.baselibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.text)).setText("current variant is " + Test.getName());
        findViewById(R.id.btn_go_business_module_1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ActivityLaunchHelper.startActivityForName(MainActivity.this,
                            ActivityList.BUSINESS_1_ACT);
                }
            });
        findViewById(R.id.btn_go_business_module_2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ActivityLaunchHelper.startActivityForName(MainActivity.this,
                            ActivityList.BUSINESS_2_ACT);
                }
            });
    }
}
