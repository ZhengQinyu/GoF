package io.zhengqinyu.structure.decorator;

import io.zhengqinyu.structure.decorator.impl.BigTrouser;
import io.zhengqinyu.structure.decorator.impl.LeatherShoes;
import io.zhengqinyu.structure.decorator.impl.Sneakers;
import io.zhengqinyu.structure.decorator.impl.Suit;
import io.zhengqinyu.structure.decorator.impl.TShirts;
import io.zhengqinyu.structure.decorator.impl.Tie;
import io.zhengqinyu.structure.decorator.po.Person;

public class Client {
	public static void main(String[] args) {
		Person xm = new Person("小明");
		
		System.out.println("第一种装饰");
		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		pqx.decorate(xm);
		kk.decorate(pqx);
		dtx.decorate(kk);
		dtx.show();
		
		
		System.out.println("第二种装饰");
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();
		
		px.decorate(xm);
		ld.decorate(px);
		xz.decorate(ld);
		xz.show();
		
	}
}
