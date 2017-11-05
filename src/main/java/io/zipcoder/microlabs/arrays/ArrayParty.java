package io.zipcoder.microlabs.arrays;
import java.util.Arrays;

public class ArrayParty {

    public String printArray(String[] inputArray) {
        String result = "*** Output ***";
        for (String input : inputArray) {
            result += "\n" + input;
        }
        return result;
    }

    public String lastElement(String[] inputArray) {
        String result = "*** Output ***\n";
        return result += inputArray[inputArray.length - 1];
    }

    public String lastButOneElement(String[] inputArray) {
        String result = "*** Output ***\n";
        return result += inputArray[inputArray.length - 2];
    }

    public String reverse(String[] inputArray) {
        String result = "*** Output ***";
        for (int r = inputArray.length - 1; r >= 0; r--) {
            result += "\n" + inputArray[r];
        }
        return result;

    }

    public String isPalindrome(String[] inputArray) {
        String result = "*** Output ***";
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != inputArray[inputArray.length - 1 - i]) {
                result += "\n" + "False";
                break;
            } else if (i == inputArray.length - 1) {
                result += "\n" + "True";
            }
        }
        return result;
    }

    //this will get all duplicates from a sorted list
    public String compress(int[] inputArray) {
        StringBuilder sb = new StringBuilder();
        sb.append("*** Output ***");
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) { // j will start one value greater than i
                if (inputArray[i] == inputArray[j]) {
                    inputArray[j] = 0; //changes the numbers of duplicates to zero!
                }
            }
            if (inputArray[i] != 0) { //if it sees a zero (that we changed above) will forgo and only print numbers
                sb.append("\n" + inputArray[i]);
            }
        }
        return sb.toString().trim();
    }

    //Pack consecutive duplicates of a char array into Strings.
    public String pack(char[] inputArray) {
        StringBuilder sb = new StringBuilder();
        sb.append("*** Output ***\n");
        sb.append(Character.toString(inputArray[0])); //need to store the starting index
        for (int i=1; i<inputArray.length; i++) {  //starts one before the starting index
            if (inputArray[i] != inputArray[i-1]) { //matches index after with the index previous
                sb.append(", " + inputArray[i]); //prints that index that is diff with a comma
            }
            else {
                sb.append(inputArray[i]); //else, prints the index that is the same
            }
        }
        return sb.toString().trim(); //print the resulting string
    }
}