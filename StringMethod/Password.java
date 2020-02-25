package StringMethod;

public class Password {

    public static void main(String[] args) {

        String password = "correcthorsebatterystaple";

        // Write the code:
        System.out.println(password.equals("correcthorsebatterystaple"));
        System.out.println(password.indexOf("r")); // returns the index of the first occurence of r
        // If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.

        String flavor1 = "Mango";
        System.out.println(flavor1.equalsIgnoreCase("mango")); // prints true and
                                                                           // equalsIgnoreCase() method that compares two strings
                                                                          // without considering upper/lower cases.



    }

}
