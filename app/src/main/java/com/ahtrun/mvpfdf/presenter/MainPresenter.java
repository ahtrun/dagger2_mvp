package com.ahtrun.mvpfdf.presenter;

import com.ahtrun.mvpfdf.base.BaseMvpPresenter;
import com.ahtrun.mvpfdf.contract.MainContract;
import com.ahtrun.mvpfdf.http.ApiService;

import javax.inject.Inject;

/**
 * Author: lhp
 * Date: 2018/2/23
 * Desc:
 */
public class MainPresenter extends BaseMvpPresenter<MainContract.IView>
        implements MainContract.Presenter {

    ApiService apiService;
    @Inject
    MainPresenter(ApiService apiService) {
      this.apiService=apiService;
    }

    @Override
    public void loadData() {
//        baseView.showTipMsg("加载数据");

    }


}
