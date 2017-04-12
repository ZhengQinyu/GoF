package io.zhengqinyu.create.abstractFactory.intf;

import io.zhengqinyu.create.abstractFactory.po.User;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public interface IUser {

    void insertUser(User user);

    User getUser(int id);
}
