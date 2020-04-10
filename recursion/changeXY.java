package Recursion;

public class changeXY {
    public static String changeXY(String str) {
//         String word = "";
        if (str.equals("")){
            return str;
        }

        if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1));
        }

        else {
            return str.charAt(0) + changeXY(str.substring(1));
        }
    }

    public static void main(String[] args){
        System.out.println(changeXY("codex"));
    }
}
