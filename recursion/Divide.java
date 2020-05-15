package Ex;

import java.sql.SQLOutput;

public class Divide {
    public static int divide(int n, int d){
        if(d==0){
            System.out.println("Cannot divide by Zero");
            return 111;
        }
        if(n<d){
            return 0;
        }
        else{
            return 1 + divide(n-d,d);
        }
    }


    public static void main(String[] args){
        System.out.println(divide(34,10));
        System.out.println(divide(17,7));
        System.out.println(divide(81,9));
        System.out.println(divide(6,10));
//        System.out.println(divide(34,0));
//        System.out.println(divide(0,20));
    }
}
