package io.zhengqinyu.behaviour.visitor.impl;

import io.zhengqinyu.behaviour.visitor.abst.Action;
import io.zhengqinyu.behaviour.visitor.abst.Person;

public class Man extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

}
