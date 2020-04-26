package Wk_5;

// Ryan Hoang
// CECS 274-05
// Prog 4 - Human Pyramid
// April 21, 2020

import java.util.Scanner;
import java.util.ArrayList;

public class HumanPyramid {

    public static double weightOnBack(double row, double col) {

        if (row == 1 && col == 1){
            return 0.0;
        }
        else if(col == 1){
            return weightOnBack(row - 1, col) / 2.0  + 75.0;
        }
        else if(row == col){
            return weightOnBack(row - 1, col - 1) / 2.0 + 75.0;
        }
        else {
            return weightOnBack(row - 1, col - 1) / 2.0 + weightOnBack(row - 1, col) / 2.0 + 150.0;
        }
    }

    public static void display(ArrayList<Integer> pyramid, int rowMax){
        int count = 0;

        for(int row = 0; row < rowMax; row++){

            for (int spaces = 0; spaces < rowMax - row; spaces++){
               System.out.print("    ");
           }
           for(int col = 0; col <= row; col++){
               System.out.printf(" (%4d) ",pyramid.get(count));
               count++;
           }
            System.out.println();
        }
    }

    public static void main(String[] args){
        boolean value = true;

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> pyramid = new ArrayList<Integer>();

        System.out.println("Welcome to the Human Pyramid");

        while(value) {

            System.out.print("How tall is your pyramid? (Enter number of rows): ");

            double rowMax = in.nextInt();

            int index = 0;

            for(double row = 1; row <= rowMax; row++){

                for(double col = 1; col <= row; col++){

                    pyramid.add(index++,(int)weightOnBack(row,col));
                }
            }
            System.out.println("Here is the graph of your pyramid showing the weight each person is holding:");

            display(pyramid, (int) rowMax);

            System.out.print("Do you want to run again? (y/n) ");

            char option = in.next().charAt(0);

            if(option == 'n'){

                value = false;
            }
        }
    }
}
