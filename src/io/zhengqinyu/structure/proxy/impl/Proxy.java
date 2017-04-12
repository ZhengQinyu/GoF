package io.zhengqinyu.structure.proxy.impl;

import io.zhengqinyu.structure.proxy.intf.IGiveGift;
import io.zhengqinyu.structure.proxy.po.SchoolGirl;

public class Proxy implements IGiveGift {
	
	Pursuit gg;
	
	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}

	@Override
	public void giveDolls() {
		gg.giveDolls();
	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}

}
