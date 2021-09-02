package src.test.java.io.turntabl.exercises;

// Think about what data structures out list/array, map/dictionary or set to use to represent the input data, and why. 

// Maximum Path Sum
// By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

// 3                            3               - 0.0*              a = 0 
// 7 4                         7 4              - 1.0* | 1.1        [a+1][a]
// 2 4 6                      2 4 6             - 2.0 | 2.1*        [a+2][a+1]
// 8 5 9 3                   8 5 9 3            - 3.1 | 3.2*        [a+3][a+2] a-1

// That is, 3 + 7 + 4 + 9 = 23.

import src.main.java.io.turntabl.exercises.TriangleMaxPathSum;
// import org.junit.*;
import DSunit.DS;
 
public class TriangleMaxPathSumTest
{
    // int triangle[][] = { 
    //                     { 3 },
    //                     { 7, 4 },
    //                     { 2, 4, 6 },
    //                     { 8, 5, 9, 3 }
    //                 };
     
    public static void main(String[] args) {

        int triangle[][] = { { 3 },{ 7, 4 },{ 2, 4, 6 },{ 8, 5, 9, 3 }};

        // TriangleMaxPathSum test = new TriangleMaxPathSum();


        DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle), 3 + 7 + 4 + 9, "Find Max Path of a triangle");
        DS.assertEquals(TriangleMaxPathSum.findMaxPathFromBottom(triangle), 3 + 7 + 4 + 9, "Find Max Path of a triangle");
    }
}
