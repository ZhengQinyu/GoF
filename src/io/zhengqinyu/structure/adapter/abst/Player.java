package io.zhengqinyu.structure.adapter.abst;



/**
 * @author ZhengQinyu
 * @date 2016年7月7日 下午10:35:49
 */
public abstract class Player {
	protected String name;
	
	public Player(String name){
		this.name = name;
	}
	
	public abstract void attack();
	
	public abstract void defense();
}
