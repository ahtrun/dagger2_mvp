package com.ahtrun.mvpfdf.di.module;

import com.ahtrun.mvpfdf.MyApplication;

import dagger.Module;

/**
 * Author: lhp
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
