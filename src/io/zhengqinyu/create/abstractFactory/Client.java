package io.zhengqinyu.create.abstractFactory;

import io.zhengqinyu.create.abstractFactory.impl.SqlServerFactory;
import io.zhengqinyu.create.abstractFactory.intf.IDepartment;
import io.zhengqinyu.create.abstractFactory.intf.IFactory;
import io.zhengqinyu.create.abstractFactory.intf.IUser;
import io.zhengqinyu.create.abstractFactory.po.Department;
import io.zhengqinyu.create.abstractFactory.po.User;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        IFactory factory = new SqlServerFactory();
        IUser iUser = factory.createUser();
        iUser.insertUser(user);
        iUser.getUser(1);

        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insertDepartment(department);
        iDepartment.getDepartment(1);
    }
}
