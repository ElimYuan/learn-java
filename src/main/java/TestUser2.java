public class TestUser2 {
    int id;
    String name;
    String pwd;

    static String company = "北京尚学堂";

    public TestUser2(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public TestUser2(int id, String name, String pwd) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        System.out.print(TestUser2.company); //非静态方法里面可以调用静态方法
    }

    public void login() {
        System.out.println("登录" + company);
    }

    public static void setCompany(String company) {
        TestUser2.company = company;
    }

    public static void printCompany() {
        System.out.println(company);
        setCompany("Test");
    }

    public static void main(String[] args) {
//        TestUser2 tu_Id_Name = new TestUser2(2, "elim");
//        TestUser2 tu_Id_Name_Pas = new TestUser2(1, "yuanbo", "password");
//        System.out.println(tu_Id_Name);
//        System.out.println(tu_Id_Name_Pas);
        System.out.print(TestUser2.company); //静态方法里面可调用静态变量
        TestUser2.printCompany();//静态方法可直接调用静态方法， 静态方法不可直接调用非静态方法

    }


}
