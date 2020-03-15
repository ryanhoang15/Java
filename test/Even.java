package test;

public class Even {
    public static void main(String[] args){
        // Even
        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        //Odd
        for(int i = 0; i <= 10; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
