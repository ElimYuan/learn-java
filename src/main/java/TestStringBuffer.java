
/**
 * String 字符串常量
 * StringBuffer  字符串变量（线程安全）
 * StringBuilder  字符串变量（非线程安全）
 * 三者在执行速度方面的比较：StringBuilder >  StringBuffer  >  String
 * 1.如果要操作少量的数据用 = String
 * 2.单线程操作字符串缓冲区 下操作大量数据 = StringBuilder（线程非安全）
 * 3.多线程操作字符串缓冲区 下操作大量数据 = StringBuffer（有buff就是安全，这个是线程安全的）
 */

public class TestStringBuffer {

    String name;
    static StringBuffer international;


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello"); //向StringBuffer中付值的时候可以通过它的append方法.字符串连接操作中StringBuffer的效率要比String高:
        TestStringBuffer.TestStringBuffer();
        System.out.println(sb);

        international.append("我来给StringBuffer赋值");

    }

    public TestStringBuffer(StringBuffer international, String name) {
        this.international = international;
        this.name = name;
    }


    public static void TestStringBuffer() {
        System.out.println("我要测试StringBuffer" + international);

    }

}
