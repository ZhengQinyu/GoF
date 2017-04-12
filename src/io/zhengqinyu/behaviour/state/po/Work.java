package io.zhengqinyu.behaviour.state.po;

import io.zhengqinyu.behaviour.state.abst.State;
import io.zhengqinyu.behaviour.state.impl.ForenoonState;

public class Work {
	private State current;

	private double hour;

	private boolean taskFinished = false;

	public Work() {
		current = new ForenoonState();
	}

	public void setState(State state) {
		current = state;
	}

	public void writePrograme() {
		current.writeProgram(this);
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isTaskFinished() {
		return taskFinished;
	}

	public void setTaskFinished(boolean taskFinished) {
		this.taskFinished = taskFinished;
	}

}
