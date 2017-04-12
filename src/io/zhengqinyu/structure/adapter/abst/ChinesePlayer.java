package io.zhengqinyu.structure.adapter.abst;

public abstract class ChinesePlayer {
	protected String name;

	public ChinesePlayer(String name){
		this.name = name;
	}

	public abstract void attack_chinese();

	public abstract void defense_chinese();
}
