package test;

import java.util.Random;

public class Average {
    public static void main(String[] args){
        int[] numbers = new int[20];
        loaded(numbers);
        double avg = average(numbers);
        System.out.println(avg);
    }

    public static void loaded(int[] numbers){
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            int n = rand.nextInt(51) + 50;
            numbers[i] = n;
        }
    }



    public static double average(int[] numbers){
        int total = 0;
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
            count++;
        }
        return (float) total/count;
    }

}
