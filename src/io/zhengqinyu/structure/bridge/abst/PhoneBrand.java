package io.zhengqinyu.structure.bridge.abst;


/**
 * 手机品牌类
 * @author ZhengQinyu
 * @date 2016年7月7日 下午11:14:18
 */
public abstract class PhoneBrand {
	protected PhoneSoftware software;

	
	//开启手机软件
	public void setPhoneSoftware(PhoneSoftware software){
		this.software = software;
	}
	
	public abstract void run();
}
