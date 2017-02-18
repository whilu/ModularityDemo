package co.lujun.businessmodule2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import co.lujun.baselibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.businessmodule2_activity_main);

        ((TextView)findViewById(R.id.m2_text)).setText("business module 2, variant is " + Test.getName());
    }
}
