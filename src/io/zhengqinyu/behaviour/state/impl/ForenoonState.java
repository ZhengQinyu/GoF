package io.zhengqinyu.behaviour.state.impl;

import io.zhengqinyu.behaviour.state.abst.State;
import io.zhengqinyu.behaviour.state.po.Work;

public class ForenoonState extends State {

	@Override
	public void writeProgram(Work work) {
		if (work.getHour() < 12) {
			System.out.println("当前时间：" + work.getHour() + "点 上午工作，精神百倍");
		} else {
			work.setState(new NoonState());
			work.writePrograme();
		}
	}

}
