package io.zhengqinyu.create.factoryMethod.intf;

import io.zhengqinyu.create.factoryMethod.abst.Operation;

/**
 * Created by ZhengQinyu on 2016/7/1.
 */
public interface IFactory {
    Operation CreateOperation();
}
