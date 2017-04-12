package io.zhengqinyu.behaviour.mediator;

import io.zhengqinyu.behaviour.mediator.impl.Iraq;
import io.zhengqinyu.behaviour.mediator.impl.USA;
import io.zhengqinyu.behaviour.mediator.impl.UnitedNationsSecurityCouncil;

public class Client {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);

		UNSC.setCollaague1(c1);
		UNSC.setCollaague2(c2);
		c1.declare("不转研制核武器，否则发动战争！");
		c2.declare("我们没有核武器，也不怕侵略！");
	}
}
