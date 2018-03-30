package com.ahtrun.mvpfdf.base;

import android.support.annotation.StringRes;

/**
 * Author:lhp
 * Date: 2018/2/23
 * Desc:
 */
public interface BaseView {
  void showTipMsg(String msg);

  void showTipMsg(@StringRes int msg);

  void showLoading();

  void hideLoading();

  void invalidToken();

  void myFinish();


}
