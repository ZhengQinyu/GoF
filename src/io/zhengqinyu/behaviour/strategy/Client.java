package io.zhengqinyu.behaviour.strategy;

import io.zhengqinyu.behaviour.strategy.impl.ConcreteStrategyA;
import io.zhengqinyu.behaviour.strategy.impl.ConcreteStrategyB;
import io.zhengqinyu.behaviour.strategy.impl.ConcreteStrategyC;
import io.zhengqinyu.behaviour.strategy.po.Context;

public class Client {
	public static void main(String[] args) {
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		context = new Context(new ConcreteStrategyB());
		context.contextInterface();

		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
}
