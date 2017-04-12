package io.zhengqinyu.behaviour.iterator.impl;

import io.zhengqinyu.behaviour.iterator.abst.Iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getAt(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.getCount()) {
			ret = aggregate.getAt(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.getCount();
	}

	@Override
	public Object currentItem() {
		return aggregate.getAt(current);
	}

}
