package io.zhengqinyu.behaviour.observer;

import io.zhengqinyu.behaviour.observer.intf.Boss;
import io.zhengqinyu.behaviour.observer.intf.NBAObserver;
import io.zhengqinyu.behaviour.observer.intf.StockObserver;

public class Client {
	public static void main(String[] args) {

		Boss huhansan = new Boss();
		StockObserver tongshi1 = new StockObserver("魏管姹", huhansan);
		NBAObserver tongshi2 = new NBAObserver("易管查", huhansan);
		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);

		huhansan.detach(tongshi1);

		huhansan.setSubjectStatus("我胡汉三又回来了！");
		huhansan.notifyBegin();
	}
}
