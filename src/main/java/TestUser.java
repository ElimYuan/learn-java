public class TestUser {
    int id;
    String name;
    String pwd;

    public TestUser(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public TestUser(int id, String name, String pwd) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        TestUser tu_Id_Name = new TestUser(2, "elim");
        TestUser tu_Id_Name_Pas = new TestUser(1, "yuanbo", "password");
        System.out.println(tu_Id_Name);
        System.out.println(tu_Id_Name_Pas);
    }

}
