package io.zhengqinyu.behaviour.mediator.abst;

public abstract class Country {
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
}
