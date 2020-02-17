package ForLoopsEx;

// array list not used
import java.util.ArrayList;
import java.util.Arrays;

public class ForLoopUsingArrays {
    public static void main(String[] args) {
        //   for (int i = 0; i < 28; i++) {
        // 		System.out.println("Congrats on finishing Java loops!");
        // 	  }
        int[] money = {1,2,3,4,5};
        int total = 0;
        for (int i = 0; i < money.length; i++) {
            total = total + money[i];
        }
        System.out.println(total);
        System.out.println(Arrays.toString(money));
    }

}
