package ForLoopsEx;

// array list not used
import java.util.ArrayList;
import java.util.Arrays;

public class ForLoopUsingArrays {
    public static void main(String[] args) {
        
        int[] money = {1,2,3,4,5};
        int total = 0;
        
        // this loop is looping through the array and adding the index value to total
        for (int i = 0; i < money.length; i++) {
            total = total + money[i];
        }
        
        System.out.println(total);
        
        // this is printing out the array using the Arrays.tostring method b/c if u don't use it than 
        // it will print out the memory location
        System.out.println(Arrays.toString(money));
    }

}
