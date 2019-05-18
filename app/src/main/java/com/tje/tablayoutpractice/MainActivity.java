package com.tje.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tje.tablayoutpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViews();
        setupEvent();
        setValues();

    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }
}
