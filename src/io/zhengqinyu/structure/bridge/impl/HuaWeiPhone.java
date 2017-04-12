package io.zhengqinyu.structure.bridge.impl;

import io.zhengqinyu.structure.bridge.abst.PhoneBrand;

public class HuaWeiPhone extends PhoneBrand{

	@Override
	public void run() {
		System.out.println("我是华为手机");
		software.run();
	}

}
