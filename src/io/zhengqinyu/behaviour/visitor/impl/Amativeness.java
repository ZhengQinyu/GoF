package io.zhengqinyu.behaviour.visitor.impl;

import io.zhengqinyu.behaviour.visitor.abst.Action;

public class Amativeness extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(
				String.format("%s在%s时，凡事不懂也要装懂。", man.getClass().getSimpleName(), this.getClass().getSimpleName()));

	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(
				String.format("%s在%s时，遇事懂也装作不懂。", woman.getClass().getSimpleName(), this.getClass().getSimpleName()));

	}

}
