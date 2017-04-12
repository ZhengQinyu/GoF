package io.zhengqinyu.structure.adapter.impl;

import io.zhengqinyu.structure.adapter.abst.ChinesePlayer;
import io.zhengqinyu.structure.adapter.abst.Player;

public class Translator extends Player {

	private ChinesePlayer chinesePlayer;

	public Translator(String name) {
		super(name);
		chinesePlayer = new ChineseCenters(name);
	}

	@Override
	public void attack() {
		chinesePlayer.attack_chinese();
	}

	@Override
	public void defense() {
		chinesePlayer.defense_chinese();
	}

}
