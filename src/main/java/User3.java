//静态初始化块 static


public class User3 {
    int id;
    String name;
    String pwd;
    static String company;

    static {
        System.out.println("执行类的初始化工作");  //加载好类以后， 先执行的语句
        company = "博彦科技";
    }

    public static void main(String[] args) {
        System.out.println(company);
    }
}
