package Wk_6;

// Ryan Hoang
// CECS 274-05
// Prog 5 - Binary Search Tree
// May 7, 2020

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int Menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1) Create empty BST");
        System.out.println("2) Add a number to BST");
        System.out.println("3) Add 20 random numbers to your BST");
        System.out.println("4) Display the BST in sorted order");
        System.out.println("5) Show Stats");
        System.out.println("6) Find a number");
        System.out.println("7) Delete a number");
        System.out.println("8) Press 8 to Quit");
        System.out.print("Which option would you like to do: ");
        return in.nextInt();
    }

    public static void main(String[] args){
        BinarySearchTree myTree = new BinarySearchTree();
        Scanner in = new Scanner(System.in);
        int option = Menu();
        while(option != 8) {
            switch (option) {
                case 1:
                    myTree = new BinarySearchTree();
                    System.out.println();
                    option = Menu();
                    break;

                case 2:
                    System.out.print("What number would you like to add: ");
                    int digit = in.nextInt();
                    myTree.add(digit);
                    System.out.println();
                    option = Menu();
                    break;

                case 3:
                    Random rand = new Random();
                    for (int i = 0; i < 20; i++) {
                        myTree.add(rand.nextInt(1001));
                    }
                    System.out.println();
                    option = Menu();
                    break;

                case 4:
                    myTree.display();
                    System.out.println("\n");
                    option = Menu();
                    break;

                case 5:
                    System.out.println("The root value is: " + myTree.rootValue());
                    System.out.println("The tree height is: " + myTree.height());
                    System.out.println("The number of items are: " + myTree.size());
                    System.out.println("The maximum value is: " + myTree.max());
                    System.out.println("The minimum value is: " + myTree.min());
                    System.out.println("The average value is: " + myTree.averageValue());
                    System.out.println();
                    option = Menu();
                    break;


                case 6:
                    System.out.print("What number do you want to find: ");
                    int number = in.nextInt();
                    if(myTree.find(number)){
                        System.out.println(number + " has been found");
                    }
                    else {
                        System.out.println("Not found");
                    }
                    System.out.println();
                    option = Menu();
                    break;

                case 7:
                    System.out.println("Here are the numbers to be chosen from: ");
                    myTree.display();
                    System.out.print("\nEnter a number that you would like to delete: ");
                    int value = in.nextInt();
                    myTree.delete(value);
                    System.out.println();
                    option = Menu();
                    break;
            }
        }
    }
}


