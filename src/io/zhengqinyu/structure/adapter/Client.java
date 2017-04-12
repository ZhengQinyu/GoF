package io.zhengqinyu.structure.adapter;

import io.zhengqinyu.structure.adapter.abst.Player;
import io.zhengqinyu.structure.adapter.impl.Forwards;
import io.zhengqinyu.structure.adapter.impl.Guards;
import io.zhengqinyu.structure.adapter.impl.Translator;

public class Client {
	public static void main(String[] args) {
		Player b = new Forwards("巴蒂尔");
		b.attack();

		Player m = new Guards("麦克格雷迪");
		m.attack();

		Player ym = new Translator("姚明");

		ym.attack();
		ym.defense();
	}
}
