/**
 * 测试封装 Set,get 方法
 * 由于privage 属性，私有化，需要set, get方法
 */
package oo;

public class TestPerson {
    private int id;
    private String name;
    private int age;
    private boolean man;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("请输入正常的年龄：");
        }

    }

    public int getAge() {
        return this.age;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public boolean isMan() {
        return this.man;
    }
}
