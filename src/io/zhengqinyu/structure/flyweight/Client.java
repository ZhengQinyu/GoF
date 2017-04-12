package io.zhengqinyu.structure.flyweight;

import io.zhengqinyu.structure.flyweight.impl.WebsiteFactory;
import io.zhengqinyu.structure.flyweight.intf.Website;
import io.zhengqinyu.structure.flyweight.po.User;

public class Client {
	public static void main(String[] args) {
		WebsiteFactory f = new WebsiteFactory();

		Website fx = f.getWebsiteCategory("产品展示");
		fx.use(new User("菜鸟"));

		Website fy = f.getWebsiteCategory("产品展示");
		fy.use(new User("老鸟"));

		Website fz = f.getWebsiteCategory("产品展示");
		fz.use(new User("娇娇"));

		Website fa = f.getWebsiteCategory("博客");
		fa.use(new User("老甲"));

		Website fb = f.getWebsiteCategory("博客");
		fb.use(new User("老乙"));

		Website fc = f.getWebsiteCategory("博客");
		fc.use(new User("老丙"));

		System.out.println("网站分类总数是：" + f.getWebsiteCount());

	}
}
