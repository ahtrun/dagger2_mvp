package com.ahtrun.mvpfdf.presenter;

import com.ahtrun.mvpfdf.base.BaseMvpPresenter;
import com.ahtrun.mvpfdf.bean.Version;
import com.ahtrun.mvpfdf.contract.MainContract;
import com.ahtrun.mvpfdf.http.ApiService;
import com.ahtrun.mvpfdf.http.CommonSubscriber;
import com.ahtrun.mvpfdf.http.HttpRespBean;
import com.ahtrun.mvpfdf.http.SubscriberListener;

import java.util.HashMap;
import java.util.Map;

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
        baseView.showLoading();
        CommonSubscriber<HttpRespBean<Version>> subscriber = new CommonSubscriber(new SubscriberListener<HttpRespBean<Version>>() {
            @Override
            public void onNext(HttpRespBean<Version> stringHttpRespBean) {
                baseView.setData(stringHttpRespBean.getResult().getSys().getRemark());
            }

            @Override
            public void onError(String e, int code) {

            }

            @Override
            public void onComplated() {
                baseView.hideLoading();
            }


        });
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("type","2");
        map.put("versionAndr","1420");
        toSubscribe(apiService.getVersion(map), subscriber);

    }


}
