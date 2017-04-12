package io.zhengqinyu.create.factoryMethod;

import io.zhengqinyu.create.factoryMethod.abst.Operation;
import io.zhengqinyu.create.factoryMethod.impl.AddFactory;
import io.zhengqinyu.create.factoryMethod.intf.IFactory;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class Client {
    public static void main(String[] args) {
        double number_a = 20,number_b = 5;
        IFactory factory = new AddFactory();
        Operation operation = factory.CreateOperation();
        operation.setNumber_a(number_a);
        operation.setNumber_b(number_b);
        System.out.println(operation.getResult());
    }
}
