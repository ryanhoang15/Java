package Javapt1;

import java.util.Scanner;
import java.lang.Math;

public class Arithmetics {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int num = sc.nextInt();
        System.out.println(("Enter a second number:"));
        int num2 = sc.nextInt();
        int sum = num + num2;
        int prod = num * num2;
        System.out.println("The sum is " + sum);
        System.out.println("The distance is " + Math.abs(num - num2));
        System.out.println("The product is " + prod);

    }
}
