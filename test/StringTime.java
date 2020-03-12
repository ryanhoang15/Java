package test;

public class StringTime{

    public static String stringTimes(String str, int n) {
        String x = " ";
        for(int i = 0; i < n; i++){
            x = x + str;
        }
        return x;
    }

    public static void main(String[] arg){
        System.out.println(stringTimes("hi",3));
        System.out.println(stringTimes("king",8));
    }
}
