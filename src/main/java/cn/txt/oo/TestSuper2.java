/**
 * 所有构造方面里面调用super方法，第一句。
 * 构造方法里面，调用super(),先去调用父类方法，后子类方法：
 * 创建FatherClsss
 * 创建ChildClsss
 */
package cn.txt.oo;

public class TestSuper2 {
    public static void main(String[] args) {
        new ChildClass2();
    }

}

class FatherClass2 {
    public FatherClass2() {
        super();
        System.out.println("创建FatherClsss");
    }

}

class ChildClass2 extends FatherClass2 {
    public ChildClass2() {
        super();
        System.out.println("创建ChildClsss");
    }
}
