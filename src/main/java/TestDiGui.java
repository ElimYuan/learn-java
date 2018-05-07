//测试递归

public class TestDiGui {
    public static void main(String[] args) {
        TestDiGui.TestFn(5);
        System.out.println(TestDiGui.TestFn(5));
    }

    public static int TestFn(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * TestFn(n - 1);
        }
    }
}
