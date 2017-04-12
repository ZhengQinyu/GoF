package io.zhengqinyu.create.singleton.impl;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
