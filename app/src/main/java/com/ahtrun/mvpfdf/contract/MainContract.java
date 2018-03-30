package com.ahtrun.mvpfdf.contract;

import com.ahtrun.mvpfdf.base.BasePresenter;
import com.ahtrun.mvpfdf.base.BaseView;

/**
 * Author: lhp
 * Date: 2018/2/23
 * Desc:
 */
public interface MainContract {
  interface IView extends BaseView{
      void setData(String str);
  }
  interface Presenter extends BasePresenter<IView>{
    void loadData();
  }
}
