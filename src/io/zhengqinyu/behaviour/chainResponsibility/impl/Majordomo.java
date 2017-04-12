package io.zhengqinyu.behaviour.chainResponsibility.impl;

import io.zhengqinyu.behaviour.chainResponsibility.abst.Manager;
import io.zhengqinyu.behaviour.chainResponsibility.po.Request;

public class Majordomo extends Manager{

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplicantions(Request request) {
		if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
			System.out.println(
					String.format("%s : %s 数量 %d 被批准", name, request.getRequestContent(), request.getNumber()));
		} else {
			if (supperior != null) {
				supperior.requestApplicantions(request);
			}
		}
	}

}
