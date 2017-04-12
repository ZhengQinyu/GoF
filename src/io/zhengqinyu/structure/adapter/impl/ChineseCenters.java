package io.zhengqinyu.structure.adapter.impl;

import io.zhengqinyu.structure.adapter.abst.ChinesePlayer;

public class ChineseCenters extends ChinesePlayer{
	public ChineseCenters(String name) {
		super(name);
	}

	@Override
	public void attack_chinese() {
		System.out.println(String.format("中国中锋%s进攻", name));
	}

	@Override
	public void defense_chinese() {
		System.out.println(String.format("中国中锋%s防守", name));
	}
}
