package io.zhengqinyu.behaviour.observer.intf;

import java.util.ArrayList;
import java.util.List;

import io.zhengqinyu.behaviour.observer.abst.Observer;

public class Boss implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	private String action;

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyBegin() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public String getSubjectStatus() {
		return action;
	}

	@Override
	public void setSubjectStatus(String action) {
		this.action = action;
	}
}
