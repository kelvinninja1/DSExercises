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
     
    public static void main(String[] args) {
        // int triangle2[][] = {
        //     {3}, 
        //     {5, 4}, 
        //     {2, 1, 6}
        // };
        // int triangle2b[][] = {
        //     {3}, 
        //     {5, 4}, 
        //     {1, 2, 6}
        // };
        // int expected2 =  3 + 5 + 2;

        // int triangle1[][] = { 
        //     { 3 },
        //     { 7, 4 },
        //     { 2, 4, 6 },
        //     { 8, 5, 9, 3 }
        // };
        // int expected1 =  3 + 7 + 4 + 9;

        int triangle3[][] = { 
            { 75 },
            { 95, 64 },
            { 17, 47, 82 }
        };
        int expected3 =  75 + 64 + 82;

        int triangle4[][] = { 
            { 3 },
            { 4, 5 },
            { 5, 7, 9 },
            { 6, 11, 1, 2 }
        };
        int expected4 =  26;


        // int triangle[][] = { 
        //                 {75},
        //                 {95, 64},
        //                 {17, 47, 82},
        //                 {18, 35, 87, 10},
        //                 {20, 04, 82, 47, 65},
        //                 {19, 01, 23, 75, 03, 34},
        //                 {88, 02, 77, 73, 07, 63, 67},
        //                 {99, 65, 04, 28, 06, 16, 70, 92},
        //                 {41, 41, 26, 56, 83, 40, 80, 70, 33},
        //                 {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
        //                 {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
        //                 {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
        //                 {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
        //                 {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
        //                 {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}
        //             };
        // int expected = 75 + 95 + 47 + 87 + 82 + 75 + 73 + 28 + 83 + 47 + 43 + 73 + 91 + 67 + 98;

        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle1), expected1, "Example 1: Find Max Path of a triangle");
        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle2), expected2, "Example 2a: Find Max Path of a triangle");
        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle2b), expected2, "Example 2b: Find Max Path of a triangle");
        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle3), expected3, "Example 3: Find Max Path of a triangle");
        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle), expected, "Find Max Path of a triangle");

        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle1), expected1, "Example 1: Find Max Path of a triangle");
        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle2), expected2, "Example 2a: Find Max Path of a triangle");
        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle2b), expected2, "Example 2b: Find Max Path of a triangle");
        DS.assertEquals(TriangleMaxPathSum.bruteFindMaxPath(triangle3), expected3, "Example 3: Find Max Path of a triangle");
        DS.assertEquals(TriangleMaxPathSum.bruteFindMaxPath(triangle4), expected4, "Example 4: Find Max Path of a triangle");
        // DS.assertEquals(TriangleMaxPathSum.findMaxPath(triangle), expected, "Find Max Path of a triangle");
    }
}
