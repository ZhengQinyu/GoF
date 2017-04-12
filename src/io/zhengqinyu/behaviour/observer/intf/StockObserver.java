package io.zhengqinyu.behaviour.observer.intf;

import io.zhengqinyu.behaviour.observer.abst.Observer;

public class StockObserver extends Observer {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(String.format("%s  %s 关闭股票行情，继续工作！", sub.getSubjectStatus(), name));
	}

}
