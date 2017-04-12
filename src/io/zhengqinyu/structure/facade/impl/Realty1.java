package io.zhengqinyu.structure.facade.impl;

import io.zhengqinyu.structure.facade.intf.Good;

public class Realty1 implements Good{

	@Override
	public void sell() {
		System.out.println("房地产1卖出");
	}

	@Override
	public void bug() {
		System.out.println("房地产1买入");
	}
}
