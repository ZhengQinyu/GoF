package io.zhengqinyu.create.prototype;

/**
 * Created by ZhengQinyu on 2015/11/15.
 */
public class Teacher implements Cloneable{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Teacher clone(){
        Teacher teacher = null;
        try {
            teacher = (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return teacher;
    }
}
