package Recursion;

public class bunniesEars {
    public static int bunnyEars(int bunnies) {
        if(bunnies == 1){
            return 2;
        }

        else{
            return bunnyEars(bunnies - 1) + 2;
        }
    }
    public static void main(String[] args){
        System.out.println(bunnyEars(3));
    }
}
