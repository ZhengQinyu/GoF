package io.zhengqinyu.structure.facade.po;

import io.zhengqinyu.structure.facade.impl.NationalDebt1;
import io.zhengqinyu.structure.facade.impl.Realty1;
import io.zhengqinyu.structure.facade.impl.Stock1;
import io.zhengqinyu.structure.facade.impl.Stock2;
import io.zhengqinyu.structure.facade.impl.Stock3;

public class Fund{
	private Stock1 gu1;
	
	private Stock2 gu2;
	
	private Stock3 gu3;
	
	private NationalDebt1 nd1;
	
	private Realty1 rt1;
	
	public Fund(){
		gu1 = new Stock1();
		gu2 = new Stock2();
		gu3 = new Stock3();
		nd1 = new NationalDebt1();
		rt1 = new Realty1();
	}
	
	public void buyFund(){
		gu1.bug();
		gu2.bug();
		gu3.bug();
		nd1.bug();
		rt1.bug();
	}
	
	public void sellFund(){
		gu1.sell();
		gu2.sell();
		gu3.sell();
		nd1.sell();
		rt1.sell();
	}
}
