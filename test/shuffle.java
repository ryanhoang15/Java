package test;

import java.util.Random;

public class shuffle {
    public void shuffle() {
        Random rand = new Random();
        int y = 0;
        for(int x = 0; x < 1000; x++){
            System.out.println("num " + y);
            if(y % 52 == 0) {
                y = 0;
            }
//            Card oldCard = storage[y];
//            int shuffleDeck = rand.nextInt(52);
//            storage[y] = storage[shuffleDeck];
//            storage[shuffleDeck] = oldCard;
//            y++;

        }
    }
    public static void main(String[] args){
        shuffle s = new shuffle();
        s.shuffle();
    }
}
