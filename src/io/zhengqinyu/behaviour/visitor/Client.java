package io.zhengqinyu.behaviour.visitor;

import io.zhengqinyu.behaviour.visitor.impl.Amativeness;
import io.zhengqinyu.behaviour.visitor.impl.Failure;
import io.zhengqinyu.behaviour.visitor.impl.Man;
import io.zhengqinyu.behaviour.visitor.impl.Success;
import io.zhengqinyu.behaviour.visitor.impl.Woman;
import io.zhengqinyu.behaviour.visitor.po.ObjectStructure;

public class Client {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());

		Success v1 = new Success();
		o.display(v1);

		Failure v2 = new Failure();
		o.display(v2);

		Amativeness v3 = new Amativeness();
		o.display(v3);
	}
}
