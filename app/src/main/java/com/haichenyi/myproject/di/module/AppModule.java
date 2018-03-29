package com.haichenyi.myproject.di.module;

import com.haichenyi.myproject.base.MyApplication;

import dagger.Module;

/**
 * Author: 海晨忆
 * Date: 2018/2/23
 * Desc:
 */
@Module
public class AppModule {
  private MyApplication application;

  public AppModule(MyApplication application) {
    this.application = application;
  }
}
