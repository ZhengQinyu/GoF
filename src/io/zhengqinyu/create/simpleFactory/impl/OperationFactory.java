package io.zhengqinyu.create.simpleFactory.impl;

import io.zhengqinyu.create.simpleFactory.abst.Operation;
import io.zhengqinyu.create.simpleFactory.impl.OperationAdd;
import io.zhengqinyu.create.simpleFactory.impl.OperationDiv;
import io.zhengqinyu.create.simpleFactory.impl.OperationMul;
import io.zhengqinyu.create.simpleFactory.impl.OperationSub;

/**
 * Created by ZhengQinyu on 2016/7/1.
 */
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+" :
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
