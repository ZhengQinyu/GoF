package io.zhengqinyu.create.abstractFactory.impl;

import io.zhengqinyu.create.abstractFactory.intf.IUser;
import io.zhengqinyu.create.abstractFactory.po.User;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class AccessUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("在 Access 中给 User 添加一条记录！");
    }

    @Override
    public User getUser(int id) {
        System.out.println("从 Access 根据id获得一条 User 记录！");
        return null;
    }
}
