package io.zhengqinyu.create.factoryMethod.abst;

/**
 * Created by ZhengQinyu on 2016/7/1.
 */
public abstract class Operation {

    private double number_a;

    private double number_b;


    public double getNumber_b() {
        return number_b;
    }

    public void setNumber_b(double number_b) {
        this.number_b = number_b;
    }

    public double getNumber_a() {
        return number_a;
    }

    public void setNumber_a(double number_a) {
        this.number_a = number_a;
    }

    public abstract double getResult();
}
