package io.zhengqinyu.create.singleton.impl;


/**
 * Created by ZhengQinyu on 2016/7/2.
 * 在JDK1.5之后，双重检查锁定才能够正常达到线程安全的单例效果。
 */
public class SingletonNewSafe {

    private volatile static SingletonNewSafe instance;

    private SingletonNewSafe() {
    }

    public static SingletonNewSafe getSingleton() {
        if (instance == null) {
            synchronized (SingletonNewSafe.class) {
                if (instance == null) {
                    instance = new SingletonNewSafe();
                }
            }
        }
        return instance;
    }
}