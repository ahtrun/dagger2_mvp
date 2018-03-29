package com.haichenyi.myproject.base;

/**
 * Author: 海晨忆
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
}
