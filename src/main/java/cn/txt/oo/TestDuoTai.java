/**
 * 多态指的是同一个方法调用，对于对象不同可能会有不同的行为。
 * <p>
 * 3个必要条件： 继承，方法重写，父类引用指向子类对象
 * 父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了
 * 父类引用指向子类对象
 */


package cn.txt.oo;

public class TestDuoTai {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        animalCry(a);
        Animal1 d = new Dog1();  //父类引用指向子类对象   // 向上转型
        animalCry(d);// 以 Cat 对象调用 animalCry 方法
        animalCry(new Cat1()); //以 Cat 对象调用 animalCry 方法
    }

    static void animalCry(Animal1 a) { //父类引用指向子类对象
        a.shout();
    }

}


class Animal1 {
    public void shout() {
        System.out.println("叫了一声");
    }
}

class Dog1 extends Animal1 {
    public void shout() {
        System.out.println("汪汪汪！");
    }

}

class Cat1 extends Animal1 {
    public void shout() {
        System.out.println("喵喵喵！");
    }

}