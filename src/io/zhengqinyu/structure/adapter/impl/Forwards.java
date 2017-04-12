package io.zhengqinyu.structure.adapter.impl;

import io.zhengqinyu.structure.adapter.abst.Player;

public class Forwards extends Player {
	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(String.format("前锋%s进攻", name));
	}

	@Override
	public void defense() {
		System.out.println(String.format("前锋%s防守", name));
	}

}
