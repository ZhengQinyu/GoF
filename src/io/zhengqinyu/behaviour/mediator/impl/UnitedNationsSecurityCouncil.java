package io.zhengqinyu.behaviour.mediator.impl;

import io.zhengqinyu.behaviour.mediator.abst.Country;
import io.zhengqinyu.behaviour.mediator.abst.UnitedNations;

public class UnitedNationsSecurityCouncil extends UnitedNations {

	private USA collaague1;

	private Iraq collaague2;

	@Override
	public void declare(String message, Country colleague) {
		if (colleague == collaague1) {
			collaague2.getMessage(message);
		} else if (colleague == collaague2) {
			collaague1.getMessage(message);
		}
	}

	public void setCollaague1(USA collaague1) {
		this.collaague1 = collaague1;
	}

	public void setCollaague2(Iraq collaague2) {
		this.collaague2 = collaague2;
	}

}
