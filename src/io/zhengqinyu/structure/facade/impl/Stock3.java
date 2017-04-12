package io.zhengqinyu.structure.facade.impl;

import io.zhengqinyu.structure.facade.intf.Good;

public class Stock3 implements Good{

	@Override
	public void sell() {
		System.out.println("股票3卖出");
	}

	@Override
	public void bug() {
		System.out.println("股票3买入");
	}
}
