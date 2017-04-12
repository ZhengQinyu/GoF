package io.zhengqinyu.behaviour.mediator.impl;

import io.zhengqinyu.behaviour.mediator.abst.Country;
import io.zhengqinyu.behaviour.mediator.abst.UnitedNations;

public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
	}

	public void declare(String message) {
		mediator.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("美国获得对方的信息：" + message);
	}
}
