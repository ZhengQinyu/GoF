package io.zhengqinyu.create.factoryMethod.impl;

import io.zhengqinyu.create.factoryMethod.abst.Operation;
import io.zhengqinyu.create.factoryMethod.intf.IFactory;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class MulFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}
