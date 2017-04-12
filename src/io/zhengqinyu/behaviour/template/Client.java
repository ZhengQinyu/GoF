package io.zhengqinyu.behaviour.template;

import io.zhengqinyu.behaviour.template.impl.TestPaperA;

public class Client {
	public static void main(String[] args) {
		System.out.println("学生甲抄的试卷：");
		TestPaperA studentA = new TestPaperA();
		studentA.TestQuestion1();
		studentA.TestQuestion2();
		studentA.TestQuestion3();
		System.out.println("-------------------------------------------------");
		System.out.println("学生乙抄的试卷：");
		TestPaperA studentB = new TestPaperA();
		studentB.TestQuestion1();
		studentB.TestQuestion2();
		studentB.TestQuestion3();
		
	}
}
