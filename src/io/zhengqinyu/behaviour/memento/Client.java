package io.zhengqinyu.behaviour.memento;

import io.zhengqinyu.behaviour.memento.po.Caretaker;
import io.zhengqinyu.behaviour.memento.po.Originator;

public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();

		o.setState("On");
		o.show();

		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		o.setState("Off");
		o.show();
		
		o.setMemento(c.getMemento());
		o.show();
	}
}
