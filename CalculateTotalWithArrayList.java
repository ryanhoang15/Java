package ForLoopsEx;

import java.util.ArrayList;

public class CalculateTotalWithArrayList {
    
    public static void main(String[] args) {
        //this creates an ArrayList
        ArrayList<Double> expenses = new ArrayList<Double>();
        //.add() method is adding to the ArrayList
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        // Iterate over expenses
        for (int i = 0; i < expenses.size(); i++) {
            // .get() method is used for ArrayList and is getting value at the index location and adding it to total
            total = total + expenses.get(i);
        }

        System.out.println(total);

    }

}

