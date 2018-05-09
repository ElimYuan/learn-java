public class TestThis {
    int a, b, c;

    public TestThis(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public TestThis(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void eat() {
        System.out.println("吃饭啦！");
    }

    public static void main(String[] args) {
        TestThis tt = new TestThis(1, 0);
        tt.eat();
    }
}
