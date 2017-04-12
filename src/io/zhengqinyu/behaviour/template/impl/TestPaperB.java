package io.zhengqinyu.behaviour.template.impl;

import io.zhengqinyu.behaviour.template.po.TestPaper;

public class TestPaperB extends TestPaper {

	@Override
	public String answer1() {
		return "c";
	}

	@Override
	public String answer2() {
		return "a";
	}

	@Override
	public String answer3() {
		return "a";
	}
}
