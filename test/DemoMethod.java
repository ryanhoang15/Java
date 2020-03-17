package test;

public class DemoMethod {
    int num = 7;
    public static void main(String[] arg){
        System.out.println("this is a test for method");
        display();
        DemoMethod d1 = new DemoMethod();
        DemoMethodTest dt = new DemoMethodTest();
        int result;
        result = dt.addnum(dt.n1,dt.n2);
        System.out.println(d1.num);
        d1.display2();
    }
    static void display() {
        System.out.println("hello");
    }
    void display2() {System.out.println("another hello from display()");}
}
