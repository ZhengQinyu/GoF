package io.zhengqinyu.behaviour.chainResponsibility;

import io.zhengqinyu.behaviour.chainResponsibility.impl.CommonManager;
import io.zhengqinyu.behaviour.chainResponsibility.impl.GeneralManager;
import io.zhengqinyu.behaviour.chainResponsibility.impl.Majordomo;
import io.zhengqinyu.behaviour.chainResponsibility.po.Request;

public class Client {
	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("金利");
		Majordomo zongjian = new Majordomo("宗剑");
		GeneralManager zongjingli = new GeneralManager("钟精励");
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zongjingli);

		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		jinli.requestApplicantions(request);

		Request request1 = new Request();
		request1.setRequestType("请假");
		request1.setRequestContent("小菜请假");
		request1.setNumber(4);
		jinli.requestApplicantions(request1);

		Request request2 = new Request();
		request2.setRequestType("加薪");
		request2.setRequestContent("小菜请求加薪");
		request2.setNumber(500);
		jinli.requestApplicantions(request2);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(1000);
		jinli.requestApplicantions(request3);

	}
}
