package io.zhengqinyu.behaviour.visitor.abst;

import io.zhengqinyu.behaviour.visitor.impl.Man;
import io.zhengqinyu.behaviour.visitor.impl.Woman;

public abstract class Action {
	public abstract void getManConclusion(Man man);

	public abstract void getWomanConclusion(Woman woman);
	
	
}
