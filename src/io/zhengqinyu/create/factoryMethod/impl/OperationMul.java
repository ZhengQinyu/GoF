package io.zhengqinyu.create.factoryMethod.impl;

import io.zhengqinyu.create.factoryMethod.abst.Operation;

/**
 * Created by ZhengQinyu on 2016/7/1.
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumber_a() * getNumber_b();
    }
}
