/**
 * 测试封装
 */
package oo;

public class TestEncapsulation {
    public static void main(String[] args) {
        TestPerson person = new TestPerson();
        person.setId(100);
        person.setAge(99);
        System.out.println(person.getAge());

    }
}
