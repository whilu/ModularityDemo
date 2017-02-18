package co.lujun.businessmodule1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import co.lujun.baselibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.businessmodule1_activity_main);

        ((TextView)findViewById(R.id.m1_text)).setText("business module 1, variant is " + Test.getName());
    }
}
