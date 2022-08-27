package Inheritance;

public class RunTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.designation();
        e.companyname();

        System.out.println("SoftwareTester");
        SoftwareTester s=new SoftwareTester();
        s.designation();
        s.companyname();
    }
}
