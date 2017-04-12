package io.zhengqinyu.behaviour.command.abst;

import io.zhengqinyu.behaviour.command.po.Barbecuer;

public abstract class Command {
	protected Barbecuer receiver;

	private String name;

	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}

	public abstract void excuteCommand();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
