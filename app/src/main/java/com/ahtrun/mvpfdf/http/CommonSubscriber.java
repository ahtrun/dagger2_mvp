package com.ahtrun.mvpfdf.http;

import android.util.Log;

import com.ahtrun.mvpfdf.utils.EmptyUtils;

import rx.Subscriber;

public class CommonSubscriber<T> extends Subscriber<T> implements CancelSubscriberListener {

    private SubscriberListener mSubscriberListener;

    public CommonSubscriber(SubscriberListener mSubscriberListener) {
        this.mSubscriberListener = mSubscriberListener;
    }

    @Override
    public void onCompleted() {
        Log.i("lhp","lho");
        if (mSubscriberListener != null) {
            mSubscriberListener.onComplated();
        }
    }

    /**
     * 对错误进行统一处理
     * @param e Throwable
     */
    @Override
    public void onError(Throwable e)
    {
        e.printStackTrace();

        if (mSubscriberListener != null) {
            mSubscriberListener.onError(e.getMessage(), 0);
        }
    }

    /**
     * 将onNext方法中的返回结果交给Activity或Fragment自己处理
     * @param t 创建Subscriber时的泛型类型
     */
    @Override
    public void onNext(T t) {
        if (mSubscriberListener != null) {
            if (EmptyUtils.isNotNull(t)) {
                mSubscriberListener.onNext(t);
            }else{
                mSubscriberListener.onError("error",0);
            }
        }
    }

    @Override
    public void onCancelSubscriber() {
        if (!this.isUnsubscribed()) {
            this.unsubscribe();
        }
    }
}