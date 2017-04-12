package io.zhengqinyu.behaviour.strategy.impl;

import io.zhengqinyu.behaviour.strategy.abst.Strategy;

public class ConcreteStrategyB extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("算法B实现");
	}

}
