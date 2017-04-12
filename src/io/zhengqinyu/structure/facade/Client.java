package io.zhengqinyu.structure.facade;

import io.zhengqinyu.structure.facade.po.Fund;

public class Client {
	public static void main(String[] args) {
		Fund jijin = new Fund();
		jijin.buyFund();
		jijin.sellFund();
	}
}
