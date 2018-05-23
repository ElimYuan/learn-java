package cn.txt.oo;

public class TestExtends {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "yuanbo";
        student.height = 90;
        student.major = "计算机";
        student.rest();
        System.out.println(student);
        Student student1 = new Student("茜茜", 6, "挖掘机");

        System.out.println(student1);
    }
}

class Person /*extends Object(默认) */ {
    String name;
    int height;

    public void rest() {
        System.out.println("休息一会");
    }

    public void study() {
        System.out.println("学习两小时");
    }
}

class Student extends Person {   //继承Person 类
    String major;

    public Student() {
        System.out.println();
    }

    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }

}




