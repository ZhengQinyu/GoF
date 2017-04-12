package io.zhengqinyu.structure.composite.impl;

import io.zhengqinyu.structure.composite.abst.Company;

public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
	}

	@Override
	public void remove(Company c) {
	}

	@Override
	public void display(int depth) {
		System.out.println(repeatChar('-', depth) + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + "公司财务收支管理！");
	}

}
