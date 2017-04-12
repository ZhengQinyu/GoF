package io.zhengqinyu.create.abstractFactory.impl;

import io.zhengqinyu.create.abstractFactory.intf.IDepartment;
import io.zhengqinyu.create.abstractFactory.intf.IFactory;
import io.zhengqinyu.create.abstractFactory.intf.IUser;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
