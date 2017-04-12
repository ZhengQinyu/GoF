package io.zhengqinyu.behaviour.strategy.po;

import io.zhengqinyu.behaviour.strategy.abst.Strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void contextInterface() {
		strategy.algorithmInterface();
	}

}
