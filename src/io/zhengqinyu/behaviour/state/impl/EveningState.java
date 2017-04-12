package io.zhengqinyu.behaviour.state.impl;

import io.zhengqinyu.behaviour.state.abst.State;
import io.zhengqinyu.behaviour.state.po.Work;

public class EveningState extends State {

	@Override
	public void writeProgram(Work work) {
		if (work.isTaskFinished()) {
			work.setState(new RestState());
			work.writePrograme();
		} else {
			if (work.getHour() < 21) {
				System.out.println("当前时间：" + work.getHour() + "点  加班哦，疲累之极");
			} else {
				work.setState(new SleepingState());
				work.writePrograme();
			}
		}
	}
}
