package Recursion;

public class sumDigits {
    public static int sumDigits(int n) {
        if(n == 0){
            return 0;
        }
        else{
            return sumDigits(n/10) + n % 10;
        }

        // another way to do it
        //   if(n < 10){
        //   return n;
        // }
        // else{
        //   return sumDigits(n/10) + n % 10;
        // }
    }

    public static void main(String[] args){
        System.out.println(sumDigits(126));
    }

}
