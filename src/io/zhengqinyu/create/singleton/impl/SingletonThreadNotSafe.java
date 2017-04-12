package io.zhengqinyu.create.singleton.impl;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class SingletonThreadNotSafe {

    private static SingletonThreadNotSafe instance;

    private SingletonThreadNotSafe() {
    }

    public static SingletonThreadNotSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadNotSafe();
        }
        return instance;
    }
}
