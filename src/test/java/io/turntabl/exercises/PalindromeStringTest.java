package src.test.java.io.turntabl.exercises;


import src.main.java.io.turntabl.exercises.PalindromeString;
// import org.junit.*;
import DSunit.DS;

public class PalindromeStringTest {

    public static void main (String arg[]) {

        String example = "racecar";
        String example2 = "omo";
        String example3 = "test";
        String example4 = "xenannanex";

        // isPalindrome(example);
        DS.assertEquals(PalindromeString.isPalindrome(example), true, "\""+example+"\": Is a Palindrome?");
        DS.assertEquals(PalindromeString.isPalindrome(example2), true, "\""+example2+"\": Is a Palindrome?");
        DS.assertEquals(PalindromeString.isPalindrome(example3), true, "\""+example3+"\": Is a Palindrome?");
        DS.assertEquals(PalindromeString.isPalindrome(example4), true, "\""+example4+"\": Is a Palindrome?");

    }

}