package io.zhengqinyu.behaviour.visitor.impl;

import io.zhengqinyu.behaviour.visitor.abst.Action;

public class Failure extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(
				String.format("%s在%s时，闷头喝酒，说也不用劝。", man.getClass().getSimpleName(), this.getClass().getSimpleName()));
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(
				String.format("%s在%s时，眼泪汪汪，谁也劝不了。", woman.getClass().getSimpleName(), this.getClass().getSimpleName()));

	}

}
