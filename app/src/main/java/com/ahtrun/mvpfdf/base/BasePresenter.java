package com.ahtrun.mvpfdf.base;

/**
 * Author: lhp
 * Date: 2018/2/23
 * Desc:
 */
public interface BasePresenter<T extends BaseView> {
  void attachView(T baseView);

  void detachView();
}
