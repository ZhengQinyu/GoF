package io.zhengqinyu.create.abstractFactory.impl;

import io.zhengqinyu.create.abstractFactory.intf.IDepartment;
import io.zhengqinyu.create.abstractFactory.po.Department;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("在 Access 中给 Department 添加一条记录！");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("从 Access 根据id获得一条 Department 记录！");
        return null;
    }
}
