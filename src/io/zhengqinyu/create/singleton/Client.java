package io.zhengqinyu.create.singleton;

import io.zhengqinyu.create.singleton.impl.SingletonNewSafe;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class Client {

    public static void main(String[] args) {
        SingletonNewSafe singleton0 = SingletonNewSafe.getSingleton();
        SingletonNewSafe singleton1 = SingletonNewSafe.getSingleton();

        if(singleton0 == singleton1){
            System.out.println("相同的");
        }
    }
}
