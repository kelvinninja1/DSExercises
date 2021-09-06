package DSunit;

import java.util.List;

public class DS
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    

    private static int testPassed(String feedback)
    { 
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + " TEST PASSED: " + feedback + "  " + ANSI_RESET);
        return 1;
    }

    private static int testFailed(String feedback)
    { 
        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "  TEST FAILED: " + feedback + "  " + ANSI_RESET);
        return 0;
    }

    public static int assertEquals(int actual, int expected, String message)
    {

        // my algo code here
        // if actual.equal(expected); Ouch Primitive types
        if (actual == expected){
            testPassed(message + ", Expected: " + expected + " Actual: " + actual);
            return 1;
        } else {
            testFailed(message + ", Expected: " + expected + " Actual: " + actual);
            return 0;
        }

    }
    
    public static int assertEquals(Boolean actual, Boolean expected, String message)
    {

        // my algo code here
        // if actual.equal(expected); Ouch Primitive types
        if (actual == expected){
            testPassed(message + ", Expected: " + expected + " Actual: " + actual);
            return 1;
        } else {
            testFailed(message + ", Expected: " + expected + " Actual: " + actual);
            return 0;
        }

    }

    public static int assertEquals(List actual, List expected, String message) {
        if (actual.equals(expected)){
            testPassed(message + ", Expected: " + expected + " Actual: " + actual);
            return 1;
        } else {
            testFailed(message + ", Expected: " + expected + " Actual: " + actual);
            return 0;
        }
	}
    
    // public static int assertEquals(List<Integer> actual, List<Integer> expected, String message) {
    //     if (actual.equals(expected)){
    //         testPassed(message + ", Expected: " + expected + " Actual: " + actual);
    //         return 1;
    //     } else {
    //         testFailed(message + ", Expected: " + expected + " Actual: " + actual);
    //         return 0;
    //     }
	// }

    public static void doc ()
    {
        System.out.println("DSunit - DataStructures Unit testing Docs");
    }

}
 