package io.zhengqinyu.behaviour.visitor.impl;

import io.zhengqinyu.behaviour.visitor.abst.Action;

public class Success extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(
				String.format("%s在%s时，背后多半有一个伟大的女人。", man.getClass().getSimpleName(), this.getClass().getSimpleName()));
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(String.format("%s在%s时，背后大多有一个不成功的男人。", woman.getClass().getSimpleName(),
				this.getClass().getSimpleName()));
	}

}
