package com.linshengt.qq.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.linshengt.qq.R;
import com.linshengt.qq.Views.TitleBar;

public class RegisterActivity extends AppCompatActivity {

    private TitleBar mTitleBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findView();
        initView();
    }

    private void findView(){
        mTitleBar = (TitleBar) findViewById(R.id.titleBar);

    }
    private void initView(){
        mTitleBar.setBtnTitleBack(R.drawable.boss_unipay_icon_back, "返回");
        mTitleBar.setBtnTitleBackOnClickListenr(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
