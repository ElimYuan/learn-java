public class TestMethod {
    public static void main(String[] args) {

//通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.testPrint();
        tm.add(3, 4, 5);
    }

    void testPrint() {   //未加public static , 不能直接调用，需要new 一个实例
        System.out.println("方法调用学习");
    }

    int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.print(sum);
        return sum;
    }
}
