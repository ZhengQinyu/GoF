package io.zhengqinyu.behaviour.command.impl;

import io.zhengqinyu.behaviour.command.abst.Command;
import io.zhengqinyu.behaviour.command.po.Barbecuer;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		super.setName("烤羊肉串");
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}

}
