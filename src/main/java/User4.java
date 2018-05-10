
/**
 * JAVA 值传输机制
 */

public class User4 {
    int id;
    String name;
    String pwd;

    public User4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer01(User4 u) {
        u.name = "高小八";
    }

    public void testParameterTransfer02(User4 u12) {
        u12 = new User4(100, "高小白");
    }

    public static void main(String[] args) {
        User4 u1 = new User4(100, "高小七");
        u1.testParameterTransfer01(u1);
        System.out.println(u1.name);
        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
