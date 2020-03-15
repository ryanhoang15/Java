package test;

public class checkPrime {

    public static void main(String[] args){
        for(int i = 0; i <= 100; i++){
            if(i==0 || i == 1){
                continue;
            }
            boolean x = true;
            for (int j = 2; j <= (i/2); j++){
            if( i % j == 0){
                x = false;
                break;
                }
            }
            if(x) {
                System.out.println(i);
            }

        }

    }
}

