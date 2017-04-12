package io.zhengqinyu.behaviour.chainResponsibility.impl;

import io.zhengqinyu.behaviour.chainResponsibility.abst.Manager;
import io.zhengqinyu.behaviour.chainResponsibility.po.Request;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplicantions(Request request) {
		if (request.getRequestType().equals("请假")) {
			System.out.println(
					String.format("%s : %s 数量 %d 被批准", name, request.getRequestContent(), request.getNumber()));
		} else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
			System.out.println(
					String.format("%s : %s 数量 %d 被批准", name, request.getRequestContent(), request.getNumber()));
		} else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
			System.out.println(
					String.format("%s : %s 数量 %d 再说吧", name, request.getRequestContent(), request.getNumber()));
		}
	}

}
