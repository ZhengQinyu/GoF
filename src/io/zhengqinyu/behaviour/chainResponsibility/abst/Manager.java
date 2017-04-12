package io.zhengqinyu.behaviour.chainResponsibility.abst;

import io.zhengqinyu.behaviour.chainResponsibility.po.Request;

public abstract class Manager {
	protected String name;

	protected Manager supperior;
	
	public Manager(String name) {
		this.name = name;
	}

	public void setSuperior(Manager supperior) {
		this.supperior = supperior;
	}
	
	public abstract void requestApplicantions(Request request);

}
