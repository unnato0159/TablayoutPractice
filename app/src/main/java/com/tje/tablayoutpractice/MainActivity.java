package com.tje.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

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

        act.tablayout.addTab(act.tablayout.newTab().setText("홈").setIcon(R.mipmap.ic_launcher));
        act.tablayout.addTab(act.tablayout.newTab().setText("채팅목록"));
        act.tablayout.addTab(act.tablayout.newTab().setText("검색"));
        act.tablayout.addTab(act.tablayout.newTab().setCustomView(createCoutomTabView("커스텀")));
        act.tablayout.addTab(act.tablayout.newTab().setCustomView(createCoutomTabView("커스텀2")));


    }

    View createCoutomTabView(String tabName){
        View tabView = LayoutInflater.from(mContext).inflate(R.layout.custom_tab,null);

        TextView nameTxt = tabView.findViewById(R.id.nameTxt);
        nameTxt.setText(tabName);

        return tabView;

    }


    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }
}
