package io.zhengqinyu.structure.adapter.impl;

import io.zhengqinyu.structure.adapter.abst.Player;

public class Centers extends Player {
	public Centers(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(String.format("中锋%s进攻", name));
	}

	@Override
	public void defense() {
		System.out.println(String.format("中锋%s防守", name));
	}
}