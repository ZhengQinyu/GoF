package io.zhengqinyu.structure.bridge.impl;

import io.zhengqinyu.structure.bridge.abst.PhoneBrand;

public class LETVPhone extends PhoneBrand{

	@Override
	public void run() {
		System.out.println("我是乐视手机");
		software.run();
	}

}
