package io.zhengqinyu.behaviour.state.impl;

import io.zhengqinyu.behaviour.state.abst.State;
import io.zhengqinyu.behaviour.state.po.Work;

public class SleepingState extends State {

	@Override
	public void writeProgram(Work work) {
		System.out.println("当前时间：" + work.getHour() + "点 不行了，睡着了。");
	}

}
