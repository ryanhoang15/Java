package Recursion;

public class bunniesEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies == 1){
            return 2;
        }

        else if (bunnies == 0){
            return 0;
        }

        else{

            if(bunnies % 2 == 0){
                return bunnyEars2(bunnies - 1) + 3;
            }

            else{
                return bunnyEars2(bunnies - 1) + 2;
            }
        }
    }


    public static void main(String[] args){
        bunniesEars2 bunny = new bunniesEars2();
        int ears = bunny.bunnyEars2(3);
        System.out.println(ears);


    }
}
