package io.zhengqinyu.behaviour.observer.intf;

import io.zhengqinyu.behaviour.observer.abst.Observer;

public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyBegin();

	String getSubjectStatus();

	void setSubjectStatus(String action);
}
