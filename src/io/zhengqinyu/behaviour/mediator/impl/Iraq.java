package io.zhengqinyu.behaviour.mediator.impl;

import io.zhengqinyu.behaviour.mediator.abst.Country;
import io.zhengqinyu.behaviour.mediator.abst.UnitedNations;

public class Iraq extends Country {

	public Iraq(UnitedNations mediator) {
		super(mediator);
	}

	public void declare(String message) {
		mediator.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("伊拉克获得对方的信息：" + message);
	}
}
