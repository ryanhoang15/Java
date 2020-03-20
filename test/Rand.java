package test;

import java.util.Random;
public class Rand {
    public static void main(String[] arg){
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            int x = rand.nextInt(100) + 100;
            System.out.println(x);
        }
//        char x = '0';
//        char y = '2';
//        int n = '0';
        int n2 = '2';
        int value = n2 - '0';
//        System.out.println(Integer.parseInt(String.valueOf(x)));
//        System.out.println(n2 - n);
//        System.out.println(n);
        System.out.println(value);
    }
}
