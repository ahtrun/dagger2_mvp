package com.haichenyi.myproject;

import android.os.Bundle;
import android.widget.TextView;

import com.haichenyi.myproject.base.BaseMvpActivity;
import com.haichenyi.myproject.contract.MainContract;
import com.haichenyi.myproject.presenter.MainPresenter;

import butterknife.BindView;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.IView {


    @BindView(R.id.tv_test)
    TextView tvTest;

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        super.initData();
//        initToolbar(true, false, true).setMyTitle("主页").setMoreTitle("更多");
        basePresenter.loadData();
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    public void setData(String str) {
        tvTest.setText(str);
    }

    @Override
    protected int getToolBar() {
        return R.layout.include_common_top;
    }
}
