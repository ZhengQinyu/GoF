package io.zhengqinyu.create.simpleFactory;

import io.zhengqinyu.create.simpleFactory.abst.Operation;
import io.zhengqinyu.create.simpleFactory.impl.OperationFactory;

/**
 * Created by ZhengQinyu on 2016/7/1.
 * 简单工厂模式不属于GoF中的
 */
public class Client {

    public static void main(String[] args) {
        double number_a = 20,number_b = 5;
        Operation operation;
        operation = OperationFactory.createOperation("+");
        operation.setNumber_a(number_a);
        operation.setNumber_b(number_b);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperation("-");
        operation.setNumber_a(number_a);
        operation.setNumber_b(number_b);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperation("*");
        operation.setNumber_a(number_a);
        operation.setNumber_b(number_b);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperation("/");
        operation.setNumber_a(number_a);
        operation.setNumber_b(number_b);
        System.out.println(operation.getResult());
    }
}
