package com.ahtrun.mvpfdf.di.component;

import com.ahtrun.mvpfdf.di.module.ActivityModule;
import com.ahtrun.mvpfdf.di.module.AppModule;
import com.ahtrun.mvpfdf.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author: lhp
 * Date: 2018/2/23
 * Desc:
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    ActivityComponent addSub(ActivityModule activityModule);
}
