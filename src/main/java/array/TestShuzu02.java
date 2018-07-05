/**
 * 数组的3个初始化
 * 1. 静态初始化
 * 2. 动态初始化
 * 3. 默认初始化
 */

package array;

public class TestShuzu02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1, 3, 9};

        User[] b = {new User(1001, "elim 1"),
                new User(1001, "elim 2"),
                new User(1001, "elim 3")};
        //默认初始化
        int[] c = new int[7];

        //动态初始化
        int[] d = new int[2];
        d[0] = 1;
        d[1] = 2;
    }
}
