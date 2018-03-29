package com.haichenyi.myproject.presenter;

import android.os.Handler;
import android.os.Message;

import com.haichenyi.myproject.base.BaseMvpPresenter;
import com.haichenyi.myproject.contract.MainContract;

import javax.inject.Inject;

/**
 * Author: 海晨忆
 * Date: 2018/2/23
 * Desc:
 */
public class MainPresenter extends BaseMvpPresenter<MainContract.IView>
    implements MainContract.Presenter {
  @Inject
  MainPresenter() {
  }

  @Override
  public void loadData() {
    baseView.showTipMsg("加载数据");
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(3000);
          handler.sendEmptyMessage(0);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }

  private Handler handler=new Handler(){
    @Override
    public void handleMessage(Message msg) {
      baseView.setData("林韩鹏测试");
    }
  };
}
