package com.example.stone.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Inject
    Cloth cloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        DaggerMainComponent.builder().mainModule(new MainModule()).build().inject(this);
        cloth.setColor("蓝色");
        tv.setText("我现在有"+cloth);
    }
}
