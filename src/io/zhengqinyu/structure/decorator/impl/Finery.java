package io.zhengqinyu.structure.decorator.impl;

import io.zhengqinyu.structure.decorator.po.Person;

public class Finery extends Person {
	private Person component;

	public void decorate(Person component) {
		this.component = component;
	}

	@Override
	public void show() {
		if (component != null) {
			component.show();
		}
	}
}
