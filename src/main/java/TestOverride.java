public class TestOverride {
    //测试方法重载
    public static void main(String[] args) {
        TestOverride.add(10, 20);
        TestOverride.add(10, 20, 30);
        TestOverride.add(10, 20.0, 30);
        TestOverride.add(10, 20, 30.1);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    //参数个数不一样
    public static int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
        return sum;
    }

    //参数类型不一样
    public static double add(int a, double b, int c) {
        double sum = a + b + c;
        System.out.println(sum);
        return sum;
    }

    //参数顺序不一样
    public static double add(int a, int b, double c) {
        double sum = a + b + c;
        System.out.println(sum);
        return sum;
    }

    //注意参数名称不一样和返回值不一样不构成重载

}
