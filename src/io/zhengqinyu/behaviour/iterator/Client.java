package io.zhengqinyu.behaviour.iterator;

import io.zhengqinyu.behaviour.iterator.abst.Iterator;
import io.zhengqinyu.behaviour.iterator.impl.ConcreteAggregate;
import io.zhengqinyu.behaviour.iterator.impl.ConcreteIterator;

public class Client {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.add("大鸟");
		a.add("小菜");
		a.add("大行李");
		a.add("老外");
		a.add("公交内部员工");
		a.add("小偷");

		Iterator itr = new ConcreteIterator(a);
//		Object item = itr.first();
		while (!itr.isDone()) {
			System.out.println(itr.currentItem() + " 请买车票！");
			itr.next();
		}
	}
}
