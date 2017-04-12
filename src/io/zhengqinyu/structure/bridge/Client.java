package io.zhengqinyu.structure.bridge;

import io.zhengqinyu.structure.bridge.abst.PhoneBrand;
import io.zhengqinyu.structure.bridge.impl.HuaWeiPhone;
import io.zhengqinyu.structure.bridge.impl.LETVPhone;
import io.zhengqinyu.structure.bridge.impl.PhoneGame;
import io.zhengqinyu.structure.bridge.impl.PhoneMusic;

public class Client {
	public static void main(String[] args) {
		PhoneBrand phone; 
		
		phone = new HuaWeiPhone();
		phone.setPhoneSoftware(new PhoneGame());
		phone.run();
		
		phone = new LETVPhone();
		phone.setPhoneSoftware(new PhoneGame());
		phone.run();
		
		phone.setPhoneSoftware(new PhoneMusic());
		phone.run();
		
		
	}
}
