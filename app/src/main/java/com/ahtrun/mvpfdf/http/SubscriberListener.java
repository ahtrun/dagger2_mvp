package com.ahtrun.mvpfdf.http;

public interface SubscriberListener<T> {
    void onNext(T t);

    void onError(String e, int code);

    void onComplated();
}
