package io.zhengqinyu.structure.proxy;

import io.zhengqinyu.structure.proxy.impl.Proxy;
import io.zhengqinyu.structure.proxy.po.SchoolGirl;

public class Client {
	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("李娇娇");
		
		Proxy daili = new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
