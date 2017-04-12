package io.zhengqinyu.create.abstractFactory.intf;

/**
 * Created by ZhengQinyu on 2016/7/2.
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
