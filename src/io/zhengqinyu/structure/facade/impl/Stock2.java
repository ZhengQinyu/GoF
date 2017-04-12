package io.zhengqinyu.structure.facade.impl;

import io.zhengqinyu.structure.facade.intf.Good;

public class Stock2 implements Good{

	@Override
	public void sell() {
		System.out.println("股票2卖出");
	}

	@Override
	public void bug() {
		System.out.println("股票2买入");
	}

}
