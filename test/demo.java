package test;

public class demo {
    public static void main(String[] arg){
        System.out.println("this is a test for method");
        display();
        DemoMethod d1 = new DemoMethod();
        d1.display2();
    }
    static void display(){
        System.out.println("hello");
    }
    void display2(){

        System.out.println("another hello from display2()");
        }
    }
