package com.ahtrun.mvpfdf.base;

import com.ahtrun.mvpfdf.http.HttpRespBean;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Author: lhp
 * Date: 2018/2/23
 * Desc:
 */
public class BaseMvpPresenter<T extends BaseView> implements BasePresenter<T> {
  protected T baseView;


  @Override
  public void attachView(T baseView) {
    this.baseView = baseView;
  }

  @Override
  public void detachView() {
    this.baseView = null;
  }

  // 统一添加线程切换
  public <T> void toSubscribe(Observable<HttpRespBean<T>> observable, Subscriber<HttpRespBean<T>> subscribe){
    observable
            .subscribeOn(Schedulers.io())
            .unsubscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(subscribe);
  }
}
