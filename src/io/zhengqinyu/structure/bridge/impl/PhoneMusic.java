package io.zhengqinyu.structure.bridge.impl;

import io.zhengqinyu.structure.bridge.abst.PhoneSoftware;

public class PhoneMusic extends PhoneSoftware{

	@Override
	public void run() {
		System.out.println("音乐播放器开始播放音乐！");
	}
	
}
