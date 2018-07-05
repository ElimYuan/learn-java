/**
 * 数组
 */

package array;

public class TestShuzu {
    public static void main(String[] args) {
        int[] arr01 = new int[10]; //索引下班【0， length -1】:0,1,2,3,4,5,6,7,8,9 声明数组，并分配空间
        String[] arr02;
//        User[] arr03 = new User[3];

        arr01[0] = 13; //给数组赋值
        arr01[1] = 15;
        arr01[2] = 20;
//        arr01[10] =100;//超出arr01.length<10范围，不能复制
        for (int i = 0; i < arr01.length; i++) {
            arr01[i] = 100 * i;
        }
        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);

        }

        User[] arr03 = new User[3];
        arr03[0] = new User(1001, "001Elim");
        arr03[1] = new User(1002, "002Elim");
        arr03[2] = new User(1003, "003Elim");

        for (int i = 0; i < arr03.length; i++) {
            System.out.println(arr03[i].getName());
        }
    }
}


class User {
    private int id;
    private String name;

    public User(int id, String name) {
        super();
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
