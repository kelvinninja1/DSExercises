package src.main.java.io.turntabl.exercises;

import java.util.Arrays;

// Think about what data structures out list/array, map/dictionary or set to use to represent the input data, and why. 

// Maximum Path Sum
// By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

// 3                            3               - 0.0*              a = 0 
// 7 4                         7 4              - 1.0* | 1.1        [a+1][a]
// 2 4 6                      2 4 6             - 2.0 | 2.1*        [a+2][a+1]
// 8 5 9 3                   8 5 9 3            - 3.1 | 3.2*        [a+3][a+2] a-1

// That is, 3 + 7 + 4 + 9 = 23.

// Find the maximum total from top to bottom of the triangle below:

// 75
// 95 64
// 17 47 82
// 18 35 87 10
// 20 04 82 47 65
// 19 01 23 75 03 34
// 88 02 77 73 07 63 67
// 99 65 04 28 06 16 70 92
// 41 41 26 56 83 40 80 70 33
// 41 48 72 33 47 32 37 16 94 29
// 53 71 44 65 25 43 91 52 97 51 14
// 70 11 33 28 77 73 17 78 39 68 17 57
// 91 71 52 38 17 14 91 43 58 50 27 29 48
// 63 66 04 68 89 53 67 30 73 16 69 87 40 31
// 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

// NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. 

// However, for a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method. 

// See if you can think of both a brute force method and a cleverer way to solve it. 
 
public class TriangleMaxPathSum
{
     
    // Find the max path in triangle
    public static int findMaxPath(final int triangle[][]) {
        // my algo code here
        int sum = triangle[0][0];
        int foldIndex = 0;

        for (int a = 1; a < triangle.length; a++) {
            sum += (triangle[a][foldIndex] > triangle[a][foldIndex + 1]) ? triangle[a][foldIndex]
                    : triangle[a][++foldIndex];
        }

        return sum;
    }

    private static int[][] initStruct ( final int triangle[][]) {

        int structure[][] = new int[triangle.length][];

        for (int row = 0; row < structure.length; row++) {
            structure[row] = new int[triangle[row].length];
            // foldIndex = 0;
            for (int column = 0; column < structure[row].length; column++) {
                // structure[row][column] = triangle[row][column];
            }
        }
        return structure;

    }

    public static int bruteFindMaxPath(final int triangle[][]) {
        // my algo code here
        // int foldIndex = 0;
        int triangleLength = triangle.length;
        int res[][] = initStruct(triangle);

        // res[triangle.length]
        // foreach (rows: row){
        // for (r = 0; r < res.length; r++>)
        // a[row][r] = res[r]+ a[row][r]
        // a[row][r+1] = res[r]+ a[row][r+1]
        // }

        for (int row = 0; row < triangleLength; row++) {

            

            int columnLength =triangle[row].length;
            for (int column = 0; column < columnLength; column++) {

                res[row][column] = (row > 0) ? res[row - 1][column] + triangle[row][column] : triangle[row][column] ;

                // res[row][column] = (row > 0) ? res[row - 1][column] + triangle[row][column] : triangle[row][column] ;

                // res[row][column] += triangle[row][column];
                // res[row][column + 1] = triangle[row][column + 1];
            }
        }
        // foreach(triangle[triangleLength - 1]){

        // };

        System.out.println(Arrays.toString(triangle[triangleLength - 1]));
        System.out.println(Arrays.toString(res[res.length - 1]));

        return triangle[triangleLength - 1][0];
    }

    public static void main(final String[] args) {

        // Use Test rather
        final int triangle[][] = { 
                        {75},
                        {95, 64},
                        {17, 47, 82},
                        {18, 35, 87, 10},
                        {20, 04, 82, 47, 65},
                        {19, 01, 23, 75, 03, 34},
                        {88, 02, 77, 73, 07, 63, 67},
                        {99, 65, 04, 28, 06, 16, 70, 92},
                        {41, 41, 26, 56, 83, 40, 80, 70, 33},
                        {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                        {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                        {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                        {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                        {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                        {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}
                    };

                    // replace 9 with 09
 
        // System.out.println(findMaxPath(triangle));
        System.out.println(bruteFindMaxPath(triangle));
    }
}
 