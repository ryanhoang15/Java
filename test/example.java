package test;


import JavaPt3.WordCount;

import java.util.Scanner;

public class example {
    // have to create a instance if u create the void method
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        example w1 = new example();
        String str = sc.nextLine();
        w1.countWords(str);
    }
    void countWords(String sentence){
        String[] wd = sentence.split(" ");
        int num = wd.length;
        System.out.println(num);
    }
}


// another way to do it with static void and u don't need to
// create an instance

    //public static void main(String[] arg){
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter a sentence:");
    //    String str = sc.nextLine();
    //    countWords(str);
    //}
    //static void countWords(String sentence){
    //    String[] wd = sentence.split(" ");
    //    int num = wd.length;
    //    System.out.println(num);
    //}
