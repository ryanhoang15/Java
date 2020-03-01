package Javapt1;

import java.util.Scanner;

public class BasicOutputWithVariables {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in); // like my_acct = BA()
        System.out.println("Enter an Integer: ");
        int num = sc.nextInt();
        int sq = num * num;
        int cub = num * num * num;
        System.out.println("You entered: " + num);
        System.out.println(num + " squared is " + sq);
        System.out.println(("And " + num + " cubed is " + cub + " !!"));
        System.out.println(("Enter another integer: "));
        int num2 = sc.nextInt();
        int sum = num + num2;
        int sum2 = num * num2;
        System.out.println(num + " + " + num2 + " is " + sum);
        System.out.println((num + " * " + num2 + " is " + sum2));

    }
}
