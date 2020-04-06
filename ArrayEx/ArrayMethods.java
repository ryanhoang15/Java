package ArrayEx;

import java.util.Arrays;

public class ArrayMethods {
    String [] topics = {"Opinion", "Tech","Science","Health"};
    public static void main(String[] args){
        ArrayMethods list = new ArrayMethods();
        System.out.println(Arrays.toString(list.topics));

        // use [] to access an ARRAY index value
        System.out.println(list.topics[1]);

        // .length method for array
        System.out.println(list.topics.length);

        // String[] items = new String[5]; is creating an empty array
        String[] items = new String[5];

        // this is adding to the empty array
        items[0] = "hi";
        items[1] = "abc";
        items[2] = "xyz";
        items[3] = "123";
        items[4] = "bye";

        // use [] to also update or change the list value
        items[0] = "12";
        System.out.println(Arrays.toString(items));
    }
}
