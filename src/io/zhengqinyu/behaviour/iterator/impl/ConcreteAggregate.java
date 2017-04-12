package io.zhengqinyu.behaviour.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import io.zhengqinyu.behaviour.iterator.abst.Aggregate;
import io.zhengqinyu.behaviour.iterator.abst.Iterator;

public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int getCount() {
		return items.size();
	}

	public Object getAt(int index) {
		return items.get(index);
	}

	public void add(Object value) {
		items.add(value);
	}
}
