package io.zhengqinyu.structure.composite.abst;

public abstract class Company {
	protected String name;

	public Company(String name) {
		this.name = name;
	}

	public abstract void add(Company c);

	public abstract void remove(Company c);

	public abstract void display(int depth);

	public abstract void lineOfDuty();

	protected String repeatChar(char c, int depth) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < depth; ++i) {
			str.append(c);
		}
		return str.toString();
	}
}
