package io.zhengqinyu.behaviour.visitor.po;

import java.util.ArrayList;
import java.util.List;

import io.zhengqinyu.behaviour.visitor.abst.Action;
import io.zhengqinyu.behaviour.visitor.abst.Person;

public class ObjectStructure {
	private List<Person> persons = new ArrayList<Person>();

	public void attach(Person person) {
		persons.add(person);
	}

	public void detach(Person person) {
		persons.remove(person);
	}

	public void display(Action visitor) {
		for (Person person : persons) {
			person.accept(visitor);
		}
	}
}
