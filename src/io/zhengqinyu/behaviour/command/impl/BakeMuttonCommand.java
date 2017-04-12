package io.zhengqinyu.behaviour.command.impl;

import io.zhengqinyu.behaviour.command.abst.Command;
import io.zhengqinyu.behaviour.command.po.Barbecuer;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		super.setName("烤鸡翅");
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}

}
