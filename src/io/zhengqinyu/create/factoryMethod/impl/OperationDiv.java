package io.zhengqinyu.create.factoryMethod.impl;

import io.zhengqinyu.create.factoryMethod.abst.Operation;

/**
 * Created by ZhengQinyu on 2016/7/1.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if(getNumber_b() == 0){
            throw new RuntimeException("除数不能为零！");
        }
        return getNumber_a() / getNumber_b();
    }
}
