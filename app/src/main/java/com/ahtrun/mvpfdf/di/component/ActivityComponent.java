package com.ahtrun.mvpfdf.di.component;

import com.ahtrun.mvpfdf.di.module.ActivityModule;
import com.ahtrun.mvpfdf.di.scope.ActivityScope;
import com.ahtrun.mvpfdf.ui.MainActivity;

import dagger.Subcomponent;

/**
 * Author: lhp
 * Date: 2018/2/23
 * Desc:
 */
@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
  void inject(MainActivity mainActivity);
}
