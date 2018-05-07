//面向对象测试， 对象，类
public class TestObject {

    //属性（成员变量）
    int age;
    String name;
    int id;

    Computer comp;


    //方法
    public void study() {
        System.out.println("我在学习,使用电脑" + comp.band);
    }


    public void play() {
        System.out.println("我在玩耍");
    }

    //程序执行的入口，main
    public static void main(String[] args) {
        TestObject testObject = new TestObject();//创建一个对象
//        testObject.study();
//        testObject.play();
        testObject.age = 19;
        testObject.id = 2;
        testObject.name = "Elim";

        Computer c1 = new Computer();
        c1.band = "戴尔";
        testObject.comp = c1;
        testObject.study();
        testObject.play();

    }

    //构造方法， 用于创建这个类的对象。 无参的构造方法可以由系统自动创建
//    TestObject() {
//
//    }

    //一个java 文件中第二个类
    static class Computer {
        String band;
    }


}
