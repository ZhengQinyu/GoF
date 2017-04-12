package io.zhengqinyu.behaviour.command;

import io.zhengqinyu.behaviour.command.abst.Command;
import io.zhengqinyu.behaviour.command.impl.BakeChickenWingCommand;
import io.zhengqinyu.behaviour.command.impl.BakeMuttonCommand;
import io.zhengqinyu.behaviour.command.po.Barbecuer;
import io.zhengqinyu.behaviour.command.po.Waiter;

public class Client {
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();

		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);

		Waiter girl = new Waiter();
		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand);

		girl.notifyBegin();

	}
}
