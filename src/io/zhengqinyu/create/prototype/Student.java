package io.zhengqinyu.create.prototype;

/**
 * Created by ZhengQinyu on 2015/11/15.
 */
public class Student implements Cloneable{

    private String name;

    private String sex;

    private Integer age;

    private Teacher teacher;

    public Student(){
        this.teacher = new Teacher();
    }

    public void display(){
        System.out.println(name+"-"+sex+"-"+age+"-teacher:"+teacher.getName());
    }

    //浅拷贝，复制对象属性（如上面的Teacher时只是复制引用而已）
    public Student shallowClone(){
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

    //深拷贝
    public Student deepClone(){
        Student student = null;
        try {
            student = (Student) super.clone();

            //将内部的复合对象也进行拷贝
            student.setTeacher(this.getTeacher().clone());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
