package io.zhengqinyu.behaviour.command.po;

import java.util.ArrayList;
import java.util.List;

import io.zhengqinyu.behaviour.command.abst.Command;
import io.zhengqinyu.behaviour.command.impl.BakeChickenWingCommand;

public class Waiter {
	private List<Command> orders = new ArrayList<Command>();

	public void setOrder(Command command) {
		if (command instanceof BakeChickenWingCommand) {
			System.out.println("服务员 ： 鸡翅没有了，请点别的烧烤吧。");
		} else {
			orders.add(command);
			System.out.println("增加订单：" + command.getName());
		}
	}

	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("取消订单：" + command.getName());

	}

	public void notifyBegin() {
		for (Command command : orders) {
			command.excuteCommand();
		}
	}
}
