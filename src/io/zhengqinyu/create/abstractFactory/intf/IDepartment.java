package io.zhengqinyu.create.abstractFactory.intf;

import io.zhengqinyu.create.abstractFactory.po.Department;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public interface IDepartment {

    void insertDepartment(Department department);

    Department getDepartment(int id);
}
