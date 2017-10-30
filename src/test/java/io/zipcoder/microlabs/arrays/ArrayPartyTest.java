package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;
import sun.tools.tree.AssignShiftLeftExpression;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                          "Mushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastButOneTest() {
        //Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected =  "*** Output ***\n" +
                           "Tomatoes";

        //When
        String actual = arrayParty.lastButOneElement(breakfast);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        //Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";
        //When
        String actual = arrayParty.reverse(breakfast);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTest1() {
        //Given
        ArrayParty arrayParty = new ArrayParty();
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        String expected = "*** Output ***\n" +
                "True";
        //When
        String actual1 = arrayParty.isPalindrome(palindromic);

        //Then
        Assert.assertEquals(expected, actual1);
    }

    @Test
    public void isPalindromeTest2() {
        //Given
        ArrayParty arrayParty = new ArrayParty();
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "False";
        //When
        String actual2 = arrayParty.isPalindrome(breakfast);

        //Then
        Assert.assertEquals(expected, actual2);
    }

    @Test
    public void compressTest() {
        //Given
        ArrayParty arrayParty = new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected = "*** Output ***\n" +
                "1\n3\n2\n1\n4";

        //When
        String actual = arrayParty.compress(nums);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void packTest() {
        //Given
        ArrayParty arrayParty = new ArrayParty();
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd',
                'e', 'e', 'e', 'e'};
        String expected = "*** Output ***\n" +
                "aaaa, b, cc, aa, d, eeee";

        //When
        String actual = arrayParty.pack(letters);

        //Then
        Assert.assertEquals(expected, actual);

    }


}
