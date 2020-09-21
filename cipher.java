package Ex;

public class cipher {
    /*
     * Complete the 'simpleCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING encrypted
     *  2. INTEGER k
     */

    public static String simpleCipher(String encrypted, int k) {
        // Write your code here
        char[] alphalocation = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] alpha = new char[encrypted.length()];
        String word = "";
        int shift = k;

        for(int i = 0; i < encrypted.length(); i++){
            alpha[i] = encrypted.toUpperCase().charAt(i);
        }

        for(int j = 0; j < alpha.length; j++){
            int charValue = alpha[j]; // stores the value of the char

            // cheching if the value is between 65(A) and 90(Z)
            if(charValue >= 65 && charValue <= 90){
                // if its between than the value is subtracted from how many spots shift is
                charValue = charValue - shift;
                // if the new value is not in the alphabet
                if(charValue < 65){
                    // calculate to find the letter
                    char letter = alphalocation[(charValue + 65) % 26];
                    //    char letter = (char) ((charValue + 65) % 26 + 65);
                    word = word + letter;
                }
                else{
                    word = word + (char) charValue;
                }
            }
            // else{
            //     word = word + (char) charValue;
            // }
        }
        return word;
    }

    /**
     *
     /*
     * Complete the 'simpleCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING encrypted
     *  2. INTEGER k
     */
/**
    public static String simpleCipher(String encrypted, int k) {
        // Write your code here
        char[] alphalocation = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] alpha = new char[encrypted.length()];
        String word = "";
        int shift = k;

// this is to go through the string length and add each char of the string to the char[] alpha array
        for(int i = 0; i < encrypted.length(); i++){
            alpha[i] = encrypted.toUpperCase().charAt(i);
        }

// this is looping to the char[] alpha length and trying to decrypt it
        for(int j = 0; j < alpha.length; j++){
            int charValue = alpha[j]; // stores the value of the char

            // cheching if the value is between 65(A) and 90(Z)
            if(charValue >= 65 && charValue <= 90){
                // if its between than the value is subtracted from how many spots shift is
                charValue = charValue - shift;

                //if the new value is not in the alphabet
                if(charValue < 65){

                    // calculate to find the letter by adding 65 for the char A and using mod to find the location since there are 26 letters in the alphabet
                    int location = (charValue + 65) % 26;
                    char letter = alphalocation[location];
                    word = word + letter;
                }

                // if the value is in the alphabet and just concat to the string word
                else{
                    word = word + (char) charValue;
                }
            }
        }
        return word;
    }
 */


    public static void main(String[] args) {
        int x = -1;
        x = x * -1;
        System.out.println(x);
    }
}
