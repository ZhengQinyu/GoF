package io.zhengqinyu.behaviour.state.impl;

import io.zhengqinyu.behaviour.state.abst.State;
import io.zhengqinyu.behaviour.state.po.Work;

public class AfternoonState extends State {

	@Override
	public void writeProgram(Work work) {
		if (work.getHour() < 17) {
			System.out.println("当前时间：" + work.getHour() + "点  下午状态还不错，继续努力");
		} else {
			work.setState(new EveningState());
			work.writePrograme();
		}
	}

}
