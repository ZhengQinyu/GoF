package io.zhengqinyu.structure.composite.impl;

import java.util.ArrayList;
import java.util.List;

import io.zhengqinyu.structure.composite.abst.Company;

public class ConcreteCompany extends Company {

	private List<Company> children;

	public ConcreteCompany(String name) {
		super(name);
		children = new ArrayList<Company>();
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(repeatChar('-', depth) + name);
		for (Company one : children) {
			one.display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {
		for (Company one : children) {
			one.lineOfDuty();
		}
	}

}
