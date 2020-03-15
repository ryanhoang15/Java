package test;

import java.util.Scanner;

public class BackWards {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = word.length()-1; i >= 0; i--){
            if(word.charAt(i) != ' '){
                System.out.print(word.charAt(i));
            }

        }


        /*
        // if use int i = variable.length() than when use .charAt() method u must minus 1 or it will be index out of range
        for(int i = word.length(); i > 0; i--){
            if(word.charAt(i-1) != ' '){
                System.out.print(word.charAt(i-1));
            }
        }
        // if use int i = variable.length()-1 than when use .charAt() method u must make it i >= 0 b/c so it will take 0
        // and give u the answer at index 0 and don't use i >= 0 than 0 will not go through and your answer will be missing
        // a value at index 0 !!
        for(int i = word.length()-1; i >= 0; i--){
            if(word.charAt(i) != ' '){
                System.out.print(word.charAt(i));
            }
        }
         */
    }
}
