package io.zhengqinyu.structure.flyweight.impl;

import java.util.Hashtable;

import io.zhengqinyu.structure.flyweight.intf.Website;

public class WebsiteFactory {
	private Hashtable<String, Website> flyweights = new Hashtable<String, Website>();

	public Website getWebsiteCategory(String key) {
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebsite(key));
		}
		return flyweights.get(key);
	}

	public int getWebsiteCount() {
		return flyweights.size();
	}
}
