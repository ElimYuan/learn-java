/**
 * 数组的遍历
 */
package array;

public class TestForEoch {
    public static void main(String[] args) {
        int[] arry1 = new int[10];

        for (int i = 0; i < arry1.length; i++) {
            arry1[i] = i * 100;
        }
        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
        System.out.println("###################");
        //for eoch 读取元素的值，不能改变元素的值
        for (int m : arry1) {               //（int 类型， 声明一个变量，循环数据arry1, 把每个数组取出来后赋值给m ）
            System.out.println(m);
        }


        String[] a = {"aaaa", "bbbb", "cccc"}; //静态初始化数据遍历打印
        for (String n : a) {
            System.out.println(n);
        }

    }
}
