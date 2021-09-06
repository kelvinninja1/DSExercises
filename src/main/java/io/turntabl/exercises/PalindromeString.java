package src.main.java.io.turntabl.exercises;

// Problem:
// Write a function that tests whether a string is a palindrome.

public class PalindromeString {

    public static void main (String arg[]) {

        String example = "racecar";
        System.out.println( isPalindrome(example) ? "\""+example + "\" Is a Palindrome" : "\""+example + "\" Is not a Palindrome" );
        
    }

    public static Boolean isPalindrome(String testString) {
        int testLength = testString.length();
        Boolean isPalindrome = true;

        for(int i = 0; i < testLength; i++){
            if (testString.charAt(i) != testString.charAt((testLength - 1) - i)) {
                isPalindrome = false;
                 break;
            } 
        }

        return isPalindrome;
    }


}