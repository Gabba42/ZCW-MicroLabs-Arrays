package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {
        String result = "*** Output ***";
        for (String input: inputArray) {
             result += "\n" + input;
        }
        return result;
    }

    public String lastElement(String[] inputArray){
        String result = "*** Output ***\n";
        return result += inputArray[inputArray.length-1];
    }

    public String lastButOneElement(String[] inputArray) {
        String result = "*** Output ***\n";
        return result += inputArray[inputArray.length-2];
    }

    public String reverse(String[] inputArray) {
        String result = "*** Output ***";
        for (int r = inputArray.length-1; r >= 0; r--) {
            result += "\n" + inputArray[r];
        }
        return result;

    }

    public String isPalindrome(String[] inputArray) {
        String result = "*** Output ***";
        for (int i=0; i<inputArray.length; i++) {
            if (inputArray[i] != inputArray[inputArray.length-1-i]) {
                result += "\n" + "False";
                break;
            }
            else if (i == inputArray.length-1) {
                result += "\n" + "True";
            }
        }
        return result;
    }

    public String compress(int[] inputArray) {
        //eliminate consecutive duplicates
    }

    public String pack(char[] inputArray) {
        //Pack consecutive duplicates of a char array into Strings.

    }
}
