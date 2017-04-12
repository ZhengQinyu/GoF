package io.zhengqinyu.create.prototype;

/**
 * Created by ZhengQinyu on 2015/11/15.
 */
public class Client {

    public static void main(String[] args) {
        testShallowClone();
        System.out.println("+++++++++以下是深拷贝的例子++++");
        testDeepClone();
    }

    private static void testShallowClone(){
        Student student0 = new Student();
        student0.setName("小郑");
        student0.setSex("男");
        student0.setAge(10);
        student0.getTeacher().setName("杨老师");


        Student student1 = student0.shallowClone();
        student1.setName("小王");
        student1.setAge(11);
        student1.getTeacher().setName("蔡老师");

        Student student2 = student0.shallowClone();
        student2.setName("小白");
        student2.setAge(12);
        student2.getTeacher().setName("林老师");//此处会将三人的教师全部修改

        student0.display();
        student1.display();
        student2.display();
    }

    public static void testDeepClone(){
        Student student0 = new Student();
        student0.setName("小郑");
        student0.setSex("男");
        student0.setAge(10);
        student0.getTeacher().setName("杨老师");


        Student student1 = student0.deepClone();
        student1.setName("小王");
        student1.setAge(11);
        student1.getTeacher().setName("蔡老师");

        Student student2 = student0.deepClone();
        student2.setName("小白");
        student2.setAge(12);
        student2.getTeacher().setName("林老师");

        student0.display();
        student1.display();
        student2.display();
    }
}
