package com.ahtrun.mvpfdf;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.ahtrun.mvpfdf.di.component.AppComponent;
import com.ahtrun.mvpfdf.di.component.DaggerAppComponent;
import com.ahtrun.mvpfdf.di.module.AppModule;
import com.ahtrun.mvpfdf.di.module.HttpModule;
import com.ahtrun.mvpfdf.utils.IInnerImageSetter;
import com.ahtrun.mvpfdf.utils.ImageUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.leakcanary.LeakCanary;

/**
 * Author: lhp
 * Date: 2018/2/23
 * Desc:
 */
public class MyApplication extends Application {
    private static MyApplication instance;
    private static AppComponent appComponent;

    public static MyApplication getInstance() {
        return instance;
    }

    private void setInstance(MyApplication instance) {
        MyApplication.instance = instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);
        initLeakCanary();
        ImageUtils.setImageSetter(new IInnerImageSetter() {
            @Override
            public <IMAGE extends ImageView> void doLoadImageUrl(@NonNull IMAGE view, @Nullable String url) {
                if (url.toLowerCase().contains(".gif")) {
                    Glide.with(getApplicationContext())
                            .load(url)
                            .asGif()
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(view);
                }else {
                    Glide.with(getApplicationContext())
                            .load(url)
                            .placeholder(R.mipmap.ic_launcher)
                            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                            .into(view);
                }
            }
        });
    }

    /**
     * 初始化内存检测工具
     */
    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }

    /**
     * 获取AppComponent.
     *
     * @return AppComponent
     */
    public static synchronized AppComponent getAppComponent() {
        if (null == appComponent) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(getInstance()))
                    .httpModule(new HttpModule())
                    .build();
        }
        return appComponent;
    }
}
