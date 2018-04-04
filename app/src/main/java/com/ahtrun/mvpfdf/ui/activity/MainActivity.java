package com.ahtrun.mvpfdf.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.ahtrun.mvpfdf.MyApplication;
import com.ahtrun.mvpfdf.R;
import com.ahtrun.mvpfdf.base.BaseMvpActivity;
import com.ahtrun.mvpfdf.contract.MainContract;
import com.ahtrun.mvpfdf.di.module.ActivityModule;
import com.ahtrun.mvpfdf.presenter.MainPresenter;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.IView {





    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
//        initToolbar(true, false, true).setMyTitle("主页").setMoreTitle("更多");

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

    }

    @Override
    protected void initInject() {
        MyApplication.getAppComponent().addSub(new ActivityModule()).inject(this);

    }

    @Override
    public void setData(String str) {

    }

    @Override
    protected int getToolBar() {
        return R.layout.include_common_top;
    }



}
