package StringMethod;

public class Poetry {

    public static void main(String[] args) {

        String line = "The Heav'ns and all the Constellations rung";
        // Change the arguments:
        System.out.println(line.substring(4, 11)); //this would print out starting from the 4th index to the 11th index
        // the answer is Heav'ns
        System.out.println(line.lastIndexOf("s")); // this would find the index starting from the back
        System.out.println(line.substring(4)); // this prints out the fourth index to the end Heav'ns and all the Constellations rung

    }

}