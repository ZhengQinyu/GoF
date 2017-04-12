package io.zhengqinyu.create.simpleFactory.impl;

import io.zhengqinyu.create.simpleFactory.abst.Operation;

/**
 * Created by ZhengQinyu on 2016/7/1.
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumber_a() + getNumber_b();
    }
}
