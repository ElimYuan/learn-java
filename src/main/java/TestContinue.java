public class TestContinue {
    public static void main(String[] args) {
        //把100-150 之间不能被3整除的数输出，并且每行输出5个
        int count = 0;
        for (int i = 100; i <= 150; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.print(i + "\t");
            }
            count++; //每输出一个数， 计数器加1
            if (count % 5 == 0) { //并且每行输出5个,换行
                System.out.println();
            }
        }
    }
}
